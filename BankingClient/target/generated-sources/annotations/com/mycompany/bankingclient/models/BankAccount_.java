package com.mycompany.bankingclient.models;

import com.mycompany.bankingclient.models.Customer;
import com.mycompany.bankingclient.models.Transaction;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-25T07:29:16")
@StaticMetamodel(BankAccount.class)
public class BankAccount_ { 

    public static volatile CollectionAttribute<BankAccount, Transaction> transactionCollection;
    public static volatile SingularAttribute<BankAccount, BigDecimal> balance;
    public static volatile SingularAttribute<BankAccount, Customer> cusId;
    public static volatile SingularAttribute<BankAccount, String> accountType;
    public static volatile SingularAttribute<BankAccount, Integer> debitCard;
    public static volatile SingularAttribute<BankAccount, Integer> creditCard;
    public static volatile SingularAttribute<BankAccount, Integer> aId;
    public static volatile SingularAttribute<BankAccount, Integer> sortCode;
    public static volatile SingularAttribute<BankAccount, Date> dateOfCreation;

}