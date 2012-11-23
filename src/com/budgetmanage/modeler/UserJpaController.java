/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.modeler;

import com.budgetmanage.entities.User;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Fulvio
 */
public class UserJpaController implements Serializable{
    private EntityManagerFactory emf;
    public UserJpaController(EntityManagerFactory _emf){
        this.emf = _emf;
    }
    
    /**
     * Method that return a EntityManager as from a object EntityManagerFactory 
     * @param emf object instance EntityManagerFactory
     * @return a new object EntityManager
     */
    public EntityManager getEntityManager(EntityManagerFactory emf){
        return emf.createEntityManager();
    }
    /**
     * Method for validation if a user was in the database
     * @param user an Object type User
     * @return a values indicating is the operation
     */
    public boolean userExist(User user){
        EntityManager em = getEntityManager(emf);
        
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(User.class));
        em.getTransaction().begin();
        Query q = em.createQuery(cq);
        em.close();
        return q.getResultList().contains(user);
    }
    
}
