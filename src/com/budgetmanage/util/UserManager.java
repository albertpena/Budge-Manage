/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;
import com.budgetmanage.entities.User;

/**
 *
 * @author Fulvio
 */
public class UserManager {
    /**
     * Static method for validate the access on the system.
     * @param user a instance the entities.User
     * @return  return a boolean values 
     *          True : User access correctly. 
     *          False: User had a denied status.
     */
    public static boolean accessUser(User user){
        
        String pass     = user.getPassword();
        String userName = user.getUserName();
        return true;
    }
    
    
}
