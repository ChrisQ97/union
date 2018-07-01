/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author chr97lubuntu
 */
public class verclientes extends javax.swing.JFrame {
      
    Conexion con = new Conexion();
   
    Connection Consulta = con.conexion();
    
    /**
     * Creates new form verclientes
     */
    public verclientes() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE); 
        
        
        DefaultTableModel modelo=new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        modelo.addColumn("Nit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Dirección");
        tcli.setModel(modelo);
        
       String datos[] = new String[5];
        try {
            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Nit, Nombre, Apellido, Numero, Direccion FROM Cliente;");
            while(Ca.next()){
                datos[0] = Ca.getString(1);
                datos[1] = Ca.getString(2);
                datos[2] = Ca.getString(3);
                datos[3] = Ca.getString(4);
                datos[4] = Ca.getString(5);
                modelo.addRow(datos);
                
                
            }
            tcli.setModel(modelo);
            
        }catch(SQLException ex){
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        tcli.setVisible(true);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tcli = new javax.swing.JTable();
        addcli = new javax.swing.JButton();
        actualziar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 111, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tcli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nit", "Nombre", "Apellido", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(tcli);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 280));

        addcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-agregar-administrador-50.png"))); // NOI18N
        addcli.setContentAreaFilled(false);
        addcli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-agregar-administrador-filled-50.png"))); // NOI18N
        addcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcliActionPerformed(evt);
            }
        });
        jPanel1.add(addcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 60, 50));

        actualziar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-actualizar-50.png"))); // NOI18N
        actualziar.setContentAreaFilled(false);
        actualziar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-actualizar-filled-50.png"))); // NOI18N
        actualziar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualziarActionPerformed(evt);
            }
        });
        jPanel1.add(actualziar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 60, 50));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-multiedición-50.png"))); // NOI18N
        jButton1.setText("Reporte");
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-multiedición-filled-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcliActionPerformed
        // TODO add your handling code here:
        Clientes cls = new Clientes();
        cls.setVisible(true);
        
    }//GEN-LAST:event_addcliActionPerformed

    private void actualziarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualziarActionPerformed
        // TODO add your handling code here:
     DefaultTableModel modelo=new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        modelo.addColumn("Nit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Dirección");
        tcli.setModel(modelo);
        
       String datos[] = new String[5];
        try {
            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Nit, Nombre, Apellido, Numero, Direccion FROM Cliente;");
            while(Ca.next()){
                datos[0] = Ca.getString(1);
                datos[1] = Ca.getString(2);
                datos[2] = Ca.getString(3);
                datos[3] = Ca.getString(4);
                datos[4] = Ca.getString(5);
                modelo.addRow(datos);
                
                
            }
            tcli.setModel(modelo);
            
        }catch(SQLException ex){
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        tcli.setVisible(true);
       
        
    }//GEN-LAST:event_actualziarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection tr = con.conexion();
            JasperReport reporte= null;
            String path="/home/sys515/Documentos/ProyecoPEPS/Inventario2-master/Inventario2./src/Reportes/report1.jasper";
            reporte= (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint =JasperFillManager.fillReport(reporte,null,tr);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

            // TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(verclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualziar;
    private javax.swing.JButton addcli;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tcli;
    // End of variables declaration//GEN-END:variables
}
