package Interfaces;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import Modelos.Cliente;
import Modelos.ClienteViewModel;
import Modelos.Farmaceutico;
import Modelos.Medicamento;
import Modelos.MedicamentoViewModel;
import Modelos.ObraSocial;
import Modelos.Usuario;
import Modelos.Venta;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import Modelos.VentaViewModel;
import java.util.ArrayList;
import win8.swin.MetroTableUI;
import Paneles.panelAlta;
import Paneles.panelBaja;
import Paneles.panelFormaPago;
import Paneles.panelModificacion;
import Paneles.panelSeleccionProducto;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.edisoncor.gui.panel.PanelRect;


public class Principal extends javax.swing.JFrame {
    DefaultTableModel tm = new DefaultTableModel();
    DefaultTableModel tablaMedic = new DefaultTableModel();
    DefaultTableModel tablaCompra = new DefaultTableModel();
    DefaultTableModel tc = new DefaultTableModel();
    DefaultTableModel tv = new DefaultTableModel();
    DefaultTableModel tmC = new DefaultTableModel(); // tabla medicamentos pestania Clientes.
    Usuario user;
    boolean dia, mes, año, farmaceutico, monto;
    VentaViewModel vm = new VentaViewModel();
    MedicamentoViewModel medVM = new MedicamentoViewModel();
    ClienteViewModel cl = new ClienteViewModel();
    VentaViewModel vm1 = new VentaViewModel(); //HistorialDeVentas
    Farmaceutico fm;
    public Principal(Usuario user) {
        this.user = user;
        dia =false;
        mes = false;
        año = false;
        farmaceutico = false;
        monto = false;
        initComponents();
        if(user.getCargo().equals("farmaceutico")){
            panelRect3.setEnabled(false);
            tabbedPaneRound1.setEnabledAt(2, false);
        }
        panelSeleccionProducto.setVisible(false);
        fm = new Farmaceutico(user.getNombre(),null,null,user.getFcod());
        CargarSeleccionProducto();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        jCalendar1.setEnabled(dia);
        mesChoser.setEnabled(mes);
        añoPick.setEnabled(año);
        farmaceuticoCB.setEnabled(farmaceutico);
        montoTF.setEnabled(monto);
        RelativeLayout ly =new RelativeLayout(this.getWidth(), this.getHeight());
        panelRect3.setLayout(ly);
        metroTableUI1.setRowHeight(30);
        metroTableUI2.setRowHeight(30);
        metroTableUI4.setRowHeight(30);
        tablaClientes.setRowHeight(30);
        tm.addColumn("Venta");
        tm.addColumn("Lote");
        tm.addColumn("Medicamento");
        tm.addColumn("Farmaceutico");
        tm.addColumn("Cantidad");
        tm.addColumn("Precio Unitario");
        tm.addColumn("Precio Total");
        tablaMedic.addColumn("Nombre");
        tablaMedic.addColumn("Marca");
        tablaMedic.addColumn("Generico");
        tablaMedic.addColumn("Forma Farmaceutica");
        tablaMedic.addColumn("Presentacion");
        tablaMedic.addColumn("Precio");
        tablaMedic.addColumn("Stock");
        tablaCompra.addColumn("Producto");
        tablaCompra.addColumn("Forma Farmaceutica");
        tablaCompra.addColumn("Presentacion");
        tablaCompra.addColumn("Precio Unitario");
        metroTableUI4.setModel(tablaMedic);
        metroTableUI1.setModel(tm);
        metroTableUI2.setModel(tablaCompra);
        this.setExtendedState(MAXIMIZED_BOTH);
        //tabla cliente
        tc.addColumn("Nombre y Apellido del cliente");
        tablaClientes.setModel(tc);
        //tabla historiaventa
        tv.addColumn("Monto");
        tv.addColumn("Fecha de venta");
        tablaHistorialVentas.setModel(tv);
        //tabla medicamentos
        tmC.addColumn("Nombre");
        tmC.addColumn("Marca");
        tmC.addColumn("Presentacion");
        tablaMedicamentos.setModel(tmC);
        CargarPestaña(cl.iniciarTablaClientes());
        cargarTablaVentas(vm.iniciarTablaVentas());
        cargarFarmaceuticos(vm.cargarFarmaceuticos());
        ApagarLabels();
        PanelABM.setVisible(false);
    }


