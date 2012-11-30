/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.dao;

import com.budgetmanage.entities.Account;
import java.util.List;

/**
 *
 * @author Alexateam
 */

//Data Access Object
public interface AccountDAo {
    
    
    public void create(Account account);
    
    public void delete(Integer id);
    
    public void update(Account account);
    
    public List<Account> listAll();
    
 
    
}
