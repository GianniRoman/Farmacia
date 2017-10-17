
package Paneles;

import Modelos.Cliente;
import Modelos.ObraSocial;
import Modelos.Venta;
import java.awt.Color;

/**
 *
 * @author glupi
 */
public class panelObraSocial extends javax.swing.JPanel {

    /**
     * Creates new form panelObraSocial
     */
    Venta vta;
    Cliente cABuscar = new Cliente(null,null,"");
    ObraSocial[] obs = new ObraSocial[3];
    boolean ob;
    public panelObraSocial(Venta vta) {
        this.vta= vta;
        initComponents();
        ob = false;
        labelNoSeEncuentra.setVisible(false);
        textPlanOB.setVisible(false);
        //buttonAgregarOb.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        jPanel2 = new javax.swing.JPanel();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        textFieldDni = new javax.swing.JTextField();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        jPanel3 = new javax.swing.JPanel();
        labelNombre = new org.edisoncor.gui.label.LabelCustom();
        textFieldNmbre = new javax.swing.JTextField();
        labelCustom6 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        jPanel4 = new javax.swing.JPanel();
        labelApellido = new org.edisoncor.gui.label.LabelCustom();
        textFieldApellido = new javax.swing.JTextField();
        comboOB = new javax.swing.JComboBox<>();
        textPlanOB = new org.edisoncor.gui.label.LabelCustom();
        jPanel5 = new javax.swing.JPanel();
        labelCustom8 = new org.edisoncor.gui.label.LabelCustom();
        jPanel6 = new javax.swing.JPanel();
        labelCustom9 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom10 = new org.edisoncor.gui.label.LabelCustom();
        jPanel7 = new javax.swing.JPanel();
        comboNOB = new javax.swing.JComboBox<>();
        comboPNOB = new javax.swing.JComboBox<>();
        checkOb = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        buttonAgregarOb = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        labelNoSeEncuentra = new org.edisoncor.gui.label.LabelCustom();

        setOpaque(false);

        jPanel8.setOpaque(false);

        labelRound5.setBackground(new java.awt.Color(51, 123, 123));
        labelRound5.setText("1. Seleccionar Productos");

        labelRound6.setBackground(new java.awt.Color(51, 123, 123));
        labelRound6.setText("2. Forma de Pago");

        labelRound7.setBackground(new java.awt.Color(0, 204, 51));
        labelRound7.setText("3. Datos Obra Social");

        labelRound8.setBackground(new java.awt.Color(51, 123, 123));
        labelRound8.setText("4. Facturacion");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addComponent(labelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Datos del Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel2.setOpaque(false);

        labelCustom2.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom2.setText("DNI");

        textFieldDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        textFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldDniKeyReleased(evt);
            }
        });

        labelCustom5.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom5.setText("Obras Sociales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelCustom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(labelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelCustom5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setOpaque(false);

        labelNombre.setBackground(new java.awt.Color(0, 204, 0));
        labelNombre.setText("Nombre de Cliente");

        textFieldNmbre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));

        labelCustom6.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom6.setText("Obra Social");

        labelCustom7.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom7.setText("Plan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldNmbre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNmbre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(labelCustom7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setOpaque(false);

        labelApellido.setBackground(new java.awt.Color(0, 204, 0));
        labelApellido.setText("Apellido del Cliente");

        textFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));

        comboOB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboOBItemStateChanged(evt);
            }
        });
        comboOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboOBFocusLost(evt);
            }
        });
        comboOB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOBMouseClicked(evt);
            }
        });

        textPlanOB.setBackground(new java.awt.Color(0, 0, 153));
        textPlanOB.setText("labelCustom3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(comboOB, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(textPlanOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldApellido)
            .addComponent(comboOB, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(textPlanOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelCustom8.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom8.setText("Nueva Obra Social");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustom8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(labelCustom8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);

        labelCustom9.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom9.setText("Obra Social");

        labelCustom10.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom10.setText("Plan");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCustom10, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustom9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(labelCustom10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setOpaque(false);

        comboNOB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNOBItemStateChanged(evt);
            }
        });

        checkOb.setOpaque(false);
        checkOb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkObItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(checkOb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboNOB, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboPNOB, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboNOB)
            .addComponent(comboPNOB)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkOb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setOpaque(false);

        buttonAgregarOb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregarusuario 48px.png"))); // NOI18N
        buttonAgregarOb.setText("Agregar");
        buttonAgregarOb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarObActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAgregarOb))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAgregarOb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1830, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConfirmarUsuario 48px.png"))); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelNoSeEncuentra.setBackground(new java.awt.Color(204, 0, 0));
        labelNoSeEncuentra.setText("El cliente no se encuentra en el sistema. Ingrese sus datos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelNoSeEncuentra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(labelNoSeEncuentra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!"".equals(textFieldNmbre.getText()))
        {
            vta.setCliente(cABuscar);
            PasarAFacturacion();
        }else{
            //cartel
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textFieldDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDniKeyReleased
        String stringABuscar = textFieldDni.getText();
        Cliente aux = new Cliente(null,null,"");
        cABuscar = aux.BuscarPorDni(stringABuscar);
        ObraSocial ob = new ObraSocial();
        comboOB.removeAllItems();
        comboNOB.removeAllItems();
        comboPNOB.removeAllItems();
        textPlanOB.setText("");
        if(cABuscar != null)
        {
            textFieldNmbre.disable();
            textFieldApellido.disable();
            labelNoSeEncuentra.setVisible(false);
            textFieldNmbre.setText(cABuscar.getNombre());
            textFieldApellido.setText(cABuscar.getApellido());
            textFieldDni.setText(cABuscar.getDni());
            labelApellido.setBackground(new java.awt.Color(0, 204, 0));
            labelNombre.setBackground(new java.awt.Color(0, 204, 0));
            int cant = ob.ObtenerCantobDeUnCliente(cABuscar.getDni());
            obs = ob.traerObrasDeUnCliente(cABuscar.getDni(), cant);
            textPlanOB.setVisible(false);
            System.out.println(cant +"obras sociales");
            if(cant != 0)
            {    
                if(cant == 1)
                {
                    comboOB.addItem(obs[cant-1].getNombre());
                    textPlanOB.setVisible(true);
                    textPlanOB.setText(obs[cant-1].getPlan()[0]);
                    CargarObraSocial();
                }else{
                if(cant == 2)
                {
                    comboOB.addItem(obs[cant-1].getNombre());
                    comboOB.addItem(obs[cant-2].getNombre());
                    
                    CargarObraSocial();
                }else{
                    comboOB.addItem(obs[cant-1].getNombre());
                    comboOB.addItem(obs[cant-2].getNombre());
                    comboOB.addItem(obs[cant-3].getNombre());
                  }
            
                 }               
            }else{
                CargarObrasSociales();
            }
        }else{
            textFieldNmbre.enable();
            textFieldApellido.enable();
            textPlanOB.setVisible(false);
            labelNoSeEncuentra.setVisible(true);
            labelApellido.setBackground(Color.red);
            labelNombre.setBackground(Color.red);
            textFieldNmbre.setText("");
            textFieldApellido.setText("");
            CargarObrasSociales();
        }
        
    }//GEN-LAST:event_textFieldDniKeyReleased

    private void comboOBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboOBFocusLost
        Object ob1 = comboOB.getSelectedItem();
        String nombreOb1 = String.valueOf(ob1);
        System.out.println("nombre :"+nombreOb1 );
        if(nombreOb1 != null){
            if(obs[0].getNombre() == nombreOb1)
            {
            textPlanOB.setText(obs[0].getPlan()[0]);
            }else{
                if(obs[1].getNombre() == nombreOb1){
                textPlanOB.setText(obs[1].getPlan()[0]);
                }else{
                textPlanOB.setText(obs[2].getPlan()[0]);
                }
                }
           textPlanOB.setVisible(true); 
        }
            
        
    }//GEN-LAST:event_comboOBFocusLost

    public void CargarObraSocial()
  {
      ObraSocial[] obs = new ObraSocial[3];
      ObraSocial ob = new ObraSocial();
      obs = ob.traerObrasQueTiene(textFieldDni.getText());
      int cantob = ob.ObtenerCantobDeUnCliente(textFieldDni.getText());
      int cantobEnSistema = ob.contarObrasSociales();
      if(cantob != cantobEnSistema)
      {
            if(cantob == 0)
            {
                CargarObrasSociales();
            }else{
                if(obs[0] != null)
                {
                    int oscod = ob.ObtenerCcod(obs[0].getNombre());
                    Cargar(oscod); // cargar obras sociales menos la del oscod  
                }     
            }               
      }else{
          
      }
         
      
      
  }

    public void CargarObrasSociales()
  {
      ObraSocial ob = new ObraSocial();
      int cant = ob.contarObrasSociales();
      while(cant > 0)
      {
          ob = ob.Cargar(cant);
          comboNOB.addItem(ob.getNombre());
          cant--;
      }
      
      
  }
    
    private void Cargar(int oscod) {
        ObraSocial ob = new ObraSocial();
        ob = ob.ObtenerObrasMenosLaOscodDeParametro(oscod);
        comboNOB.removeAllItems();
        comboPNOB.removeAllItems();
        comboNOB.addItem(ob.getNombre());
        int tam = ob.getPlan().length;
        int i= 0;
        while(tam > 0)
        {
            comboPNOB.addItem(ob.getPlan()[i]);
            tam--;
            i++;
        }
    }
    
    private void comboOBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboOBItemStateChanged
        
        
        
    }//GEN-LAST:event_comboOBItemStateChanged

    private void comboOBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOBMouseClicked
        
    }//GEN-LAST:event_comboOBMouseClicked

    private void buttonAgregarObActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarObActionPerformed
        Object ob1 = comboNOB.getSelectedItem();
        String obs = String.valueOf(ob1);
        Object pob1 = comboPNOB.getSelectedItem();
        String pObs = String.valueOf(pob1);     
        String dni = textFieldDni.getText();
        ObraSocial ob = new ObraSocial();
        ob.AltaCobertura(dni, obs, pObs);
    }//GEN-LAST:event_buttonAgregarObActionPerformed

    private void checkObItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkObItemStateChanged
         if(ob = checkOb.isSelected()){
           buttonAgregarOb.setEnabled(true);
        }else{
           buttonAgregarOb.setEnabled(false);
        }
    }//GEN-LAST:event_checkObItemStateChanged

    private void comboNOBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNOBItemStateChanged
        comboPNOB.removeAllItems();
        Object ob1 = comboNOB.getSelectedItem();
        String nombreOb1 = String.valueOf(ob1);
        ObraSocial ob = new ObraSocial();
        ob.Cargar(0);
        ob = ob.CargarPlanes(nombreOb1);
        int i = 0;
        String[] planes;
        planes = ob.getPlan();
        int tam = ob.getPlan().length;
        while(tam > 0)
        {
            comboPNOB.addItem(ob.getPlan()[i]);
            tam--;
            i++;
        }
    }//GEN-LAST:event_comboNOBItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarOb;
    private javax.swing.JCheckBox checkOb;
    private javax.swing.JComboBox<String> comboNOB;
    private javax.swing.JComboBox<String> comboOB;
    private javax.swing.JComboBox<String> comboPNOB;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private org.edisoncor.gui.label.LabelCustom labelApellido;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom10;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom6;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelCustom8;
    private org.edisoncor.gui.label.LabelCustom labelCustom9;
    private org.edisoncor.gui.label.LabelCustom labelNoSeEncuentra;
    private org.edisoncor.gui.label.LabelCustom labelNombre;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private org.edisoncor.gui.label.LabelRound labelRound7;
    private org.edisoncor.gui.label.LabelRound labelRound8;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldDni;
    private javax.swing.JTextField textFieldNmbre;
    private org.edisoncor.gui.label.LabelCustom textPlanOB;
    // End of variables declaration//GEN-END:variables

    private void PasarAFacturacion() {
        panelFacturacion pFacturacion = new panelFacturacion(vta);
        pFacturacion.setSize(2239, 1309);
        pFacturacion.setLocation(0,0);
        this.removeAll();
        this.add(pFacturacion);
        this.revalidate();
        this.repaint();

    }
}
