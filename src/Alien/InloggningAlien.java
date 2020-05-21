/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien;

/**
 *
 * @author vince
 */

import Validering.Validering;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class InloggningAlien extends javax.swing.JFrame {

    /**
     * Creates new form InloggningAlien
     */
    private InfDB idb;
    
    public InloggningAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        //GÖR VARNING HÄR.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnvAlien = new javax.swing.JLabel();
        lblLosenAlien = new javax.swing.JLabel();
        txtAnvAlien = new javax.swing.JTextField();
        txtPswAlien = new javax.swing.JTextField();
        btnLoginAlien = new javax.swing.JButton();
        btnTillbakaAlienInlog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAnvAlien.setText("AnvändarID:");

        lblLosenAlien.setText("Lösenord:");

        btnLoginAlien.setText("Login");
        btnLoginAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAlienActionPerformed(evt);
            }
        });

        btnTillbakaAlienInlog.setText("Tillbaka");
        btnTillbakaAlienInlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAlienInlogActionPerformed(evt);
            }
        });

        jLabel1.setText("Inloggning Alien:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbakaAlienInlog, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnvAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnvAlien))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLosenAlien)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnLoginAlien)
                                        .addComponent(txtPswAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnvAlien)
                    .addComponent(lblLosenAlien))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnvAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPswAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnLoginAlien)
                .addGap(28, 28, 28)
                .addComponent(btnTillbakaAlienInlog)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAlienActionPerformed
        InloggningAlien(txtAnvAlien.getText(), txtPswAlien.getText());
    }//GEN-LAST:event_btnLoginAlienActionPerformed

    private void btnTillbakaAlienInlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAlienInlogActionPerformed
 //       new HuvudFonster(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTillbakaAlienInlogActionPerformed

    public void InloggningAlien(String anvandarNamn, String losenOrd){
        if (Validering.textNotEmpty(txtAnvAlien) && Validering.textNotEmpty(txtPswAlien)){
            try{
            String Alien = idb.fetchSingle(
            "SELECT LOSENORD FROM ALIEN "
            + "WHERE ALIEN.LOSENORD = '" + losenOrd + "'" + "AND ALIEN.ALIEN_ID = '" + anvandarNamn + "'");
            
         
            if (Alien!=null && Alien.equals(losenOrd)){
            new InloggadAlien(idb, anvandarNamn).setVisible(true);
            this.dispose();
            
                 }
            }
         catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
       
        }
    }    
    
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggningAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAlien;
    private javax.swing.JButton btnTillbakaAlienInlog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnvAlien;
    private javax.swing.JLabel lblLosenAlien;
    private javax.swing.JTextField txtAnvAlien;
    private javax.swing.JTextField txtPswAlien;
    // End of variables declaration//GEN-END:variables
}