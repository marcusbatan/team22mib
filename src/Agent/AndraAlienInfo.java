/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import Validering.Validering;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author marku
 */
public class AndraAlienInfo extends javax.swing.JFrame {

    private InfDB idb;
    private Integer alienID;
    private String alienNamn;
    
    
    
    public AndraAlienInfo(String AlienNamn, InfDB idb) {
        initComponents();
        this.idb=idb;
        this.alienNamn = AlienNamn;
        AlienLista();
    }
    
     public AndraAlienInfo(InfDB idb){
        initComponents();
        this.idb = idb;
        this.alienNamn = alienNamn;
        AlienLista();
     }

    private AndraAlienInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     public void AlienLista() {
        try {
              
            ArrayList<HashMap<String, String>> alienLista = idb.fetchRows("SELECT ALIEN_ID, NAMN FROM ALIEN ");
                for(HashMap<String, String> alien : alienLista) {
                    String allaAliens = alien.get("ALIEN_ID") + " " + alien.get("NAMN");
                       JcValjAlien.addItem(allaAliens);
                  }
                

        } catch (InfException e) { 
            JOptionPane.showMessageDialog(null, e.getMessage()); // fel meddelande
        }

    }
        
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAndraNamnAlienAdmin = new javax.swing.JLabel();
        lblAndraTelefonAlienAdmin = new javax.swing.JLabel();
        lblAndraPlatsAlienAdmin = new javax.swing.JLabel();
        lblAndraAnsvAgentALienAdmin = new javax.swing.JLabel();
        lblAndraRegDatumAlienAdmin = new javax.swing.JLabel();
        lblAndraIDAlienAdmin = new javax.swing.JLabel();
        lblAndraLosenAlienAdmin = new javax.swing.JLabel();
        txtAndraNamnAlienAdmin = new javax.swing.JTextField();
        txtAndraPlatsAlienAdmin = new javax.swing.JTextField();
        txtAndraAnsvAgentAlienAdmin = new javax.swing.JTextField();
        txtAndraIDAlienAdmin = new javax.swing.JTextField();
        txtAndraTelefonAlienAdmin = new javax.swing.JTextField();
        txtAndraRegDatumAlienAdmin = new javax.swing.JTextField();
        txtAndraLosenAlienAdmin = new javax.swing.JTextField();
        btnAndraAlienInfo = new javax.swing.JButton();
        btnTillbakaAndraInfoAlien = new javax.swing.JButton();
        JcValjAlien = new javax.swing.JComboBox<>();
        lblRasTillhrorighet = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Ändra Information Om Alien");

        lblAndraNamnAlienAdmin.setText("Ändra Namn");

        lblAndraTelefonAlienAdmin.setText("Ändra Telefon Nummer");

        lblAndraPlatsAlienAdmin.setText("Ändra Plats");

        lblAndraAnsvAgentALienAdmin.setText("Ändra Ansvarig Agent");

        lblAndraRegDatumAlienAdmin.setText("Ändra Registreringsdatum");

        lblAndraIDAlienAdmin.setText("Ändra ID");

        lblAndraLosenAlienAdmin.setText("Ändra Lösenord (Max 6 tecken)");

        txtAndraLosenAlienAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAndraLosenAlienAdminActionPerformed(evt);
            }
        });

        btnAndraAlienInfo.setText("Ändra");
        btnAndraAlienInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienInfoActionPerformed(evt);
            }
        });

        btnTillbakaAndraInfoAlien.setText("Tillbaka");
        btnTillbakaAndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAndraInfoAlienActionPerformed(evt);
            }
        });

        JcValjAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Alien" }));
        JcValjAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcValjAlienActionPerformed(evt);
            }
        });

        lblRasTillhrorighet.setText("Ändra rastillhörighet");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj En Ny Ras", "SQUID", "WORM", "BOGLODITE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAndraTelefonAlienAdmin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAndraRegDatumAlienAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAndraRegDatumAlienAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtAndraNamnAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAndraLosenAlienAdmin)
                            .addComponent(txtAndraTelefonAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(268, 268, 268)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAndraAnsvAgentALienAdmin)
                            .addComponent(txtAndraPlatsAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAndraAnsvAgentAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAndraIDAlienAdmin)
                            .addComponent(txtAndraIDAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRasTillhrorighet)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAndraLosenAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAndraNamnAlienAdmin)
                                .addGap(145, 145, 145)
                                .addComponent(JcValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(lblAndraPlatsAlienAdmin)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnTillbakaAndraInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAndraAlienInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndraNamnAlienAdmin)
                    .addComponent(lblAndraPlatsAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JcValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraPlatsAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraNamnAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndraTelefonAlienAdmin)
                    .addComponent(lblAndraAnsvAgentALienAdmin))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraTelefonAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraAnsvAgentAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndraRegDatumAlienAdmin)
                    .addComponent(lblAndraIDAlienAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraRegDatumAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraIDAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndraLosenAlienAdmin)
                    .addComponent(lblRasTillhrorighet))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraLosenAlienAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaAndraInfoAlien)
                    .addComponent(btnAndraAlienInfo))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcValjAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcValjAlienActionPerformed
 
         Object o = JcValjAlien.getSelectedItem();
        String aid = String.valueOf(o);
        
        String agentID = aid.split(" ")[0];
        alienID = Integer.parseInt(agentID);
        

    }//GEN-LAST:event_JcValjAlienActionPerformed

    private void btnAndraAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienInfoActionPerformed
         if (Validering.textNotEmpty(txtAndraAnsvAgentAlienAdmin) && (Validering.textNotEmpty(txtAndraIDAlienAdmin) && (Validering.textNotEmpty(txtAndraLosenAlienAdmin)&&
                 (Validering.textNotEmpty(txtAndraNamnAlienAdmin)&&(Validering.textNotEmpty(txtAndraPlatsAlienAdmin)&&(Validering.textNotEmpty(txtAndraRegDatumAlienAdmin)&&(Validering.textNotEmpty(txtAndraTelefonAlienAdmin)))))))) { // validering
            if (Validering.cbValueTrue(JcValjAlien)) {
               
                
                try {
                    
                    String table=jComboBox1.getSelectedItem().toString();
                    String sammaRas = ("SELECT ALIEN_ID FROM ALIEN '" + table + "' ALIEN_ID =" +alienID);
                    String Namn = txtAndraNamnAlienAdmin.getText();
                    String AnsvAgent  = txtAndraAnsvAgentAlienAdmin.getText();
                    String Plats=txtAndraPlatsAlienAdmin.getText();
                    String Telefon=txtAndraTelefonAlienAdmin.getText();
                    String RegstreringsDatum=txtAndraRegDatumAlienAdmin.getText();
                    String losenord =txtAndraLosenAlienAdmin.getText();
                    String NyttId = txtAndraIDAlienAdmin.getText();
                    
                      
                  
                    idb.update("UPDATE ALIEN SET NAMN = '" + Namn + "'WHERE ALIEN_ID = " + alienID); // uppdaterar namn genom att komma åt alienid.
                    idb.update("UPDATE ALIEN SET LOSENORD = '" + losenord + "' WHERE ALIEN_ID = " + alienID); 
                    idb.update("UPDATE ALIEN SET PLATS = '" + Plats + "' WHERE ALIEN_ID = " + alienID);
                    idb.update("UPDATE ALIEN SET ANSVARIG_AGENT ='" + AnsvAgent + "' WHERE ALIEN_ID = " + alienID);
                    idb.update("UPDATE ALIEN SET TELEFON = '" + Telefon + "' WHERE ALIEN_ID = " + alienID);
                    idb.update("UPDATE ALIEN SET REGISTRERINGSDATUM ='" + RegstreringsDatum + "' WHERE ALIEN_ID = " + alienID);
                    idb.update("UPDATE ALIEN SET ALIEN_ID = '" + NyttId + "' WHERE ALIEN_ID = " + alienID);
                    
                    if(sammaRas.equals(table) && sammaRas != null){
                    idb.update("UPDATE " + table + " SET ALIEN_ID='" + NyttId + "'");
                    }
                    else{
                        idb.delete("DELETE FROM BOGLODITE WHERE ALIEN_ID =" + alienID);
                        idb.delete("DELETE FROM WORM WHERE ALIEN_ID =" + alienID);
                        idb.delete("DELETE FROM SQUID WHERE ALIEN_ID =" + alienID);
                        idb.insert("INSERT INTO " + table + " (ALIEN_ID) VALUES (" + NyttId + ")");
                        this.dispose();
                        new AndraAlienInfo(idb).setVisible(true);
                        
                    }
                    JOptionPane.showMessageDialog(null, "Ändringen är Registrerad!"); // meddelande när uppdateringen registerats.

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage()); // fel meddelande
                }
            }
        }
    }//GEN-LAST:event_btnAndraAlienInfoActionPerformed

    private void btnTillbakaAndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAndraInfoAlienActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaAndraInfoAlienActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         
        String table=jComboBox1.getSelectedItem().toString();
        String fraga="SELECT NAMN FROM ALIEN JOIN " + table + " ON ALIEN.ALIEN_ID = " + table + ".ALIEN_ID";
        System.out.println(fraga);
        try {
            ArrayList<HashMap<String , String>> allaAliens = idb.fetchRows(fraga);
            if (allaAliens != null) {
                for(HashMap<String , String>alien : allaAliens){
                    
                    

                }
            }
        } catch (InfException ex) {
            Logger.getLogger(SokAliensForEnRas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                                                  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtAndraLosenAlienAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAndraLosenAlienAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAndraLosenAlienAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAlienInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcValjAlien;
    private javax.swing.JButton btnAndraAlienInfo;
    private javax.swing.JButton btnTillbakaAndraInfoAlien;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAndraAnsvAgentALienAdmin;
    private javax.swing.JLabel lblAndraIDAlienAdmin;
    private javax.swing.JLabel lblAndraLosenAlienAdmin;
    private javax.swing.JLabel lblAndraNamnAlienAdmin;
    private javax.swing.JLabel lblAndraPlatsAlienAdmin;
    private javax.swing.JLabel lblAndraRegDatumAlienAdmin;
    private javax.swing.JLabel lblAndraTelefonAlienAdmin;
    private javax.swing.JLabel lblRasTillhrorighet;
    private javax.swing.JTextField txtAndraAnsvAgentAlienAdmin;
    private javax.swing.JTextField txtAndraIDAlienAdmin;
    private javax.swing.JTextField txtAndraLosenAlienAdmin;
    private javax.swing.JTextField txtAndraNamnAlienAdmin;
    private javax.swing.JTextField txtAndraPlatsAlienAdmin;
    private javax.swing.JTextField txtAndraRegDatumAlienAdmin;
    private javax.swing.JTextField txtAndraTelefonAlienAdmin;
    // End of variables declaration//GEN-END:variables

   
}
