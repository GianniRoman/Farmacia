
package Interfaces;

import java.util.Date;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date d = new Date();
        String hora;
        String fecha = (+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        
         if(d.getMinutes() < 10)
         {
             hora = (+(d.getHours())+":0"+d.getMinutes());
         }else
         {
             hora = (+(d.getHours())+":"+d.getMinutes());
         } 
         FechaInicio.setText(fecha);
         Hora.setText(hora);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        FechaInicio = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        passwordFieldRectIcon1 = new org.edisoncor.gui.passwordField.PasswordFieldRectIcon();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 30)); // NOI18N
        jLabel1.setText("Sistema Farmacia San Antonio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 400, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 51)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 550, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 255, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 51)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 10, 510));

        FechaInicio.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jPanel1.add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 130, 30));

        Hora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 100, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel3.setText("Nombre de usuario :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 30));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmaceutica 1", "Farmaceutica 2", "Farmaceutica 3"}));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 160, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel4.setText("Contraseña  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 30));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFarmacia.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));
        jPanel1.add(passwordFieldRectIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 20));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton1.setText("Iniciar sesion");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JLabel Hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.passwordField.PasswordFieldRectIcon passwordFieldRectIcon1;
    // End of variables declaration//GEN-END:variables
}
