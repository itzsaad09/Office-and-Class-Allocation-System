/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class ShowStudent extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet result = null;
    PreparedStatement pst = null;
    ResultSetMetaData RSMD;
    DefaultTableModel DTM;
    
    String email;
    
    public ShowStudent() {
        initComponents();
        show_Table();
        // Set Title
        this.setTitle("Office and Class Allocation System");
    }

    public ShowStudent(String email) {
        initComponents();
        show_Table();
        // Set Title
        this.setTitle("Office and Class Allocation System");
        this.email = email;
    }
    
    // Show Table
    private void show_Table() {
        int CC;
        try {
            // Database Connection
            connect = Database.getConnection();
            pst = connect.prepareStatement("SELECT * FROM `student` ");
            result = pst.executeQuery();
            RSMD = result.getMetaData();
            CC = RSMD.getColumnCount();
            DTM = (DefaultTableModel)ShowStudentTable.getModel();
            
            DTM.setRowCount(0);
            while(result.next()) {
                Vector v2 = new Vector();
                for(int i=1; i<=CC; i++) {
                    v2.add(result.getString("Id"));
                    v2.add(result.getString("fName"));
                    v2.add(result.getString("lName"));
                    v2.add(result.getString("cnic"));
                    v2.add(result.getString("phoneno"));
                    v2.add(result.getString("gender"));
                    v2.add(result.getString("status"));
                    v2.add(result.getString("department"));
                    v2.add(result.getString("program"));
                    v2.add(result.getString("email"));
                }
                DTM.addRow(v2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowStudentPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Field = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ShowStudentsScrollPane = new javax.swing.JScrollPane();
        ShowStudentTable = new javax.swing.JTable();
        Footer = new javax.swing.JPanel();
        DevelopedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ShowStudentPanel.setBackground(new java.awt.Color(54, 79, 107));

        Header.setBackground(new java.awt.Color(63, 193, 201));
        Header.setPreferredSize(new java.awt.Dimension(900, 86));

        Field.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Field.setForeground(new java.awt.Color(245, 245, 245));
        Field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Field.setText("Admin");

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
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(Field, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 728, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Field)
                .addContainerGap())
        );

        ShowStudentsScrollPane.setPreferredSize(new java.awt.Dimension(300, 300));

        ShowStudentTable.setBackground(new java.awt.Color(54, 79, 107));
        ShowStudentTable.setForeground(new java.awt.Color(245, 245, 245));
        ShowStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "CNIC", "Phone No", "Gender", "Status", "Department", "Program", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ShowStudentTable.getTableHeader().setReorderingAllowed(false);
        ShowStudentsScrollPane.setViewportView(ShowStudentTable);
        if (ShowStudentTable.getColumnModel().getColumnCount() > 0) {
            ShowStudentTable.getColumnModel().getColumn(0).setMinWidth(30);
            ShowStudentTable.getColumnModel().getColumn(0).setMaxWidth(30);
            ShowStudentTable.getColumnModel().getColumn(1).setMinWidth(30);
            ShowStudentTable.getColumnModel().getColumn(1).setMaxWidth(110);
            ShowStudentTable.getColumnModel().getColumn(2).setMinWidth(30);
            ShowStudentTable.getColumnModel().getColumn(2).setMaxWidth(110);
            ShowStudentTable.getColumnModel().getColumn(3).setMinWidth(50);
            ShowStudentTable.getColumnModel().getColumn(3).setMaxWidth(140);
            ShowStudentTable.getColumnModel().getColumn(4).setMinWidth(50);
            ShowStudentTable.getColumnModel().getColumn(4).setMaxWidth(100);
            ShowStudentTable.getColumnModel().getColumn(5).setMinWidth(30);
            ShowStudentTable.getColumnModel().getColumn(5).setMaxWidth(60);
            ShowStudentTable.getColumnModel().getColumn(6).setMinWidth(30);
            ShowStudentTable.getColumnModel().getColumn(6).setMaxWidth(60);
            ShowStudentTable.getColumnModel().getColumn(7).setMinWidth(100);
            ShowStudentTable.getColumnModel().getColumn(7).setMaxWidth(200);
            ShowStudentTable.getColumnModel().getColumn(8).setMinWidth(100);
            ShowStudentTable.getColumnModel().getColumn(8).setMaxWidth(200);
        }

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

        javax.swing.GroupLayout ShowStudentPanelLayout = new javax.swing.GroupLayout(ShowStudentPanel);
        ShowStudentPanel.setLayout(ShowStudentPanelLayout);
        ShowStudentPanelLayout.setHorizontalGroup(
            ShowStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ShowStudentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShowStudentPanelLayout.setVerticalGroup(
            ShowStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowStudentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ShowStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ShowStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        new StudentPage(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new StudentPage(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BackButtonKeyPressed

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
            java.util.logging.Logger.getLogger(ShowStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DevelopedBy;
    private javax.swing.JLabel Field;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel ShowStudentPanel;
    private javax.swing.JTable ShowStudentTable;
    private javax.swing.JScrollPane ShowStudentsScrollPane;
    // End of variables declaration//GEN-END:variables
}
