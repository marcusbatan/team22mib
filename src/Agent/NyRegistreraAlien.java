/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

/**
 *
 * @author hania
 */
import Validering.Validering;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class NyRegistreraAlien extends javax.swing.JFrame {

    private InfDB idb;
    private ArrayList<String> omradeLista;
    private Integer platsAlien;

    /**
     * Creates new form NyRegistreraAlien
     */
    public NyRegistreraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        gePlatsAlien();
        this.setLocationRelativeTo(null);

    }

    private void gePlatsAlien() {

        try {
            ArrayList<HashMap<String, String>> omrade = idb.fetchRows("SELECT BENAMNING FROM PLATS");
            for (HashMap<String, String> plats : omrade) {
                String omradeLista1 = plats.get("BENAMNING");
                cmbTilldelatOmrade.addItem(omradeLista1);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNyRegistreraAlien = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNamnNyAlien = new javax.swing.JTextField();
        lblRegistreringsDatum = new javax.swing.JLabel();
        txtRegistreringsDatum = new javax.swing.JTextField();
        lblTelefonNrAlien = new javax.swing.JLabel();
        txtTelefonNrAlien = new javax.swing.JTextField();
        lblTilldelatOmradeAlien = new javax.swing.JLabel();
        lblAnsvarigAgentAlien = new javax.swing.JLabel();
        txtAnsvarigAgentAlien = new javax.swing.JTextField();
        lblNyttLosenAlien = new javax.swing.JLabel();
        txtNyttLosenAlien = new javax.swing.JTextField();
        btnRegistreraAlien = new javax.swing.JButton();
        btnTillbakaAlienRegistrering = new javax.swing.JButton();
        cmbTilldelatOmrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNyRegistreraAlien.setText("Nyregistrera Alien");

        jLabel1.setText("Namn");

        txtNamnNyAlien.setText("Skriv in namn");
        txtNamnNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnNyAlienActionPerformed(evt);
            }
        });

        lblRegistreringsDatum.setText("Registreringsdatum");

        txtRegistreringsDatum.setText("Ex:2019-12-20");

        lblTelefonNrAlien.setText("Telefon Nummer");

        txtTelefonNrAlien.setText("Skriv in Telefonnumret");

        lblTilldelatOmradeAlien.setText("Tilldelat Område");

        lblAnsvarigAgentAlien.setText("Ansvarig Agent");

        txtAnsvarigAgentAlien.setText("Skriv in Agent ID ");

        lblNyttLosenAlien.setText("Nytt Lösenord");

        txtNyttLosenAlien.setText("Skriv in nya lösenordet");

        btnRegistreraAlien.setText("Registrera");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        btnTillbakaAlienRegistrering.setText("Tillbaka");
        btnTillbakaAlienRegistrering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAlienRegistreringActionPerformed(evt);
            }
        });

        cmbTilldelatOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Plats" }));
        cmbTilldelatOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTilldelatOmradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lblNyRegistreraAlien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistreringsDatum)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonNrAlien)
                            .addComponent(lblTilldelatOmradeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNyttLosenAlien))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNyttLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefonNrAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNamnNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRegistreringsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(147, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(cmbTilldelatOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(btnTillbakaAlienRegistrering, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnsvarigAgentAlien)
                                .addGap(47, 47, 47)
                                .addComponent(txtAnsvarigAgentAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblNyRegistreraAlien)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamnNyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistreringsDatum)
                    .addComponent(txtRegistreringsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonNrAlien)
                    .addComponent(txtTelefonNrAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTilldelatOmradeAlien)
                    .addComponent(cmbTilldelatOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttLosenAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNyttLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnsvarigAgentAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnsvarigAgentAlien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(btnTillbakaAlienRegistrering))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnNyAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnNyAlienActionPerformed

    private void btnTillbakaAlienRegistreringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAlienRegistreringActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnTillbakaAlienRegistreringActionPerformed

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        Object plats = cmbTilldelatOmrade.getSelectedItem();
        String tilldelatPlats = String.valueOf(plats);

        if (Validering.textFaltHarVarde(txtAnsvarigAgentAlien) && (Validering.textFaltHarVarde(txtNamnNyAlien) && ((Validering.textFaltHarVarde(txtNyttLosenAlien) && (Validering.textFaltHarVarde(txtRegistreringsDatum) && (Validering.textFaltHarVarde(txtTelefonNrAlien))))))) {

            int AlienId = 0;
            try {
                int platsId = Integer.parseInt(idb.fetchSingle("SELECT PLATS_ID FROM PLATS WHERE BENAMNING ='" + tilldelatPlats + "'"));
                AlienId = Integer.parseInt(idb.fetchSingle("SELECT MAX(ALIEN_ID) FROM ALIEN"));
                AlienId += 1;
                idb.insert("INSERT INTO ALIEN "
                        + "(ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT) "
                        + "VALUES (" + AlienId + ", "
                        + "'" + txtRegistreringsDatum.getText() + "', "
                        + "'" + txtNyttLosenAlien.getText() + "', "
                        + "'" + txtNamnNyAlien.getText() + "', "
                        + "'" + txtTelefonNrAlien.getText() + "', "
                        + "'" + platsId + "', " + "'" + txtAnsvarigAgentAlien.getText() + "')");

                JOptionPane.showMessageDialog(null, "Alien är nu Registrerad!");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.out.println("H�R �R FELET");
            }
        }
    }

    //* @param args the command line arguments
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
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyRegistreraEnAgent(idb).setVisible(true);
            }
        });


    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void cmbTilldelatOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTilldelatOmradeActionPerformed


    }//GEN-LAST:event_cmbTilldelatOmradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnTillbakaAlienRegistrering;
    private javax.swing.JComboBox<String> cmbTilldelatOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnsvarigAgentAlien;
    private javax.swing.JLabel lblNyRegistreraAlien;
    private javax.swing.JLabel lblNyttLosenAlien;
    private javax.swing.JLabel lblRegistreringsDatum;
    private javax.swing.JLabel lblTelefonNrAlien;
    private javax.swing.JLabel lblTilldelatOmradeAlien;
    private javax.swing.JTextField txtAnsvarigAgentAlien;
    private javax.swing.JTextField txtNamnNyAlien;
    private javax.swing.JTextField txtNyttLosenAlien;
    private javax.swing.JTextField txtRegistreringsDatum;
    private javax.swing.JTextField txtTelefonNrAlien;
    // End of variables declaration//GEN-END:variables

}
