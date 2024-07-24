/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class ForgotPassword extends javax.swing.JFrame {
    Connection connect = null;
    ResultSet result = null;
    PreparedStatement pst = null;
    
    public ForgotPassword() {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
        // Database Connection
        connect = Database.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ForgotPasswordPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        ForgotPasswordText = new javax.swing.JTextField();
        ForgotPasswordForm = new javax.swing.JPanel();
        AdminID = new javax.swing.JLabel();
        AdminIDField = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        SecurityQuestion = new javax.swing.JTextField();
        SecurityAnswer = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        RecoverPassword = new javax.swing.JButton();
        PasswordField = new javax.swing.JTextField();
        GobackButton = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        DevelopedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ForgotPasswordPanel.setBackground(new java.awt.Color(54, 79, 107));

        Header.setBackground(new java.awt.Color(63, 193, 201));
        Header.setPreferredSize(new java.awt.Dimension(900, 86));

        ForgotPasswordText.setEditable(false);
        ForgotPasswordText.setBackground(new java.awt.Color(63, 193, 201));
        ForgotPasswordText.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ForgotPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        ForgotPasswordText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ForgotPasswordText.setText("Forgot Password");
        ForgotPasswordText.setBorder(null);
        ForgotPasswordText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ForgotPasswordText.setFocusable(false);
        ForgotPasswordText.setHighlighter(null);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(ForgotPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ForgotPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        ForgotPasswordForm.setOpaque(false);
        ForgotPasswordForm.setPreferredSize(new java.awt.Dimension(600, 100));

        AdminID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AdminID.setForeground(new java.awt.Color(245, 245, 245));
        AdminID.setText("Admin ID");

        AdminIDField.setForeground(new java.awt.Color(153, 153, 153));
        AdminIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdminIDField.setText("Enter ID to Search");
        AdminIDField.setMinimumSize(new java.awt.Dimension(64, 30));
        AdminIDField.setPreferredSize(new java.awt.Dimension(64, 30));
        AdminIDField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AdminIDFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdminIDFieldFocusLost(evt);
            }
        });
        AdminIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdminIDFieldKeyPressed(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        FirstName.setForeground(new java.awt.Color(245, 245, 245));
        FirstName.setText("First Name");

        FirstNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FirstNameField.setMinimumSize(new java.awt.Dimension(64, 30));
        FirstNameField.setPreferredSize(new java.awt.Dimension(64, 30));

        LastName.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LastName.setForeground(new java.awt.Color(245, 245, 245));
        LastName.setText("Last Name");

        LastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LastNameField.setMinimumSize(new java.awt.Dimension(64, 30));
        LastNameField.setPreferredSize(new java.awt.Dimension(64, 30));

        SecurityQuestion.setEditable(false);
        SecurityQuestion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SecurityQuestion.setFocusable(false);
        SecurityQuestion.setMinimumSize(new java.awt.Dimension(64, 30));
        SecurityQuestion.setPreferredSize(new java.awt.Dimension(64, 30));

        SecurityAnswer.setForeground(new java.awt.Color(153, 153, 153));
        SecurityAnswer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SecurityAnswer.setText("Answer");
        SecurityAnswer.setMinimumSize(new java.awt.Dimension(64, 30));
        SecurityAnswer.setPreferredSize(new java.awt.Dimension(64, 30));
        SecurityAnswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SecurityAnswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SecurityAnswerFocusLost(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(245, 245, 245));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email.setText("Email");

        EmailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailField.setPreferredSize(new java.awt.Dimension(64, 30));

        Password.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(245, 245, 245));
        Password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Password.setText("Password");

        RecoverPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        RecoverPassword.setForeground(new java.awt.Color(54, 79, 107));
        RecoverPassword.setText("Recover Password");
        RecoverPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecoverPassword.setPreferredSize(new java.awt.Dimension(140, 30));
        RecoverPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecoverPasswordMouseClicked(evt);
            }
        });
        RecoverPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecoverPasswordKeyPressed(evt);
            }
        });

        PasswordField.setEditable(false);
        PasswordField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        PasswordField.setFocusable(false);
        PasswordField.setPreferredSize(new java.awt.Dimension(64, 30));

        GobackButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        GobackButton.setForeground(new java.awt.Color(54, 79, 107));
        GobackButton.setText("Go Back");
        GobackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GobackButton.setPreferredSize(new java.awt.Dimension(90, 30));
        GobackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GobackButtonMouseClicked(evt);
            }
        });
        GobackButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GobackButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ForgotPasswordFormLayout = new javax.swing.GroupLayout(ForgotPasswordForm);
        ForgotPasswordForm.setLayout(ForgotPasswordFormLayout);
        ForgotPasswordFormLayout.setHorizontalGroup(
            ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                        .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ForgotPasswordFormLayout.createSequentialGroup()
                                .addComponent(RecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GobackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ForgotPasswordFormLayout.createSequentialGroup()
                                .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ForgotPasswordFormLayout.createSequentialGroup()
                                        .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AdminID)
                                            .addComponent(AdminIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FirstName))
                                        .addGap(35, 35, 35)
                                        .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LastName)
                                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(105, 105, 105))
                    .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                        .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SecurityAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(SecurityQuestion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ForgotPasswordFormLayout.setVerticalGroup(
            ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                        .addComponent(AdminID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                            .addComponent(FirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                            .addComponent(LastName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addComponent(SecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecurityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GobackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Footer.setBackground(new java.awt.Color(63, 193, 201));
        Footer.setPreferredSize(new java.awt.Dimension(0, 30));

        DevelopedBy.setEditable(false);
        DevelopedBy.setBackground(new java.awt.Color(63, 193, 201));
        DevelopedBy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DevelopedBy.setForeground(new java.awt.Color(255, 255, 255));
        DevelopedBy.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DevelopedBy.setText("Developed By: Hafiz Muhammad Saad");
        DevelopedBy.setBorder(null);
        DevelopedBy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DevelopedBy.setFocusable(false);
        DevelopedBy.setHighlighter(null);

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DevelopedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DevelopedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ForgotPasswordPanelLayout = new javax.swing.GroupLayout(ForgotPasswordPanel);
        ForgotPasswordPanel.setLayout(ForgotPasswordPanelLayout);
        ForgotPasswordPanelLayout.setHorizontalGroup(
            ForgotPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordPanelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(ForgotPasswordForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        ForgotPasswordPanelLayout.setVerticalGroup(
            ForgotPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ForgotPasswordForm, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgotPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgotPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SecurityAnswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SecurityAnswerFocusGained
        // TODO add your handling code here:
        if (SecurityAnswer.getText().trim().equals("Answer")) {
            SecurityAnswer.setText("");
            SecurityAnswer.setForeground(new Color(153,153,153));
        }
        SecurityAnswer.setForeground(Color.BLACK);
    }//GEN-LAST:event_SecurityAnswerFocusGained

    private void SecurityAnswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SecurityAnswerFocusLost
        // TODO add your handling code here:
        if (SecurityAnswer.getText().trim().equals("")) {
            SecurityAnswer.setText("Answer");
            SecurityAnswer.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_SecurityAnswerFocusLost

    private void GobackButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GobackButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            LogInAdmin log = new LogInAdmin();
            log.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_GobackButtonKeyPressed

    private void GobackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GobackButtonMouseClicked
        // TODO add your handling code here:
        LogInAdmin log = new LogInAdmin();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GobackButtonMouseClicked

    private void RecoverPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecoverPasswordMouseClicked
        // TODO add your handling code here:
        String ans = SecurityAnswer.getText();
        if (ans.equals("")) {
            SecurityAnswer.setForeground(Color.RED);
        } else {
            try {
                String query = "SELECT * FROM `signup` WHERE `sAnswer`='"+ans+"'";
                pst = connect.prepareStatement(query);
                result = pst.executeQuery();
                if (result.next()) {
                    String answer = result.getString(10);
                    PasswordField.setText("Your password is: " + answer);
                } else {
                    SecurityAnswerWrong wronganswer = new SecurityAnswerWrong();
                    wronganswer.setVisible(true);
                    new Timer().schedule(new TimerTask() {
                        public void run() {
                            wronganswer.dispose();
                        }
                    }, 1000);
                    PasswordField.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_RecoverPasswordMouseClicked

    private void RecoverPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecoverPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String ans = SecurityAnswer.getText();
            if (ans.equals("")) {
                SecurityAnswer.setForeground(Color.RED);
            } else {
                try {
                    String query = "SELECT * FROM `signup` WHERE `sAnswer`='"+ans+"'";
                    pst = connect.prepareStatement(query);
                    result = pst.executeQuery();
                    if (result.next()) {
                        String answer = result.getString(10);
                        PasswordField.setText("Your password is: " + answer);
                    } else {
                        SecurityAnswerWrong wronganswer = new SecurityAnswerWrong();
                        wronganswer.setVisible(true);
                        new Timer().schedule(new TimerTask() {
                            public void run() {
                                wronganswer.dispose();
                            }
                        }, 1000);
                        PasswordField.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
        }
    }//GEN-LAST:event_RecoverPasswordKeyPressed

    private void AdminIDFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminIDFieldFocusGained
        // TODO add your handling code here:
        if (AdminIDField.getText().trim().equals("Enter ID to Search")) {
            AdminIDField.setText("");
            AdminIDField.setForeground(new Color(153,153,153));
        }
        AdminIDField.setForeground(Color.BLACK);
    }//GEN-LAST:event_AdminIDFieldFocusGained

    private void AdminIDFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminIDFieldFocusLost
        // TODO add your handling code here:
        if (AdminIDField.getText().trim().equals("")) {
            AdminIDField.setText("Enter ID to Search");
            AdminIDField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_AdminIDFieldFocusLost

    private void AdminIDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminIDFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String Admin_ID = AdminIDField.getText();
            try {
                String query = "SELECT * FROM `signup` WHERE `Admin_ID` = ?";
                pst = connect.prepareStatement(query);
                pst.setString(1, Admin_ID);
                result = pst.executeQuery();
                if (result.next()) {
                    FirstNameField.setText(result.getString(2));
                    LastNameField.setText(result.getString(3));
                    SecurityQuestion.setText(result.getString(7));
                    EmailField.setText(result.getString(9));
                } else {
                    IDNotFound idnotfound = new IDNotFound();
                    idnotfound.setVisible(true);
                    new Timer().schedule(new TimerTask() {
                        public void run() {
                            idnotfound.dispose();
                        }
                    }, 1000);
                    
                    FirstNameField.setText("");
                    LastNameField.setText("");
                    SecurityQuestion.setText("");
                    SecurityAnswer.setText("");
                    EmailField.setText("");
                    PasswordField.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_AdminIDFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminID;
    private javax.swing.JTextField AdminIDField;
    private javax.swing.JTextField DevelopedBy;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel ForgotPasswordForm;
    private javax.swing.JPanel ForgotPasswordPanel;
    private javax.swing.JTextField ForgotPasswordText;
    private javax.swing.JButton GobackButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JButton RecoverPassword;
    private javax.swing.JTextField SecurityAnswer;
    private javax.swing.JTextField SecurityQuestion;
    // End of variables declaration//GEN-END:variables
}
