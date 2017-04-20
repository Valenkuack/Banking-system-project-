create database banking;

use banking;

drop table if exists customer;

create table customer
(
cus_id INTEGER(10),
full_name VARCHAR (30),
address VARCHAR (50),
email VARCHAR (20),
mobile INTEGER (15),
security_answer VARCHAR (20),
security_question VARCHAR (20),
passcode VARCHAR (15),
primary key (cus_id)
);

CREATE TABLE bank_account
(
a_id INTEGER (10),
balance DECIMAL(10,2),
account_type VARCHAR (20),
sort_code INTEGER(10),
date_of_creation DATE,
credit_card INTEGER(15),
debit_card INTEGER(15),
cus_id INTEGER(10),
FOREIGN KEY (cus_id) REFERENCES Customer(cus_id),
PRIMARY KEY (a_id)
);

CREATE TABLE transaction
(
t_id INTEGER (10),
a_id INTEGER (10),
cus_id INTEGER (10),
amount DECIMAL (10,2),
description VARCHAR (20),
t_type VARCHAR (20),
date DATE,
FOREIGN KEY (a_id) REFERENCES bank_account(a_id),
FOREIGN KEY (cus_id) REFERENCES Customer(cus_id),
PRIMARY KEY (t_id)
);

