/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingclient;

import com.mycompany.bankingclient.models.BankAccount;
import com.mycompany.bankingclient.models.Customer;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 * CreateAccount.java
 * 
 * @reference https://www.youtube.com/watch?v=RDUPOnXCmuw&feature=youtu.be
 * @author Jun Hsin Lim, 16123107
 * @author Jessica Valeria, 16118677
 */
public class CreateAccount extends javax.swing.JFrame {
    final String ACCOUNT_API_PATH = "http://localhost:8080/BankingSystem/api/bankAccount";
    Customer customer; 
    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        userName.setText(customer.getFullName());
    }
    
    /**
     * Create a client Method
     */
    public void createAccount (BankAccount account) {
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        accountType = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        debitCard = new javax.swing.JCheckBox();
        creditCard = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("jj's bank");

        userName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userName.setText("*User Name*");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Account type:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Debit card:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Credit Card");

        accountType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        accountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Current", "Fixed Deposit" }));
        accountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accountType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(debitCard)
                                    .addComponent(creditCard))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(45, 45, 45))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(debitCard))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(creditCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        /*
        * @reference https://www.youtube.com/watch?v=RDUPOnXCmuw&feature=youtu.be
        */
        BankAccount a = new BankAccount();
        a.setBalance(BigDecimal.ZERO);
        a.setAccountType(accountType.getSelectedItem().toString());
        a.setSortCode(112233);
        a.setDateOfCreation(new Date());
        a.setCusId(customer);
        
        /*
        * @author Jun Hsin Lim, 16123107
        */
        if(debitCard.isSelected() == true){
            int cardNo;
            cardNo = (int) (Math.random()*9999999 + 1000000);
            a.setDebitCard(cardNo);
        }
        if(creditCard.isSelected() == true){
            int cardNo;
            cardNo = (int) (Math.random()*9999999 + 1000000);
            a.setCreditCard(cardNo);
        }
        
        /*
        * @reference https://www.youtube.com/watch?v=RDUPOnXCmuw&feature=youtu.be
        */
        boolean status = RESTConnection.sendPostRequest(a, ACCOUNT_API_PATH);
        if(status == true){
            JOptionPane.showMessageDialog(null, "Your new account has been created.");
            
            Home myHome = new Home();
            myHome.setCustomer(customer);
            myHome.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to create new account.");
        }
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountType;
    private javax.swing.JCheckBox creditCard;
    private javax.swing.JCheckBox debitCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submit;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
