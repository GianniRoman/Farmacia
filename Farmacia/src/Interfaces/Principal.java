/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Conexion.ConexionBD;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import Modelos.Cliente;
import Modelos.Farmaceutico;
import Modelos.Usuario;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import Modelos.VentaViewModel;
import java.util.ArrayList;
import win8.swin.MetroTableUI;


/**
 *
 * @author glupi
 */
public class Principal extends javax.swing.JFrame {
    DefaultTableModel tm = new DefaultTableModel();
    Usuario user;
    boolean dia, mes, año, farmaceutico, monto;
    VentaViewModel vm = new VentaViewModel();
    
    
    
    public Principal(Usuario user) {
        this.user = user;
        dia =false;
        mes = false;
        año = false;
        farmaceutico = false;
        monto = false;
        initComponents();
        jCalendar1.setEnabled(dia);
        mesChoser.setEnabled(mes);
        añoPick.setEnabled(año);
        farmaceuticoCB.setEnabled(farmaceutico);
        montoTF.setEnabled(monto);
        RelativeLayout ly =new RelativeLayout(this.getWidth(), this.getHeight());
        panelRect3.setLayout(ly);
        metroTableUI1.setRowHeight(30);
        tm.addColumn("Venta");
        tm.addColumn("Lote");
        tm.addColumn("Medicamento");
        tm.addColumn("Farmaceutico");
        tm.addColumn("Cantidad");
        tm.addColumn("Precio Unitario");
        tm.addColumn("Precio Total");
        metroTableUI1.setModel(tm);
        panelAlta.setVisible(false);
        panelModificacion.setVisible(false);
        panelBaja.setVisible(false);
        //this.setExtendedState(MAXIMIZED_BOTH);
        CargarPestaña();
        cargarTablaVentas(vm.iniciarTablaVentas());
        cargarFarmaceuticos(vm.cargarFarmaceuticos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unsharpMaskFilter1 = new org.edisoncor.gui.util.UnsharpMaskFilter();
        actionManager1 = new org.jdesktop.swingx.action.ActionManager();
        tabbedPaneRound1 = new org.edisoncor.gui.tabbedPane.TabbedPaneRound();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCantClientes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelAlta = new org.edisoncor.gui.panel.PanelRect();
        panelModificacion = new org.edisoncor.gui.panel.PanelRect();
        panelBaja = new org.edisoncor.gui.panel.PanelRect();
        panelRect2 = new org.edisoncor.gui.panel.PanelRect();
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

        panelRect1.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect1.setColorSecundario(new java.awt.Color(51, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Cantidad de clientes :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 30));

        labelCantClientes.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        labelCantClientes.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(labelCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 80, 40));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton1.setText("Modificacion cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton2.setText("Nuevo cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton3.setText("Eliminar cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 80)); // NOI18N
        jLabel2.setText("Cosas extras que estan por verse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        panelAlta.setForeground(new java.awt.Color(255, 255, 255));
        panelAlta.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelAlta.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAltaLayout = new javax.swing.GroupLayout(panelAlta);
        panelAlta.setLayout(panelAltaLayout);
        panelAltaLayout.setHorizontalGroup(
            panelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1494, Short.MAX_VALUE)
        );
        panelAltaLayout.setVerticalGroup(
            panelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nuevo cliente", panelAlta);

        panelModificacion.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelModificacion.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelModificacionLayout = new javax.swing.GroupLayout(panelModificacion);
        panelModificacion.setLayout(panelModificacionLayout);
        panelModificacionLayout.setHorizontalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1494, Short.MAX_VALUE)
        );
        panelModificacionLayout.setVerticalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificacion cliente", panelModificacion);

        panelBaja.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelBaja.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBajaLayout = new javax.swing.GroupLayout(panelBaja);
        panelBaja.setLayout(panelBajaLayout);
        panelBajaLayout.setHorizontalGroup(
            panelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1494, Short.MAX_VALUE)
        );
        panelBajaLayout.setVerticalGroup(
            panelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar cliente", panelBaja);

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPaneRound1.addTab("   Clientes", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Users-icon 16px.png")), panelRect1, ""); // NOI18N

        javax.swing.GroupLayout panelRect2Layout = new javax.swing.GroupLayout(panelRect2);
        panelRect2.setLayout(panelRect2Layout);
        panelRect2Layout.setHorizontalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1519, Short.MAX_VALUE)
        );
        panelRect2Layout.setVerticalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
        );

        tabbedPaneRound1.addTab("   Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Barcodes-icon 16px.png")), panelRect2, ""); // NOI18N

        panelRect3.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect3.setColorSecundario(new java.awt.Color(51, 255, 255));
        panelRect3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1);

        panelRect3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 793, 510));

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

        diaCheckBox.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        diaCheckBox.setText("Dia");
        diaCheckBox.setOpaque(false);
        diaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diaCheckBoxItemStateChanged(evt);
            }
        });

        botonFiltrar.setBackground(new java.awt.Color(0, 153, 51));
        botonFiltrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        panelRect3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 100, 270, 630));

        tabbedPaneRound1.addTab("   Consulta Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cash-icon 16 px.png")), panelRect3); // NOI18N
        panelRect3.getAccessibleContext().setAccessibleName("");

        getContentPane().add(tabbedPaneRound1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
                //new Principal().setVisible(true);

            }
        });
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelModificacion.setVisible(false);
        panelBaja.setVisible(false);
        panelAlta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panelBaja.setVisible(true);
        panelAlta.setVisible(false);
        panelModificacion.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelBaja.setVisible(false);
        panelAlta.setVisible(false);
        panelModificacion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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


    public void CargarPestaña()
    {
       Cliente cManager = new Cliente(null,null,"0");
       int cant = cManager.ObtenerCantClientes();
       labelCantClientes.setText(Integer.toString(cant));
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
    private org.jdesktop.swingx.action.ActionManager actionManager1;
    private javax.swing.JCheckBox añoCheckBox;
    private com.toedter.calendar.JYearChooser añoPick;
    private org.edisoncor.gui.button.ButtonRound botonFiltrar;
    private javax.swing.JCheckBox diaCheckBox;
    public org.edisoncor.gui.comboBox.ComboBoxRect farmaceuticoCB;
    private javax.swing.JCheckBox farmaceuticoCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelCantClientes;
    private javax.swing.JCheckBox mesCheckBox;
    private com.toedter.calendar.JMonthChooser mesChoser;
    private win8.swin.MetroTableUI metroTableUI1;
    private javax.swing.JCheckBox montoCheckBox;
    private javax.swing.JTextField montoTF;
    private org.edisoncor.gui.panel.PanelRect panelAlta;
    private org.edisoncor.gui.panel.PanelRect panelBaja;
    private org.edisoncor.gui.panel.PanelRect panelModificacion;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.panel.PanelRect panelRect2;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private org.edisoncor.gui.tabbedPane.TabbedPaneRound tabbedPaneRound1;
    private org.edisoncor.gui.util.UnsharpMaskFilter unsharpMaskFilter1;
    // End of variables declaration//GEN-END:variables

}
