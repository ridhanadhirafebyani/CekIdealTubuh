/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cektubuhideal;

import javax.swing.JOptionPane;

/**
 *
 * @author Ridha Nadhira F
 */
public class idealframe extends javax.swing.JFrame {

   String temp = "";
   Double ti,bt,hl;
    public idealframe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etNama = new javax.swing.JTextField();
        etTinggi = new javax.swing.JTextField();
        etBB = new javax.swing.JTextField();
        rbPr = new javax.swing.JRadioButton();
        rbLk = new javax.swing.JRadioButton();
        btHitung = new javax.swing.JButton();
        btCobaLagi = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etHasil = new javax.swing.JTextField();
        etHasil2 = new javax.swing.JTextField();
        etIdeal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Tinggi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 90, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 110, 30);

        etNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNamaActionPerformed(evt);
            }
        });
        getContentPane().add(etNama);
        etNama.setBounds(160, 50, 200, 30);

        etTinggi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(etTinggi);
        etTinggi.setBounds(160, 90, 100, 30);

        etBB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(etBB);
        etBB.setBounds(160, 130, 100, 30);

        rbPr.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbPr);
        rbPr.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbPr.setText("Perempuan");
        getContentPane().add(rbPr);
        rbPr.setBounds(160, 170, 90, 25);

        rbLk.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbLk);
        rbLk.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbLk.setText("Laki-Laki");
        getContentPane().add(rbLk);
        rbLk.setBounds(270, 170, 80, 25);

        btHitung.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btHitung);
        btHitung.setBounds(60, 220, 90, 40);

        btCobaLagi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCobaLagi.setText("Coba Lagi");
        btCobaLagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCobaLagiActionPerformed(evt);
            }
        });
        getContentPane().add(btCobaLagi);
        btCobaLagi.setBounds(160, 220, 110, 40);

        btExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExit.setText("Keluar");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(280, 220, 90, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Berat Badan Ideal");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 290, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 340, 170, 30);

        etHasil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(etHasil);
        etHasil.setBounds(40, 380, 350, 30);

        etHasil2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(etHasil2);
        etHasil2.setBounds(40, 420, 350, 30);

        etIdeal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(etIdeal);
        etIdeal.setBounds(170, 290, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 290, 40, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 210);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 210, 420, 60);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 270, 420, 70);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 340, 420, 130);

        setBounds(0, 0, 434, 512);
    }// </editor-fold>//GEN-END:initComponents

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        if(etBB.getText().equals("")||etTinggi.getText().equals("")||etNama.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Kotak Isian Belum Diisi");
        }else if(rbPr.isSelected()||rbLk.isSelected()){
            try{
                Proses();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada Yang Salah");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Pilih Jenis Kelamin Ada");
        }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btCobaLagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCobaLagiActionPerformed
        etNama.setText(null);
        etBB.setText(null);
        etTinggi.setText(null);
        buttonGroup1.clearSelection();
        etIdeal.setText(null);
        etHasil.setText(null);
        etHasil2.setText(null);

    }//GEN-LAST:event_btCobaLagiActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void etNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNamaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(idealframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(idealframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(idealframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(idealframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new idealframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCobaLagi;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btHitung;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField etBB;
    private javax.swing.JTextField etHasil;
    private javax.swing.JTextField etHasil2;
    private javax.swing.JTextField etIdeal;
    private javax.swing.JTextField etNama;
    private javax.swing.JTextField etTinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
 ti = Double.valueOf(etTinggi.getText());
        bt = Double.valueOf(etBB.getText());
        
        if(rbPr.isSelected()){
            hl = (ti - 100) *1;
        }else if(rbLk.isSelected()){
            hl = (ti-104)*1;
        }
        temp = Double.toString(hl.intValue());
        
        if(hl <bt){
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Sepertinya Anda Overweight :( ");
            etHasil2.setText("Banyaklah Berolahraga dan Hindari Makanan Berkolesterol");
        }else if(hl > bt){
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Sepertinya Anda UnderWeight :(");
            etHasil2.setText("Banyaklah Mengkonsumsi Makanan yang Berkarbohidrat");
        }else{
            etIdeal.setText(temp);
            etHasil.setText("Maaf " + etNama.getText() + " , Berat Badan Anda Sudah Ideal ");
            etHasil2.setText("Lanjutkan Pola Makan Teratur dan Gaya Hidup Sehat");
            }
}
}
