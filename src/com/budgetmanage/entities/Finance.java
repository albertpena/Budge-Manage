/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

/**
 *
 * @author Nestor_Velasquez
 */
public abstract class Finance {
    public double amount;    
    public int priority;
    public String name;
    public String type;
    
    public abstract Finance get();
    public abstract Finance get(String name);

}
