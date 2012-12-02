/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Nestor_Velasquez
 */
@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames={"BUDGETUSER_ID, BUDGET_NAME"})})
public class Budget extends Finance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="Budget_name")
    private String name;
    @Column(name="Budget_Status")
    private String Status;
    @Column(name="Expending_Total", columnDefinition="DOUBLE DEFAULT 0")
    private double expendingTotal;
    @Column(name="Ingress_Total", columnDefinition="DOUBLE DEFAULT 0")
    private double ingressTotal;
    @Column(name="Generate_Date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp generateDate;
    @Column(name="UPDATED_DATE", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp updateDate;
    @ManyToOne
    private BudgetUser budgetUser;
    @Column(name="Life_days")
    private int lifeDays;

    public Budget(String name, String Status, double expendingTotal, double ingressTotal, Timestamp generateDate, Timestamp updateDate, BudgetUser budgetUser, int lifeDays) {
        this.name = name;
        this.Status = Status;
        this.expendingTotal = expendingTotal;
        this.ingressTotal = ingressTotal;
        this.generateDate = generateDate;
        this.updateDate = updateDate;
        this.budgetUser = budgetUser;
        this.lifeDays = lifeDays;
    }

    
    public Budget() {
    
    }
    
    public Budget(String name) {
        this.name = name;
    }
    
    
    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;        
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Budget)) {
            return false;
        }
        Budget other = (Budget) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "com.budgetmanage.entities.Budget[ id=" + id + " ]";
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     *
     * @return
     */
    @Override
    public double getFinanceTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param expendingTotal
     */
    @Override
    public void seFinanceTotal(double financeTotal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return
     */
    @Override
    public Timestamp getGenerateDate() {
        return this.generateDate;
    }

    /**
     *
     * @param generateDate
     */
    @Override
    public void setGenerateDate(Timestamp generateDate) {
        this.generateDate = generateDate;
    }

    /**
     *
     * @return
     */
    @Override
    public Timestamp getUpdateDate() {
        return this.updateDate;
    }

    /**
     *
     * @param updateDate
     */
    @Override
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     *
     * @return
     */
    @Override
    public int getPriority() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param priority
     */
    @Override
    public void setPriority(int priority) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @return
     */
    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param type
     */
    @Override
    public void setType(String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the expendingTotal
     */
    public double getExpendingTotal() {
        return expendingTotal;
    }

    /**
     * @param expendingTotal the expendingTotal to set
     */
    public void setExpendingTotal(double expendingTotal) {
        this.expendingTotal = expendingTotal;
    }

    /**
     * @return the ingressTotal
     */
    public double getIngressTotal() {
        return ingressTotal;
    }

    /**
     * @param ingressTotal the ingressTotal to set
     */
    public void setIngressTotal(double ingressTotal) {
        this.ingressTotal = ingressTotal;
    }

    /**
     * @return the budgetUser
     */
    public BudgetUser getBudgetUser() {
        return budgetUser;
    }

    /**
     * @param budgetUser the budgetUser to set
     */
    public void setBudgetUser(BudgetUser budgetUser) {
        this.budgetUser = budgetUser;
    }

    /**
     * @return the lifeDays
     */
    public int getLifeDays() {
        return lifeDays;
    }

    /**
     * @param lifeDays the lifeDays to set
     */
    public void setLifeDays(int lifeDays) {
        this.lifeDays = lifeDays;
    }
}
