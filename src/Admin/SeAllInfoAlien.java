/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;
import java.util.HashMap;


/**
 *
 * @author erikgoransson
 */
public class SeAllInfoAlien extends javax.swing.JFrame {
    
    private InfDB idb;

    /** Creates new form SeAllInfoAlien */
    public SeAllInfoAlien(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb; 
        listaAlien();
    }
    
    private void listaAlien(){
        
        String fraga = "SELECT NAMN FROM ALIEN";
        ArrayList <String> allaAlien;
        try{
            allaAlien=idb.fetchColumn(fraga);
            
        for(String Alien : allaAlien){
            cmbValjAlien.addItem(Alien);    
        }
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        cmbValjAlien = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setText("Sök info alien");

        cmbValjAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en alien" }));
        cmbValjAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValjAlienActionPerformed(evt);
            }
        });

        txtResultat.setColumns(20);
        txtResultat.setRows(5);
        jScrollPane1.setViewportView(txtResultat);

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmbValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRubrik)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbValjAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValjAlienActionPerformed
        txtResultat.setText("ID" + "\t" + "Namn" + "\t" + "REG.Datum" + "\t"+ "Losenord" + "\t" + "Telefon" + "\t" + "Plats" +"\t" + "Ansvarig Agent" + "\n");
        ArrayList<HashMap<String, String>> soktaAliens = new ArrayList<HashMap<String, String>>();
        try{
            String valdAlien = cmbValjAlien.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE NAMN = '" + valdAlien + "'";
               
            
            soktaAliens =idb.fetchRows(fraga);
            
            for(HashMap<String,String> alien : soktaAliens){
                txtResultat.append(alien.get("ALIEN_ID")+"\t");
                txtResultat.append(" "+ alien.get("NAMN")+"\t");
                txtResultat.append(" "+ alien.get("REGISTRERINGSDATUM")+"\t");
                txtResultat.append(" "+ alien.get("LOSENORD")+"\t");
                txtResultat.append(" "+ alien.get("TELEFON")+"\t");
                txtResultat.append(" "+ alien.get("PLATS")+"\t");
                txtResultat.append(" "+ alien.get("ANSVARIG_AGENT")+"\n");
                
            } 
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmbValjAlienActionPerformed

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
            java.util.logging.Logger.getLogger(SeAllInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeAllInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeAllInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeAllInfoAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeAllInfoAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbValjAlien;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextArea txtResultat;
    // End of variables declaration//GEN-END:variables

}