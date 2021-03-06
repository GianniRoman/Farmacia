package Paneles;

import Conexion.ConexionBD;
import Modelos.Cliente;
import Modelos.ObraSocial;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import Interfaces.Principal;
import Modelos.ClienteViewModel;
import Modelos.Usuario;

public class panelAlta extends javax.swing.JPanel {

    boolean ob1,ob2,ob3;
    boolean pob1,pob2,pob3;
    Principal p;
    ClienteViewModel cl = new ClienteViewModel();
    public panelAlta(Principal pPrin) {
        ob1 = false;
        ob2 = false;
        ob3 = false;
        pob1 = false;
        pob2 = false;
        pob3 = false;      
        initComponents();
        CargarObrasSociales();
        ApagarComboBox();
        comboSexo.addItem("Masculino");
        comboSexo.addItem("Femenino");
        p = pPrin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        metroTableUI2 = new win8.swin.MetroTableUI();
        textField1 = new org.edisoncor.gui.textField.TextField();
        labelBackgroundTitle1 = new org.edisoncor.gui.label.LabelBackgroundTitle();
        basicHyperlinkUI1 = new org.jdesktop.swingx.plaf.basic.BasicHyperlinkUI();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom3 = new org.edisoncor.gui.label.LabelCustom();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        textApellido = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        textDni = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        buttonRound1 = new org.edisoncor.gui.button.ButtonRound();
        textNombre = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        comboPlanOB1 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        ComboOB1 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboPlanOB3 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboPlanOB2 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboOB2 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboOB3 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom6 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        comboSexo = new org.edisoncor.gui.comboBox.ComboBoxRect();
        checkOB1 = new javax.swing.JCheckBox();
        checkOB2 = new javax.swing.JCheckBox();
        checkOB3 = new javax.swing.JCheckBox();

        metroTableUI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        metroTableUI2.setModel(new javax.swing.table.DefaultTableModel(
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
        metroTableUI2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        metroTableUI2.setGridColor(new java.awt.Color(51, 204, 0));
        jScrollPane2.setViewportView(metroTableUI2);

        textField1.setText("textField1");

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 51)));
        setOpaque(false);

        labelCustom2.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom2.setText("Nuevo cliente");
        labelCustom2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom3.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom3.setText("Fecha de ingreso al sistema");
        labelCustom3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        fechaIngreso.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N

