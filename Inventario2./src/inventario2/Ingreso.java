/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author sys515
 */
public class Ingreso extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conexion();
    Connection tr = con.conexion();
    Connection res = con.conexion();
    Connection Consulta = con.conexion();
    private String restar;
    private String nitglobal;
    private int tp=0;
    private int n2=0;
    private int año=0;
    private int mes=0;
    private int dia=0;
    private String[] volumen=new String[3];
    private String[] unidad=new String[3];
    private String[] longitud=new String[3];
    private String[] area=new String[3];
    



  
   
       DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        initComponents();
   
    volumen[0]="Litros";
    volumen[1]="cm3";
    volumen[2]="Galon";
    unidad[0]="Cajas";
    unidad[1]="pares";
    unidad[2]="docenas";
    longitud[0]="m";
    longitud[1]="cm";
    longitud[2]="pie";
    area[0]="cm2";
    area[1]="m2";
    area[2]="pie2";
        this.setResizable(false);
       
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();    
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        modelo.setRowCount(0);
        modelo.addColumn("Codigo"); //0    
        modelo.addColumn("Cantidad"); //1
        modelo.addColumn("Medida"); //2
        modelo.addColumn("Nombre");//3
        modelo.addColumn("Marca");//4
        modelo.addColumn("Costo Unitario");//5
        modelo.addColumn("Costo Total");//6
        modelo.addColumn("Descripcion");//7
        modelo.addColumn("Ganancia");//8
        modelo.addColumn("Precio Unitario");//9
        modelo.addColumn("Precio Total");//10
                Factura.setModel(modelo);
                
                
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE); 
        AutoCompleteDecorator.decorate(Otro);
        Producto.setText("");
        Marca.setText("");
        Costo.setText("");
        Serie.setText("");
        Numero.setText("");
        Cantidad.setText("");
        Ganancia.setText("");
        Codigo.setText("");
          try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Nit,id FROM Proveedor");
            while (Ca.next()) {

                Otro.addItem(Ca.getString(1));
            }
            Ca.close();
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
     
            }
         Costo.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             Costo.setText(null);
             tp=0;
             n2=0;
            }
        });
         Factura.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 2) {
                    modelo.removeRow(Factura.getSelectedRow());
                    
                 
                }
            }
        });
        for (int i = 0; i <area.length; i++) {
            Tipo.addItem(area[i]);
        }
        
         
    }
    private String mensaje(String x)
    {
        int numero=0;
        try
        {
        
            numero=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("introduce numero"));
            return String.valueOf(numero);
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
 
        }
        return x;
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
        palenparaprov = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Otro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Serie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        addfila = new javax.swing.JButton();
        Descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ganancia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Unidad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        TC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TC1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Factura = new rojerusan.RSTableMetro();
        Compra = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(17, 111, 172));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        palenparaprov.setBackground(new java.awt.Color(31, 115, 170));
        palenparaprov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        palenparaprov.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                palenparaprovFocusLost(evt);
            }
        });
        palenparaprov.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        palenparaprov.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 155, 72, 32));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Representante");
        palenparaprov.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 199, -1, 25));

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre");
        palenparaprov.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 163, -1, -1));

        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido");
        palenparaprov.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 203, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nit Proveedor");
        palenparaprov.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 234, -1, 24));

        Otro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OtroFocusLost(evt);
            }
        });
        Otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroActionPerformed(evt);
            }
        });
        palenparaprov.add(Otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 230, 208, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Factura");
        palenparaprov.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));

        Serie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SerieFocusLost(evt);
            }
        });
        palenparaprov.add(Serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 47, 92, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Serie");
        palenparaprov.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 55, -1, -1));

        Numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumeroFocusLost(evt);
            }
        });
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });
        Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroKeyTyped(evt);
            }
        });
        palenparaprov.add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 87, 93, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Numero");
        palenparaprov.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 95, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Proveedor");
        palenparaprov.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 127, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-agregar-administrador-50.png"))); // NOI18N
        jButton2.setToolTipText("Agregar Proveedor");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-agregar-administrador-filled-50.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        palenparaprov.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 60, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-actualizar-50.png"))); // NOI18N
        jButton3.setToolTipText("Actualizar");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-actualizar-filled-50.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        palenparaprov.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 50, 50));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha");
        palenparaprov.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 13, -1, -1));
        palenparaprov.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 47, 152, -1));

        jPanel2.add(palenparaprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 290));

        jPanel1.setBackground(new java.awt.Color(31, 115, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addfila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-más-2-matemáticas-50.png"))); // NOI18N
        addfila.setContentAreaFilled(false);
        addfila.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-más-2-matemáticas-filled-50.png"))); // NOI18N
        addfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfilaActionPerformed(evt);
            }
        });
        jPanel1.add(addfila, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, 50));

        Descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DescripcionFocusLost(evt);
            }
        });
        jPanel1.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 243, 60));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        Ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciaActionPerformed(evt);
            }
        });
        Ganancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GananciaKeyTyped(evt);
            }
        });
        jPanel1.add(Ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 98, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Porcentaje de ganancia");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Costo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CostoFocusLost(evt);
            }
        });
        Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoKeyTyped(evt);
            }
        });
        jPanel1.add(Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 114, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo/Unitario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 114, -1));

        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });
        jPanel1.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 200, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        Producto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductoFocusLost(evt);
            }
        });
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        jPanel1.add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Volumen", "Longitud", "Unidad" }));
        Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadActionPerformed(evt);
            }
        });
        jPanel1.add(Unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Unidad");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 450, 290));

        TC.setForeground(new java.awt.Color(255, 255, 255));
        TC.setText("0");
        jPanel2.add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 71, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, -1, -1));

        TC1.setForeground(new java.awt.Color(255, 255, 255));
        TC1.setText("0.0");
        jPanel2.add(TC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 74, -1));

        Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Factura.setColorBackgoundHead(new java.awt.Color(0, 141, 232));
        Factura.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jScrollPane1.setViewportView(Factura);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 1070, 310));

        Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-añadir-a-la-colección-50.png"))); // NOI18N
        Compra.setContentAreaFilled(false);
        Compra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-añadir-a-la-colección-filled-50.png"))); // NOI18N
        Compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompraMouseClicked(evt);
            }
        });
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });
        Compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CompraKeyPressed(evt);
            }
        });
        jPanel2.add(Compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 49, 49));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-volver-asignación-50.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-volver-asignación-filled-50.png"))); // NOI18N
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 61, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void CrearReg(int id,String xyz[],int idFac)
    {
       int idUsuario = 0;

        try {
            BigDecimal CostoTotal = BigDecimal.valueOf(Double.parseDouble(Costo.getText())).multiply(BigDecimal.valueOf(Double.parseDouble(Cantidad.getText()))).setScale(2, BigDecimal.ROUND_DOWN);;
           
            PreparedStatement CrearLot = tr.prepareStatement("INSERT INTO Registro_Compras(Producto_id,CostoUnitario,Cantidad,CostoTotal,Descripcion,Ganancia,PrecioUnitario,PrecioTotal,Fecha,FacturaCompra_id) VALUES(?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            
       
            CrearLot.setString(1, String.valueOf(id));
            CrearLot.setString(2,xyz[5]);
            CrearLot.setString(3, xyz[1]);
            CrearLot.setString(4, xyz[6]);
            CrearLot.setString(5, xyz[7]);
            CrearLot.setString(6, xyz[8]);
            CrearLot.setString(7,xyz[9]);
            CrearLot.setString(8,xyz[10]);
            CrearLot.setString(9,año+"-"+mes+"-"+dia);
            CrearLot.setString(10,String.valueOf(idFac));
            

            

            CrearLot.executeUpdate();
            
            
              try (ResultSet rs = CrearLot.getGeneratedKeys()) {
                if (!rs.next()) {
                    throw new RuntimeException("no devolvió el ID");
                }

                idUsuario = rs.getInt(1);
                CrearLot.close();
               
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      private BigDecimal x(Double r)
    {
        return BigDecimal.valueOf(r).setScale(2, BigDecimal.ROUND_DOWN);
    }
    private void CrearLote(int id, int idF,String xyz[]) {
               int idUsuario = 0;

        try {
            BigDecimal CostoTotal = BigDecimal.valueOf(Double.parseDouble(Costo.getText())).multiply(BigDecimal.valueOf(Double.parseDouble(Cantidad.getText()))).setScale(2, BigDecimal.ROUND_DOWN);
           
            PreparedStatement CrearLot = tr.prepareStatement("INSERT INTO Lote(Producto_id,CostoUnitario,Cantidad,CostoTotal,Descripcion,Ganancia,PrecioUnitario,PrecioTotal,Fecha,FacturaCompra_id,NoLote,Disponible) VALUES(?,?,?,?,?,?,?,?,?,?,1,1)",
                    Statement.RETURN_GENERATED_KEYS);
            
       
            CrearLot.setString(1, String.valueOf(id));
            CrearLot.setString(2,xyz[5]);
            CrearLot.setString(3, xyz[1]);
            CrearLot.setString(4, xyz[6]);
            CrearLot.setString(5, xyz[7]);
            CrearLot.setString(6, xyz[8]);
            CrearLot.setString(7,xyz[9]);
            CrearLot.setString(8,xyz[10]);
            CrearLot.setString(9,año+"-"+mes+"-"+dia);
            CrearLot.setString(10,String.valueOf(idF));

         
            

            CrearLot.executeUpdate();
            
            
              try (ResultSet rs = CrearLot.getGeneratedKeys()) {
                if (!rs.next()) {
                    throw new RuntimeException("no devolvió el ID");
                }

                idUsuario = rs.getInt(1);
                CrearLot.close();
               
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }
    
     private static Double formatearDecimales(Double numero, Integer numeroDecimales) {
return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
}
    private int CrearProducto(String xy[]) {
        restar=null;
        int idUsuario = 0;
        try {
            PreparedStatement CrearProd = cn.prepareStatement("INSERT INTO Producto(Nombre,Existencia,Marca,Codigo,StockMinimo,Medida) VALUES(?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            double otro=0;
            otro=formatearDecimales(Double.parseDouble(xy[1])*0.25,0);
            int x=(int)otro;
            CrearProd.setString(1, xy[3]);
            CrearProd.setString(2, xy[1]);
            CrearProd.setString(3, xy[4]);
            CrearProd.setString(4, xy[0]);
            CrearProd.setString(5,String.valueOf(x));
            CrearProd.setString(6, xy[2]);
            CrearProd.executeUpdate();
            restar=xy[1];
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
            try (ResultSet rs = CrearProd.getGeneratedKeys()) {
                if (!rs.next()) {
                    throw new RuntimeException("no devolvió el ID");
                }

                idUsuario = rs.getInt(1);
                CrearProd.close();
                restar(idUsuario);
                return idUsuario;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idUsuario;

    }
    private void restar(int r)
    {
        try {
            PreparedStatement ActualizarProveedor = res.prepareStatement("UPDATE Producto SET Existencia =Existencia-'"+restar+"' WHERE id='"+String.valueOf(r)+"' ");
            ActualizarProveedor.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int idPro(String Nit)
    {
        try {
            String id2 ="0";
            Statement xq = cn.createStatement();
            ResultSet red = xq.executeQuery("SELECT id FROM Proveedor WHERE Nit ='" + Nit+ "' ");
            while(red.next())
            {
            id2=red.getString(1);
            }
            return Integer.parseInt(id2);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
       
    

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 127 || k >= 58 && k <= 97) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k >= 33 && k <=47 ) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Simbolos!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            Cantidad.transferFocus();
        }
    }//GEN-LAST:event_CantidadKeyTyped
    
    private void CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k == 10) {
            Costo.transferFocus();
            tp=1;
            Costo.setText(""+x(Double.parseDouble(Costo.getText())));

        }
        else{
            if(k==46)
            {
                tp++;
            }

            if(tp>1)
            {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "Punto de mas", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
                tp--;
            }

            if (k >= 97 && k <= 127 || k >= 58 && k <= 97) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            }
            if (k == 241 || k == 209) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            }
            if (k >= 33 && k <= 45 || k==47 ) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                JOptionPane.showMessageDialog(null, "No puede ingresar Simbolos!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_CostoKeyTyped

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed
    
    private void GananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GananciaActionPerformed

    private void GananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GananciaKeyTyped
     int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 127 || k >= 58 && k <= 97) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k >= 33 && k <=47 ) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Simbolos!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            Ganancia.transferFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_GananciaKeyTyped

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
      JOptionPane.showMessageDialog(null, "Ingreso");// TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed
        
    private int generarFactura()
    {
        int id=0;
        try {
            PreparedStatement CrearLot = tr.prepareStatement("INSERT INTO FacturaCompra(Serie,Numero,Proveedor_id,Fecha,Total_Factura,Cantidad_Prod,Anulado) VALUES(?,?,?,?,?,?,0)",
                    Statement.RETURN_GENERATED_KEYS);
            
            CrearLot.setString(1, Serie.getText());
            CrearLot.setString(2, Numero.getText());

            CrearLot.setString(3, String.valueOf(idPro(nitglobal)));
            CrearLot.setString(4, año+"-"+mes+"-"+dia);
            CrearLot.setString(5, TC1.getText());
            CrearLot.setString(6, TC.getText());
            CrearLot.executeUpdate();
             try (ResultSet rs = CrearLot.getGeneratedKeys()) {
                if (!rs.next()) {
                    throw new RuntimeException("no devolvió el ID");
                }

                id = rs.getInt(1);
                CrearLot.close();

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    private void CostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CostoFocusLost
        try
        {
        Costo.setText(""+x(Double.parseDouble(Costo.getText())));
        }
        catch(NumberFormatException ex) {
    }
   
        
// TODO add your handling code here:
    }//GEN-LAST:event_CostoFocusLost

    private void ProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductoFocusLost
Marca.requestFocus();
    }//GEN-LAST:event_ProductoFocusLost

    private void DescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescripcionFocusLost
      palenparaprov.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionFocusLost
    private Boolean CompararEntrada(String Nombre,String Marca,String Unidad)
    {
        
            int ac=0;
            try {
                Statement sx = Consulta.createStatement();
                ResultSet Ca = sx.executeQuery("SELECT id FROM Producto where Nombre='"+Nombre+"' && Marca='"+Marca+"'&& Medida='"+Unidad+"'");
                while(Ca.next())
                {
                    ac++;
                }
                if(ac==0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        return false;
    }
    private Boolean CC(String Cod)
    {               int contador=0;

        try {
            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT id FROM Producto where Codigo='"+Cod+"'");
            while(Ca.next())
            {
                contador++;
            }
            if(contador==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }    
    
    private Boolean CP2(String Nombre,String Marca,String cod,String med)
    {
        String x[] = new String[4];
        if(Factura.getRowCount()!=0)
        {
        for (int i = 0; i < Factura.getRowCount(); i++)
        {
            
                x[0] = Factura.getValueAt(i, 3).toString().trim();
                x[1] = Factura.getValueAt(i, 4).toString().trim();
                x[2]=Factura.getValueAt(i, 0).toString().trim();
                x[3]=Factura.getValueAt(i, 1).toString().trim();

                
                if((x[0].equals(Nombre)&& x[1].equals(Marca)&&x[3].equals(med))||x[2].equals(cod))
                {
                    return false;
                }
               
                
           
        }
        }
        else{
            return true;

        }
        return true;
    }
    private void addfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfilaActionPerformed
        if(Producto.getText().equals("")||Marca.getText().equals("")||Costo.getText().equals("")
            ||Cantidad.getText().equals("")||Ganancia.getText().equals("")
            ||Codigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Verifique que algun campo no este vacios");

        }
        else
        {
                
                
                    if((CompararEntrada(Producto.getText(),Marca.getText(),(String) Tipo.getSelectedItem())==true||CC(Codigo.getText())==true)||CP2(Producto.getText(),Marca.getText(),Codigo.getText(),(String)Tipo.getSelectedItem())==false)
                    {
                        
                    JOptionPane.showMessageDialog(null, "Nombre y Marca ya registrados y/o Codigo");
                    }
                    else
                    {
                    try{

                        modelo.addRow(new Object[]{(String) Codigo.getText(), Cantidad.getText(),(String) Tipo.getSelectedItem() ,Producto.getText(), Marca.getText(), Costo.getText(), CostoTotal(Double.parseDouble(Cantidad.getText()),Double.parseDouble(Costo.getText())), Descripcion.getText(),
                            Ganancia.getText(),PrecioUnitario(Double.parseDouble(Costo.getText()),Double.parseDouble(Ganancia.getText()),Double.parseDouble(Costo.getText()))
                            ,PrecioTotal(          PrecioUnitario(Double.parseDouble(Costo.getText()),Double.parseDouble(Ganancia.getText()),Double.parseDouble(Costo.getText())),Double.parseDouble(Cantidad.getText()))});
                         }
                    catch(NumberFormatException ex) {
                    }
                
                    }
                    int TC3=0;   
                    TC3=Integer.valueOf(TC.getText());

                    BigDecimal auxT=BigDecimal.valueOf(Double.parseDouble(TC1.getText()));
                    auxT=auxT.add(PrecioTotal(          PrecioUnitario(Double.parseDouble(Costo.getText()),Double.parseDouble(Ganancia.getText()),Double.parseDouble(Costo.getText())),Double.parseDouble(Cantidad.getText())));
                    TC1.setText(String.valueOf((auxT)));
                    TC3=TC3+Integer.valueOf(Cantidad.getText());
                    TC.setText(String.valueOf(TC3));
               

                
        }
               
            
    }//GEN-LAST:event_addfilaActionPerformed

    private void palenparaprovFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_palenparaprovFocusLost
        Serie.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_palenparaprovFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Otro.removeAllItems();
        try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Nit,id FROM Proveedor");
            while (Ca.next()) {

                Otro.addItem(Ca.getString(1));
            }
            Ca.close();
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IngresarProve x=new IngresarProve();
        x.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CompraKeyPressed
        int k = (int) evt.getKeyChar();
        if(k==13)
        {
        }// TODO add your handling code here:
    }//GEN-LAST:event_CompraKeyPressed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
        try
        {
            año = Fecha.getCalendar().get(Calendar.YEAR);
            mes = Fecha.getCalendar().get(Calendar.MONTH) + 1;
            dia = Fecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        }

        catch(NullPointerException ex) {
        }
        if(año==0&&dia==0&&mes==00)
        {
            JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(Serie.getText().equals("")||Numero.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Información de Factura Faltante");
            }
            else
            {
                if(Factura.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null, "Factura Vacía");

                }
                else
                {
                    int idF=generarFactura();
                    JOptionPane.showMessageDialog(null, "idFac "+idF);

                    String x[] = new String[11];
                    for (int i = 0; i < Factura.getRowCount(); i++)
                    {
                        for (int j = 0; j < Factura.getColumnCount(); j++)
                        {
                            x[j] = Factura.getValueAt(i, j).toString().trim();

                        }
                        int idP = CrearProducto(x);
                        CrearReg(idP,x,idF);
                        CrearLote(idP,idF,x);

                    }
                    JOptionPane.showMessageDialog(null, "Productos Comprado Con Exito");
                }
            }
        }
        // TODO add your handling code here
    }//GEN-LAST:event_CompraActionPerformed

    private void CompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompraMouseClicked

    }//GEN-LAST:event_CompraMouseClicked

    private void NumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 127 || k >= 58 && k <= 97) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k >= 33 && k <= 47) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar Simbolos!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            Numero.transferFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroKeyTyped

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void NumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumeroFocusLost
        Otro.requestFocus();
    }//GEN-LAST:event_NumeroFocusLost

    private void SerieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SerieFocusLost

    }//GEN-LAST:event_SerieFocusLost

    private void OtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroActionPerformed
        nitglobal=(String) Otro.getSelectedItem();
        String id3=null;
        id3=obtenerid(nitglobal);
    }//GEN-LAST:event_OtroActionPerformed

    private void OtroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OtroFocusLost

    }//GEN-LAST:event_OtroFocusLost

    private void llenarOtro()
    {   
         Tipo.removeAllItems();
        String sele = (String) Unidad.getSelectedItem();
       
        if(sele.equals("Longitud"))
        {
            for (int i = 0; i <longitud.length; i++) {
                Tipo.addItem(longitud[i]);
            }
        }
        if(sele.equals("Unidad"))
        {
            for (int i = 0; i <unidad.length; i++) {
                Tipo.addItem(unidad[i]);
            }
        }
        if(sele.equals("Volumen"))
        {
            for (int i = 0; i <volumen.length; i++) {
                Tipo.addItem(volumen[i]);
            }
        }
        if(sele.equals("Area"))
        {
            for (int i = 0; i <area.length; i++) {
                Tipo.addItem(area[i]);
            }
        }
    }
    private void UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadActionPerformed
        llenarOtro();


        // TODO add your handling code here:
    }//GEN-LAST:event_UnidadActionPerformed
      
     private BigDecimal CostoTotal(Double Cantidad,Double Costo)
    {
        return BigDecimal.valueOf(Cantidad).multiply(BigDecimal.valueOf(Costo)).setScale(2, BigDecimal.ROUND_DOWN);
    }
    private BigDecimal PrecioTotal(BigDecimal Uni,Double T)
    {
        return Uni.multiply(BigDecimal.valueOf(T)).setScale(2, BigDecimal.ROUND_DOWN);
    }
    private BigDecimal PrecioUnitario(Double PreU,Double G,Double CU)
    {
        BigDecimal w=BigDecimal.valueOf(PreU).multiply(BigDecimal.valueOf(G)).setScale(2, BigDecimal.ROUND_DOWN);      
        w=w.divide(BigDecimal.valueOf(100)).setScale(2, BigDecimal.ROUND_DOWN);
        w=w.add(BigDecimal.valueOf(CU)).setScale(2, BigDecimal.ROUND_DOWN);
        return w;
    }
    private String obtenerid(String nit)
    {
        
          String idProv=null;
          try {
            Statement st = cn.createStatement();
            ResultSet rd = st.executeQuery("SELECT NombreV, Representante, id FROM Proveedor WHERE Nit ='" +nit+ "'");
            while(rd.next())
            {
                Nombre.setText(rd.getString(1));
                Apellido.setText(rd.getString(2));
             
                idProv=rd.getString(3);
            }
            return idProv;
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Compra;
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField Descripcion;
    private rojerusan.RSTableMetro Factura;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JTextField Ganancia;
    private javax.swing.JTextField Marca;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Numero;
    private javax.swing.JComboBox<String> Otro;
    private javax.swing.JTextField Producto;
    private javax.swing.JTextField Serie;
    private javax.swing.JLabel TC;
    private javax.swing.JLabel TC1;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JComboBox<String> Unidad;
    private javax.swing.JButton addfila;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel palenparaprov;
    // End of variables declaration//GEN-END:variables
}
