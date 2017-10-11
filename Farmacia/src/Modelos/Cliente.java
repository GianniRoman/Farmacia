package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;


public class Cliente extends Persona{
    int NumeroCliente;
    ObraSocial[] obrasSociales;
    Receta[] recetas;
    Venta[] ventas;
    String fechaIngreso;

    public Cliente(int dni) {
        super(null,null,dni);
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Cliente(ObraSocial[] obrasSociales, Receta[] recetas, Venta[] ventas, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.obrasSociales = obrasSociales;
        this.recetas = recetas;
        this.ventas = ventas;
    }

    public Cliente(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }
    
    public Cliente(String nombre, String apellido, int dni,String fecha)
    {
        super(nombre,apellido,dni);
        this.fechaIngreso = fecha;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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


    public int Alta(String nombre, String apellido,String sexo, int dni, String fIng, String[] obs, String[] pObs) {
        ConexionBD db = ConexionBD.getInstance();
        int exito = 0;
        String valores = " '"+dni+"','"+sexo+"','"+nombre+"','"+apellido+"','"+fIng+"'";
        exito = db.Insert("cliente (cdni,csexo,cnbre,capll,ingreso)",valores);
        if(exito == 1)
        {
            ObraSocial ob = new ObraSocial();
            ob.AltaCobertura(dni,obs,pObs);
        }
        return exito;
       
    }

    public Cliente Buscar(String stringABuscar) {
       ConexionBD db = ConexionBD.getInstance();
       if("".equals(stringABuscar))
       {
             System.out.println("vacio");
             return null;
       }
       stringABuscar = "%"+stringABuscar+"%";
       Cliente buscado = null;
           db.Select("*","cliente","cnbre like '"+stringABuscar+"' or capll like '"+stringABuscar+"' ");
           try{
               if(db.getRs().next()){
               String nombre = db.getRs().getString("cnbre");
               String apellido = db.getRs().getString("capll");
               int dni = Integer.parseInt(db.getRs().getString("cdni"));
               String fecha = db.getRs().getString("ingreso");
               buscado = new Cliente(nombre,apellido,dni,fecha);
               }
               }catch(SQLException ex){
                 System.out.println(ex);
                }   
        return buscado;

    }
    
    public int Baja(Cliente baja)
    {
        int exito = 0;
        ConexionBD db = ConexionBD.getInstance();
        db.Select("ccod","cliente","cdni ='"+this.dni+"'");
        try{
            if(db.getRs().next())
            {
                db.Delete("cobertura_cliente","ccod ='"+db.getRs().getString("ccod")+"'");
                exito = db.Delete("cliente","cdni ='"+this.dni+"'");
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        
        return exito;
    }

   

    
}
