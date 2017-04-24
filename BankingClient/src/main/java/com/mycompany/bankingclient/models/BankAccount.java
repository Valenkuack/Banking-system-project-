/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingclient.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "bank_account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankAccount.findAll", query = "SELECT b FROM BankAccount b")
    , @NamedQuery(name = "BankAccount.findByAId", query = "SELECT b FROM BankAccount b WHERE b.aId = :aId")
    , @NamedQuery(name = "BankAccount.findByBalance", query = "SELECT b FROM BankAccount b WHERE b.balance = :balance")
    , @NamedQuery(name = "BankAccount.findByAccountType", query = "SELECT b FROM BankAccount b WHERE b.accountType = :accountType")
    , @NamedQuery(name = "BankAccount.findBySortCode", query = "SELECT b FROM BankAccount b WHERE b.sortCode = :sortCode")
    , @NamedQuery(name = "BankAccount.findByDateOfCreation", query = "SELECT b FROM BankAccount b WHERE b.dateOfCreation = :dateOfCreation")
    , @NamedQuery(name = "BankAccount.findByCreditCard", query = "SELECT b FROM BankAccount b WHERE b.creditCard = :creditCard")
    , @NamedQuery(name = "BankAccount.findByDebitCard", query = "SELECT b FROM BankAccount b WHERE b.debitCard = :debitCard")})
public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "a_id")
    private Integer aId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "sort_code")
    private Integer sortCode;
    @Column(name = "date_of_creation")
    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;
    @Column(name = "credit_card")
    private Integer creditCard;
    @Column(name = "debit_card")
    private Integer debitCard;
    @OneToMany(mappedBy = "aId")
    private Collection<Transaction> transactionCollection;
    @JoinColumn(name = "cus_id", referencedColumnName = "cus_id")
    @ManyToOne
    private Customer cusId;

    public BankAccount() {
    }

    public BankAccount(Integer aId) {
        this.aId = aId;
    }

    public Integer getAId() {
        return aId;
    }

    public void setAId(Integer aId) {
        this.aId = aId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Integer getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Integer creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(Integer debitCard) {
        this.debitCard = debitCard;
    }

    @XmlTransient
    public Collection<Transaction> getTransactionCollection() {
        return transactionCollection;
    }

    public void setTransactionCollection(Collection<Transaction> transactionCollection) {
        this.transactionCollection = transactionCollection;
    }

    public Customer getCusId() {
        return cusId;
    }

    public void setCusId(Customer cusId) {
        this.cusId = cusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aId != null ? aId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BankAccount)) {
            return false;
        }
        BankAccount other = (BankAccount) object;
        if ((this.aId == null && other.aId != null) || (this.aId != null && !this.aId.equals(other.aId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bankingclient.models.BankAccount[ aId=" + aId + " ]";
    }
    
}
