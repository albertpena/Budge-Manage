/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.Account;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.modeler.exceptions.PreexistingEntityException;
import com.budgetmanage.ui.Main;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Alexateam
 */
public class AccountJpaController implements Serializable {

    public AccountJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Account account) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(account);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Account account) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            account = em.merge(account);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = account.getId();
                if (findAccount(id) == null) {
                    throw new NonexistentEntityException("The account with id " + id + " no longer exists.");
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
            Account account;
            try {
                account = em.getReference(Account.class, id);
                account.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The account with id " + id + " no longer exists.", enfe);
            }
            em.remove(account);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Account> findAccountEntities() {
        return findAccountEntities(true, -1, -1);
    }

    public List<Account> findAccountEntities(int maxResults, int firstResult) {
        return findAccountEntities(false, maxResults, firstResult);
    }

    private List<Account> findAccountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Account.class));
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

    public List<Account> findAccounts(){
        EntityManager em = getEntityManager();
        Query q;
        List<Account> accounts = null;
        try{
            q = em.createNativeQuery("Select * from accounts where budgetuser_id = "+Main.getUser().getId(), Account.class);
            accounts = q.getResultList();
        }catch (Exception ex){
            ex.printStackTrace();
            accounts = new ArrayList<>();
        }
        finally{
            em.close();
            return accounts;
        }
    }
    public List<Account> findAccountByNo(String number) throws NonexistentEntityException{
        EntityManager em = getEntityManager();
        Query q;
        List<Account> accounts = null;
        try{
            q = em.createNativeQuery("Select * from accounts where budgetuser_id = "+Main.getUser().getId()+
                                      " and account_number = '"+number+"'", Account.class);
            accounts = q.getResultList();
        }catch (Exception ex){
            ex.printStackTrace();
            throw new NonexistentEntityException("No existen cuentas para este usuario");
        }
        finally{
            em.close();
            return accounts;
        }
    }
    
       public Account findAccount(String number) throws NonexistentEntityException{
        EntityManager em = getEntityManager();
        Query q;
        Account account = null;
        try{
            q = em.createNativeQuery("Select * from accounts where budgetuser_id = "+Main.getUser().getId()+
                                      " and account_number = '"+number+"'", Account.class);
            account = (Account) q.getSingleResult();
        }catch (Exception ex){
            ex.printStackTrace();
            throw new NonexistentEntityException("No existen cuentas para este usuario");
        }
        finally{
            em.close();
            return account;
        }
    }
    
    public Account findAccount(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Account.class, id);
        } finally {
            em.close();
        }
    }

    public int getAccountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Account> rt = cq.from(Account.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
