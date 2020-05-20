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
 * @author Vincent
 */
public class GeAgentOmrChefsStatus extends javax.swing.JFrame {

    /**
     * Creates new form GeAgentOmrChefsStatus
     */
        private InfDB idb;
        private Integer agentensID;
        private Integer OmradetsID;
        
        
    public GeAgentOmrChefsStatus(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        geAgentOmrChefsStatus();
        valjEttOmrade();
    }
        
    public GeAgentOmrChefsStatus() {
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

        cmbValjAgent = new javax.swing.JComboBox<>();
        cmbValjOmrade = new javax.swing.JComboBox<>();
        btnGeOmrChefsStatus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbValjAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent" }));
        cmbValjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValjAgentActionPerformed(evt);
            }
        });

        cmbValjOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Område" }));
        cmbValjOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValjOmradeActionPerformed(evt);
            }
        });

        btnGeOmrChefsStatus.setText("Ok");
        btnGeOmrChefsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeOmrChefsStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj agent att ge områdeschefsstatus:");

        jLabel2.setText("Välj Ett Område Från Listan:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGeOmrChefsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(cmbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnGeOmrChefsStatus)
                .addGap(34, 34, 34)
                .addComponent(btnTillbaka)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbValjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValjAgentActionPerformed
        String enAgent = cmbValjAgent.getSelectedItem().toString();
       // String agent1 = String.valueOf(enAgent);
        
        String agentensID1;
        agentensID1 = enAgent.split(" ")[0];
        agentensID = Integer.parseInt(agentensID1);
    
    }//GEN-LAST:event_cmbValjAgentActionPerformed

    private void geAgentOmrChefsStatus(){
        
        try{
            ArrayList<HashMap<String, String>> valjAgentLista1 = idb.fetchRows("SELECT AGENT_ID, NAMN FROM AGENT ");
                for(HashMap<String, String> valjAgent1 : valjAgentLista1) {
                    String helaValjAgentLista1 = valjAgent1.get("AGENT_ID") + " " + valjAgent1.get("NAMN");
                        cmbValjAgent.addItem(helaValjAgentLista1);
                  }
                
             }
                  catch(InfException e){
                     JOptionPane.showMessageDialog(null, e.getMessage());
         }
       }
            
                
     
    
    private void valjEttOmrade(){
    try{
            ArrayList<HashMap<String, String>> valjOmrLista1 = idb.fetchRows("SELECT OMRADES_ID, BENAMNING FROM OMRADE");
                for(HashMap<String, String> valjOmr1 : valjOmrLista1) {
                    String helaValjOmrLista1 = valjOmr1.get("OMRADES_ID") + " " + valjOmr1.get("BENAMNING");
                        cmbValjOmrade.addItem(helaValjOmrLista1);
                  }
                
             }
                  catch(InfException e){
                     JOptionPane.showMessageDialog(null, e.getMessage());
         }
    
    } 
    
    
    
    private void cmbValjOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValjOmradeActionPerformed
        String ettOmrade = cmbValjOmrade.getSelectedItem().toString();
       // String agent1 = String.valueOf(enAgent);
        
        String OmradetsID1;
        OmradetsID1 = ettOmrade.split(" ")[0];
        OmradetsID = Integer.parseInt(OmradetsID1);
    }//GEN-LAST:event_cmbValjOmradeActionPerformed

    private void btnGeOmrChefsStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeOmrChefsStatusActionPerformed
        if(Validering.cbValueTrue(cmbValjAgent) && Validering.cbValueTrue(cmbValjOmrade))
        {
            
            try
            {
                System.out.println(agentensID + " " + OmradetsID);
               // String arRedanOmrChef = "SELECT AGENT_ID FROM OMRADESCHEF WHERE AGENT_ID =" + agentensID; 
                String arRedanOmrChef = idb.fetchSingle("SELECT AGENT_ID FROM OMRADESCHEF WHERE AGENT_ID =" + agentensID);
                System.out.println(arRedanOmrChef);
                if(arRedanOmrChef == null)
                {
                System.out.println("Värdet är null");
                idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentensID + "' , '" + OmradetsID +"')");
                JOptionPane.showMessageDialog(null, "Agenten med ID : " + agentensID + "är befodrad till områdeschef");
                } 
                else 
                {
               
                idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID =" +agentensID);
                idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentensID + "' , '" + OmradetsID +"')");
                JOptionPane.showMessageDialog(null, "Agenten med ID: " + agentensID + " är nu chef för område med ID: " + OmradetsID);
                }
            }
            catch(InfException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());     
               }      
         }
           
    }//GEN-LAST:event_btnGeOmrChefsStatusActionPerformed

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
            java.util.logging.Logger.getLogger(GeAgentOmrChefsStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeAgentOmrChefsStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeAgentOmrChefsStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeAgentOmrChefsStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeAgentOmrChefsStatus(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeOmrChefsStatus;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbValjAgent;
    private javax.swing.JComboBox<String> cmbValjOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}