/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.event.KeyEvent;

/**
 *
 * @author LENOVO
 */
public class StudentPage extends javax.swing.JFrame {

    String email;
    
    public StudentPage() {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
    }

    public StudentPage(String email) {
        initComponents();
        // Set Title
        this.setTitle("Office and Class Allocation System");
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

        StudentPagePanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Field = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        AddStudentPanel = new javax.swing.JPanel();
        AddStudentIconButton = new javax.swing.JButton();
        AddStudentLabel = new javax.swing.JLabel();
        ShowStudentPanel = new javax.swing.JPanel();
        ShowStudentIconButton = new javax.swing.JButton();
        ShowStudentLabel = new javax.swing.JLabel();
        UpdateStudentPanel = new javax.swing.JPanel();
        UpdateStudentIconButton = new javax.swing.JButton();
        UpdateStudentLabel = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        DevelopedBy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        StudentPagePanel.setBackground(new java.awt.Color(54, 79, 107));
        StudentPagePanel.setPreferredSize(new java.awt.Dimension(900, 500));

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

        AddStudentPanel.setOpaque(false);
        AddStudentPanel.setPreferredSize(new java.awt.Dimension(150, 150));

        AddStudentIconButton.setBackground(new java.awt.Color(59, 79, 107));
        AddStudentIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-user-group-woman-man-96.png"))); // NOI18N
        AddStudentIconButton.setToolTipText("");
        AddStudentIconButton.setBorder(null);
        AddStudentIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudentIconButton.setPreferredSize(new java.awt.Dimension(102, 102));
        AddStudentIconButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentIconButtonMouseClicked(evt);
            }
        });
        AddStudentIconButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddStudentIconButtonKeyPressed(evt);
            }
        });

        AddStudentLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AddStudentLabel.setForeground(new java.awt.Color(245, 245, 245));
        AddStudentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddStudentLabel.setText("Add Student");
        AddStudentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentLabelMouseClicked(evt);
            }
        });
        AddStudentLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddStudentLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout AddStudentPanelLayout = new javax.swing.GroupLayout(AddStudentPanel);
        AddStudentPanel.setLayout(AddStudentPanelLayout);
        AddStudentPanelLayout.setHorizontalGroup(
            AddStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStudentPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(AddStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(AddStudentPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(AddStudentLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddStudentPanelLayout.setVerticalGroup(
            AddStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddStudentPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AddStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(AddStudentLabel)
                .addContainerGap())
        );

        ShowStudentPanel.setOpaque(false);
        ShowStudentPanel.setPreferredSize(new java.awt.Dimension(150, 150));

        ShowStudentIconButton.setBackground(new java.awt.Color(59, 79, 107));
        ShowStudentIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-team-skin-type-7-96.png"))); // NOI18N
        ShowStudentIconButton.setToolTipText("");
        ShowStudentIconButton.setBorder(null);
        ShowStudentIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowStudentIconButton.setPreferredSize(new java.awt.Dimension(102, 102));
        ShowStudentIconButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowStudentIconButtonMouseClicked(evt);
            }
        });
        ShowStudentIconButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowStudentIconButtonKeyPressed(evt);
            }
        });

        ShowStudentLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ShowStudentLabel.setForeground(new java.awt.Color(245, 245, 245));
        ShowStudentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowStudentLabel.setText("Show Students");
        ShowStudentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowStudentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowStudentLabelMouseClicked(evt);
            }
        });
        ShowStudentLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowStudentLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ShowStudentPanelLayout = new javax.swing.GroupLayout(ShowStudentPanel);
        ShowStudentPanel.setLayout(ShowStudentPanelLayout);
        ShowStudentPanelLayout.setHorizontalGroup(
            ShowStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(ShowStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ShowStudentLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ShowStudentPanelLayout.setVerticalGroup(
            ShowStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowStudentPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ShowStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ShowStudentLabel)
                .addContainerGap())
        );

        UpdateStudentPanel.setOpaque(false);
        UpdateStudentPanel.setPreferredSize(new java.awt.Dimension(150, 150));

        UpdateStudentIconButton.setBackground(new java.awt.Color(59, 79, 107));
        UpdateStudentIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-user-skin-type-7-96.png"))); // NOI18N
        UpdateStudentIconButton.setToolTipText("");
        UpdateStudentIconButton.setBorder(null);
        UpdateStudentIconButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStudentIconButton.setPreferredSize(new java.awt.Dimension(102, 102));
        UpdateStudentIconButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStudentIconButtonMouseClicked(evt);
            }
        });
        UpdateStudentIconButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpdateStudentIconButtonKeyPressed(evt);
            }
        });

        UpdateStudentLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        UpdateStudentLabel.setForeground(new java.awt.Color(245, 245, 245));
        UpdateStudentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateStudentLabel.setText("Update Student");
        UpdateStudentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStudentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStudentLabelMouseClicked(evt);
            }
        });
        UpdateStudentLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpdateStudentLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout UpdateStudentPanelLayout = new javax.swing.GroupLayout(UpdateStudentPanel);
        UpdateStudentPanel.setLayout(UpdateStudentPanelLayout);
        UpdateStudentPanelLayout.setHorizontalGroup(
            UpdateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStudentPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(UpdateStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(UpdateStudentPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(UpdateStudentLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        UpdateStudentPanelLayout.setVerticalGroup(
            UpdateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStudentPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(UpdateStudentIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(UpdateStudentLabel)
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

        javax.swing.GroupLayout StudentPagePanelLayout = new javax.swing.GroupLayout(StudentPagePanel);
        StudentPagePanel.setLayout(StudentPagePanelLayout);
        StudentPagePanelLayout.setHorizontalGroup(
            StudentPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPagePanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(StudentPagePanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(AddStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(ShowStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(UpdateStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StudentPagePanelLayout.setVerticalGroup(
            StudentPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPagePanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(StudentPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(StudentPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(StudentPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        if (email.equals("admin@admin.com")) {
            new HomePageAdmin(email).setVisible(true);
            this.dispose();
        } else {
            new HomePageSubAdmin(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if (email.equals("admin@admin.com")) {
                new HomePageAdmin(email).setVisible(true);
                this.dispose();
            } else {
                new HomePageSubAdmin(email).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_BackButtonKeyPressed

    private void AddStudentIconButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentIconButtonMouseClicked
        // TODO add your handling code here:
        new AddStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddStudentIconButtonMouseClicked

    private void AddStudentIconButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddStudentIconButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new AddStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AddStudentIconButtonKeyPressed

    private void AddStudentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentLabelMouseClicked
        // TODO add your handling code here:
        new AddStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddStudentLabelMouseClicked

    private void AddStudentLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddStudentLabelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new AddStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AddStudentLabelKeyPressed

    private void ShowStudentIconButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowStudentIconButtonMouseClicked
        // TODO add your handling code here:
        new ShowStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowStudentIconButtonMouseClicked

    private void ShowStudentIconButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowStudentIconButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ShowStudentIconButtonKeyPressed

    private void ShowStudentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowStudentLabelMouseClicked
        // TODO add your handling code here:
        new ShowStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowStudentLabelMouseClicked

    private void ShowStudentLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowStudentLabelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new ShowStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ShowStudentLabelKeyPressed

    private void UpdateStudentIconButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStudentIconButtonMouseClicked
        // TODO add your handling code here:
        new UpdateStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateStudentIconButtonMouseClicked

    private void UpdateStudentIconButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateStudentIconButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new UpdateStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_UpdateStudentIconButtonKeyPressed

    private void UpdateStudentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStudentLabelMouseClicked
        // TODO add your handling code here:
        new UpdateStudent(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateStudentLabelMouseClicked

    private void UpdateStudentLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateStudentLabelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new UpdateStudent(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_UpdateStudentLabelKeyPressed

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
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentIconButton;
    private javax.swing.JLabel AddStudentLabel;
    private javax.swing.JPanel AddStudentPanel;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DevelopedBy;
    private javax.swing.JLabel Field;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ShowStudentIconButton;
    private javax.swing.JLabel ShowStudentLabel;
    private javax.swing.JPanel ShowStudentPanel;
    private javax.swing.JPanel StudentPagePanel;
    private javax.swing.JButton UpdateStudentIconButton;
    private javax.swing.JLabel UpdateStudentLabel;
    private javax.swing.JPanel UpdateStudentPanel;
    // End of variables declaration//GEN-END:variables
}
