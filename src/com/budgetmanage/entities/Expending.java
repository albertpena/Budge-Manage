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
import javax.persistence.ManyToOne;

/**
 *
 * @author Nestor_Velasquez
 */
@Entity
public class Expending implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Expending_id")
    private Integer id;
    
    @Column(unique=true,name="Expending_name")
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
    
    public Integer getId() {
        return id;
    }

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
    public int getExpendingTotal() {
        return expendingTotal;
    }

    /**
     * @param expendingTotal the expendingTotal to set
     */
    public void setExpendingTotal(int expendingTotal) {
        this.expendingTotal = expendingTotal;
    }

    /**
     * @return the generateDate
     */
    public String getGenerateDate() {
        return generateDate;
    }

    /**
     * @param generateDate the generateDate to set
     */
    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    /**
     * @return the updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
