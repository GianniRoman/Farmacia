package Modelos;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;

public class Usuario {
    String nombre;
    String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    /*
    public static int IniciarSesion(String cargo, String pw) {
        
        if("Gerente".equals(cargo))
        {
            //ConexionBD bd = ConexionBD.getConexion();
            //ConexionBD bd = new ConexionBD();
            
            try{
                //bd.setRs(bd.getS().executeQuery("SELECT * FROM Usuario Where nombre = '"+cargo+"';"));
                if(true)
                {
                     //String nombre = bd.getRs().getString("nombre"); 
                     //String contra = bd.getRs().getString("contraseña");
                     if(nombre.equals(cargo) && contra.equals(pw))
                         return 1;
                     
                }else{
                    return 0;
                }
                
            }catch(SQLException ex) {
            System.out.println(ex);
        } 
            
        }else{
            return 1;
        }
        return 0;
    }
*/
    
    
    
}
