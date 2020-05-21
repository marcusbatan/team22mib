/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Validering.Validering;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author celine
 */
public class NyRegistreraEnAgent extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form NyRegistreraEnAgent
     */
    public NyRegistreraEnAgent(InfDB idb) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        geOmradeAgent();
    }

    private void geOmradeAgent() {

        try {
            ArrayList<HashMap<String, String>> omrade1 = idb.fetchRows("SELECT BENAMNING FROM OMRADE");
            for (HashMap<String, String> omradeAg : omrade1) {
                String omradeLista2 = omradeAg.get("BENAMNING");
                cmbOmradeAg.addItem(omradeLista2);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblAnstallningsdatum = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnRegistreraAgent = new javax.swing.JButton();
        btnTillbakaRegistreraAgent = new javax.swing.JButton();
        lblLosenord = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAnstallningsdatum = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbOmradeAg = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNamn.setText("Namn");

        lblTelefon.setText("Telefon");

        lblAnstallningsdatum.setText("Anställningsdatum");

        lblAdmin.setText("Adminstratör");

        btnRegistreraAgent.setText("Registrera Agent");
        btnRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAgentActionPerformed(evt);
            }
        });

        btnTillbakaRegistreraAgent.setText("Tillbaka");
        btnTillbakaRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaRegistreraAgentActionPerformed(evt);
            }
        });

        lblLosenord.setText("Lösenord");

        lblOmrade.setText("Område");

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        txtAnstallningsdatum.setText("Ex. 2020-05-23");
        txtAnstallningsdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnstallningsdatumActionPerformed(evt);
            }
        });

        txtAdmin.setText("J / N");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Registrera Agent");

        cmbOmradeAg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Område" }));
        cmbOmradeAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOmradeAgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefon)
                            .addComponent(lblAnstallningsdatum)
                            .addComponent(lblAdmin)
                            .addComponent(lblLosenord)
                            .addComponent(lblOmrade)
                            .addComponent(lblNamn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTillbakaRegistreraAgent)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(btnRegistreraAgent)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cmbOmradeAg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdmin)
                                    .addComponent(txtAnstallningsdatum))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefon)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnstallningsdatum)
                            .addComponent(txtAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLosenord)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblOmrade))
                    .addComponent(cmbOmradeAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraAgent)
                    .addComponent(btnTillbakaRegistreraAgent))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void txtAnstallningsdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnstallningsdatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnstallningsdatumActionPerformed

    private void btnRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAgentActionPerformed
        Object omrade = cmbOmradeAg.getSelectedItem();
        String tilldelatOmrade = String.valueOf(omrade);

        if (Validering.textFaltHarVarde(txtNamn) && (Validering.textFaltHarVarde(txtTelefon) && (Validering.textFaltHarVarde(txtAnstallningsdatum) && (Validering.textFaltHarVarde(txtAdmin)
                && (Validering.textFaltHarVarde(txtLosenord) && (Validering.cbValueTrue(cmbOmradeAg))))))) {
            int AgentID = 0;
            try {
                int omradeId = Integer.parseInt(idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = '" + tilldelatOmrade + "'"));
                AgentID = Integer.parseInt(idb.fetchSingle("SELECT MAX(AGENT_ID) FROM AGENT"));
                AgentID += 1;
                idb.insert("INSERT INTO AGENT "
                        + "(AGENT_ID, NAMN, TELEFON, ANSTALLNINGSDATUM, ADMINISTRATOR, LOSENORD, OMRADE) "
                        + "VALUES (" + AgentID + ","
                        + "'" + txtNamn.getText() + "',"
                        + "'" + txtTelefon.getText() + "',"
                        + "'" + txtAnstallningsdatum.getText() + "',"
                        + "'" + txtAdmin.getText() + "',"
                        + "'" + txtLosenord.getText() + "',"
                        + "'" + omradeId + "')");

                JOptionPane.showMessageDialog(null, "Agent har blivit registrerad");
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistreraAgentActionPerformed

    private void btnTillbakaRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaRegistreraAgentActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaRegistreraAgentActionPerformed

    private void cmbOmradeAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOmradeAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOmradeAgActionPerformed

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
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyRegistreraEnAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyRegistreraEnAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JButton btnTillbakaRegistreraAgent;
    private javax.swing.JComboBox<String> cmbOmradeAg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAnstallningsdatum;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtAnstallningsdatum;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
