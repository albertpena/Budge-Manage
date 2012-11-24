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
    
    public abstract Integer getId();
    public abstract void setId(Integer id);
    public abstract int getFinanceTotal();
    public abstract void seFinanceTotal(int expendingTotal);
    public abstract String getGenerateDate();
    public abstract void setGenerateDate(String generateDate);
    public abstract String getUpdateDate();
    public abstract void setUpdateDate(String updateDate);
    public abstract int getPriority();
    public abstract void setPriority(int priority);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getType();
    public abstract void setType(String type);
}
