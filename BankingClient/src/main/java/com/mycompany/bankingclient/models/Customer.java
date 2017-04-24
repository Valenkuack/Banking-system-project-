/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingclient.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCusId", query = "SELECT c FROM Customer c WHERE c.cusId = :cusId")
    , @NamedQuery(name = "Customer.findByFullName", query = "SELECT c FROM Customer c WHERE c.fullName = :fullName")
    , @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address")
    , @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")
    , @NamedQuery(name = "Customer.findByMobile", query = "SELECT c FROM Customer c WHERE c.mobile = :mobile")
    , @NamedQuery(name = "Customer.findBySecurityAnswer", query = "SELECT c FROM Customer c WHERE c.securityAnswer = :securityAnswer")
    , @NamedQuery(name = "Customer.findBySecurityQuestion", query = "SELECT c FROM Customer c WHERE c.securityQuestion = :securityQuestion")
    , @NamedQuery(name = "Customer.findByPasscode", query = "SELECT c FROM Customer c WHERE c.passcode = :passcode")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cus_id")
    private Integer cusId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private Integer mobile;
    @Column(name = "security_answer")
    private String securityAnswer;
    @Column(name = "security_question")
    private String securityQuestion;
    @Column(name = "passcode")
    private String passcode;
    @OneToMany(mappedBy = "cusId")
    private Collection<Transaction> transactionCollection;
    @OneToMany(mappedBy = "cusId")
    private Collection<BankAccount> bankAccountCollection;

    public Customer() {
    }

    public Customer(Integer cusId) {
        this.cusId = cusId;
    }

    public Customer(Integer cusId, String fullName, String address, String email, Integer mobile, String securityAnswer, String securityQuestion, String passcode) {
        this.cusId = cusId;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.securityAnswer = securityAnswer;
        this.securityQuestion = securityQuestion;
        this.passcode = passcode;
    }
    
    

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @XmlTransient
    public Collection<Transaction> getTransactionCollection() {
        return transactionCollection;
    }

    public void setTransactionCollection(Collection<Transaction> transactionCollection) {
        this.transactionCollection = transactionCollection;
    }

    @XmlTransient
    public Collection<BankAccount> getBankAccountCollection() {
        return bankAccountCollection;
    }

    public void setBankAccountCollection(Collection<BankAccount> bankAccountCollection) {
        this.bankAccountCollection = bankAccountCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusId != null ? cusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.cusId == null && other.cusId != null) || (this.cusId != null && !this.cusId.equals(other.cusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bankingclient.models.Customer[ cusId=" + cusId + " ]";
    }
    
}
