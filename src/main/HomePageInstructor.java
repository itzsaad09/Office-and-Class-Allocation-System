/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class HomePageInstructor extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet result = null;
    PreparedStatement pst = null;
    
    String email;
    public HomePageInstructor() {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
        // Database Connection
        connect = Database.getConnection();
    }
    
    public HomePageInstructor(String email) {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
        // Database Connection
        connect = Database.getConnection();
        this.email = email;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePageInstructorPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        IDField = new javax.swing.JTextField();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        ShowClassesPanel = new javax.swing.JPanel();
        ShowClassesIconButton = new javax.swing.JButton();
        ShowClassesLabel = new javax.swing.JLabel();
        ShowOfficePanel = new javax.swing.JPanel();
        ShowOfficeIconButton = new javax.swing.JButton();
        ShowOfficeLabel = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        DevelopedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        HomePageInstructorPanel.setBackground(new java.awt.Color(54, 79, 107));

        Header.setBackground(new java.awt.Color(63, 193, 201));
        Header.setPreferredSize(new java.awt.Dimension(900, 86));

        LogoutButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(54, 79, 107));
        LogoutButton.setText("Logout");
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.setPreferredSize(new java.awt.Dimension(90, 30));
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });
        LogoutButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LogoutButtonKeyPressed(evt);
            }
        });

        IDField.setEditable(false);
        IDField.setBackground(new java.awt.Color(63, 193, 201));
        IDField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        IDField.setForeground(new java.awt.Color(255, 255, 255));
        IDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDField.setFocusable(false);

        FirstNameField.setEditable(false);
        FirstNameField.setBackground(new java.awt.Color(63, 193, 201));
        FirstNameField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        FirstNameField.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FirstNameField.setFocusable(false);

        LastNameField.setEditable(false);
        LastNameField.setBackground(new java.awt.Color(63, 193, 201));
        LastNameField.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(255, 255, 255));
        LastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastNameField.setFocusable(false);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 592, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ShowClassesPanel.setOpaque(false);
        ShowClassesPanel.setPreferredSize(new java.awt.Dimension(150, 150));

        ShowClassesIconButton.setBackground(new java.awt.Color(54, 79, 107));
        ShowClassesIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-class-96.png"))); // NOI18N
        ShowClassesIconButton.setBorder(null);
        ShowClassesIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowClassesIconButton.setPreferredSize(new java.awt.Dimension(102, 102));
        ShowClassesIconButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowClassesIconButtonMouseClicked(evt);
            }
        });
        ShowClassesIconButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowClassesIconButtonKeyPressed(evt);
            }
        });

        ShowClassesLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ShowClassesLabel.setForeground(new java.awt.Color(245, 245, 245));
        ShowClassesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowClassesLabel.setText("Show Classes");
        ShowClassesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowClassesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowClassesLabelMouseClicked(evt);
            }
        });
        ShowClassesLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowClassesLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ShowClassesPanelLayout = new javax.swing.GroupLayout(ShowClassesPanel);
        ShowClassesPanel.setLayout(ShowClassesPanelLayout);
        ShowClassesPanelLayout.setHorizontalGroup(
            ShowClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowClassesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ShowClassesIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(ShowClassesPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ShowClassesLabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        ShowClassesPanelLayout.setVerticalGroup(
            ShowClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowClassesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ShowClassesIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ShowClassesLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ShowOfficePanel.setOpaque(false);
        ShowOfficePanel.setPreferredSize(new java.awt.Dimension(150, 150));

        ShowOfficeIconButton.setBackground(new java.awt.Color(54, 79, 107));
        ShowOfficeIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-meeting-room-96.png"))); // NOI18N
        ShowOfficeIconButton.setBorder(null);
        ShowOfficeIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowOfficeIconButton.setPreferredSize(new java.awt.Dimension(102, 102));
        ShowOfficeIconButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowOfficeIconButtonMouseClicked(evt);
            }
        });
        ShowOfficeIconButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowOfficeIconButtonKeyPressed(evt);
            }
        });

        ShowOfficeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ShowOfficeLabel.setForeground(new java.awt.Color(245, 245, 245));
        ShowOfficeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowOfficeLabel.setText("Show Office");
        ShowOfficeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowOfficeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowOfficeLabelMouseClicked(evt);
            }
        });
        ShowOfficeLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowOfficeLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ShowOfficePanelLayout = new javax.swing.GroupLayout(ShowOfficePanel);
        ShowOfficePanel.setLayout(ShowOfficePanelLayout);
        ShowOfficePanelLayout.setHorizontalGroup(
            ShowOfficePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowOfficePanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(ShowOfficePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowOfficePanelLayout.createSequentialGroup()
                        .addComponent(ShowOfficeIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowOfficePanelLayout.createSequentialGroup()
                        .addComponent(ShowOfficeLabel)
                        .addGap(40, 40, 40))))
        );
        ShowOfficePanelLayout.setVerticalGroup(
            ShowOfficePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowOfficePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ShowOfficeIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ShowOfficeLabel)
                .addContainerGap())
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

        javax.swing.GroupLayout HomePageInstructorPanelLayout = new javax.swing.GroupLayout(HomePageInstructorPanel);
        HomePageInstructorPanel.setLayout(HomePageInstructorPanelLayout);
        HomePageInstructorPanelLayout.setHorizontalGroup(
            HomePageInstructorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageInstructorPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(HomePageInstructorPanelLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(ShowClassesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(ShowOfficePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePageInstructorPanelLayout.setVerticalGroup(
            HomePageInstructorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageInstructorPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(HomePageInstructorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowClassesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowOfficePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePageInstructorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePageInstructorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        // TODO add your handling code here:
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void LogoutButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LogoutButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            HomePage homepage = new HomePage();
            homepage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutButtonKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            String query = "SELECT * FROM `instructor` WHERE `email`='"+email+"'";
            pst = connect.prepareStatement(query);
            result = pst.executeQuery();
            if (result.next()) {
                String ID = result.getString(1);
                String FName = result.getString(2);
                String LName = result.getString(3);
                IDField.setText("ID: " + ID);
                FirstNameField.setText(FName);
                LastNameField.setText(LName);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_formWindowOpened

    private void ShowClassesIconButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowClassesIconButtonMouseClicked
        // TODO add your handling code here:
        new ShowClasses(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowClassesIconButtonMouseClicked

    private void ShowClassesIconButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowClassesIconButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowClasses(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ShowClassesIconButtonKeyPressed

    private void ShowClassesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowClassesLabelMouseClicked
        // TODO add your handling code here:
        new ShowClasses(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowClassesLabelMouseClicked

    private void ShowClassesLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowClassesLabelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowClasses(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ShowClassesLabelKeyPressed

    private void ShowOfficeIconButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowOfficeIconButtonMouseClicked
        // TODO add your handling code here:
        new ShowOffice(email).setVisible(true);
    }//GEN-LAST:event_ShowOfficeIconButtonMouseClicked

    private void ShowOfficeIconButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowOfficeIconButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowOffice(email).setVisible(true);
        }
    }//GEN-LAST:event_ShowOfficeIconButtonKeyPressed

    private void ShowOfficeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowOfficeLabelMouseClicked
        // TODO add your handling code here:
        new ShowOffice(email).setVisible(true);
    }//GEN-LAST:event_ShowOfficeLabelMouseClicked

    private void ShowOfficeLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowOfficeLabelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowOffice(email).setVisible(true);
        }
    }//GEN-LAST:event_ShowOfficeLabelKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePageInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DevelopedBy;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HomePageInstructorPanel;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ShowClassesIconButton;
    private javax.swing.JLabel ShowClassesLabel;
    private javax.swing.JPanel ShowClassesPanel;
    private javax.swing.JButton ShowOfficeIconButton;
    private javax.swing.JLabel ShowOfficeLabel;
    private javax.swing.JPanel ShowOfficePanel;
    // End of variables declaration//GEN-END:variables
}
