/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author sys515
 */
public class Menu extends javax.swing.JFrame {

    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setResizable(false);
         setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
         
        // this.setSize(720,310);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();    
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonventa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonrh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonclientes = new javax.swing.JButton();
        botonprov = new javax.swing.JButton();
        botonfinanzas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(17, 111, 172));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-caja-llena-100.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-caja-llena-filled-100.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 110));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compras");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-comprar-100.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(109, 85));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-comprar-filled-100.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 110));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        botonventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-checkout-100.png"))); // NOI18N
        botonventa.setContentAreaFilled(false);
        botonventa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-checkout-filled-100.png"))); // NOI18N
        botonventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonventaActionPerformed(evt);
            }
        });
        jPanel2.add(botonventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, 110));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recursos Humanos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        botonrh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-grupos-de-usuarios-100.png"))); // NOI18N
        botonrh.setContentAreaFilled(false);
        botonrh.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-grupos-de-usuarios-filled-100.png"))); // NOI18N
        botonrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrhActionPerformed(evt);
            }
        });
        jPanel2.add(botonrh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 110));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedores");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Finanzas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        botonclientes.setForeground(new java.awt.Color(255, 255, 255));
        botonclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-cliente-de-empresa-100.png"))); // NOI18N
        botonclientes.setContentAreaFilled(false);
        botonclientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-cliente-de-empresa-filled-100.png"))); // NOI18N
        botonclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonclientesActionPerformed(evt);
            }
        });
        jPanel2.add(botonclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 110));

        botonprov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-proveedor-100.png"))); // NOI18N
        botonprov.setContentAreaFilled(false);
        botonprov.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-proveedor-filled-100.png"))); // NOI18N
        botonprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonprovActionPerformed(evt);
            }
        });
        jPanel2.add(botonprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, 120));

        botonfinanzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-contabilidad-100.png"))); // NOI18N
        botonfinanzas.setContentAreaFilled(false);
        botonfinanzas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-contabilidad-filled-100.png"))); // NOI18N
        botonfinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonfinanzasActionPerformed(evt);
            }
        });
        jPanel2.add(botonfinanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 120, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inventario s = new Inventario();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void cerrar(){
Object [] opciones ={"Aceptar","Cancelar"};
int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
if (eleccion == JOptionPane.YES_OPTION)
{
System.exit(0);
}else{
  
    
}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SubCompras trd = new SubCompras();
        trd.setVisible(true); // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    cerrar();    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void botonventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonventaActionPerformed
      SubVentas x=new SubVentas();
      x.setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botonventaActionPerformed

    private void botonclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonclientesActionPerformed
        // TODO add your handling code here:
        verclientes vr = new verclientes();
        vr.setVisible(true);
    }//GEN-LAST:event_botonclientesActionPerformed

    private void botonprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonprovActionPerformed
        // TODO add your handling code here:
        verprove prov = new verprove();
        prov.setVisible(true);
    }//GEN-LAST:event_botonprovActionPerformed

    private void botonrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrhActionPerformed
        // TODO add your handling code here:
        
        rh recursos = new rh();
        recursos.setVisible(true);
        
    }//GEN-LAST:event_botonrhActionPerformed

    private void botonfinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonfinanzasActionPerformed
        // TODO add your handling code here:
        
        vfin vff = new vfin();
        vff.setVisible(true);
    }//GEN-LAST:event_botonfinanzasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonclientes;
    private javax.swing.JButton botonfinanzas;
    private javax.swing.JButton botonprov;
    private javax.swing.JButton botonrh;
    private javax.swing.JButton botonventa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
