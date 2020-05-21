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
 * @author marku
 */
public class TaBortUtrustning extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandarNamn;
    private Integer utrID;
    
    
    public TaBortUtrustning(InfDB idb, String anvandarNamn) {
        initComponents();
        this.idb = idb;
        this.anvandarNamn = anvandarNamn;
        this.setLocationRelativeTo(null);
        listaUtrustning();
    }
    public TaBortUtrustning (InfDB idb) {
        initComponents();
        this.idb = idb;
        this.anvandarNamn = anvandarNamn; 
        this.setLocationRelativeTo(null);
        listaUtrustning();
    }

      public void listaUtrustning(){ //Lägger till alla utrustning i ComboBox listan innan vi kan ta bort utrustning.
        try{
            ArrayList<HashMap<String, String>> utrustningsLista = idb.fetchRows("SELECT UTRUSTNINGS_ID, BENAMNING FROM UTRUSTNING ");
                for(HashMap<String, String> utrustning : utrustningsLista) {
                    String AllUtrustning = utrustning.get("UTRUSTNINGS_ID") + " " + utrustning.get("BENAMNING");
                        cmbUtrLista.addItem(AllUtrustning);
                  }
             }
        catch(InfException e){
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

        lblRubrik = new javax.swing.JLabel();
        cmbUtrLista = new javax.swing.JComboBox<>();
        btnTaBort = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblRubrik.setText("Ta bort utrustning");

        cmbUtrLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Utrustning" }));
        cmbUtrLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUtrListaActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaBort)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(lblRubrik)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(cmbUtrLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblRubrik)
                .addGap(50, 50, 50)
                .addComponent(cmbUtrLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnTaBort))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        if(Validering.cbValueTrue(cmbUtrLista)) {
        try {
            
            String utrustningsNamn = idb.fetchSingle("SELECT BENAMNING FROM UTRUSTNING WHERE UTRUSTNINGS_ID = " + utrID);
            
            idb.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + utrID + ";");
            idb.delete("DELETE FROM VAPEN WHERE UTRUSTNINGS_ID = " + utrID + ";");
            idb.delete("DELETE FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + utrID + ";");
            idb.delete("DELETE FROM TEKNIK WHERE UTRUSTNINGS_ID = " + utrID + ";");
 
            idb.delete("DELETE FROM UTRUSTNING WHERE UTRUSTNINGS_ID = " + utrID);

            JOptionPane.showMessageDialog(null, "UTRUSTNING:" + " " + utrustningsNamn + " " + "har raderats från MIB systemet!");

        } 
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }

    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cmbUtrListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUtrListaActionPerformed
        Object o = cmbUtrLista.getSelectedItem();
        String uid = String.valueOf(o);
        
        String Utrustningsid = uid.split(" ")[0];
        utrID = Integer.parseInt(Utrustningsid);
    }//GEN-LAST:event_cmbUtrListaActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbUtrLista;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
