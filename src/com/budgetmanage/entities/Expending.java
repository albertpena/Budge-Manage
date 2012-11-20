package com.budgetmanage.entities;

import com.budgetmanage.util.Entities;

/**
 *
 * @author Nestor_Velasquez
 */
public class Expending extends Finance implements Entities{   

    public Expending(String name, String type, double amount, int priority) {
        this.name = name;
        this.type = type;
        this.amount = amount;        
        this.priority = priority;        
    }
    
    @Override
    public Finance get() {
        return this;
    }

    @Override
    public Finance get(String name) {
        return this;
    }
    
    public double getAmount() {
        return getAmount();
    }

    public void setAmount(double amount) {
        this.setAmount(amount);
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
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
    
}
