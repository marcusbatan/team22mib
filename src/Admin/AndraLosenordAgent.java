/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author khali
 */


import Validering.Validering;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;


public class AndraLosenordAgent extends javax.swing.JFrame {

    /**
     * Creates new form AndraLosenordAgent
     */
        private InfDB idb;
        private String anvandarNamn;
        

    public AndraLosenordAgent(InfDB idb, String anvandarNamn) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        this.anvandarNamn = anvandarNamn;
        
    }
    
    public AndraLosenordAgent(InfDB idb) {
        initComponents();
        this.idb = idb;      
    }
    

    public void sattNyttLosen2(){
       if (Validering.textFaltHarVarde(txtNuvarandeLosenAgent) && Validering.textFaltHarVarde(txtBekraftaLosenAgent)){
                String sokLosen1 = "SELECT LOSENORD FROM AGENT WHERE AGENT_ID =" + anvandarNamn;
                String befLosen = txtNuvarandeLosenAgent.getText();
                String nyaLosen = txtBekraftaLosenAgent.getText();
                    if(nyaLosen.length() <=6){
                        try{
                             String hamtadLosen1 = idb.fetchSingle(sokLosen1);
                             System.out.println(hamtadLosen1);
                
                    if(befLosen.equals(hamtadLosen1)){
                          System.out.println(hamtadLosen1);
                    idb.update("UPDATE AGENT SET LOSENORD='" + nyaLosen + "' WHERE AGENT_ID =" +anvandarNamn);
                         JOptionPane.showMessageDialog(null, "Ditt l�senord �r nu bytt till: " + nyaLosen + "");
                   }              
                    else{
                        JOptionPane.showMessageDialog(null, "Fel nuvarande lösenord är ifyllt! Försök igen.");
                    } 
              }
               catch(InfException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());     
               }   
             }   
                 else{
             JOptionPane.showMessageDialog(null, "Lösenordet får max vara 6 tecken långt.");
            }
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

        lblNuvarandeLosenAgent = new javax.swing.JLabel();
        lblBekraftaLosenAgent = new javax.swing.JLabel();
        txtNuvarandeLosenAgent = new javax.swing.JTextField();
        txtBekraftaLosenAgent = new javax.swing.JTextField();
        btnTillbakaLosenAgent = new javax.swing.JButton();
        btnAndraLosenAgent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNuvarandeLosenAgent.setText("Nuvarande Lösenord:");

        lblBekraftaLosenAgent.setText("Nytt Lösenord:");

        btnTillbakaLosenAgent.setText("Tillbaka");
        btnTillbakaLosenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaLosenAgentActionPerformed(evt);
            }
        });

        btnAndraLosenAgent.setText("Ändra");
        btnAndraLosenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenAgentActionPerformed(evt);
            }
        });

        jLabel1.setText("(Max 6 tecken)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNuvarandeLosenAgent)
                            .addComponent(txtNuvarandeLosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBekraftaLosenAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAndraLosenAgent)
                                .addComponent(txtBekraftaLosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbakaLosenAgent)
                        .addGap(2, 2, 2)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblBekraftaLosenAgent)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuvarandeLosenAgent)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuvarandeLosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBekraftaLosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAndraLosenAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnTillbakaLosenAgent)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenAgentActionPerformed
          sattNyttLosen2(); //kallar på metod i denna klass som ändrar lösenordet.
    }//GEN-LAST:event_btnAndraLosenAgentActionPerformed

    private void btnTillbakaLosenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaLosenAgentActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaLosenAgentActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenordAgent(idb, anvandarNamn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosenAgent;
    private javax.swing.JButton btnTillbakaLosenAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBekraftaLosenAgent;
    private javax.swing.JLabel lblNuvarandeLosenAgent;
    private javax.swing.JTextField txtBekraftaLosenAgent;
    private javax.swing.JTextField txtNuvarandeLosenAgent;
    // End of variables declaration//GEN-END:variables
}
