/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import com.budgetmanage.util.Entities;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Nestor_Velasquez
 */
public class Budget extends Finance implements Entities{

    private Set<Ingress>   ingresses = new HashSet<>();
    private Set<Expending> expending = new HashSet<>();
    
    public Budget() {
        
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

    /**
     *
     */
    @Override
    public void modify(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
