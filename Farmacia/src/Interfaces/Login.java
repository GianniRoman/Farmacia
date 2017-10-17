
package Interfaces;

import Conexion.ConexionBD;
import Modelos.Usuario;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {
    ConexionBD db = ConexionBD.getInstance();

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
         CargarNombresDeUsuario();
         labelContraseñaIncorrecta.setVisible(false);
        
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
        labelContraseña = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        campoContraseña = new org.edisoncor.gui.passwordField.PasswordFieldRectIcon();
        jButton1 = new javax.swing.JButton();
        labelContraseñaIncorrecta = new javax.swing.JLabel();
        nombreUsuario = new org.edisoncor.gui.comboBox.ComboBoxRect();

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 230, 30));

        labelContraseña.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        labelContraseña.setText("Contraseña  :");
        jPanel1.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 30));

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
        jPanel1.add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, 20));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton1.setText("Iniciar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickBotonIniciarSesion(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 180, 40));

        labelContraseñaIncorrecta.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        labelContraseñaIncorrecta.setText("Contraseña incorrecta, vuelva a intentarlo. ");
        jPanel1.add(labelContraseñaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 440, 40));
        jPanel1.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 160, 30));

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

    public void CargarNombresDeUsuario()
    {
       try{
                db.setS(db.getConexion().createStatement());
                db.setRs(db.getS().executeQuery("select * FROM usuario"));
                while(db.getRs().next())
                {
                    Usuario user = new Usuario(db.getRs().getString("nombre"),db.getRs().getString("contraseña"),db.getRs().getString("cargo"),db.getRs().getString("fcod"));
                    nombreUsuario.addItem(user);    
                }
            }catch(SQLException ex){
                System.out.println(ex);
            }
    }
    
    private void ClickBotonIniciarSesion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickBotonIniciarSesion
        Usuario e = (Usuario) nombreUsuario.getSelectedItem();
        String nombre = e.getNombre();
        String pw = campoContraseña.getText();
        Usuario user = new Usuario(nombre,pw,e.getCargo(),e.getFcod());
        int verif = user.IniciarSesion(nombre, pw);
        if(verif == 0)
        {
            labelContraseñaIncorrecta.setVisible(true);
        }else{
            this.setVisible(false);
            new Principal(user).setVisible(true);
        }
    }//GEN-LAST:event_ClickBotonIniciarSesion

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
    private org.edisoncor.gui.passwordField.PasswordFieldRectIcon campoContraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelContraseñaIncorrecta;
    private org.edisoncor.gui.comboBox.ComboBoxRect nombreUsuario;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
