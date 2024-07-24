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
public class RegisteredCourses extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet result = null;
    PreparedStatement pst = null;
    
    String email;
    public RegisteredCourses() {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
        // Database Connection
        connect = Database.getConnection();
    }

    public RegisteredCourses(String email) {
        initComponents();
        this.email = email;
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

        RegisterCoursesPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        EnterCourseName = new javax.swing.JScrollPane();
        EnterCourses = new javax.swing.JTextArea();
        Footer = new javax.swing.JPanel();
        DevelopedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        RegisterCoursesPanel.setBackground(new java.awt.Color(54, 79, 107));

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

        BackButton.setBackground(new java.awt.Color(54, 79, 107));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-32.png"))); // NOI18N
        BackButton.setBorder(null);
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.setPreferredSize(new java.awt.Dimension(35, 35));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 769, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        EnterCourses.setColumns(20);
        EnterCourses.setRows(5);
        EnterCourseName.setViewportView(EnterCourses);

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

        javax.swing.GroupLayout RegisterCoursesPanelLayout = new javax.swing.GroupLayout(RegisterCoursesPanel);
        RegisterCoursesPanel.setLayout(RegisterCoursesPanelLayout);
        RegisterCoursesPanelLayout.setHorizontalGroup(
            RegisterCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterCoursesPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterCoursesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnterCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        RegisterCoursesPanelLayout.setVerticalGroup(
            RegisterCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterCoursesPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(EnterCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterCoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterCoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        new HomePageStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new HomePageStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BackButtonKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            String query = "SELECT * FROM `student` WHERE `email`='"+email+"'";
            pst = connect.prepareStatement(query);
            result = pst.executeQuery();
            if (result.next()) {
                String Registered_Courses = result.getString(12);
                EnterCourses.setText(Registered_Courses);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(RegisteredCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisteredCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisteredCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisteredCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisteredCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DevelopedBy;
    private javax.swing.JScrollPane EnterCourseName;
    private javax.swing.JTextArea EnterCourses;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel RegisterCoursesPanel;
    // End of variables declaration//GEN-END:variables
}
