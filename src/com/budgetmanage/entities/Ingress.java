/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import com.budgetmanage.util.Entities;

/**
 *
 * @author Nestor_Velasquez
 */
public class Ingress extends Finance implements Entities {

    
    public Ingress() {
    
    }
    
    public Ingress(String name, String type, double amount, int priority){
        this.name = name;
        this.type = type;
        this.amount = amount;        
        this.priority = priority;
    }
    
    @Override
    public Finance get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Finance get(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
    
    
}
