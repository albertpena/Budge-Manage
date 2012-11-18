/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;
import com.budgetmanage.util.Entities;

/**
 * The User class have all about the User's management 
 * @author Fulvio
 */
public class User implements Entities{
    private String name;
    private String lastName;
    private String password;
    private String userName;

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
     @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modify(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String name) {
        /*This method without your name is delete its fuction is disable users
         on the system*/
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
