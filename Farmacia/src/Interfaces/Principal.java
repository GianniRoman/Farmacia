/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import Modelos.Cliente;
import Modelos.Usuario;


/**
 *
 * @author glupi
 */
public class Principal extends javax.swing.JFrame {

    Usuario user;
    public Principal(Usuario user) {
        this.user = user;
        initComponents();
        panelAlta.setVisible(false);
        panelModificacion.setVisible(false);
        panelBaja.setVisible(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        metroTableUI2 = new win8.swin.MetroTableUI();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();

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
                .addContainerGap(510, Short.MAX_VALUE))
        );

        panelAlta.setForeground(new java.awt.Color(255, 255, 255));
        panelAlta.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelAlta.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAltaLayout = new javax.swing.GroupLayout(panelAlta);
        panelAlta.setLayout(panelAltaLayout);
        panelAltaLayout.setHorizontalGroup(
            panelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1616, Short.MAX_VALUE)
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
            .addGap(0, 1616, Short.MAX_VALUE)
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
            .addGap(0, 1616, Short.MAX_VALUE)
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
                .addComponent(jTabbedPane1)
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
            .addGap(0, 1641, Short.MAX_VALUE)
        );
        panelRect2Layout.setVerticalGroup(
            panelRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );

        tabbedPaneRound1.addTab("   Ventas", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Barcodes-icon 16px.png")), panelRect2, ""); // NOI18N

        panelRect3.setColorPrimario(new java.awt.Color(0, 153, 153));
        panelRect3.setColorSecundario(new java.awt.Color(51, 255, 255));
        panelRect3.setLayout(new java.awt.GridLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout(100, 10));

        metroTableUI2.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        metroTableUI2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(metroTableUI2);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");
        jLabel1.setAlignmentY(2.0F);
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        panelRect3.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(5, 0, 0, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(56, 20));
        jComboBox1.setName(""); // NOI18N
        jPanel3.add(jComboBox1);
        jPanel3.add(jYearChooser1);

        jDayChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDayChooser1.setDecorationBackgroundColor(new java.awt.Color(102, 255, 204));
        jDayChooser1.setOpaque(false);
        jPanel3.add(jDayChooser1);
        jPanel3.add(jMonthChooser1);

        panelRect3.add(jPanel3);

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

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private win8.swin.MetroTableUI metroTableUI2;

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


    public void CargarPestaña()
    {
       Cliente cManager = new Cliente(null,null,0);
       int cant = cManager.ObtenerCantClientes();
       labelCantClientes.setText(Integer.toString(cant));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.action.ActionManager actionManager1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelCantClientes;
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
