/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author vince
 */
import Start.huvudFonster;
import Validering.Validering;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class InloggadAdmin extends javax.swing.JFrame {

    
    private InfDB idb;
    private Integer agentID;
    private Integer alienID;
    
    private Integer utrustningsID;
    private Integer agentensID;
    private String anvandarNamn;
    private Integer kontorsChefsID1;
    
    
    public InloggadAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
        
        
        
    }
    
    public InloggadAdmin(InfDB idb, String anvandarNamn) {
        this.idb = idb;
        this.anvandarNamn = anvandarNamn;
        initComponents();
        this.setLocationRelativeTo(null);
       // geAgentAdminStatus();
       // taBortEnAgent();
        //taBortAlien();
        
        //taBortUtrustning();
        geKontorsChefStatus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lblRubrikAdmin = new javax.swing.JLabel();
        lblAndraKontChef = new javax.swing.JLabel();
        btnNyRegAgentAdmin = new javax.swing.JButton();
        btnNyRegAlienAdmin = new javax.swing.JButton();
        btnAndraAgentInfAdmin = new javax.swing.JButton();
        btnAndraAlienInfAdmin = new javax.swing.JButton();
        btnTillbakaAdmin = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();
        btnTaBortAlienAdmin = new javax.swing.JButton();
        btnAndraKontChef = new javax.swing.JButton();
        btnTaBortUtrusAdmin = new javax.swing.JButton();
        btnAndraLosenAdmin = new javax.swing.JButton();
        btnSokAliensPlats = new javax.swing.JButton();
        btnSeRegAlienTvaDatum = new javax.swing.JButton();
        btnRegNyUtrs = new javax.swing.JButton();
        btnSeAllInfoOmEnAlien = new javax.swing.JButton();
        btnSeOmradesChefForEttOmrade = new javax.swing.JButton();
        btnSokAlienForEnRas = new javax.swing.JButton();
        btnGeAgentOmrChefStatusOk = new javax.swing.JButton();
        cmbAndraKontorsChef = new javax.swing.JComboBox<>();
        btnTest = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrikAdmin.setText("Inloggad som Admin:");

        lblAndraKontChef.setText("Ändra KontorsChef");

        btnNyRegAgentAdmin.setText("Nyregistrera En Agent");
        btnNyRegAgentAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegAgentAdminActionPerformed(evt);
            }
        });

        btnNyRegAlienAdmin.setText("Nyregistrera en Alien");
        btnNyRegAlienAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegAlienAdminActionPerformed(evt);
            }
        });

        btnAndraAgentInfAdmin.setText("Ändra All Information Om En Agent");
        btnAndraAgentInfAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAgentInfAdminActionPerformed(evt);
            }
        });

        btnAndraAlienInfAdmin.setText("Ändra All Information Om En Alien");
        btnAndraAlienInfAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienInfAdminActionPerformed(evt);
            }
        });

        btnTillbakaAdmin.setText("Logga Ut");
        btnTillbakaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAdminActionPerformed(evt);
            }
        });

        btnTaBortAgent.setText("Ta Bort En Agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        btnTaBortAlienAdmin.setText("Ta Bort En Alien");
        btnTaBortAlienAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienAdminActionPerformed(evt);
            }
        });

        btnAndraKontChef.setText("Ok");
        btnAndraKontChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKontChefActionPerformed(evt);
            }
        });

        btnTaBortUtrusAdmin.setText("Ta Bort Utrustning");
        btnTaBortUtrusAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrusAdminActionPerformed(evt);
            }
        });

        btnAndraLosenAdmin.setText("Ändra Lösenord");
        btnAndraLosenAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenAdminActionPerformed(evt);
            }
        });

        btnSokAliensPlats.setText("Sök Aliens För En Plats");
        btnSokAliensPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAliensPlatsActionPerformed(evt);
            }
        });

        btnSeRegAlienTvaDatum.setText("Sök Aliens Registrerade Mellan Två Datum");
        btnSeRegAlienTvaDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeRegAlienTvaDatumActionPerformed(evt);
            }
        });

        btnRegNyUtrs.setText("Registrera Ny Utrustning");
        btnRegNyUtrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNyUtrsActionPerformed(evt);
            }
        });

        btnSeAllInfoOmEnAlien.setText("Se All Information Om En Alien");
        btnSeAllInfoOmEnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeAllInfoOmEnAlienActionPerformed(evt);
            }
        });

        btnSeOmradesChefForEttOmrade.setText("Sök Områdeschef För Ett Område");
        btnSeOmradesChefForEttOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeOmradesChefForEttOmradeActionPerformed(evt);
            }
        });

        btnSokAlienForEnRas.setText("Sök Aliens För En Ras");
        btnSokAlienForEnRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienForEnRasActionPerformed(evt);
            }
        });

        btnGeAgentOmrChefStatusOk.setText("Ge en Agent områdeschefsstatus");
        btnGeAgentOmrChefStatusOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeAgentOmrChefStatusOkActionPerformed(evt);
            }
        });

        cmbAndraKontorsChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj En Ny Kontorschef:" }));
        cmbAndraKontorsChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAndraKontorsChefActionPerformed(evt);
            }
        });

        btnTest.setText("Ge En Agent Administratörsstatus");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTest)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbAndraKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAndraKontChef))
                            .addComponent(btnTaBortAgent)
                            .addComponent(btnTaBortAlienAdmin)
                            .addComponent(btnTaBortUtrusAdmin)
                            .addComponent(btnAndraLosenAdmin))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraAgentInfAdmin)
                            .addComponent(btnAndraAlienInfAdmin)
                            .addComponent(btnSeRegAlienTvaDatum)
                            .addComponent(btnSeAllInfoOmEnAlien)
                            .addComponent(btnGeAgentOmrChefStatusOk)
                            .addComponent(btnSeOmradesChefForEttOmrade))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNyRegAlienAdmin)
                            .addComponent(btnSokAlienForEnRas)
                            .addComponent(btnNyRegAgentAdmin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTillbakaAdmin)
                                .addComponent(btnRegNyUtrs))
                            .addComponent(btnSokAliensPlats)))
                    .addComponent(lblAndraKontChef))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(lblRubrikAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblRubrikAdmin)
                .addGap(44, 44, 44)
                .addComponent(lblAndraKontChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyRegAgentAdmin)
                    .addComponent(btnAndraAgentInfAdmin)
                    .addComponent(btnAndraKontChef)
                    .addComponent(cmbAndraKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyRegAlienAdmin)
                    .addComponent(btnAndraAlienInfAdmin)
                    .addComponent(btnTest))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokAlienForEnRas)
                    .addComponent(btnTaBortAgent)
                    .addComponent(btnSeOmradesChefForEttOmrade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortAlienAdmin)
                    .addComponent(btnSokAliensPlats)
                    .addComponent(btnSeAllInfoOmEnAlien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortUtrusAdmin)
                    .addComponent(btnRegNyUtrs)
                    .addComponent(btnGeAgentOmrChefStatusOk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeRegAlienTvaDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnTillbakaAdmin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAndraLosenAdmin)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenAdminActionPerformed
        new AndraLosenordAgent(idb, anvandarNamn).setVisible(true);
    }//GEN-LAST:event_btnAndraLosenAdminActionPerformed

 /*   private void geAgentAdminStatus(){
        try{
            ArrayList<HashMap<String, String>> agentLista1 = idb.fetchRows("SELECT AGENT_ID, NAMN FROM AGENT ");
                for(HashMap<String, String> agent1 : agentLista1) {
                    String helaAgentLista1 = agent1.get("NAMN") + " " + agent1.get("AGENT_ID");
                        cmbGeAgentAdminStatus.addItem(helaAgentLista1);
                  }
                
             }
                  catch(InfException e){
                     JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }
    */
    
    private void geKontorsChefStatus(){
    
        try{
            ArrayList<HashMap<String, String>> kontorChef = idb.fetchRows("SELECT AGENT_ID, NAMN FROM AGENT ");
                for(HashMap<String, String> kChef : kontorChef) {
                    String kChefsLista = kChef.get("AGENT_ID") + " " + kChef.get("NAMN");
                        cmbAndraKontorsChef.addItem(kChefsLista);
                  }
                
             }
                  catch(InfException e){
                     JOptionPane.showMessageDialog(null, e.getMessage());
         }
    
    } 
    
    
    
    
    
    private void btnNyRegAgentAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegAgentAdminActionPerformed
        new NyRegistreraEnAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnNyRegAgentAdminActionPerformed

    private void cmbAndraKontorsChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAndraKontorsChefActionPerformed
        Object enKontorsChef = cmbAndraKontorsChef.getSelectedItem();
        String kontorsChef = String.valueOf(enKontorsChef);
        
        String kontorsChefsID;
        kontorsChefsID = kontorsChef.split(" ")[0];
        kontorsChefsID1 = Integer.parseInt(kontorsChefsID);
      
    }//GEN-LAST:event_cmbAndraKontorsChefActionPerformed

    
    
    private void btnAndraAgentInfAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAgentInfAdminActionPerformed
        new AndraInfoAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnAndraAgentInfAdminActionPerformed

    private void btnSokAliensPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAliensPlatsActionPerformed
        new SokAlienEfterPlats(idb).setVisible(true);
    }//GEN-LAST:event_btnSokAliensPlatsActionPerformed

    private void btnSeOmradesChefForEttOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeOmradesChefForEttOmradeActionPerformed
        new SeOmradesChef(idb).setVisible(true);
    }//GEN-LAST:event_btnSeOmradesChefForEttOmradeActionPerformed

    private void btnRegNyUtrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNyUtrsActionPerformed
        new RegistreraNyUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRegNyUtrsActionPerformed

    private void btnTillbakaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAdminActionPerformed
        new huvudFonster(idb).setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnTillbakaAdminActionPerformed

    private void btnGeAgentOmrChefStatusOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeAgentOmrChefStatusOkActionPerformed
        new GeAgentOmrChefsStatus(idb).setVisible(true);
    }//GEN-LAST:event_btnGeAgentOmrChefStatusOkActionPerformed

    private void btnSeAllInfoOmEnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeAllInfoOmEnAlienActionPerformed
        new SeAllInfoAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnSeAllInfoOmEnAlienActionPerformed

    private void btnAndraKontChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKontChefActionPerformed
        if(Validering.cbValueTrue(cmbAndraKontorsChef));
        try{
            String kontorsChStatus = idb.fetchSingle("SELECT AGENT_ID FROM KONTORSCHEF");
         
        if(kontorsChStatus == null){ 
             String laggInKChef = ("INSERT INTO KONTORSCHEF"
                    + "(AGENT_ID, KONTORSBETECKNING)"
                    + "VALUES(" +kontorsChefsID1 + "," + "'�rebrokontoret'" + ")");
             
                    idb.insert(laggInKChef);
                    
                     JOptionPane.showMessageDialog(null, "En ny kontorschef med ID: " + kontorsChefsID1 + " har blivit registrerad");
                    }
           
        else{
         String uppdaterakChefsStatus = "UPDATE KONTORSCHEF SET AGENT_ID =" +kontorsChefsID1; 
             
                idb.update(uppdaterakChefsStatus);
                JOptionPane.showMessageDialog(null, "Nu �r agenten med ID: " + kontorsChefsID1 + " " + " kontorschef!");
                 }
        
         } catch(InfException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
             }

    }//GEN-LAST:event_btnAndraKontChefActionPerformed

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed
        new TaBortAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

    private void btnTaBortUtrusAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrusAdminActionPerformed
        new TaBortUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnTaBortUtrusAdminActionPerformed

    private void btnTaBortAlienAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienAdminActionPerformed
        new TaBortAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnTaBortAlienAdminActionPerformed

    private void btnNyRegAlienAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegAlienAdminActionPerformed
        new NyRegistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnNyRegAlienAdminActionPerformed

    private void btnSeRegAlienTvaDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeRegAlienTvaDatumActionPerformed
        new SokAliensMellan2Datum(idb).setVisible(true);
    }//GEN-LAST:event_btnSeRegAlienTvaDatumActionPerformed

    private void btnSokAlienForEnRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienForEnRasActionPerformed
        new SokAliensForEnRas(idb).setVisible(true);
    }//GEN-LAST:event_btnSokAlienForEnRasActionPerformed

    private void btnAndraAlienInfAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienInfAdminActionPerformed
        new AndraAlienInfo(idb).setVisible(true);
    }//GEN-LAST:event_btnAndraAlienInfAdminActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        new GeAgentAdminStatus(idb).setVisible(true);
    }//GEN-LAST:event_btnTestActionPerformed
   
    
    
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
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggadAdmin(idb, anvandarNamn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAgentInfAdmin;
    private javax.swing.JButton btnAndraAlienInfAdmin;
    private javax.swing.JButton btnAndraKontChef;
    private javax.swing.JButton btnAndraLosenAdmin;
    private javax.swing.JButton btnGeAgentOmrChefStatusOk;
    private javax.swing.JButton btnNyRegAgentAdmin;
    private javax.swing.JButton btnNyRegAlienAdmin;
    private javax.swing.JButton btnRegNyUtrs;
    private javax.swing.JButton btnSeAllInfoOmEnAlien;
    private javax.swing.JButton btnSeOmradesChefForEttOmrade;
    private javax.swing.JButton btnSeRegAlienTvaDatum;
    private javax.swing.JButton btnSokAlienForEnRas;
    private javax.swing.JButton btnSokAliensPlats;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTaBortAlienAdmin;
    private javax.swing.JButton btnTaBortUtrusAdmin;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnTillbakaAdmin;
    private javax.swing.JComboBox<String> cmbAndraKontorsChef;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblAndraKontChef;
    private javax.swing.JLabel lblRubrikAdmin;
    // End of variables declaration//GEN-END:variables
}
