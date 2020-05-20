/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent;

/**
 *
 * @author hania
 */
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfException;



public class SokAliensForEnRas extends javax.swing.JFrame {

    private InfDB idb;
    private String enRas;
    /**
     * Creates new form SokAliensForEnRas
     */
    public SokAliensForEnRas(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        //getAlienRas();
        
         
    }
    
    /*public void getAlienRas() {
        String alien="SELECT NAMN FROM ALIEN" ;
        ArrayList<String>allaAlienNamn;
        try{
            allaAlienNamn = idb.fetchColumn(alien); 
            
            for(String alienNamn:allaAlienNamn){
                JcSokAlienForRas.addItem(alienNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel" + e.getMessage());
        }
    }*/
    
    private SokAliensForEnRas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    SokAliensForEnRas(InfDB idb, String anvandarNamn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSokAlienForRas = new javax.swing.JLabel();
        JcSokAlienForRas = new javax.swing.JComboBox<>();
        btnTillbakaSokAlienRas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtAreaAlienRas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSokAlienForRas.setText("Sök Aliens För Ras");

        JcSokAlienForRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj En Ras:", "WORM", "SQUID", "BOGLODITE" }));
        JcSokAlienForRas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcSokAlienForRasItemStateChanged(evt);
            }
        });
        JcSokAlienForRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcSokAlienForRasActionPerformed(evt);
            }
        });

        btnTillbakaSokAlienRas.setText("Tillbaka");
        btnTillbakaSokAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaSokAlienRasActionPerformed(evt);
            }
        });

        jTxtAreaAlienRas.setColumns(20);
        jTxtAreaAlienRas.setRows(5);
        jScrollPane2.setViewportView(jTxtAreaAlienRas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTillbakaSokAlienRas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JcSokAlienForRas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSokAlienForRas)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSokAlienForRas)
                .addGap(18, 18, 18)
                .addComponent(JcSokAlienForRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnTillbakaSokAlienRas)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcSokAlienForRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcSokAlienForRasActionPerformed
       /*jTxtAreaAlienRas.setText("");
       
       try{
           String valdRas=JcSokAlienForRas.getSelectedItem().toString();
           String rasID= ("SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '"+ valdRas + "'");
  String iD = idb.fetchSingle(rasID);
  System.out.println(iD);
           String ras=("SELECT 'SQUID' FROM SQUID WHERE ALIEN_ID = '" + iD + "'" + 
                   " UNION SELECT 'WORM' FROM WORM WHERE ALIEN_ID = '" + iD + "'" +
                   " UNION SELECT 'BOGLODITE' FROM BOGLODITE WHERE ALIEN_ID = '" + iD + "'");
                   
         
          String soktaRaser = idb.fetchSingle(ras);
           System.out.println(soktaRaser);
           
            jTxtAreaAlienRas.append(soktaRaser);
               
               
           }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }*/
        
    }//GEN-LAST:event_JcSokAlienForRasActionPerformed

    private void btnTillbakaSokAlienRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaSokAlienRasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaSokAlienRasActionPerformed

    private void JcSokAlienForRasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcSokAlienForRasItemStateChanged
        jTxtAreaAlienRas.setText("");
        String table=JcSokAlienForRas.getSelectedItem().toString();
        String fraga="SELECT NAMN FROM ALIEN JOIN " + table + " ON ALIEN.ALIEN_ID = " + table + ".ALIEN_ID";
        System.out.println(fraga);
        try {
            ArrayList<HashMap<String , String>> allaAliens = idb.fetchRows(fraga);
            if (allaAliens != null) {
                for(HashMap<String , String>alien : allaAliens){
                    
                    jTxtAreaAlienRas.append(alien.get("NAMN") + "\n");

                }
            }
        } catch (InfException ex) {
            Logger.getLogger(SokAliensForEnRas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JcSokAlienForRasItemStateChanged

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcSokAlienForRas;
    private javax.swing.JButton btnTillbakaSokAlienRas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTxtAreaAlienRas;
    private javax.swing.JLabel lblSokAlienForRas;
    // End of variables declaration//GEN-END:variables
        }
