package Paneles;

import Interfaces.Principal;
import Modelos.Cliente;

public class panelBaja extends javax.swing.JPanel {

    Principal p;
    public panelBaja(Principal pPrin) {
        initComponents();
        p = pPrin;
        labelNoSeEncontro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        defaultTableRenderer1 = new org.jdesktop.swingx.renderer.DefaultTableRenderer();
        daySelectionModel1 = new org.jdesktop.swingx.calendar.DaySelectionModel();
        buttonPopup1 = new org.edisoncor.gui.button.ButtonPopup();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom3 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        labelApellido = new org.jdesktop.swingx.JXLabel();
        labelNombre = new org.jdesktop.swingx.JXLabel();
        labelFecha = new org.jdesktop.swingx.JXLabel();
        labelDni = new org.jdesktop.swingx.JXLabel();
        buttonAeroLeft1 = new org.edisoncor.gui.button.ButtonAeroLeft();
        labelNoSeEncontro = new org.edisoncor.gui.label.LabelCustom();
        textBusqueda = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();

        buttonPopup1.setText("buttonPopup1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        setOpaque(false);

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Fecha ingreso");
        labelCustom1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom3.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom3.setText("Nombre cliente");
        labelCustom3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom4.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom4.setText("Apellido cliente");
        labelCustom4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom5.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom5.setText("Dni cliente");
        labelCustom5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelApellido.setForeground(new java.awt.Color(255, 255, 255));
        labelApellido.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        labelApellido.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        labelNombre.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        labelFecha.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        labelDni.setForeground(new java.awt.Color(255, 255, 255));
        labelDni.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        labelDni.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        buttonAeroLeft1.setBackground(new java.awt.Color(0, 102, 102));
        buttonAeroLeft1.setText("Eliminar");
        buttonAeroLeft1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        buttonAeroLeft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroLeft1ActionPerformed(evt);
            }
        });

        labelNoSeEncontro.setBackground(new java.awt.Color(255, 0, 0));
        labelNoSeEncontro.setText("No se encontro el cliente.");
        labelNoSeEncontro.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        textBusqueda.setDescripcion("Busqueda por Nombre , Apellido");
        textBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBusquedaKeyReleased(evt);
            }
        });

        labelCustom7.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom7.setText("Eliminar cliente");
        labelCustom7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAeroLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelDni, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAeroLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyReleased
        String stringABuscar = textBusqueda.getText();
        Cliente cAEliminar = new Cliente(null,null,"");
        cAEliminar = cAEliminar.Buscar(stringABuscar);
        if(cAEliminar != null)
        {
            labelNoSeEncontro.setVisible(false);
            labelNombre.setText(cAEliminar.getNombre());
            labelApellido.setText(cAEliminar.getApellido());
            labelDni.setText(""+cAEliminar.getDni()+"");
            labelFecha.setText(cAEliminar.getFechaIngreso());           
        }else{
            labelNombre.setText("");
            labelApellido.setText("");
            labelDni.setText("");
            labelFecha.setText("");
            labelNoSeEncontro.setVisible(true);
        }
        
        
    }//GEN-LAST:event_textBusquedaKeyReleased

    private void textBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyPressed
        
    }//GEN-LAST:event_textBusquedaKeyPressed

    private void buttonAeroLeft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroLeft1ActionPerformed
     String dni = labelDni.getText();
     Cliente baja = new Cliente(dni);
     int exito = baja.Baja(baja);
     if(exito == 1)
     {
         
     }
    }//GEN-LAST:event_buttonAeroLeft1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroLeft buttonAeroLeft1;
    private org.edisoncor.gui.button.ButtonPopup buttonPopup1;
    private org.jdesktop.swingx.calendar.DaySelectionModel daySelectionModel1;
    private org.jdesktop.swingx.renderer.DefaultTableRenderer defaultTableRenderer1;
    private javax.swing.JTextField jTextField3;
    private org.jdesktop.swingx.JXLabel labelApellido;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.jdesktop.swingx.JXLabel labelDni;
    private org.jdesktop.swingx.JXLabel labelFecha;
    private org.edisoncor.gui.label.LabelCustom labelNoSeEncontro;
    private org.jdesktop.swingx.JXLabel labelNombre;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda;
    // End of variables declaration//GEN-END:variables
}
