/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class EmailAlreadyExists extends javax.swing.JFrame {

    /**
     * Creates new form EmailAlreadyExists
     */
    public EmailAlreadyExists() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmailAlreadyExistsPanel = new javax.swing.JPanel();
        EmailAlreadyExistsText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        EmailAlreadyExistsPanel.setBackground(new java.awt.Color(63, 193, 201));
        EmailAlreadyExistsPanel.setMinimumSize(new java.awt.Dimension(200, 100));

        EmailAlreadyExistsText.setEditable(false);
        EmailAlreadyExistsText.setBackground(new java.awt.Color(63, 193, 201));
        EmailAlreadyExistsText.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        EmailAlreadyExistsText.setForeground(new java.awt.Color(245, 245, 245));
        EmailAlreadyExistsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailAlreadyExistsText.setText("Email Already Exist");
        EmailAlreadyExistsText.setBorder(null);
        EmailAlreadyExistsText.setFocusable(false);

        javax.swing.GroupLayout EmailAlreadyExistsPanelLayout = new javax.swing.GroupLayout(EmailAlreadyExistsPanel);
        EmailAlreadyExistsPanel.setLayout(EmailAlreadyExistsPanelLayout);
        EmailAlreadyExistsPanelLayout.setHorizontalGroup(
            EmailAlreadyExistsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailAlreadyExistsPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(EmailAlreadyExistsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        EmailAlreadyExistsPanelLayout.setVerticalGroup(
            EmailAlreadyExistsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailAlreadyExistsPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(EmailAlreadyExistsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmailAlreadyExistsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmailAlreadyExistsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EmailAlreadyExists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailAlreadyExists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailAlreadyExists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailAlreadyExists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailAlreadyExists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmailAlreadyExistsPanel;
    private javax.swing.JTextField EmailAlreadyExistsText;
    // End of variables declaration//GEN-END:variables
}
