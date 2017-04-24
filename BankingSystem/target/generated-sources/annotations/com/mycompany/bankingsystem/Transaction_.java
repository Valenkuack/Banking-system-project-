package com.mycompany.bankingsystem;

import com.mycompany.bankingsystem.BankAccount;
import com.mycompany.bankingsystem.Customer;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-24T13:41:27")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-25T00:22:28")
>>>>>>> 4c00f80d676ad1b35ba698a79a5abb6e66a74c3c
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Date> date;
    public static volatile SingularAttribute<Transaction, BigDecimal> amount;
    public static volatile SingularAttribute<Transaction, String> tType;
    public static volatile SingularAttribute<Transaction, Customer> cusId;
    public static volatile SingularAttribute<Transaction, String> description;
    public static volatile SingularAttribute<Transaction, BankAccount> aId;
    public static volatile SingularAttribute<Transaction, Integer> tId;

}