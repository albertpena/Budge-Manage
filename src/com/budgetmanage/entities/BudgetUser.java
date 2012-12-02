/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Fulvio
 */
@Entity
public class BudgetUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //
    private Long id;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String apellidos;
    @Column(nullable=false, unique=true)
    private String userName;
    @Column(nullable=false)
    private String password;
    private boolean status_User;

    @OneToMany(mappedBy = "budgetUser")
    List<Budget> budgets;
    @OneToMany(mappedBy = "budgetUser")
    List<Expending> expendings;
    @OneToMany(mappedBy = "budgetUser")
    List<Ingress> ingresses;
    @OneToMany(mappedBy = "budgetUser")
    List<Account> accounts;
    
    
    public void addFinance(Finance finance){
        if(finance instanceof Budget){
            if(budgets == null){
                budgets = new ArrayList<>();
            }
            budgets.add((Budget) finance);
            ((Budget) finance).setBudgetUser(this);
        }
        if(finance instanceof Expending){
            if(expendings == null){
                expendings = new ArrayList<>();
            }
            expendings.add((Expending) finance);
            ((Expending) finance).setBudgetUser(this);
        }
        if(finance instanceof Ingress){
            if(ingresses == null){
                ingresses = new ArrayList<>();
            }
            ingresses.add((Ingress) finance);
            ((Ingress) finance).setBudgetUser(this);
        }
        
    }
    
    public void addAccount(Account account){
        if(accounts == null){
            accounts = new ArrayList<>();
        }
        accounts.add(account);
        account.setBudgetUser(this);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof BudgetUser)) {
            return false;
        }
        BudgetUser other = (BudgetUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.budgetmanage.entities.User[ id=" + id + " ]";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the status_User
     */
    public boolean isStatus_User() {
        return status_User;
    }

    /**
     * @param status_User the status_User to set
     */
    public void setStatus_User(boolean status_User) {
        this.status_User = status_User;
    }
}
