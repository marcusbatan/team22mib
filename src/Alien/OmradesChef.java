/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author marku
 */
public class OmradesChef extends javax.swing.JFrame {

    public InfDB idb;
    private String OmradeNamn;

    public OmradesChef(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        vemArChef();
        this.idb = idb;
    }

    public void vemArChef() {

       String fraga = "SELECT BENAMNING FROM OMRADE";
        ArrayList <String> allaOmrade;
        try{
            allaOmrade = idb.fetchColumn(fraga);
            
        for(String omrade : allaOmrade){
            cbOmrode.addItem(omrade);    
        }
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        cbOmrode = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultat = new javax.swing.JTextArea();
        btntbx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Se områdeschef");

        cbOmrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOmrodeActionPerformed(evt);
            }
        });

        txtResultat.setColumns(20);
        txtResultat.setRows(5);
        jScrollPane2.setViewportView(txtResultat);

        btntbx.setText("Tillbaka");
        btntbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbOmrode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btntbx)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(cbOmrode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btntbx)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOmrodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOmrodeActionPerformed
        // TODO add your handling code here:
                txtResultat.setText("ID" + "\t" + "Namn" + "\t" + "TELEFON" + "\n");
        String valdOmrade = cbOmrode.getSelectedItem().toString();
        ArrayList<HashMap<String, String>> soktOmrade = new ArrayList<HashMap<String, String>>();
        try{
           // String valdOmrade = cmbOmrade.getSelectedItem().toString();
            String fraga = "SELECT AGENT.AGENT_ID, NAMN, TELEFON FROM AGENT "
                        + "JOIN OMRADESCHEF ON AGENT.AGENT_ID = OMRADESCHEF.AGENT_ID "
                        + "JOIN OMRADE ON OMRADESCHEF.OMRADE = OMRADE.OMRADES_ID "
                        + "WHERE OMRADE.BENAMNING = '" + valdOmrade + "'";
            System.out.println(fraga);
                
                soktOmrade = idb.fetchRows(fraga);
            
            for(HashMap<String,String> agent : soktOmrade){
                txtResultat.append(agent.get("AGENT_ID")+"\t");
                txtResultat.append(" "+ agent.get("NAMN")+"\t");
                txtResultat.append(" "+ agent.get("TELEFON")+"\n"); 
            } 
                    
        }
            catch (InfException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            } catch (NullPointerException n) {
                JOptionPane.showMessageDialog(null, valdOmrade + ": Har ingen Chef");
            }
       
    
    }//GEN-LAST:event_cbOmrodeActionPerformed

    private void btntbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntbxActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btntbxActionPerformed

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
            java.util.logging.Logger.getLogger(OmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OmradesChef(idb).setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntbx;
    private javax.swing.JComboBox<String> cbOmrode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtResultat;
    // End of variables declaration//GEN-END:variables
}
