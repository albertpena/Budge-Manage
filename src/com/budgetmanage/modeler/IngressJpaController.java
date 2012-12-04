/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.Finance;
import com.budgetmanage.entities.Ingress;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.modeler.exceptions.PreexistingEntityException;
import com.budgetmanage.ui.Main;
import com.budgetmanage.util.Constant;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Nestor_Velasquez
 */
public class IngressJpaController implements Serializable {

    public IngressJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ingress ingress) throws PreexistingEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ingress);
            em.getTransaction().commit();           
        }catch(Exception ex){
            throw new PreexistingEntityException(Constant.EXIST_ERROR_MSG);
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ingress ingress) throws NonexistentEntityException{
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ingress = em.merge(ingress);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ingress.getId();
                if (findIngress(id) == null) {
                    throw new NonexistentEntityException(Constant.NON_EXISTS_ERROR_MSG);
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Finance> findIngress(String name){
        EntityManager em = getEntityManager();
        try{            
            Query inQuery = em.createNativeQuery("Select i.* from INGRESS i where i.INGRESS_NAME like "+name+" and BUDGETUSER_ID="+
                    Main.getUser().getId(), Ingress.class);
            List<Finance> ins= inQuery.getResultList();
            return ins;
        }finally{
            em.close();
        }
    }
    
    public List<Finance> findIngress(int value){
        EntityManager em = getEntityManager();
        try{            
            Query inQuery = em.createNativeQuery("Select i.* from INGRESS i where i.Ingress_Total = "+value+" and BUDGETUSER_ID="+
                    Main.getUser().getId(), Ingress.class);
            List<Finance> ins= inQuery.getResultList();
            return ins;
        }finally{
            em.close();
        }
    }
    
    public List<Finance> findAll(){
        EntityManager em = getEntityManager();
        Query q;
        try{
            q = em.createNativeQuery("Select * from INGRESS where BUDGETUSER_ID = "+Main.getUser().getId(), Ingress.class);
            return q.getResultList();
        }finally{
            em.close();
        }
    }
    
    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ingress ingress;
            try {
                ingress = em.getReference(Ingress.class, id);
                ingress.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ingress with id " + id + " no longer exists.", enfe);
            }
            em.remove(ingress);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Finance> findIngressEntities() {
        return findIngressEntities(true, -1, -1);
    }

    public List<Finance> findIngressEntities(int maxResults, int firstResult) {
        return findIngressEntities(false, maxResults, firstResult);
    }

    private List<Finance> findIngressEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ingress.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ingress findIngress(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ingress.class, id);
        } finally {
            em.close();
        }
    }

    public int getIngressCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ingress> rt = cq.from(Ingress.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public double getIngressTotal(){
        EntityManager em = getEntityManager();
        Query q;
        double ingressTotal = 0;
        try{
            q = em.createNativeQuery("Select sum(INGRESS_TOTAL) from INGRESS where BUDGETUSER_ID = "+Main.getUser().getId());
            ingressTotal =  (Double) q.getSingleResult();
            return ingressTotal;
        }catch(Exception ex){
            ingressTotal = 0;
        }finally{
            em.close();
            return ingressTotal;
        }
    }
    
}
