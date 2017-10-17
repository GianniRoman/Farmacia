package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;

public class Usuario {
    String nombre;
    String contraseña;
    String cargo;
    String fcod;

    public Usuario(String nombre, String contraseña,String cargo, String fcod) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.fcod = fcod;
    }

    public String getCargo() {
        return cargo;
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

    @Override
    public String toString() {
        return nombre;
    }

    public Usuario(String fcod) {
        this.fcod = fcod;
    }

    public String getFcod() {
        return fcod;
    }
    
    
    public int IniciarSesion(String nombre, String pw) {
        
        ConexionBD bd = ConexionBD.getInstance();          
        bd.Select("*","Usuario","nombre = '"+nombre+"'");
        try{
                while(bd.getRs().next())
                {
                     String nbre = bd.getRs().getString("nombre"); 
                     String contra = bd.getRs().getString("contraseña");
                     if(nbre.equals(nombre) && contra.equals(pw)){
                            return 1;    
                     }else{
                            return 0;
                          }
                }               
            }catch(SQLException ex) {
                System.out.println(ex);
            }     
        
        return 0;
    }

    
    
    
}
