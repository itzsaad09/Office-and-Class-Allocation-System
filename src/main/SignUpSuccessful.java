/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class SignUpSuccessful extends javax.swing.JFrame {

    /**
     * Creates new form SuccessfullySignUp
     */
    public SignUpSuccessful() {
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

        SignUpSuccessfullyPanel = new javax.swing.JPanel();
        SignUpSuccessfulText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        SignUpSuccessfullyPanel.setBackground(new java.awt.Color(63, 193, 201));
        SignUpSuccessfullyPanel.setMinimumSize(new java.awt.Dimension(200, 100));

        SignUpSuccessfulText.setEditable(false);
        SignUpSuccessfulText.setBackground(new java.awt.Color(63, 193, 201));
        SignUpSuccessfulText.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        SignUpSuccessfulText.setForeground(new java.awt.Color(245, 245, 245));
        SignUpSuccessfulText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SignUpSuccessfulText.setText("Successfully SignUp");
        SignUpSuccessfulText.setBorder(null);
        SignUpSuccessfulText.setFocusable(false);

        javax.swing.GroupLayout SignUpSuccessfullyPanelLayout = new javax.swing.GroupLayout(SignUpSuccessfullyPanel);
        SignUpSuccessfullyPanel.setLayout(SignUpSuccessfullyPanelLayout);
        SignUpSuccessfullyPanelLayout.setHorizontalGroup(
            SignUpSuccessfullyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpSuccessfullyPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(SignUpSuccessfulText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        SignUpSuccessfullyPanelLayout.setVerticalGroup(
            SignUpSuccessfullyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpSuccessfullyPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(SignUpSuccessfulText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpSuccessfullyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpSuccessfullyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(SignUpSuccessful.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpSuccessful.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpSuccessful.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpSuccessful.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpSuccessful().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SignUpSuccessfulText;
    private javax.swing.JPanel SignUpSuccessfullyPanel;
    // End of variables declaration//GEN-END:variables
}
