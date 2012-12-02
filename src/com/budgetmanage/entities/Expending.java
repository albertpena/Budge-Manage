/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Nestor_Velasquez
 */
@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames={"BUDGETUSER_ID, EXPENDING_NAME"})})
public class Expending extends Finance implements Serializable {
    @ManyToOne
    @JoinColumn(unique=true)
    private BudgetUser budgetUser;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Expending_id")
    private Integer id;
    
    @Column(name="Expending_name")
    private String name;
    @Column(name="Expending_total")
    private int expendingTotal;
    @Column(name="Generate_Date")
    private String generateDate;
    @Column(name="Update_Date")
    private String updateDate;
    @Column(name="Expending_priority")
    private int priority;
    @Column(name="Expending_Type")
    private String type;
    
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
        if (!(object instanceof Expending)) {
            return false;
        }
        Expending other = (Expending) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * @return the expendingTotal
     */
    @Override
    public int getFinanceTotal() {
        return expendingTotal;
    }

    /**
     * @param expendingTotal the expendingTotal to set
     */
    @Override
    public void seFinanceTotal(int expendingTotal) {
        this.expendingTotal = expendingTotal;
    }

    /**
     * @return the generateDate
     */
    @Override
    public String getGenerateDate() {
        return generateDate;
    }

    /**
     * @param generateDate the generateDate to set
     */
    @Override
    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    /**
     * @return the updateDate
     */
    @Override
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    @Override
    public void setUpdateDate(String updateDate) {
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
