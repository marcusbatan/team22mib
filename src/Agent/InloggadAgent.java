/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

import Admin.SeAllInfoAlien;
import Start.huvudFonster;
import oru.inf.InfDB;


public class InloggadAgent extends javax.swing.JFrame {

    private InfDB idb;
    private String anvandarNamn;
    
    
    public InloggadAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public InloggadAgent(InfDB idb, String anvandarNamn) {
       initComponents();
       this.setLocationRelativeTo(null);
       this.idb = idb;
       this.anvandarNamn= anvandarNamn;
       
    }

   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInloggadAgentRubrik = new javax.swing.JLabel();
        btnNyRegAlienAgent = new javax.swing.JButton();
        btnSeAllaAliensIOmrAgent = new javax.swing.JButton();
        btnAndraInfoAlienAgent = new javax.swing.JButton();
        btnSeAliensAvRasAgent = new javax.swing.JButton();
        btnNyRegUtrusAgent = new javax.swing.JButton();
        btnSeRegAlienTvaDatumAgent = new javax.swing.JButton();
        btnSeInfoOmAlienAgent = new javax.swing.JButton();
        btnSeOmrChefAgent = new javax.swing.JButton();
        btnAndraLosenAgent = new javax.swing.JButton();
        btnTillbakaAgent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInloggadAgentRubrik.setText("Inloggad som Agent:");

        btnNyRegAlienAgent.setText("Nyregistrera En Alien");
        btnNyRegAlienAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegAlienAgentActionPerformed(evt);
            }
        });

        btnSeAllaAliensIOmrAgent.setText("Se Alla Aliens I Ett Område");
        btnSeAllaAliensIOmrAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeAllaAliensIOmrAgentActionPerformed(evt);
            }
        });

        btnAndraInfoAlienAgent.setText("Ändra All Information Om En Alien");
        btnAndraInfoAlienAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAlienAgentActionPerformed(evt);
            }
        });

        btnSeAliensAvRasAgent.setText("Se Alla Aliens Av En Viss Ras");
        btnSeAliensAvRasAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeAliensAvRasAgentActionPerformed(evt);
            }
        });

        btnNyRegUtrusAgent.setText("Registrera Ny Utrustning");
        btnNyRegUtrusAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegUtrusAgentActionPerformed(evt);
            }
        });

        btnSeRegAlienTvaDatumAgent.setText("Se Registrerade Aliens Mellan Två Datum");
        btnSeRegAlienTvaDatumAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeRegAlienTvaDatumAgentActionPerformed(evt);
            }
        });

        btnSeInfoOmAlienAgent.setText("Se All Information Om En Alien");
        btnSeInfoOmAlienAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeInfoOmAlienAgentActionPerformed(evt);
            }
        });

        btnSeOmrChefAgent.setText("Se OmrådesChef För Ett Område");
        btnSeOmrChefAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeOmrChefAgentActionPerformed(evt);
            }
        });

        btnAndraLosenAgent.setText("Ändra Lösenord");
        btnAndraLosenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenAgentActionPerformed(evt);
            }
        });

        btnTillbakaAgent.setText("Tillbaka");
        btnTillbakaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNyRegUtrusAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeOmrChefAgent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAndraInfoAlienAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeAliensAvRasAgent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnNyRegAlienAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeAllaAliensIOmrAgent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSeInfoOmAlienAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                                .addComponent(btnSeRegAlienTvaDatumAgent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAndraLosenAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTillbakaAgent))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInloggadAgentRubrik)
                        .addGap(291, 291, 291)))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblInloggadAgentRubrik)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyRegAlienAgent)
                    .addComponent(btnSeAllaAliensIOmrAgent))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraInfoAlienAgent)
                    .addComponent(btnSeAliensAvRasAgent))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeRegAlienTvaDatumAgent)
                    .addComponent(btnSeInfoOmAlienAgent))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeOmrChefAgent)
                    .addComponent(btnNyRegUtrusAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaAgent)
                    .addComponent(btnAndraLosenAgent))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyRegAlienAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegAlienAgentActionPerformed
        new NyRegistreraAlien(idb).setVisible(true);
        
    }//GEN-LAST:event_btnNyRegAlienAgentActionPerformed

    private void btnAndraInfoAlienAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoAlienAgentActionPerformed
        new AndraAlienInfo(idb).setVisible(true);
        
    }//GEN-LAST:event_btnAndraInfoAlienAgentActionPerformed

    private void btnSeInfoOmAlienAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeInfoOmAlienAgentActionPerformed
        new SeAllInfoAlien(idb).setVisible(true);
        
    }//GEN-LAST:event_btnSeInfoOmAlienAgentActionPerformed

    private void btnSeAliensAvRasAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeAliensAvRasAgentActionPerformed
        new SokAliensForEnRas(idb).setVisible(true);
        
    }//GEN-LAST:event_btnSeAliensAvRasAgentActionPerformed

    private void btnTillbakaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAgentActionPerformed
        new huvudFonster(idb).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTillbakaAgentActionPerformed

    private void btnNyRegUtrusAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegUtrusAgentActionPerformed
        new RegistreraNyUtrustning(idb).setVisible(true);
       
    }//GEN-LAST:event_btnNyRegUtrusAgentActionPerformed

    private void btnSeAllaAliensIOmrAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeAllaAliensIOmrAgentActionPerformed
        new SokAlienEfterPlats(idb).setVisible(true);
        
    }//GEN-LAST:event_btnSeAllaAliensIOmrAgentActionPerformed

    private void btnSeRegAlienTvaDatumAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeRegAlienTvaDatumAgentActionPerformed
        new SokAliensMellan2Datum(idb).setVisible(true);
        
    }//GEN-LAST:event_btnSeRegAlienTvaDatumAgentActionPerformed

    private void btnSeOmrChefAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeOmrChefAgentActionPerformed
        new SeOmradesChef(idb).setVisible(true);
        
    }//GEN-LAST:event_btnSeOmrChefAgentActionPerformed

    private void btnAndraLosenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenAgentActionPerformed
        new AndraLosenordAgent(idb, anvandarNamn).setVisible(true);
        
    }//GEN-LAST:event_btnAndraLosenAgentActionPerformed

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
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggadAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfoAlienAgent;
    private javax.swing.JButton btnAndraLosenAgent;
    private javax.swing.JButton btnNyRegAlienAgent;
    private javax.swing.JButton btnNyRegUtrusAgent;
    private javax.swing.JButton btnSeAliensAvRasAgent;
    private javax.swing.JButton btnSeAllaAliensIOmrAgent;
    private javax.swing.JButton btnSeInfoOmAlienAgent;
    private javax.swing.JButton btnSeOmrChefAgent;
    private javax.swing.JButton btnSeRegAlienTvaDatumAgent;
    private javax.swing.JButton btnTillbakaAgent;
    private javax.swing.JLabel lblInloggadAgentRubrik;
    // End of variables declaration//GEN-END:variables
}