/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testande;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author marku
 */
public class registreraNyttMaterial extends javax.swing.JFrame {
    String epost;
    private String char_list = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /**
     * Creates new form registreraNyttMaterial
     */
    public registreraNyttMaterial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   public registreraNyttMaterial(String e) {
               initComponents();
        this.setLocationRelativeTo(null);
                 epost = e;
                 
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfieldnamn = new javax.swing.JTextField();
        txtFieldTyp = new javax.swing.JTextField();
        btnlaggtill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Namn:");

        jLabel2.setText("Typ:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Registrera nytt material");

        txtfieldnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldnamnActionPerformed(evt);
            }
        });

        btnlaggtill.setText("Lägg till");
        btnlaggtill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaggtillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldnamn)
                    .addComponent(txtFieldTyp, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnlaggtill)
                        .addGap(311, 311, 311))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfieldnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnlaggtill)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldnamnActionPerformed

    private void btnlaggtillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaggtillActionPerformed
        // TODO add your handling code here:
        String namn = txtfieldnamn.getText();
        String typ = txtFieldTyp.getText();
        if (Validering.baraBokstaver(txtfieldnamn) && Validering.baraBokstaver(txtFieldTyp)){
        String id = GetAutoId("SELECT MAX(MATERIALID) FROM MATERIAL");
        String fraga = "INSERT into MATERIAL values ('" + id + "', '" + namn + "', '" + typ +"')";
        }
    }//GEN-LAST:event_btnlaggtillActionPerformed
            private void emptyBoxes(){
        txtfieldnamn.setText(null);
        txtFieldTyp.setText(null);
    }    
    
        public String GetAutoId(String o) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int idNy = 1;
        try {
            String query = o;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idNy = rs.getInt(1);
            }

        } catch (Exception ex) {
            System.out.println("Internt felmeddelande: " + ex);
        }

        idNy = idNy + 1;

        return Integer.toString(idNy);
  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlaggtill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtFieldTyp;
    private javax.swing.JTextField txtfieldnamn;
    // End of variables declaration//GEN-END:variables
}
