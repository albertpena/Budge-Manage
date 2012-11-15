package com.budgemanage.entities;

import com.budgetmanage.util.Entities;

/**
 *
 * @author Nestor_Velasquez
 */
public class Expending extends Finance implements Entities{   

    public Expending(double amount, int concept) {
        setAmount(amount);
        setConcept(concept);
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

    public void setConcept(int concept) {
        this.setConcept(concept);
    }

    public int getConcept() {
        return getConcept();
    }    

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modify() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
