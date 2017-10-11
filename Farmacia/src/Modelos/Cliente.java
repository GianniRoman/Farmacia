package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;


public class Cliente extends Persona{
    int NumeroCliente;
    ObraSocial[] obrasSociales;
    Receta[] recetas;
    Venta[] ventas;

    public Cliente(int NumeroCliente, ObraSocial[] obrasSociales, Receta[] recetas, Venta[] ventas, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.NumeroCliente = NumeroCliente;
        this.obrasSociales = obrasSociales;
        this.recetas = recetas;
        this.ventas = ventas;
    }

    public Cliente(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }
    
    

    public int getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(int NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public ObraSocial[] getObrasSociales() {
        return obrasSociales;
    }

    public void setObrasSociales(ObraSocial[] obrasSociales) {
        this.obrasSociales = obrasSociales;
    }

    public Receta[] getRecetas() {
        return recetas;
    }

    public void setRecetas(Receta[] recetas) {
        this.recetas = recetas;
    }

    public Venta[] getVentas() {
        return ventas;
    }

    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int ObtenerCantClientes() {
        ConexionBD bd = ConexionBD.getInstance();          
        bd.Select("*","cliente",""); 
        int cant = 0;
        try{
            while(bd.getRs().next())
            {
                cant++;
            }
            return cant;
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        
            
      return 0;
    }
    

   

    
}
