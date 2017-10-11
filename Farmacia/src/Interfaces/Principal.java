package Interfaces;
import Conexion.ConexionBD;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import Modelos.Cliente;
import Modelos.Usuario;
import Paneles.panelAlta;
import Paneles.panelBaja;
import Paneles.panelModificacion;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;


/**
 *
 * @author glupi
 */
public class Principal extends javax.swing.JFrame {
    DefaultListModel lm = new DefaultListModel();
    Usuario user;
    
    public Principal(Usuario user) {
        this.user = user;
        initComponents();
        RelativeLayout ly =new RelativeLayout(this.getWidth(), this.getHeight());
        //jPanel3.setLayout(ly);
        metroTableUI1.setRowHeight(30);
        PanelABM.setVisible(false);
        
        this.setExtendedState(MAXIMIZED_BOTH);
        CargarPestaña();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unsharpMaskFilter1 = new org.edisoncor.gui.util.UnsharpMaskFilter();
        actionManager1 = new org.jdesktop.swingx.action.ActionManager();
        tabbedPaneRound1 = new org.edisoncor.gui.tabbedPane.TabbedPaneRound();
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
        labelCustom6 = new org.edisoncor.gui.label.LabelCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new win8.swin.MetroTableUI();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        metroTableUI3 = new win8.swin.MetroTableUI();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        panelRect2 = new org.edisoncor.gui.panel.PanelRect();
        panelRect3 = new org.edisoncor.gui.panel.PanelRect();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metroTableUI1 = new win8.swin.MetroTableUI();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tabbedPaneRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPaneRound1MouseClicked(evt);
            }
        });

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
            .addGap(0, 1653, Short.MAX_VALUE)
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

        labelCustom6.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom6.setText("Recetas");
        labelCustom6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

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
        jScrollPane2.setViewportView(tablaClientes);

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        jXLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        jXLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        metroTableUI3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        metroTableUI3.setModel(new javax.swing.table.DefaultTableModel(
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
        metroTableUI3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        metroTableUI3.setGridColor(new java.awt.Color(51, 204, 0));
        jScrollPane3.setViewportView(metroTableUI3);

        labelCustom7.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom7.setText("Medicamentos");
        labelCustom7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(labelListadoEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelCustom5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCustom6, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelListadoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addGap(356, 356, 356))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1653, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelRect2Layout = new javax.swing.GroupLayout(panelRect2);
        panelRect2.setLayout(panelRect2Layout);
        panelRect2Layout.setHorizontalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1673, Short.MAX_VALUE)
        );
        panelRect2Layout.setVerticalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1333, Short.MAX_VALUE)
        );

        tabbedPaneRound1.addTab("   Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Barcodes-icon 16px.png")), panelRect2, ""); // NOI18N

        panelRect3.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect3.setColorSecundario(new java.awt.Color(51, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 24))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        metroTableUI1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRect3Layout = new javax.swing.GroupLayout(panelRect3);
        panelRect3.setLayout(panelRect3Layout);
        panelRect3Layout.setHorizontalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        panelRect3Layout.setVerticalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(467, Short.MAX_VALUE))
        );

        tabbedPaneRound1.addTab("   Consulta Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cash-icon 16 px.png")), panelRect3); // NOI18N
        panelRect3.getAccessibleContext().setAccessibleName("");

        getContentPane().add(tabbedPaneRound1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PanelABM.setVisible(true);
        panelBaja  pBaja = new panelBaja();
        pBaja .setSize(1200,600);
        pBaja .setLocation(300,10);
        PanelABM.removeAll();
        PanelABM.add(pBaja ,BorderLayout.CENTER);
        PanelABM.revalidate();
        PanelABM.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PanelABM.setVisible(true);
        panelAlta pAlta = new panelAlta();
        pAlta.setSize(1200,600);
        pAlta.setLocation(300,10);
        PanelABM.removeAll();
        PanelABM.add(pAlta,BorderLayout.CENTER);
        PanelABM.revalidate();
        PanelABM.repaint();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelABM.setVisible(true);
        panelModificacion pModif = new panelModificacion();
        pModif.setSize(1200,600);
        pModif.setLocation(300,10);
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

    //-------------------------------------------------------ABM cliente---------------------------------------------------------------//

    public void CargarPestaña()
    {
       Cliente cManager = new Cliente(null,null,0);
       int cant = cManager.ObtenerCantClientes();
       labelCantClientes.setText(Integer.toString(cant));
       //CargarTablaClientes();
    }
    
    
    

    //-------------------------------------------------------Consulta Ventas---------------------------------------------------------------//
    
    public void cargarTablaVentas(){
         ConexionBD bd = ConexionBD.getInstance();
         bd.Select("*", "ventas ,ticket", "ventas.vcod=ticket.vcod");
         try{
             //llenar tabla
         }catch(Exception e){
             e.getMessage();
         }
         
    }
    
    public void asd(){
        int asd = Integer.parseInt(labelCantClientes.getText())+1;
        labelCantClientes.setText(""+asd+"");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelABM;
    private org.jdesktop.swingx.action.ActionManager actionManager1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    public javax.swing.JLabel labelCantClientes;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom6;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelCustom8;
    private org.edisoncor.gui.label.LabelCustom labelListadoEmpleados;
    private win8.swin.MetroTableUI metroTableUI1;
    private win8.swin.MetroTableUI metroTableUI3;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.panel.PanelRect panelRect2;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private org.edisoncor.gui.tabbedPane.TabbedPaneRound tabbedPaneRound1;
    private win8.swin.MetroTableUI tablaClientes;
    private org.edisoncor.gui.util.UnsharpMaskFilter unsharpMaskFilter1;
    // End of variables declaration//GEN-END:variables

}