        textApellido.setColorDeBorde(new java.awt.Color(0, 153, 0));
        textApellido.setDescripcion("ingrese el apellido aquí");
        textApellido.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        textDni.setColorDeBorde(new java.awt.Color(0, 153, 0));
        textDni.setDescripcion("ingrese el dni aquí");
        textDni.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        labelCustom4.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom4.setText("Obras sociales");
        labelCustom4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        buttonRound1.setBackground(new java.awt.Color(0, 204, 0));
        buttonRound1.setText("Ingresar nuevo cliente");
        buttonRound1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        textNombre.setColorDeBorde(new java.awt.Color(0, 153, 0));
        textNombre.setDescripcion("ingrese el nombre aquí");
        textNombre.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        comboPlanOB1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        ComboOB1.setColorDeBorde(new java.awt.Color(0, 153, 0));
        ComboOB1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ComboOB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboOB1ItemStateChanged(evt);
            }
        });
        ComboOB1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ComboOB1FocusLost(evt);
            }
        });

        comboPlanOB3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        comboPlanOB2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        comboOB2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        comboOB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboOB2ItemStateChanged(evt);
            }
        });
        comboOB2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboOB2FocusLost(evt);
            }
        });
        comboOB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOB2MouseClicked(evt);
            }
        });

        comboOB3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        comboOB3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboOB3ItemStateChanged(evt);
            }
        });
        comboOB3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboOB3FocusLost(evt);
            }
        });
        comboOB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOB3MouseClicked(evt);
            }
        });

        labelCustom5.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom5.setText("Plan");
        labelCustom5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom6.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom6.setText("nombre");
        labelCustom6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        labelCustom1.setBackground(new java.awt.Color(0, 204, 0));
        labelCustom1.setText("Para registrar un nuevo cliente debe registrar sus datos personales");
        labelCustom1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        checkOB1.setOpaque(false);
        checkOB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkOB1ItemStateChanged(evt);
            }
        });
        checkOB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOB1ActionPerformed(evt);
            }
        });

        checkOB2.setOpaque(false);
        checkOB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkOB2ItemStateChanged(evt);
            }
        });

        checkOB3.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(textApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkOB3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboOB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(ComboOB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelCustom6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboOB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboPlanOB2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(comboPlanOB1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelCustom5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboPlanOB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(labelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCustom6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPlanOB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboOB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboPlanOB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboOB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(checkOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPlanOB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOB3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
   public void ApagarComboBox()
   {
       ComboOB1.setEnabled(false);
       comboPlanOB1.setEnabled(false);
       comboOB2.setEnabled(false);
       comboPlanOB2.setEnabled(false);
       comboOB3.setEnabled(false);
       comboPlanOB3.setEnabled(false);
   }
  public void CargarObrasSociales()
  {
      ObraSocial ob = new ObraSocial();
      int cant = ob.contarObrasSociales();
      while(cant > 0)
      {
          ob = ob.Cargar(cant);
          ComboOB1.addItem(ob.getNombre());
          cant--;
      }
      
      
  }
    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        
        String[] obs = new String[3];
        String[] pObs = new String[3];
        //-----Primer Obra social--//
        if(ob1 = checkOB1.isSelected())
        {
            Object ob1 = ComboOB1.getSelectedItem();
            String nombreOb1 = String.valueOf(ob1);
            Object pob1 = comboPlanOB1.getSelectedItem();
            String planOb1 = String.valueOf(pob1);
            obs[0] = nombreOb1;
            pObs[0] = planOb1;    
        }else{
            obs[0] = null;
            pObs[0] = null; 
        }
                //-----segunda Obra social--//
        if(ob2 = checkOB2.isSelected())
        {
            Object ob2 = comboOB2.getSelectedItem();
            String nombreOb2 = String.valueOf(ob2);
            Object pob2 = comboPlanOB2.getSelectedItem();
            String planOb2 = String.valueOf(pob2);
            obs[1] = nombreOb2;
            pObs[1] = planOb2;      
        }else{
            obs[1] = null;
            pObs[1] = null; 
        }

                //-----tercer Obra social--//
        if(ob3 = checkOB3.isSelected()){
            Object ob3 = comboOB3.getSelectedItem();
            String nombreOb3 = String.valueOf(ob3);
            Object pob3 = comboPlanOB3.getSelectedItem();
            String planOb3 = String.valueOf(pob3);
            obs[2] = nombreOb3;
            pObs[2] = planOb3;
        }else{
            obs[2] = null;
            pObs[2] = null; 
        }
        //-----Get atributos cliente--//
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String dni = textDni.getText();
        Object s = comboSexo.getSelectedItem();
        String sexo = String.valueOf(s);
        //-----Get fecha ingreso--//
        Date dia = fechaIngreso.getDate();
        DateFormat fechaHora = new SimpleDateFormat("dd-MM-yyyy");
	String fIng = fechaHora.format(dia);
        //-----Creo arreglo obrasocial--//
        Cliente nuevo = new Cliente(nombre,apellido,dni);
        int exito = nuevo.Alta(nombre,apellido,sexo,dni,fIng,obs,pObs);
        if(exito == 1)
        {
            textNombre.setText("");
            textApellido.setText("");
            textDni.setText("");
            p.ActualizarNumerosDeClientes();
            p.CargarPestaña(cl.iniciarTablaClientes());
            
        }
        
        
        
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void comboOB2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboOB2FocusLost
         
    }//GEN-LAST:event_comboOB2FocusLost

    private void comboOB3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboOB3FocusLost
         
    }//GEN-LAST:event_comboOB3FocusLost

    private void comboOB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOB2MouseClicked
      ObraSocial ob = new ObraSocial();
      comboOB2.removeAllItems();
      int cant = ob.contarObrasSociales()-1;
      while(cant > 0)
      {
          ob = ob.Cargar(cant);
          comboOB2.addItem(ob.getNombre());
          cant--;
      }
    }//GEN-LAST:event_comboOB2MouseClicked

    private void comboOB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOB3MouseClicked
       ObraSocial ob = new ObraSocial();
      comboOB3.removeAllItems();
      int cant = ob.contarObrasSociales()-2;
      while(cant > 0)
      {
          ob = ob.Cargar(cant);
          comboOB3.addItem(ob.getNombre());
          cant--;
      }
    }//GEN-LAST:event_comboOB3MouseClicked

    private void checkOB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkOB1ItemStateChanged
        if(ob1 = checkOB1.isSelected()){
            ComboOB1.setEnabled(true);
            comboPlanOB1.setEnabled(true);

        }else{
            ComboOB1.setEnabled(false);
            comboPlanOB1.setEnabled(false);
        }
        
       
    }//GEN-LAST:event_checkOB1ItemStateChanged

    private void ComboOB1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboOB1FocusLost
        
    }//GEN-LAST:event_ComboOB1FocusLost

    private void checkOB2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkOB2ItemStateChanged
        if(ob2 = checkOB2.isSelected()){
            comboOB2.setEnabled(true);
            comboPlanOB2.setEnabled(true);
        }else{
            comboOB2.setEnabled(false);
            comboPlanOB2.setEnabled(false);
        }
    }//GEN-LAST:event_checkOB2ItemStateChanged

    private void checkOB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOB1ActionPerformed
        
    }//GEN-LAST:event_checkOB1ActionPerformed

    private void ComboOB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboOB1ItemStateChanged
        comboPlanOB1.removeAllItems();
        Object ob1 = ComboOB1.getSelectedItem();
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
            comboPlanOB1.addItem(ob.getPlan()[i]);
            tam--;
            i++;
        }
    }//GEN-LAST:event_ComboOB1ItemStateChanged

    private void comboOB2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboOB2ItemStateChanged
        comboPlanOB2.removeAllItems();
         Object ob1 = comboOB2.getSelectedItem();
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
            comboPlanOB2.addItem(ob.getPlan()[i]);
            tam--;
            i++;
         }
    }//GEN-LAST:event_comboOB2ItemStateChanged

    private void comboOB3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboOB3ItemStateChanged
        comboPlanOB3.removeAllItems();
         Object ob1 = comboOB3.getSelectedItem();
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
            comboPlanOB3.addItem(ob.getPlan()[i]);
            tam--;
            i++;
         }
    }//GEN-LAST:event_comboOB3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.comboBox.ComboBoxRect ComboOB1;
    private org.jdesktop.swingx.plaf.basic.BasicHyperlinkUI basicHyperlinkUI1;
    private org.edisoncor.gui.button.ButtonRound buttonRound1;
    private javax.swing.JCheckBox checkOB1;
    private javax.swing.JCheckBox checkOB2;
    private javax.swing.JCheckBox checkOB3;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboOB2;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboOB3;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboPlanOB1;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboPlanOB2;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboPlanOB3;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboSexo;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private org.edisoncor.gui.label.LabelBackgroundTitle labelBackgroundTitle1;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom3;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom6;
    private win8.swin.MetroTableUI metroTableUI2;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textApellido;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textDni;
    private org.edisoncor.gui.textField.TextField textField1;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textNombre;
    // End of variables declaration//GEN-END:variables
}
