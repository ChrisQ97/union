/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;

/**
 *
 * @author chr97lubuntu
 */
public class vfin extends javax.swing.JFrame {
Conexion con = new Conexion();
   
    Connection Consulta = con.conexion();
    /**
     * Creates new form vfin
     */
    public vfin() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();    
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jButton2.setText("<html>Datos Estado</br> de Resultados</html>"); 
        jButton1.setText("<html>Datos Balance</br> General</html>"); 
        botoner.setText("<html>Estado de</br> Resultados</html>"); 
        botonbalance.setText("<html>Balance</br> General          </html>"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonbalance = new javax.swing.JButton();
        botoner = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 111, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonbalance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonbalance.setForeground(new java.awt.Color(255, 255, 255));
        botonbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-documento-100.png"))); // NOI18N
        botonbalance.setText("Ver balance ");
        botonbalance.setContentAreaFilled(false);
        botonbalance.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-documento-filled-100.png"))); // NOI18N
        botonbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbalanceActionPerformed(evt);
            }
        });
        jPanel1.add(botonbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 310, 100));

        botoner.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botoner.setForeground(new java.awt.Color(255, 255, 255));
        botoner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-documento-100.png"))); // NOI18N
        botoner.setText("Ver estado de resultados");
        botoner.setContentAreaFilled(false);
        botoner.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-documento-filled-100.png"))); // NOI18N
        botoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonerActionPerformed(evt);
            }
        });
        jPanel1.add(botoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 310, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-ver-detalles-100.png"))); // NOI18N
        jButton1.setText("Datos Balance General");
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-ver-detalles-filled-100.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 290, 100));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-ver-detalles-100.png"))); // NOI18N
        jButton2.setText("Datos estado de resultados");
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-ver-detalles-filled-100.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonerActionPerformed
        // TODO add your handling code here:
        resultados err = new resultados();
        err.setVisible(true);
        
        
    }//GEN-LAST:event_botonerActionPerformed

    private void botonbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbalanceActionPerformed
        // TODO add your handling code here:
        er balance = new er();
        balance.setVisible(true);
    }//GEN-LAST:event_botonbalanceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        datosbalance dbl = new datosbalance();
        dbl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        datoser err = new datoser();
        err.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(vfin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vfin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vfin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vfin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vfin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbalance;
    private javax.swing.JButton botoner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}