/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.Budget;
import com.budgetmanage.entities.BudgetUser;
import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.entities.Ingress;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Fulvio
 */
public class UserJpaController implements Serializable {

    public UserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public boolean create(BudgetUser user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            if (em != null) {
                em.close();
            }
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public void edit(BudgetUser user) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            user = em.merge(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = user.getId();
                if (findUser(id) == null) {
                    throw new NonexistentEntityException("The user with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Finance> getFinace(Integer id, Finance finance)throws Exception{
        EntityManager em = getEntityManager();
        List<Finance> finances = new ArrayList<>();
        Query q = null;
        
        try{
            if(finance instanceof Budget){
                q = em.createNativeQuery("Select * from BUDGET where BUDGETUSER_ID = "+id);
            } else if(finance instanceof Expending){
                q = em.createNativeQuery("Select * from EXPENDING where BUDGETUSER_ID = "+id);
            }
            if(finance instanceof Ingress){
                q = em.createNativeQuery("Select * from INGRESS where BUDGETUSER_ID = "+id);
            }else{
                throw new Exception("Favor introduzca una finanza valida");
            }
            return finances = q.getResultList();
                    
        }finally{            
            em.close();            
        }
    }
    
    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            BudgetUser user;
            try {
                user = em.getReference(BudgetUser.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The user with id " + id + " no longer exists.", enfe);
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<BudgetUser> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<BudgetUser> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<BudgetUser> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BudgetUser.class));
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

    public BudgetUser findUser(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BudgetUser.class, id);
        } finally {
            em.close();
        }
    }
    
    public int getUserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<BudgetUser> rt = cq.from(BudgetUser.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
