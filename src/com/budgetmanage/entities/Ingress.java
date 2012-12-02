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
@Table(uniqueConstraints= {@UniqueConstraint(columnNames={"BUDGETUSER_ID", "BUDGET_NAME"})})
public class Ingress extends Finance implements Serializable {
    @ManyToOne
    private BudgetUser budgetUser;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="Ingress_name")
    private String name;
    @Column(name="Ingress_total")
    private double ingressTotal;
    @Column(name="Generate_Date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp generateDate;
    @Column(name="Update_Date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp updateDate;
    @Column(name="Ingress_priority")
    private int priority;
    @Column(name="Ingress_type")
    private String type;

    public Ingress() {
    }

    public Ingress(BudgetUser budgetUser, String name, double ingressTotal, Timestamp generateDate, Timestamp updateDate, int priority, String type) {
        this.budgetUser = budgetUser;
        this.name = name;
        this.ingressTotal = ingressTotal;
        this.generateDate = generateDate;
        this.updateDate = updateDate;
        this.priority = priority;
        this.type = type;
    }

    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingress)) {
            return false;
        }
        Ingress other = (Ingress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.budgetmanage.entities.Ingress[ id=" + id + " ]";
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ingressTotal
     */
    @Override
    public double getFinanceTotal() {
        return ingressTotal;
    }

    /**
     * @param ingressTotal the ingressTotal to set
     */
    @Override
    public void seFinanceTotal(double ingressTotal) {
        this.ingressTotal = ingressTotal;
    }

    /**
     * @return the generateDate
     */
    @Override
    public Timestamp getGenerateDate() {
        return generateDate;
    }

    /**
     * @param generateDate the generateDate to set
     */
    @Override
    public void setGenerateDate(Timestamp generateDate) {
        this.generateDate = generateDate;
    }

    /**
     * @return the updateDate
     */
    @Override
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    @Override
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the priority
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the type
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    @Override
    public void setType(String type) {
        this.type = type;
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
    
}
