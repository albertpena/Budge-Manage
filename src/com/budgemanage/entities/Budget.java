/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgemanage.entities;

import com.budgetmanage.util.Entities;

/**
 *
 * @author Nestor_Velasquez
 */
public class Budget extends Finance implements Entities{

    public Budget() {
    }
    
    public Budget(double amount, int concept) {
        setAmount(amount);
        setConcept(concept);
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
    public void modify() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setConcept(int concept) {
        this.concept = concept;
    }

    public int getConcept() {
        return concept;
    }
}