    public void ApagarLabels()
    {
        labelOB1.setVisible(false);
        labelOB2.setVisible(false);
        labelOB3.setVisible(false);
        labelOB1p.setVisible(false);
        labelOB2p.setVisible(false);
        labelOB3p.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unsharpMaskFilter1 = new org.edisoncor.gui.util.UnsharpMaskFilter();
        actionManager1 = new org.jdesktop.swingx.action.ActionManager();
        tabbedPaneRound1 = new org.edisoncor.gui.tabbedPane.TabbedPaneRound();
        panelRect2 = new org.edisoncor.gui.panel.PanelRect();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelSeleccionProducto = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        metroTableUI4 = new win8.swin.MetroTableUI();
        AgregarProd = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        metroTableUI2 = new win8.swin.MetroTableUI();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        labelCustom9 = new org.edisoncor.gui.label.LabelCustom();
        totalCompra = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        prodBuscado = new javax.swing.JTextField();
        buscarMedicamento = new javax.swing.JButton();
        labelRound5 = new org.edisoncor.gui.label.LabelRound();
        labelRound6 = new org.edisoncor.gui.label.LabelRound();
        labelRound7 = new org.edisoncor.gui.label.LabelRound();
        labelRound8 = new org.edisoncor.gui.label.LabelRound();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        jPanel1 = new javax.swing.JPanel();
        labelCantClientes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelCustom8 = new org.edisoncor.gui.label.LabelCustom();
        PanelABM = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        labelListadoEmpleados = new org.edisoncor.gui.label.LabelCustom();
        labelCustom3 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new win8.swin.MetroTableUI();
        labelNumeroCliente = new org.jdesktop.swingx.JXLabel();
        labelFechaIngreso = new org.jdesktop.swingx.JXLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaHistorialVentas = new win8.swin.MetroTableUI();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        labelOB1 = new org.edisoncor.gui.label.LabelCustom();
        labelOB3 = new org.edisoncor.gui.label.LabelCustom();
        labelOB1p = new org.edisoncor.gui.label.LabelCustom();
        labelOB3p = new org.edisoncor.gui.label.LabelCustom();
        labelOB2p = new org.edisoncor.gui.label.LabelCustom();
        labelOB2 = new org.edisoncor.gui.label.LabelCustom();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaMedicamentos = new win8.swin.MetroTableUI();
        panelRect3 = new org.edisoncor.gui.panel.PanelRect();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metroTableUI1 = new win8.swin.MetroTableUI();
        jPanel4 = new javax.swing.JPanel();
        mesChoser = new com.toedter.calendar.JMonthChooser();
        añoPick = new com.toedter.calendar.JYearChooser();
        farmaceuticoCB = new org.edisoncor.gui.comboBox.ComboBoxRect();
        montoTF = new javax.swing.JTextField();
        añoCheckBox = new javax.swing.JCheckBox();
        montoCheckBox = new javax.swing.JCheckBox();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        farmaceuticoCheckBox = new javax.swing.JCheckBox();
        mesCheckBox = new javax.swing.JCheckBox();
        diaCheckBox = new javax.swing.JCheckBox();
        botonFiltrar = new org.edisoncor.gui.button.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tabbedPaneRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPaneRound1MouseClicked(evt);
            }
        });

        panelRect2.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect2.setColorSecundario(new java.awt.Color(51, 255, 255));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2217, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2217, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        panelSeleccionProducto.setOpaque(false);

        metroTableUI4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(metroTableUI4);

        AgregarProd.setBackground(new java.awt.Color(0, 102, 51));
        AgregarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarProd 48px.png"))); // NOI18N
        AgregarProd.setText("Agregar");
        AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProdActionPerformed(evt);
            }
        });

        metroTableUI2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(metroTableUI2);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarVta.png"))); // NOI18N
        jButton6.setText("Cancelar");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/QuitarProd 48px.png"))); // NOI18N
        jButton7.setText("Quitar");

        labelCustom9.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom9.setText("Total:");
        labelCustom9.setToolTipText("");
        labelCustom9.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N

        totalCompra.setEditable(false);
        totalCompra.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        totalCompra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalCompra.setText("0");
        totalCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        totalCompra.setOpaque(false);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CompletarVta 48px.png"))); // NOI18N
        jButton8.setText("Completar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        labelCustom2.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom2.setText("Nombre del producto :");
        labelCustom2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        labelCustom2.setPreferredSize(new java.awt.Dimension(95, 25));

        prodBuscado.setToolTipText("Ingrese producto a buscar...");
        prodBuscado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        prodBuscado.setOpaque(false);

        buscarMedicamento.setBackground(new java.awt.Color(0, 102, 51));
        buscarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarProd 48px.png"))); // NOI18N
        buscarMedicamento.setText("Buscar");
        buscarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMedicamentoActionPerformed(evt);
            }
        });

        labelRound5.setBackground(new java.awt.Color(0, 204, 51));
        labelRound5.setText("1. Seleccionar Productos");

        labelRound6.setBackground(new java.awt.Color(51, 123, 123));
        labelRound6.setText("2. Forma de Pago");
        labelRound6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRound6MouseClicked(evt);
            }
        });

        labelRound7.setBackground(new java.awt.Color(51, 123, 123));
        labelRound7.setText("3. Datos Obra Social");

        labelRound8.setBackground(new java.awt.Color(51, 123, 123));
        labelRound8.setText("4. Facturacion");

        javax.swing.GroupLayout panelSeleccionProductoLayout = new javax.swing.GroupLayout(panelSeleccionProducto);
        panelSeleccionProducto.setLayout(panelSeleccionProductoLayout);
        panelSeleccionProductoLayout.setHorizontalGroup(
            panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6)
                    .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgregarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(800, 800, 800)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                        .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prodBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarMedicamento))
                            .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                                .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(labelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSeleccionProductoLayout.setVerticalGroup(
            panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionProductoLayout.createSequentialGroup()
                .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(labelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgregarProd))
                    .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSeleccionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)))
        );

        prodBuscado.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout panelRect2Layout = new javax.swing.GroupLayout(panelRect2);
        panelRect2.setLayout(panelRect2Layout);
        panelRect2Layout.setHorizontalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRect2Layout.createSequentialGroup()
                        .addComponent(panelSeleccionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        panelRect2Layout.setVerticalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect2Layout.createSequentialGroup()
                .addGroup(panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRect2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelSeleccionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(470, 470, 470)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        tabbedPaneRound1.addTab("   Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Barcodes-icon 16px.png")), panelRect2, ""); // NOI18N

        panelRect1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect1.setColorSecundario(new java.awt.Color(51, 255, 255));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCantClientes.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        labelCantClientes.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(labelCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 80, 40));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton1.setText("Modificacion cliente");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton2.setText("Nuevo cliente");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton3.setText("Eliminar cliente");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, -1, -1));

        labelCustom8.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom8.setText("Cantidad de clientes :");
        labelCustom8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jPanel1.add(labelCustom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 213, 38));

        PanelABM.setOpaque(false);

        javax.swing.GroupLayout PanelABMLayout = new javax.swing.GroupLayout(PanelABM);
        PanelABM.setLayout(PanelABMLayout);
        PanelABMLayout.setHorizontalGroup(
            PanelABMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2242, Short.MAX_VALUE)
        );
        PanelABMLayout.setVerticalGroup(
            PanelABMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        jPanel3.setOpaque(false);

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Obras sociales");
        labelCustom1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelListadoEmpleados.setBackground(new java.awt.Color(0, 204, 0));
        labelListadoEmpleados.setText("Listado de clientes");
        labelListadoEmpleados.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom3.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom3.setText("Fecha ingreso al sistema");
        labelCustom3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom4.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom4.setText("Numero de cliente");
        labelCustom4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom5.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom5.setText("Historial de ventas");
        labelCustom5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        tablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre y Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        tablaClientes.setGridColor(new java.awt.Color(51, 204, 0));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        labelNumeroCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        labelFechaIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        tablaHistorialVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaHistorialVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Monto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHistorialVentas.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        tablaHistorialVentas.setGridColor(new java.awt.Color(51, 204, 0));
        tablaHistorialVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHistorialVentasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaHistorialVentas);

        labelCustom7.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom7.setText("Medicamentos");
        labelCustom7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB1.setBackground(new java.awt.Color(0, 0, 255));
        labelOB1.setText("labelCustom10");
        labelOB1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB3.setBackground(new java.awt.Color(0, 0, 255));
        labelOB3.setText("labelCustom10");
        labelOB3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB1p.setBackground(new java.awt.Color(0, 0, 255));
        labelOB1p.setText("labelCustom10");
        labelOB1p.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB3p.setBackground(new java.awt.Color(0, 0, 255));
        labelOB3p.setText("labelCustom10");
        labelOB3p.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB2p.setBackground(new java.awt.Color(0, 0, 255));
        labelOB2p.setText("labelCustom10");
        labelOB2p.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelOB2.setBackground(new java.awt.Color(0, 0, 255));
        labelOB2.setText("labelCustom16");
        labelOB2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        tablaMedicamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Monto", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMedicamentos.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        tablaMedicamentos.setGridColor(new java.awt.Color(51, 204, 0));
        tablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablaMedicamentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelListadoEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(labelOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelOB1p, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNumeroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelOB2p, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelOB3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelOB3p, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelListadoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOB1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(labelOB1p, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOB2p, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOB3p, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOB3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 353, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(360, 360, 360))
        );

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelABM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2242, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelABM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneRound1.addTab("   Clientes", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Users-icon 16px.png")), panelRect1, ""); // NOI18N

        panelRect3.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect3.setColorSecundario(new java.awt.Color(51, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        metroTableUI1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Lote", "Medicamento", "Farmaceutico", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(metroTableUI1);
        if (metroTableUI1.getColumnModel().getColumnCount() > 0) {
            metroTableUI1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            metroTableUI1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            metroTableUI1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jPanel2.add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 24))); // NOI18N
        jPanel4.setOpaque(false);

        montoTF.setToolTipText("");

        añoCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        añoCheckBox.setText("Año");
        añoCheckBox.setOpaque(false);
        añoCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                añoCheckBoxItemStateChanged(evt);
            }
        });

        montoCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        montoCheckBox.setText("A partir del monto");
        montoCheckBox.setOpaque(false);
        montoCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                montoCheckBoxItemStateChanged(evt);
            }
        });

        farmaceuticoCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        farmaceuticoCheckBox.setText("Farmaceutico");
        farmaceuticoCheckBox.setOpaque(false);
        farmaceuticoCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                farmaceuticoCheckBoxItemStateChanged(evt);
            }
        });

        mesCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        mesCheckBox.setText("Mes");
        mesCheckBox.setOpaque(false);
        mesCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mesCheckBoxItemStateChanged(evt);
            }
        });

        diaCheckBox.setBackground(new java.awt.Color(0, 204, 0));
        diaCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        diaCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        diaCheckBox.setText("Dia");
        diaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diaCheckBoxItemStateChanged(evt);
            }
        });

        botonFiltrar.setBackground(new java.awt.Color(0, 153, 51));
        botonFiltrar.setText("Filtrar");
        botonFiltrar.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new GridLayout(1,12));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diaCheckBox)
                            .addComponent(mesCheckBox)
                            .addComponent(farmaceuticoCheckBox)
                            .addComponent(montoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesChoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(farmaceuticoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añoCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añoPick, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(montoCheckBox)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(botonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(diaCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesChoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(añoCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(añoPick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(farmaceuticoCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(farmaceuticoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(montoCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(montoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(botonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRect3Layout = new javax.swing.GroupLayout(panelRect3);
        panelRect3.setLayout(panelRect3Layout);
        panelRect3Layout.setHorizontalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1100, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        panelRect3Layout.setVerticalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRect3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(814, Short.MAX_VALUE))
        );

        tabbedPaneRound1.addTab("   Consulta Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cash-icon 16 px.png")), panelRect3); // NOI18N
        panelRect3.getAccessibleContext().setAccessibleName("");

        getContentPane().add(tabbedPaneRound1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PanelABM.setVisible(true);
        panelBaja  pBaja = new panelBaja(this);
        pBaja .setSize(1500,700);
        pBaja .setLocation(200,10);
        PanelABM.removeAll();
        PanelABM.add(pBaja ,BorderLayout.CENTER);
        PanelABM.revalidate();
        PanelABM.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PanelABM.setVisible(true);
        panelAlta pAlta = new panelAlta(this);
        pAlta.setSize(1500,600);
        pAlta.setLocation(200,10);
        PanelABM.removeAll();
        PanelABM.add(pAlta,BorderLayout.CENTER);
        PanelABM.revalidate();
        PanelABM.repaint();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelABM.setVisible(true);
        panelModificacion pModif = new panelModificacion();
        pModif.setSize(1500,600);
        pModif.setLocation(200,10);
        PanelABM.removeAll();
        PanelABM.add(pModif,BorderLayout.CENTER);
        PanelABM.revalidate();
        PanelABM.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabbedPaneRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPaneRound1MouseClicked

    }//GEN-LAST:event_tabbedPaneRound1MouseClicked


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                UIManager.setLookAndFeel(new WindowsLookAndFeel());
                }catch(Exception e){

                }

            }
        });
    }


    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        VentaViewModel vmaux = new VentaViewModel();
        vmaux.iniciarFiltrado();
        if(dia){
            vmaux.filtrarDia(jCalendar1.getDate());
            diaCheckBox.setSelected(false);
        }
        if(mes){
            vmaux.filtrarMes(mesChoser.getMonth());
        }
        if(año){
            vmaux.filtrarAño(añoPick.getYear());
        }
        if(farmaceutico){
            Farmaceutico aux = (Farmaceutico) farmaceuticoCB.getSelectedItem();
            vmaux.filtrarFarmaceutico(aux.getNroLegajo());
        }
        if(monto){
            float mtoaux = Float.parseFloat(montoTF.getText());
            vmaux.feltrarMonto(mtoaux);
        }
        resetTable(metroTableUI1);
        cargarTablaVentas(vmaux.getVtas());

    }//GEN-LAST:event_botonFiltrarActionPerformed

    private void mesCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mesCheckBoxItemStateChanged
        mes =  mesCheckBox.isSelected();
        mesChoser.setEnabled(mes);
        diaCheckBox.setSelected(false);
        diaCheckBox.setEnabled(!mes && !año);
        dia= diaCheckBox.isSelected();
    }//GEN-LAST:event_mesCheckBoxItemStateChanged

    private void añoCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_añoCheckBoxItemStateChanged
        año = añoCheckBox.isSelected();
        añoPick.setEnabled(año);
        diaCheckBox.setSelected(false);
        diaCheckBox.setEnabled(!año && !mes);
        dia= diaCheckBox.isSelected();
    }//GEN-LAST:event_añoCheckBoxItemStateChanged

    private void farmaceuticoCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_farmaceuticoCheckBoxItemStateChanged
        farmaceutico = farmaceuticoCheckBox.isSelected();
        farmaceuticoCB.setEnabled(farmaceutico);
    }//GEN-LAST:event_farmaceuticoCheckBoxItemStateChanged

    private void montoCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_montoCheckBoxItemStateChanged
        monto = montoCheckBox.isSelected();
        montoTF.setEnabled(monto);
    }//GEN-LAST:event_montoCheckBoxItemStateChanged

    private void diaCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diaCheckBoxItemStateChanged
        dia = diaCheckBox.isSelected();
        jCalendar1.setEnabled(dia);
        mesCheckBox.setSelected(false);
        añoCheckBox.setSelected(false);
        mesCheckBox.setEnabled(!dia);
        añoCheckBox.setEnabled(!dia);
        mes = mesCheckBox.isSelected();
        año= añoCheckBox.isSelected();
    }//GEN-LAST:event_diaCheckBoxItemStateChanged


    public void cargarTablaMedicamentos (ArrayList medicamentos){
        resetTable(metroTableUI4);
        int cant = medicamentos.size();
        int i;
        for(i=0; i<cant; i++){
            MedicamentoViewModel aux;
            Object[] fila = new Object[7];
            aux = (MedicamentoViewModel) medicamentos.get(i);
            fila[0] = aux;
            fila[1] = aux.getmMarca();
            fila[2] = aux.getmGenerico();
            fila[3] = aux.getmFormFarmac();
            fila[4] = aux.getmPresentacion();
            fila[5] = aux.getMprecio();
            fila[6] = aux.getExistencias();
            tablaMedic.addRow(fila);
        }
        metroTableUI4.updateUI();
    }

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
      int row = tablaClientes.getSelectedRow();
      Cliente cliente = new Cliente(null,null,"0");
      cliente = (Cliente) tablaClientes.getValueAt(row,0);
      //cargar labels de numero de cliente y fecha de ingreso.
      labelNumeroCliente.setText(cliente.getNumeroCliente());
      labelFechaIngreso.setText(cliente.getFechaIngreso());
      //cargar obras sociales//
      ObraSocial oManager = new ObraSocial();
      String dni = cliente.getDni();
      int cant = oManager.ObtenerCantobDeUnCliente(dni);
      traerObraSocial(cant);
      //carga de tabla de historial de ventas.    
      resetTable(tablaHistorialVentas);
      resetTable(tablaMedicamentos);
      ActualizarTablaVentas(vm.TraerValoresDeHistorialDeVentas(cliente.getNumeroCliente()));
      
      
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void tablaHistorialVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHistorialVentasMouseClicked
         int row = tablaHistorialVentas.getSelectedRow();
         VentaViewModel vvm = new VentaViewModel();
         vvm = (VentaViewModel) tablaHistorialVentas.getValueAt(row,0);
         resetTable(tablaMedicamentos);
         LlenarTablaMed(vvm);
    }//GEN-LAST:event_tablaHistorialVentasMouseClicked

    private void tablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMedicamentosMouseClicked

    private void labelRound6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRound6MouseClicked

    }//GEN-LAST:event_labelRound6MouseClicked

    private void buscarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMedicamentoActionPerformed
        MedicamentoViewModel aux = new MedicamentoViewModel();
        String buscado = prodBuscado.getText();
        cargarTablaMedicamentos(aux.buscarMedicamento(buscado));
    }//GEN-LAST:event_buscarMedicamentoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProdActionPerformed
        MedicamentoViewModel med =(MedicamentoViewModel) metroTableUI4.getValueAt(metroTableUI4.getSelectedRow(),0);
        med.setExistencias(med.getExistencias() -1);
        metroTableUI4.setValueAt(med.getExistencias(), metroTableUI4.getSelectedRow(), 6);
        metroTableUI4.updateUI();
        DecimalFormat df = new DecimalFormat("0.00");
        float total = 0;
        try {
            total= (float) df.parse(totalCompra.getText()).floatValue() + med.getMprecio();
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        float mostrar = total;
        totalCompra.setText(df.format(mostrar));
        Object [] fila = new Object [4];
        fila[0] = med;
        fila[1] = med.getmFormFarmac();
        fila[2] = med.getmPresentacion();
        fila[3] = med.getMprecio();
        tablaCompra.addRow(fila);
        metroTableUI2.updateUI();
    }//GEN-LAST:event_AgregarProdActionPerformed

    //-------------------------------------------------------ABM cliente---------------------------------------------------------------//

    public void CargarPestaña(ArrayList arrayClientes)
    {
        int cantClientes = arrayClientes.size();
        int i;
        for(i=0; i<cantClientes;i++){
            Cliente aux = new Cliente(null,null,"0");
            Object[] fila = new Object[1];
            aux = (Cliente) arrayClientes.get(i);
            fila[0] = aux;
            tc.addRow(fila);
            }
             tablaClientes.updateUI();

    }


    //-------------------------------------------------------Consulta Ventas---------------------------------------------------------------//

    public void cargarTablaVentas(ArrayList vm){
        int cant = vm.size();
        int i;
        for(i=0; i<cant;i++){
            VentaViewModel aux = new VentaViewModel();
            Object[] fila = new Object[7];
            aux = (VentaViewModel) vm.get(i);
            fila[0] = aux.getVcod();
            fila[1] = aux.getLote();
            fila[2] = aux.getMnbre();
            fila[3] = aux.getFnbre() + " " + aux.getFapll();
            fila[4] = aux.getVcant();
            fila[5] = aux.getMprecio();
            fila[6] = aux.getVcant() * aux.getMprecio();
            tm.addRow(fila);
             }
             metroTableUI1.updateUI();
    }

    public void resetTable(MetroTableUI mt){
        DefaultTableModel dtm = (DefaultTableModel) mt.getModel();
        int a = mt.getRowCount()-1;
        int i;
        for(i=a; i>=0;i--){
            dtm.removeRow(dtm.getRowCount()-1);
        }
    }

    public void cargarFarmaceuticos(ArrayList frm){
        int cant = frm.size();
        int i;
        for(i=0; i<cant; i++){
            Farmaceutico aux;
            aux = (Farmaceutico) frm.get(i);
            farmaceuticoCB.addItem(aux);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProd;
    private javax.swing.JPanel PanelABM;
    private org.jdesktop.swingx.action.ActionManager actionManager1;
    private javax.swing.JCheckBox añoCheckBox;
    private com.toedter.calendar.JYearChooser añoPick;
    private org.edisoncor.gui.button.ButtonRound botonFiltrar;
    private javax.swing.JButton buscarMedicamento;
    private javax.swing.JCheckBox diaCheckBox;
    public org.edisoncor.gui.comboBox.ComboBoxRect farmaceuticoCB;
    private javax.swing.JCheckBox farmaceuticoCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JLabel labelCantClientes;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelCustom8;
    private org.edisoncor.gui.label.LabelCustom labelCustom9;
    private org.jdesktop.swingx.JXLabel labelFechaIngreso;
    private org.edisoncor.gui.label.LabelCustom labelListadoEmpleados;
    private org.jdesktop.swingx.JXLabel labelNumeroCliente;
    private org.edisoncor.gui.label.LabelCustom labelOB1;
    private org.edisoncor.gui.label.LabelCustom labelOB1p;
    private org.edisoncor.gui.label.LabelCustom labelOB2;
    private org.edisoncor.gui.label.LabelCustom labelOB2p;
    private org.edisoncor.gui.label.LabelCustom labelOB3;
    private org.edisoncor.gui.label.LabelCustom labelOB3p;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private org.edisoncor.gui.label.LabelRound labelRound7;
    private org.edisoncor.gui.label.LabelRound labelRound8;
    private javax.swing.JCheckBox mesCheckBox;
    private com.toedter.calendar.JMonthChooser mesChoser;
    private win8.swin.MetroTableUI metroTableUI1;
    private win8.swin.MetroTableUI metroTableUI2;
    private win8.swin.MetroTableUI metroTableUI4;
    private javax.swing.JCheckBox montoCheckBox;
    private javax.swing.JTextField montoTF;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.panel.PanelRect panelRect2;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private javax.swing.JPanel panelSeleccionProducto;
    private javax.swing.JTextField prodBuscado;
    private org.edisoncor.gui.tabbedPane.TabbedPaneRound tabbedPaneRound1;
    private win8.swin.MetroTableUI tablaClientes;
    private win8.swin.MetroTableUI tablaHistorialVentas;
    private win8.swin.MetroTableUI tablaMedicamentos;
    private javax.swing.JTextField totalCompra;
    private org.edisoncor.gui.util.UnsharpMaskFilter unsharpMaskFilter1;
    // End of variables declaration//GEN-END:variables

    public void ActualizarNumerosDeClientes() {
       Cliente cManager = new Cliente(null,null,"0");
       int cant = cManager.ObtenerCantClientes();
       labelCantClientes.setText(Integer.toString(cant));
    }
    
    private void traerObraSocial(int cant) {
        int row = tablaClientes.getSelectedRow();
        Cliente cliente = new Cliente(null,null,"0");
        cliente = (Cliente) tablaClientes.getValueAt(row,0);
        ObraSocial ob = new ObraSocial();
        ObraSocial[] obs = new ObraSocial[cant];
        obs = ob.traerObrasDeUnCliente(cliente.getDni(),cant);
        if(cant != 0)
        {
            if(cant == 1)
             {
                  labelOB2.setVisible(false);
                  labelOB2p.setVisible(false);
                  labelOB3.setVisible(false);
                  labelOB3p.setVisible(false);
                  labelOB1.setVisible(true);
                  labelOB1.setText(obs[cant-1].getNombre());
                  labelOB1p.setVisible(true);
                  labelOB1p.setText(obs[cant-1].getPlan(0));
            }else{
                if(cant == 2)
                {
                labelOB3.setVisible(false);
                labelOB3p.setVisible(false);
                labelOB1.setVisible(true);
                labelOB1.setText(obs[cant-1].getNombre());
                labelOB1p.setVisible(true);
                labelOB1p.setText(obs[cant-1].getPlan(0));
                labelOB2.setVisible(true);
                labelOB2.setText(obs[cant-2].getNombre());
                labelOB2p.setVisible(true);
                labelOB2p.setText(obs[cant-2].getPlan(0));
                }else{
                labelOB1.setVisible(true);
                labelOB1.setText(obs[cant-1].getNombre());
                labelOB1p.setVisible(true);
                labelOB1p.setText(obs[cant-1].getPlan(0));
                labelOB2.setVisible(true);
                labelOB2.setText(obs[cant-2].getNombre());
                labelOB2p.setVisible(true);
                labelOB2p.setText(obs[cant-2].getPlan(0));
                labelOB3.setVisible(true);
                labelOB3.setText(obs[cant-3].getNombre());
                labelOB3p.setVisible(true);
                labelOB3p.setText(obs[cant-3].getPlan(0));
                }
                }
        }else{
            ApagarLabels();
        }
        
    }

    private void ActualizarTablaVentas(ArrayList vts) {
        int cantVentas = vts.size();
        int i;
        for(i=0; i<cantVentas;i++){
            VentaViewModel aux = new VentaViewModel();
            Object[] fila = new Object[2];
            aux = (VentaViewModel) vts.get(i);
            String fecha = aux.getDia()+"/"+aux.getMes()+"/"+aux.getAño();
            fila[0] = aux;
            fila[1] = fecha;
            tv.addRow(fila);
            }
             tablaHistorialVentas.updateUI();
        
    }

    private void LlenarTablaMed(VentaViewModel vvm) {
        Medicamento med = new Medicamento();
        ArrayList<Medicamento> lMed = new ArrayList<>();
        String vcod = vvm.getVcod();
        lMed = med.TraerMedicamentosDeVenta(vcod);
        int cantMed = lMed.size();
        for(int i=0;cantMed>i;i++)
        {
            Object[] fila = new Object[3];
            med = (Medicamento) lMed.get(i);
            fila[0] = med;
            fila[1] = med.getMarca();
            fila[2] = med.getPresentacion();
            tmC.addRow(fila);
        }
        tablaMedicamentos.updateUI();
    }

    private void CargarSeleccionProducto() { 
        Venta venta = new Venta();
        venta.setFcod(Integer.parseInt(fm.getNroLegajo()));
        panelSeleccionProducto pSeleccion = new panelSeleccionProducto(venta);
        pSeleccion.setSize(2239, 1309);
        pSeleccion.setLocation(0,0);
        panelRect2.removeAll();
        panelRect2.add(pSeleccion);
        panelRect2.revalidate();
        panelRect2.repaint();
    }
    
    public PanelRect getPanelRect2()
    {
        return panelRect2;
    }
}
