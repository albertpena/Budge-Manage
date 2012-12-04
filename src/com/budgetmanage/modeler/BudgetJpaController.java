/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.Budget;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.ui.Main;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class BudgetJpaController implements Serializable {

    public BudgetJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public BudgetJpaController() {
    
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Budget budget) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(budget);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Budget budget) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            budget = em.merge(budget);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = budget.getId();
                if (findBudget(id) == null) {
                    throw new NonexistentEntityException("The budget with id " + id + " no longer exists.");
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
            Budget budget;
            try {
                budget = em.getReference(Budget.class, id);
                budget.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The budget with id " + id + " no longer exists.", enfe);
            }
            em.remove(budget);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Budget> findBudgetEntities() {
        return findBudgetEntities(true, -1, -1);
    }

    public List<Budget> findBudgetEntities(int maxResults, int firstResult) {
        return findBudgetEntities(false, maxResults, firstResult);
    }

    private List<Budget> findBudgetEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Budget.class));         
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

    public Budget getActual(Long userId)throws NonexistentEntityException{
        EntityManager em = getEntityManager();        
        Budget budget = null;
        try{
            Query q = em.createNativeQuery("Select max(ID) from BUDGET where BUDGETUSER_ID = "+userId);
            Object id = q.getSingleResult();        
            budget =  em.find(Budget.class, id);
        }catch(Exception ex){
            throw new NonexistentEntityException("No tiene presupuestos generados");
        }finally{
            em.close();
        }
        
        return budget;
    }
    public List<Finance> findAll(){
        EntityManager em = getEntityManager();
        Query q;
        try{
            q = em.createNativeQuery("Select * from BUDGET where BUDGETUSER_ID = "+Main.getUser().getId(), Budget.class);
            return q.getResultList();
        }finally{
            em.close();
        }
    }
    
    public Budget findBudget(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Budget.class, id);
        } finally {
            em.close();
        }
    }
    
    /*
     * Method to generate an existing budget.
     */
    public void generateBudget(){
        EntityManager em = getEntityManager();
        Query q;
        Query q2;
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        Budget budget = null;
        try{
            budget = getActual(Main.getUser().getId());
            q  = em.createNativeQuery("Select sum(Expending_Total) from Expending"+
                                    " where BUDGETUSER_ID = "+Main.getUser().getId());
            double exTotal = (double) q.getSingleResult();
            
            q2 = em.createNativeQuery("Select sum(Ingress_Total) from Ingress"+
                                    " where BUDGETUSER_ID = "+Main.getUser().getId());
            double inTotal = (double) q2.getSingleResult();
            
            budget.setExpendingTotal(exTotal);
            budget.setIngressTotal(inTotal);
            budget.setUpdateDate(time);
            edit(budget);
        }catch(Exception ex){
            try {
                if(budget != null){
                    destroy(getActual(Main.getUser().getId()).getId());
                }
            } catch (NonexistentEntityException ex1) {
                Logger.getLogger(BudgetJpaController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }finally{
            em.close();
        }
    }
    
    /*
     * Method to regenerate an existing budget.
     */
    public void generateBudget(Timestamp updatedDate, String name, double ingressTotal, double expendingTotal)throws Exception{
        try {
            Budget budget = this.getActual(Main.getUser().getId());
            
            budget.setExpendingTotal(expendingTotal);
            budget.setIngressTotal(ingressTotal);
            budget.setUpdateDate(updatedDate);
            
            edit(budget);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();            
        }
    }
    
    /*
     * Method to find a budget by name
     */
    public List<Finance> findBudget(String name){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNativeQuery("Select * from BUDGET where BUDGET_NAME like '%"+name+"%' and BUDGETUSER_ID = "+
                    Main.getUser().getId(), Budget.class);
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    public int getBudgetCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Budget> rt = cq.from(Budget.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
