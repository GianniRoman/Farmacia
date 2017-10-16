/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Modelos.ObraSocial;

public class eliminarObra extends javax.swing.JPanel {

    panelModificacion pModif;
    public eliminarObra(panelModificacion pm) {
        initComponents();
        pModif = pm;
        int cant = verificarCantOb();
        if(cant == 0)
        {  
            labelOB1.setVisible(true);
            labelOB1.setVisible(false);
            labelOB2.setVisible(false);
            labelOB3.setVisible(false);
            labelOB1p.setVisible(false);
            labelOB2p.setVisible(false);
            labelOB3p.setVisible(false);
            butonElim1.setVisible(false);
            buttonElim2.setVisible(false);
            buttonElim3.setVisible(false);
        }else{
            labelNoObraSocial.setVisible(false);
            labelOB1.setVisible(false);
            if(cant == 1)
            {
            traerObraSocial(cant);
            labelOB2.setVisible(false);
            labelOB3.setVisible(false);
            labelOB2p.setVisible(false);
            labelOB3p.setVisible(false);
            buttonElim2.setVisible(false);
            buttonElim3.setVisible(false);
            }else{
                if(cant == 2)
                {
                    traerObraSocial(cant);
                    labelOB3.setVisible(false);
                    labelOB3p.setVisible(false);
                    buttonElim3.setVisible(false);
                }else{
                    traerObraSocial(cant);
                }
            }
            
            
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNoObraSocial = new javax.swing.JLabel();
        labelOB1 = new org.edisoncor.gui.label.LabelRect();
        labelOB2 = new org.edisoncor.gui.label.LabelRect();
        labelOB3 = new org.edisoncor.gui.label.LabelRect();
        labelOB1p = new org.edisoncor.gui.label.LabelRect();
        labelOB2p = new org.edisoncor.gui.label.LabelRect();
        labelOB3p = new org.edisoncor.gui.label.LabelRect();
        butonElim1 = new javax.swing.JButton();
        buttonElim2 = new javax.swing.JButton();
        buttonElim3 = new javax.swing.JButton();

        setOpaque(false);

        labelNoObraSocial.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelNoObraSocial.setText("El cliente en cuestion no tiene obra social");

        labelOB1.setBackground(new java.awt.Color(0, 51, 204));
        labelOB1.setText("labelRect1");

        labelOB2.setBackground(new java.awt.Color(0, 51, 204));
        labelOB2.setText("labelRect1");

        labelOB3.setBackground(new java.awt.Color(0, 51, 204));
        labelOB3.setText("labelRect1");

        labelOB1p.setBackground(new java.awt.Color(0, 51, 204));
        labelOB1p.setText("labelRect1");

        labelOB2p.setBackground(new java.awt.Color(0, 51, 204));
        labelOB2p.setText("labelRect1");

        labelOB3p.setBackground(new java.awt.Color(0, 51, 204));
        labelOB3p.setText("labelRect1");

        butonElim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-32px.png"))); // NOI18N
        butonElim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonElim1ActionPerformed(evt);
            }
        });

        buttonElim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-32px.png"))); // NOI18N
        buttonElim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElim2ActionPerformed(evt);
            }
        });

        buttonElim3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-32px.png"))); // NOI18N
        buttonElim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElim3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(labelNoObraSocial)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOB3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelOB1p, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(labelOB2p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelOB3p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butonElim1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonElim2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonElim3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelNoObraSocial)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelOB1p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butonElim1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOB2p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonElim2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonElim3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOB3p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelOB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butonElim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonElim1ActionPerformed
       ObraSocial ob = new ObraSocial();
       ob.bajaOb(pModif.traerDni(),labelOB1.getText());
    }//GEN-LAST:event_butonElim1ActionPerformed

    private void buttonElim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElim2ActionPerformed
        ObraSocial ob = new ObraSocial();
        ob.bajaOb(pModif.traerDni(),labelOB2.getText());
    }//GEN-LAST:event_buttonElim2ActionPerformed

    private void buttonElim3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElim3ActionPerformed
        ObraSocial ob = new ObraSocial();
       ob.bajaOb(pModif.traerDni(),labelOB3.getText());
    }//GEN-LAST:event_buttonElim3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonElim1;
    private javax.swing.JButton buttonElim2;
    private javax.swing.JButton buttonElim3;
    private javax.swing.JLabel labelNoObraSocial;
    private org.edisoncor.gui.label.LabelRect labelOB1;
    private org.edisoncor.gui.label.LabelRect labelOB1p;
    private org.edisoncor.gui.label.LabelRect labelOB2;
    private org.edisoncor.gui.label.LabelRect labelOB2p;
    private org.edisoncor.gui.label.LabelRect labelOB3;
    private org.edisoncor.gui.label.LabelRect labelOB3p;
    // End of variables declaration//GEN-END:variables

    private int verificarCantOb() {
        ObraSocial oManager = new ObraSocial();
        String dni = pModif.traerDni();
        int cant = oManager.ObtenerCantobDeUnCliente(dni);
        return cant;
    }

    private void traerObraSocial(int cant) {
        ObraSocial ob = new ObraSocial();
        ObraSocial[] obs = new ObraSocial[cant];
        obs = ob.traerObrasDeUnCliente(pModif.traerDni(),cant);
            if(cant == 1)
            {
            labelOB1.setVisible(true);
            labelOB1.setText(obs[cant-1].getNombre());
            labelOB1p.setVisible(true);
            labelOB1p.setText(obs[cant-1].getPlan(0));
            }else{
                if(cant == 2)
                {
                labelOB1.setVisible(true);
                labelOB1.setText(obs[cant-1].getNombre());
                labelOB1p.setVisible(true);
                labelOB1p.setText(obs[cant-1].getPlan(0));
                labelOB2.setVisible(true);
                labelOB2.setText(obs[cant-2].getNombre());
                labelOB2p.setVisible(true);
                labelOB2p.setText(obs[cant-2].getPlan(0));
             }else{
                labelOB1.setVisible(true);
                labelOB1.setText(obs[cant-1].getNombre());
                labelOB1p.setVisible(true);
                labelOB1p.setText(obs[cant-1].getPlan(0));
                labelOB2.setVisible(true);
                labelOB2.setText(obs[cant-2].getNombre());
                labelOB2p.setVisible(true);
                labelOB2p.setText(obs[cant-2].getPlan(0));
                labelOB3.setVisible(true);
                labelOB3.setText(obs[cant-3].getNombre());
                labelOB3p.setVisible(true);
                labelOB3p.setText(obs[cant-3].getPlan(0));
                }
                }
        }
        
    
}
