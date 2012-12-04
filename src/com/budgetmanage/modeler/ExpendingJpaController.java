/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Finance;
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
public class ExpendingJpaController implements Serializable {

    public ExpendingJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Expending expending) throws PreexistingEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(expending);
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

    public void edit(Expending expending) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            expending = em.merge(expending);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = expending.getId();
                if (findExpending(id) == null) {
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

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Expending expending;
            try {
                expending = em.getReference(Expending.class, id);
                expending.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The expending with id " + id + " no longer exists.", enfe);
            }
            em.remove(expending);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Finance> findExpendingEntities() {
        return findExpendingEntities(true, -1, -1);
    }

    public List<Finance> findExpendingEntities(int maxResults, int firstResult) {
        return findExpendingEntities(false, maxResults, firstResult);
    }

    private List<Finance> findExpendingEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Expending.class));
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

    public Expending findExpending(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Expending.class, id);
        } finally {
            em.close();
        }
    }
    
    public List<Finance> findExpending(String name){
        EntityManager em = getEntityManager();
        try{
            Query exQuery = em.createNativeQuery("Select c.* from Expending c where c.Expending_name like"+name+" and BUDGETUSER_ID ="+
                    + Main.getUser().getId(), Expending.class);
            List<Finance> ex = exQuery.getResultList();
            return ex;
        }
        finally{
            em.close();
        }
    }
    
    public List<Finance> findExpending(double value){
        EntityManager em = getEntityManager();
        try{
            Query exQuery = em.createNativeQuery("Select c.* from Expending c where c.Expending_Total = "+value+" and "
                    + "BUDGETUSER_ID ="+Main.getUser().getId(), Expending.class);
            List<Finance> ex = exQuery.getResultList();
            return ex;
        }
        finally{
            em.close();
        }
    }

    public int getExpendingCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Expending> rt = cq.from(Expending.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public double getExpendigsTotal(int number){
        EntityManager em = getEntityManager();
        double total = 0;
        try{
            Query q = em.createNativeQuery("Select sum(expending_total) from Expending where expending_priority ="+number+
                    " and BUDGETUSER_ID="+Main.getUser().getId());
            total = (Double) q.getSingleResult();
            return total;
        }catch(Exception ex){
            total = 0;
        }finally{
            em.close();
            return total;
        }
    }
    
    public List<Object[]> getExpendingTotalByDay(){
        EntityManager em = getEntityManager();
        Query q;
        List<Object[]> objs = null;
        try{
            q = em.createNativeQuery("Select sum(Expending_Total), DATE(update_date) from Expending"+
                                    " where BUDGETUSER_ID = "+Main.getUser().getId()+" group by DATE(update_date)");
            objs =  q.getResultList();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            em.close();
            return objs;            
        }
    }
    public List<Finance> findAll(){
        EntityManager em = getEntityManager();
        Query q;
        try{
            q = em.createNativeQuery("Select * from EXPENDING where BUDGETUSER_ID = "+Main.getUser().getId(), Expending.class);
            return q.getResultList();
        }finally{
            em.close();
        }
    }
    
    public double getExpendingTotal(){
        EntityManager em = getEntityManager();
        Query q;
        double expendingTotal = 0;
        try{
            q = em.createNativeQuery("Select sum(EXPENDING_TOTAL) from EXPENDING where BUDGETUSER_ID = "+Main.getUser().getId());
            expendingTotal = (Double) q.getSingleResult();  
            return expendingTotal;
        }catch(Exception ex){
            expendingTotal = 0;
        }finally{
            em.close();
            return expendingTotal;
        }
    }
}
