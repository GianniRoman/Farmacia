package Paneles;

import Modelos.Cliente;

public class panelModificacion extends javax.swing.JPanel {

    public panelModificacion() {
        initComponents();
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
        buttonAeroLeft1 = new org.edisoncor.gui.button.ButtonAeroLeft();
        labelNoSeEncontro = new org.edisoncor.gui.label.LabelCustom();
        textBusqueda = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        textBusqueda1 = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        textBusqueda2 = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        textBusqueda3 = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        buttonColoredAction1 = new org.edisoncor.gui.button.ButtonColoredAction();
        buttonColoredAction2 = new org.edisoncor.gui.button.ButtonColoredAction();
        buttonColoredAction3 = new org.edisoncor.gui.button.ButtonColoredAction();

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

        buttonAeroLeft1.setBackground(new java.awt.Color(0, 102, 102));
        buttonAeroLeft1.setText("Terminado");
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

        textBusqueda1.setDescripcion("Nombre a modificar");
        textBusqueda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBusqueda1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBusqueda1KeyReleased(evt);
            }
        });

        textBusqueda2.setDescripcion("Apellido a modificar");
        textBusqueda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBusqueda2ActionPerformed(evt);
            }
        });
        textBusqueda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBusqueda2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBusqueda2KeyReleased(evt);
            }
        });

        textBusqueda3.setDescripcion("Dni a modificar");
        textBusqueda3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBusqueda3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBusqueda3KeyReleased(evt);
            }
        });

        buttonColoredAction1.setText("Agregar");

        buttonColoredAction2.setText("Modificar");

        buttonColoredAction3.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textBusqueda1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(textBusqueda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textBusqueda3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(182, 182, 182))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonColoredAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(buttonColoredAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAeroLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBusqueda3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonColoredAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonColoredAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonColoredAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(buttonAeroLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNoSeEncontro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyReleased
        String stringABuscar = textBusqueda.getText();
        Cliente cAEliminar = new Cliente(null,null,"");
        cAEliminar = cAEliminar.Buscar(stringABuscar);
        if(cAEliminar != null)
        {
            labelNoSeEncontro.setVisible(false);
         
        }else{

            labelNoSeEncontro.setVisible(true);
        }
        
        
    }//GEN-LAST:event_textBusquedaKeyReleased

    private void textBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusquedaKeyPressed
        
    }//GEN-LAST:event_textBusquedaKeyPressed

    private void buttonAeroLeft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroLeft1ActionPerformed

    }//GEN-LAST:event_buttonAeroLeft1ActionPerformed

    private void textBusqueda1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda1KeyPressed

    private void textBusqueda1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda1KeyReleased

    private void textBusqueda2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda2KeyPressed

    private void textBusqueda2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda2KeyReleased

    private void textBusqueda3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda3KeyPressed

    private void textBusqueda3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBusqueda3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda3KeyReleased

    private void textBusqueda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusqueda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusqueda2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroLeft buttonAeroLeft1;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction1;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction2;
    private org.edisoncor.gui.button.ButtonColoredAction buttonColoredAction3;
    private org.edisoncor.gui.button.ButtonPopup buttonPopup1;
    private org.jdesktop.swingx.calendar.DaySelectionModel daySelectionModel1;
    private org.jdesktop.swingx.renderer.DefaultTableRenderer defaultTableRenderer1;
    private javax.swing.JTextField jTextField3;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelNoSeEncontro;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda1;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda2;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textBusqueda3;
    // End of variables declaration//GEN-END:variables
}
