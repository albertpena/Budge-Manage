/*
 * To change this template, choose Tools | Templates   tesg
 * and open the template in the editor.
 */
package com.budgetmanage.entities;       

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alexateam
 */
//testing linked form

@Entity
@Table(name ="accounts")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT e FROM Account e")
        
})
public class Account implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    //Recurda poner para que genere el id automatico, el codigo que habia se me olvido
    @Id
    private Integer id;
    
    //Migrating
    
    @Column(name = "balance")
    private Double balance;
    
    @Column(name="account_number")
    private String  accountNumber;
    
    @Column(name="account_bank")
    private String accountBank;

    public Account() {
    }

    public Account(double balance, String accountNumber, String accountBank) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountBank = accountBank;
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
    
}
