/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Modelos.Medicamento;
import Modelos.Venta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author glupi
 */
public class panelFacturacion extends javax.swing.JPanel {

    DefaultTableModel tf = new DefaultTableModel();
    Venta vta;
    public panelFacturacion(Venta vta) {
        this.vta = vta;
        initComponents();
       
        textDescuento.setEnabled(false);
        textSubtotal.setEnabled(false);
        textTotal.setEnabled(false);
        tf.addColumn("Medicamento");
        tf.addColumn("Forma farmaceutica");
        tf.addColumn("Presentacion");
        tf.addColumn("Precio unitario");
        
        tablaFacturacion.setModel(tf);
        tablaFacturacion.setRowHeight(30);
        CargarTablaFacturacion(vta);
        textSubtotal.setText(""+vta.getMonto());
        textDescuento.setText(""+CalcularDescuento());
        textTotal.setText(""+CalcularTotal());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        labelRound5 = new org.edisoncor.gui.label.LabelRound();
        labelRound6 = new org.edisoncor.gui.label.LabelRound();
        labelRound7 = new org.edisoncor.gui.label.LabelRound();
        labelRound8 = new org.edisoncor.gui.label.LabelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturacion = new win8.swin.MetroTableUI();
        jPanel1 = new javax.swing.JPanel();
        textSubtotal = new javax.swing.JTextField();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        jPanel2 = new javax.swing.JPanel();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        textDescuento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        textTotal = new javax.swing.JTextField();
        labelCustom3 = new org.edisoncor.gui.label.LabelCustom();
        jPanel4 = new javax.swing.JPanel();
        cerrarVenta = new javax.swing.JButton();

        setOpaque(false);

        jPanel8.setOpaque(false);

        labelRound5.setBackground(new java.awt.Color(51, 123, 123));
        labelRound5.setText("1. Seleccionar Productos");

        labelRound6.setBackground(new java.awt.Color(51, 123, 123));
        labelRound6.setText("2. Forma de Pago");

        labelRound7.setBackground(new java.awt.Color(51, 123, 123));
        labelRound7.setText("3. Datos Obra Social");

        labelRound8.setBackground(new java.awt.Color(0, 204, 51));
        labelRound8.setText("4. Facturacion");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addComponent(labelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaFacturacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaFacturacion);

        jPanel1.setOpaque(false);

        textSubtotal.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        textSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Subtotal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(textSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setOpaque(false);

        labelCustom2.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom2.setText("Descuento");

        textDescuento.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        textDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel3.setOpaque(false);

        textTotal.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        textTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));

        labelCustom3.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom3.setText("Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setOpaque(false);

        cerrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarVenta.png"))); // NOI18N
        cerrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarVenta)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1833, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(351, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentaActionPerformed
        vta.registrarVenta();
        PasarASeleccionProductos();
    }//GEN-LAST:event_cerrarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private org.edisoncor.gui.label.LabelRound labelRound7;
    private org.edisoncor.gui.label.LabelRound labelRound8;
    private win8.swin.MetroTableUI tablaFacturacion;
    private javax.swing.JTextField textDescuento;
    private javax.swing.JTextField textSubtotal;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables

    private void PasarASeleccionProductos() {
        panelSeleccionProducto pSeleccion = new panelSeleccionProducto(vta);
        pSeleccion.setSize(2239, 1309);
        pSeleccion.setLocation(0,0);
        this.removeAll();
        this.add(pSeleccion);
        this.revalidate();
        this.repaint();
    }

    private float CalcularDescuento() {
        float subtotal = vta.getMonto();
        float descuento = vta.getDescuento(); // porcentaje
        float total = subtotal / descuento;
        return total;
    }

    private float CalcularTotal() {
        float descuento = CalcularDescuento();
        float subtotal = vta.getMonto();
        return subtotal - descuento;
    }

    private void CargarTablaFacturacion(Venta venta) {
       ArrayList<Medicamento> meds = venta.getMedicamentos();
       int cant = meds.size();
       int i=0;
       while(cant>0)
       {
            Medicamento aux = new Medicamento();
            Object[] fila = new Object[4];
            aux = (Medicamento) meds.get(i);
            System.out.println(aux.getNombre()+" "+aux.getFrmaFarmaceutica());
            fila[0] = aux.getNombre();
            fila[1] = aux.getFrmaFarmaceutica();
            fila[2] = aux.getPresentacion();
            fila[3] = aux.getPrecio();
            tf.addRow(fila);
            i++;
            cant--;
       }
       tablaFacturacion.updateUI();
    }
}
