/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Interfaces.Principal;
import Modelos.Conserje;
import Modelos.Medicamento;
import Modelos.MedicamentoViewModel;
import Modelos.Receta;
import Modelos.Venta;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import win8.swin.MetroTableUI;

/**
 *
 * @author Lauta
 */
public class panelSeleccionProducto extends javax.swing.JPanel {

    DefaultTableModel tablaMedic = new DefaultTableModel();
    DefaultTableModel tablaCompra = new DefaultTableModel();
    Venta vta;
    String buscado;
    Medicamento medicVendid = new Medicamento();
    ArrayList<Medicamento> meds = new ArrayList<>(); 
    Conserje conserje = new Conserje(); // conserje que llevara los estados de todos los pasos de las ventas.
    //String[] lotes = new String[5];
    public panelSeleccionProducto(Venta vta) {
        initComponents();
        nroAfLbl.setVisible(false);
        nroAfTf.setVisible(false);
        nroRecTf.setVisible(false);
        nroRecLbl.setVisible(false);
        this.vta = vta;
        metroTableUI4.setRowHeight(30);
        metroTableUI2.setRowHeight(30);
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
        metroTableUI2.setModel(tablaMedic);
        metroTableUI4.setModel(tablaCompra);
    }
    
    public panelSeleccionProducto(Venta vta,Conserje csj) {
        initComponents();
        this.vta = vta;
        this.conserje = csj;
        metroTableUI4.setRowHeight(30);
        metroTableUI2.setRowHeight(30);
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
        metroTableUI2.setModel(tablaMedic);
        metroTableUI4.setModel(tablaCompra);
        String monto = String.valueOf(csj.getMemento(0).getEstado().getMonto());
        totalCompra.setText(monto);
        cargarMedicamentosVendidos(csj.getMemento(0).getEstado().getMedicamentos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecProdLbl = new org.edisoncor.gui.label.LabelRound();
        labelRound6 = new org.edisoncor.gui.label.LabelRound();
        labelRound7 = new org.edisoncor.gui.label.LabelRound();
        labelRound8 = new org.edisoncor.gui.label.LabelRound();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        prodBuscado = new javax.swing.JTextField();
        buscarMedicamento = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        metroTableUI2 = new win8.swin.MetroTableUI();
        jScrollPane6 = new javax.swing.JScrollPane();
        metroTableUI4 = new win8.swin.MetroTableUI();
        QuitarProducto = new javax.swing.JButton();
        finalizarCargaProductos = new javax.swing.JButton();
        AgregarProd = new javax.swing.JButton();
        cancelarVenta = new javax.swing.JButton();
        totalCompra = new javax.swing.JTextField();
        labelCustom9 = new org.edisoncor.gui.label.LabelCustom();
        bajoReceta = new javax.swing.JToggleButton();
        nroAfLbl = new org.edisoncor.gui.label.LabelCustom();
        nroAfTf = new javax.swing.JTextField();
        nroRecLbl = new org.edisoncor.gui.label.LabelCustom();
        nroRecTf = new javax.swing.JTextField();

        setOpaque(false);

        selecProdLbl.setBackground(new java.awt.Color(0, 204, 51));
        selecProdLbl.setText("1. Seleccionar Productos");

        labelRound6.setBackground(new java.awt.Color(51, 123, 123));
        labelRound6.setText("2. Forma de Pago");

        labelRound7.setBackground(new java.awt.Color(51, 123, 123));
        labelRound7.setText("3. Datos Obra Social");

        labelRound8.setBackground(new java.awt.Color(51, 123, 123));
        labelRound8.setText("4. Facturacion");

        labelCustom2.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom2.setText("Nombre del producto :");
        labelCustom2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        labelCustom2.setPreferredSize(new java.awt.Dimension(95, 25));

        prodBuscado.setToolTipText("Ingrese producto a buscar...");
        prodBuscado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        prodBuscado.setOpaque(false);

        buscarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarProd 48px.png"))); // NOI18N
        buscarMedicamento.setText("Buscar");
        buscarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMedicamentoActionPerformed(evt);
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
        jScrollPane7.setViewportView(metroTableUI2);

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
        jScrollPane6.setViewportView(metroTableUI4);

        QuitarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/QuitarProd 48px.png"))); // NOI18N
        QuitarProducto.setText("Quitar");
        QuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarProductoActionPerformed(evt);
            }
        });

        finalizarCargaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CompletarVta 48px.png"))); // NOI18N
        finalizarCargaProductos.setText("Completar");
        finalizarCargaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCargaProductosActionPerformed(evt);
            }
        });

        AgregarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarProd 48px.png"))); // NOI18N
        AgregarProd.setText("Agregar");
        AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProdActionPerformed(evt);
            }
        });

        cancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarVta.png"))); // NOI18N
        cancelarVenta.setText("Cancelar");
        cancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVentaActionPerformed(evt);
            }
        });

        totalCompra.setEditable(false);
        totalCompra.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        totalCompra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalCompra.setText("0");
        totalCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        totalCompra.setOpaque(false);

        labelCustom9.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom9.setText("Total:");
        labelCustom9.setToolTipText("");
        labelCustom9.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N

        bajoReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Receta 48px.png"))); // NOI18N
        bajoReceta.setText("Bajo receta");
        bajoReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajoRecetaActionPerformed(evt);
            }
        });

        nroAfLbl.setBackground(new java.awt.Color(0, 204, 0));
        nroAfLbl.setText("Numero de afiliado");

        nroAfTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        nroRecLbl.setBackground(new java.awt.Color(0, 204, 0));
        nroRecLbl.setText("Numero de receta");

        nroRecTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prodBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selecProdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarMedicamento)
                                .addGap(64, 64, 64)
                                .addComponent(bajoReceta)
                                .addGap(139, 139, 139))
                            .addComponent(labelRound6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nroAfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nroAfTf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(nroRecLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nroRecTf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(AgregarProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cancelarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuitarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finalizarCargaProductos)))
                        .addGap(388, 388, 388))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(labelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(selecProdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prodBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bajoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nroAfLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nroAfTf, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nroRecLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nroRecTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarProd)
                    .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarVenta)
                    .addComponent(QuitarProducto)
                    .addComponent(finalizarCargaProductos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMedicamentoActionPerformed
        MedicamentoViewModel aux = new MedicamentoViewModel();
        buscado = prodBuscado.getText().toUpperCase();
        cargarTablaMedicamentos(aux.buscarMedicamento(buscado));
    }//GEN-LAST:event_buscarMedicamentoActionPerformed

    private void finalizarCargaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCargaProductosActionPerformed
          if(tablaCompra.getRowCount()>0){
            DecimalFormat df = new DecimalFormat("0.00");
            try {
                vta.setMonto(df.parse(this.totalCompra.getText()).floatValue()); //guardo el monto de la venta
            } catch (ParseException ex) {
                Logger.getLogger(panelSeleccionProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            int cant = tablaCompra.getRowCount();
            int i =0;
            while(i<cant){
                Medicamento auxm = new Medicamento();
                auxm = (Medicamento) metroTableUI4.getValueAt(i, 0);
                meds.add(auxm); 
                i++;
            }
            vta.setMedicamentos(meds);//lleno el arreglo de Medicamento de la venta
            Date fecha = new Date();           
            vta.setDia(fecha.getDate());
            vta.setMes(fecha.getMonth()+1);
            vta.setAño(fecha.getYear()+1900);
            
            if(conserje.getEstadosSalvados().size() == 0)
            {
                conserje.setMemento(vta.guardarEstadoToMemento());
                System.out.println(vta.getDia()+"/"+vta.getMes()+"/"+vta.getAño());
                PasarAFormaDePago();
            }else{
                conserje.ActualizarMomento(0,vta.guardarEstadoToMemento());
                PasarAFormaDePago();
            }
            
            
           
        }
        else{
            selecProdLbl.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debe ingresar productos a la venta antes de continuar", "Ningun elemento seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_finalizarCargaProductosActionPerformed

    private void AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProdActionPerformed
        MedicamentoViewModel med =(MedicamentoViewModel) metroTableUI2.getValueAt(metroTableUI2.getSelectedRow(),0);

        if(bajoReceta.isSelected()){//si el boton de bajo receta esta seleccionado
            med.setmBajoReceta(true);//seteo el campo bajo receta del medicamento que se agrego a la venta
            
        }else{
            med.setmBajoReceta(false);
            
        }
        med.actualizarExistencias(med.getExistencias() -1,med.getLote());//actualizo existencias del medicamento que vendo
        if(med.getExistencias()>0){//si las existencias son mayores a 0 el lote del que vendo es el mismo
            metroTableUI2.setValueAt(med.getExistencias(), metroTableUI2.getSelectedRow(), 6);
            metroTableUI2.updateUI();

        medicVendid = med.getMedic();
        
        int exist = med.getExistencias()-1;
        if(exist>=0){
            med.actualizarExistencias(med.getExistencias() -1,med.getLote());
            metroTableUI2.setValueAt(med.getExistencias(), metroTableUI2.getSelectedRow(), 6);//resta uno del stock en la primer tabla
            metroTableUI2.updateUI();//actualiza el estado de la primer tabla

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
            metroTableUI4.updateUI();
        }else{//sino, cargo el ultimo medicamento del lote anterior y actualizo la tabla con un lote nuevo
            metroTableUI2.setValueAt(med.getExistencias(), metroTableUI2.getSelectedRow(), 6);
            metroTableUI2.updateUI();
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
            metroTableUI4.updateUI();
            //tomo la fila que fue seleccionada en un principio
            int SeleccionAntesDeCambiarLote = metroTableUI2.getSelectedRow();
            //cargo el nuevo lote
            MedicamentoViewModel aux = new MedicamentoViewModel();
            buscado = prodBuscado.getText().toUpperCase();
            cargarTablaMedicamentos(aux.buscarMedicamento(buscado));
            //selecciono en la nueva tabla la fila que fue seleccionada en un principio
            metroTableUI2.getSelectionModel().setSelectionInterval(SeleccionAntesDeCambiarLote,SeleccionAntesDeCambiarLote);
           }
    }//GEN-LAST:event_AgregarProdActionPerformed
    }
    
    private void QuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarProductoActionPerformed
       int i = metroTableUI4.getSelectedRow();
       MedicamentoViewModel med = (MedicamentoViewModel) metroTableUI4.getValueAt(i, 0);
       med.actualizarExistencias(med.getExistencias()+1,med.getLote());
       float total=0;
       DecimalFormat df = new DecimalFormat();
       try {
            total= (float) df.parse(totalCompra.getText()).floatValue() - med.getMprecio();
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       totalCompra.setText(df.format(total));
       tablaCompra.removeRow(i);
       metroTableUI4.updateUI();
    }//GEN-LAST:event_QuitarProductoActionPerformed

    private void cancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVentaActionPerformed
        int cantFilas = tablaCompra.getRowCount()-1;
        while(cantFilas >=0){
            MedicamentoViewModel med = (MedicamentoViewModel) metroTableUI4.getValueAt(cantFilas, 0);
            med.actualizarExistencias(med.getExistencias()+1,med.getLote());
            tablaCompra.removeRow(cantFilas);
            cantFilas--;
        }
        metroTableUI4.updateUI();
        resetTable(metroTableUI2);
        totalCompra.setText("0");
    }//GEN-LAST:event_cancelarVentaActionPerformed


    private void bajoRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajoRecetaActionPerformed
        if(bajoReceta.isSelected()){
            nroAfLbl.setVisible(true);
            nroAfTf.setVisible(true);
            nroRecTf.setVisible(true);
            nroRecLbl.setVisible(true);
            
        }else{
            nroAfLbl.setVisible(false);
            nroAfTf.setVisible(false);
            nroRecTf.setVisible(false);
            nroRecLbl.setVisible(false);
        }
    }//GEN-LAST:event_bajoRecetaActionPerformed


    public void cargarMedicamentosVendidos(ArrayList meds){
        int cant = meds.size();
        int i;
        for(i=0; i<cant; i++){
            Medicamento aux;
            Object[] fila = new Object[7];
            aux = (Medicamento) meds.get(i);
            fila[0] = aux;
            fila[1] = aux.getFrmaFarmaceutica();
            fila[2] = aux.getPresentacion();
            fila[3] = aux.getPrecio();
            tablaCompra.addRow(fila);
        } 
        metroTableUI2.updateUI();
    }

     public void cargarTablaMedicamentos (ArrayList medicamentos){
        resetTable(metroTableUI2);
        int cant = medicamentos.size();
        int i;
        for(i=0; i<cant; i++){
            MedicamentoViewModel aux;
            Object[] fila = new Object[7];
            aux = (MedicamentoViewModel) medicamentos.get(i);
            System.out.println(aux.getMedic().getNombre());
            fila[0] = aux;
            fila[1] = aux.getmMarca();
            fila[2] = aux.getmGenerico();
            fila[3] = aux.getmFormFarmac();
            fila[4] = aux.getmPresentacion();
            fila[5] = aux.getMprecio();
            fila[6] = aux.getExistencias();
            System.out.println(aux.getmNbre());
            tablaMedic.addRow(fila);
        } 
        metroTableUI2.updateUI();
    }
    
    public void resetTable(MetroTableUI mt){
        DefaultTableModel dtm = (DefaultTableModel) mt.getModel();
        int a = mt.getRowCount()-1;
        int i;
        for(i=a; i>=0;i--){
            dtm.removeRow(dtm.getRowCount()-1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProd;
    private javax.swing.JButton QuitarProducto;
    private javax.swing.JToggleButton bajoReceta;
    private javax.swing.JButton buscarMedicamento;
    private javax.swing.JButton cancelarVenta;
    private javax.swing.JButton finalizarCargaProductos;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom9;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private org.edisoncor.gui.label.LabelRound labelRound7;
    private org.edisoncor.gui.label.LabelRound labelRound8;
    private win8.swin.MetroTableUI metroTableUI2;
    private win8.swin.MetroTableUI metroTableUI4;
    private org.edisoncor.gui.label.LabelCustom nroAfLbl;
    private javax.swing.JTextField nroAfTf;
    private org.edisoncor.gui.label.LabelCustom nroRecLbl;
    private javax.swing.JTextField nroRecTf;
    private javax.swing.JTextField prodBuscado;
    private org.edisoncor.gui.label.LabelRound selecProdLbl;
    private javax.swing.JTextField totalCompra;
    // End of variables declaration//GEN-END:variables

    private void PasarAFormaDePago() {
        panelFormaPago pFormaPago = new panelFormaPago(vta,conserje);
        pFormaPago.setSize(2239, 1309);
        pFormaPago.setLocation(0,0);
        this.removeAll();
        this.add(pFormaPago);
        this.revalidate();
        this.repaint();
    }

    private void RecargarMemento() {
        
    }
}
