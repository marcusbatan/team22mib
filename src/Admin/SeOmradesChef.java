/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erikgoransson
 */
public class SeOmradesChef extends javax.swing.JFrame {

    private InfDB idb;
    private String OmradeNamn;
    /**
     * Creates new form SeOmradesChef
     * @param idb
     */
    public SeOmradesChef(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        vemArChef();
    }

    public void vemArChef() {

       String fraga = "SELECT BENAMNING FROM OMRADE";
        ArrayList <String> allaOmrade;
        try{
            allaOmrade=idb.fetchColumn(fraga);
            
        for(String omrade : allaOmrade){
            cmbOmrade.addItem(omrade);    
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
        cmbOmrade = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultat = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Se Områdeschef");

        cmbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Ett Område" }));
        cmbOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOmradeActionPerformed(evt);
            }
        });

        txtResultat.setColumns(20);
        txtResultat.setRows(5);
        jScrollPane1.setViewportView(txtResultat);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOmradeActionPerformed
        
        txtResultat.setText("ID" + "\t" + "Namn" + "\t" + "TELEFON" + "\n");
        String valdOmrade = cmbOmrade.getSelectedItem().toString();
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
        
    }//GEN-LAST:event_cmbOmradeActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(SeOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeOmradesChef(idb).setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultat;
    // End of variables declaration//GEN-END:variables
}
