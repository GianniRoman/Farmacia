package Paneles;

import Modelos.Cliente;
import java.awt.BorderLayout;

public class panelModificacion extends javax.swing.JPanel {

    public panelModificacion() {
        initComponents();
        labelNoSeEncontro.setVisible(false);
        panelModificacionOb.setVisible(false);
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
        labelNoSeEncontro = new org.edisoncor.gui.label.LabelCustom();
        textBusqueda = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        textNombre = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        textApellido = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        textDni = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        buttonColoredAction1 = new org.edisoncor.gui.button.ButtonColoredAction();
        buttonColoredAction2 = new org.edisoncor.gui.button.ButtonColoredAction();
        buttonColoredAction3 = new org.edisoncor.gui.button.ButtonColoredAction();
        panelModificacionOb = new javax.swing.JPanel();
        buttonRound1 = new org.edisoncor.gui.button.ButtonRound();

        buttonPopup1.setText("buttonPopup1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        setOpaque(false);

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Obras Sociales");
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
        labelCustom7.setText("Modificar cliente");
        labelCustom7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        textNombre.setDescripcion("Nombre a modificar");
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNombreKeyReleased(evt);
            }
        });

        textApellido.setDescripcion("Apellido a modificar");
        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });
        textApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textApellidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textApellidoKeyReleased(evt);
            }
        });

        textDni.setDescripcion("Dni a modificar");
        textDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textDniKeyReleased(evt);
            }
        });

        buttonColoredAction1.setText("Agregar");
        buttonColoredAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoredAction1ActionPerformed(evt);
            }
        });

        buttonColoredAction2.setText("Modificar");
        buttonColoredAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoredAction2ActionPerformed(evt);
            }
        });

        buttonColoredAction3.setText("Eliminar");
        buttonColoredAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColoredAction3ActionPerformed(evt);
            }
        });

        panelModificacionOb.setOpaque(false);

        javax.swing.GroupLayout panelModificacionObLayout = new javax.swing.GroupLayout(panelModificacionOb);
        panelModificacionOb.setLayout(panelModificacionObLayout);
        panelModificacionObLayout.setHorizontalGroup(
            panelModificacionObLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelModificacionObLayout.setVerticalGroup(
            panelModificacionObLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        buttonRound1.setBackground(new java.awt.Color(0, 102, 102));
        buttonRound1.setText("Terminar modificacion");
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelCustom4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(labelCustom5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(textDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCustom1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(buttonColoredAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonColoredAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelModificacionOb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonColoredAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonColoredAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelModificacionOb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyReleased
        String stringABuscar = textBusqueda.getText();
        Cliente cAEliminar = new Cliente(null,null,"");
        cAEliminar = cAEliminar.Buscar(stringABuscar);
        if(cAEliminar != null)
        {
            labelNoSeEncontro.setVisible(false);
            textNombre.setText(cAEliminar.getNombre());
            textApellido.setText(cAEliminar.getApellido());
            textDni.setText(cAEliminar.getDni());
        }else{
            textNombre.setText("");
            textApellido.setText("");
            textDni.setText("");
            labelNoSeEncontro.setVisible(true);
        }
        
        
    }//GEN-LAST:event_textBusquedaKeyReleased

    private void textBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyPressed
        
    }//GEN-LAST:event_textBusquedaKeyPressed

    private void textNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreKeyPressed

    private void textNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreKeyReleased

    private void textApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textApellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoKeyPressed

    private void textApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textApellidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoKeyReleased

    private void textDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDniKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDniKeyPressed

    private void textDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDniKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textDniKeyReleased

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

    private void buttonColoredAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoredAction1ActionPerformed
        panelModificacionOb.setVisible(true);
        nuevaObra pNueva = new nuevaObra(this);
        pNueva.setSize(400,200);
        pNueva.setLocation(0,10);
        panelModificacionOb.removeAll();
        panelModificacionOb.add(pNueva ,BorderLayout.CENTER);
        panelModificacionOb.revalidate();
        panelModificacionOb.repaint();
    }//GEN-LAST:event_buttonColoredAction1ActionPerformed

    private void buttonColoredAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoredAction3ActionPerformed
        panelModificacionOb.setVisible(true);
        eliminarObra pElim = new eliminarObra(this);
        pElim.setSize(400,200);
        pElim.setLocation(0,10);
        panelModificacionOb.removeAll();
        panelModificacionOb.add(pElim,BorderLayout.CENTER);
        panelModificacionOb.revalidate();
        panelModificacionOb.repaint();
    }//GEN-LAST:event_buttonColoredAction3ActionPerformed

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
       Cliente cAEliminar = new Cliente(textNombre.getText(),textApellido.getText(),textDni.getText());
       cAEliminar.Modificar();
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void buttonColoredAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColoredAction2ActionPerformed
        panelModificacionOb.setVisible(true);
        modificarObra pModif = new modificarObra(this);
        pModif.setSize(400,200);
        pModif.setLocation(0,10);
        panelModificacionOb.removeAll();
        panelModificacionOb.add(pModif,BorderLayout.CENTER);
        panelModificacionOb.revalidate();
        panelModificacionOb.repaint();
    }//GEN-LAST:event_buttonColoredAction2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction1;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction2;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction3;
    private org.edisoncor.gui.button.ButtonPopup buttonPopup1;
    private org.edisoncor.gui.button.ButtonRound buttonRound1;
    private org.jdesktop.swingx.calendar.DaySelectionModel daySelectionModel1;
    private org.jdesktop.swingx.renderer.DefaultTableRenderer defaultTableRenderer1;
    private javax.swing.JTextField jTextField3;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelNoSeEncontro;
    private javax.swing.JPanel panelModificacionOb;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textApellido;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textDni;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textNombre;
    // End of variables declaration//GEN-END:variables

    public String traerDni() {
        return this.textDni.getText();
    }
}
