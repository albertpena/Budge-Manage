/*
 * To change this template, choose Tools | Templates   tesg
 * and open the template in the editor.
 */
package com.budgetmanage.entities;       

import com.budgetmanage.ui.Main;
import com.budgetmanage.util.Constant;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Alexateam
 */
//testing linked form

@Entity
@Table(name ="accounts", uniqueConstraints={@UniqueConstraint(columnNames={"account_number","account_bank","budgetuser_id"})})
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT e FROM Account e")
        
})
public class Account implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    //Recurda poner para que genere el id automatico, el codigo que habia se me olvido
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    //Migrating
    
    @Column(name = "balance")
    private Double balance;
    
    @Column(name="account_number")
    private String  accountNumber;
    
    @Column(name="account_bank")
    private String accountBank;
    @ManyToOne
    private BudgetUser budgetUser;

    public Account() {
    }

    public Account(String accountNumber, String accountBank) {
        this.balance = Constant.INITIAL_ACCOUNT_VALUE;
        this.accountNumber = accountNumber;
        this.accountBank = accountBank;
        budgetUser = Main.getUser();
    }
    
    

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }
    
    
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.budgetmanage.entities.Account[ id=" + id + " ]";
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
