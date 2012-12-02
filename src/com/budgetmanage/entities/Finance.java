/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Nestor_Velasquez
 */
public abstract class Finance {
    
    public abstract Integer getId();
    public abstract void setId(Integer id);
    public abstract double getFinanceTotal();
    public abstract void seFinanceTotal(double financeTotal);
    public abstract Timestamp getGenerateDate();
    public abstract void setGenerateDate(Timestamp generateDate);
    public abstract Timestamp getUpdateDate();
    public abstract void setUpdateDate(Timestamp updateDate);
    public abstract int getPriority();
    public abstract void setPriority(int priority);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getType();
    public abstract void setType(String type);
}
