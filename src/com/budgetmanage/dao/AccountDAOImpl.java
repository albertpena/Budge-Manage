/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.dao;

import com.budgetmanage.entities.Account;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Alexateam
 */

//Implementando la interfaz AccountDAo
public  class AccountDAOImpl implements AccountDAo{
    
    //Se crea la factoria de EntityManager
    //En Persistence se pone el mismo nombre que tiene el persistence.xml
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("BudgeManagePU");

    @Override
    public void create(Account account) {
        
        //Se crea entity Manager
        // para administrar un lote de entidades, sea cual sea
       EntityManager entityManager = emf.createEntityManager();
       
       //Creacion de la transaccion
       EntityTransaction transaction = entityManager.getTransaction();
       
       // se inicia la transaction
       transaction.begin();
       
       //Se periste el objeto, en la bd
       entityManager.persist(account);
       
       //Y luego se autoirza o se da commit para que lo guarde pernamente
       transaction.commit();
       
       //Se cierra el entityManager
       entityManager.close();
       
    }

    @Override
    public void delete(Integer id) {
          //Se crea entity Manager
       EntityManager entityManager = emf.createEntityManager();
       
       //Se crea transaccion
       EntityTransaction transaction = entityManager.getTransaction();
       
       //inciia la transaccion
       transaction.begin();
       
       //Este bloke obtiene la clase entidad a partir de su id
       Account acount = (Account) entityManager.find(Account.class, id);
       
       
       //Lo elimina de la base de dato
       entityManager.remove(acount);
       
       //Se autoriza
       transaction.commit();
       entityManager.close();
       
        
    }

    @Override
    public void update(Account account) {
          //Se crea entity Manager
       EntityManager entityManager = emf.createEntityManager();
       
       //Se crea transaccion
       EntityTransaction transaction = entityManager.getTransaction();
       transaction.begin();
       
       //Se actualiza
       entityManager.merge(account);
       
       //lo Autoriza
       transaction.commit();
       entityManager.close();
    }

    @Override
    public List<Account> listAll() {
        
        //Se crea una lista del tipo de entidad
        List<Account> lista = new ArrayList<Account>();
     
         EntityManager entityManager = emf.createEntityManager();
         
         
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        
        //se crea un query a paratir del nombre del namedQuery
        Query query = entityManager.createNamedQuery("Account.findAll");
        
        // retorna una lista con las entidades
        lista = query.getResultList();
        return lista;
     
    }


    
}
