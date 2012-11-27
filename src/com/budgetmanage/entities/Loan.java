/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;
                                            
                                          // Formula para calcular interes Ic= cant_inicial * (1+tasa/100)^periodos
/**
 *
 * @author Alexateam
 */
public class Loan {
  
     
    private double amount;
    private int shares;
    private double interest;
    
    public void create(){
    
        
    }
    
    
    public Loan get()
    {
        return null;
    }
    
    /*
     * @return amount
     */
    public double getAmount() {
        
        return amount;
    }

    public int getShares() {
        return shares;
    }

    public double getInterest() {
        return interest;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public void setInterest(double interest) {
            this.interest = interest;
        
    
    
}
    
    
}