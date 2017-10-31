package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;


public class Cliente extends Persona{
    String NumeroCliente;
    ObraSocial[] obrasSociales;
    Receta[] recetas;
    Venta[] ventas;
    String fechaIngreso;


    public Cliente(String dni) {
        super(null,null,dni);
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Cliente(ObraSocial[] obrasSociales, Receta[] recetas, Venta[] ventas, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.obrasSociales = obrasSociales;
        this.recetas = recetas;
        this.ventas = ventas;
    }

    public Cliente(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }
    
    public Cliente(String nombre, String apellido, String dni,String fecha)
    {
        super(nombre,apellido,dni);
        this.fechaIngreso = fecha;
    }

    public String getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(String NumeroCliente) {
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


    public int Alta(String nombre, String apellido,String sexo, String dni, String fIng, String[] obs, String[] pObs) {
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
               String dni = db.getRs().getString("cdni");
               String fecha = db.getRs().getString("ingreso");
               buscado = new Cliente(nombre,apellido,dni,fecha);
               }
               }catch(SQLException ex){
                 System.out.println(ex);
                }   
        return buscado;

    }
    
    public Cliente BuscarPorDni(String dni) {
       ConexionBD db = ConexionBD.getInstance();
       Cliente buscado = null;
           db.Select("*","cliente","cdni ='"+dni+"'");
           try{
               if(db.getRs().next()){
               String numeroCliente = db.getRs().getString("ccod");
               String nombre = db.getRs().getString("cnbre");
               String apellido = db.getRs().getString("capll");
               buscado = new Cliente(nombre,apellido,db.getRs().getString("cdni"));
               buscado.setNumeroCliente(numeroCliente);
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

    public void Modificar() {
        ConexionBD db = ConexionBD.getInstance();
        try{
            db.Select("ccod","cliente","cdni ='"+this.dni+"'");
            if(db.getRs().next())
            {
                String ccod = db.getRs().getString("ccod");
                db.Update("cliente","cdni ='"+this.dni+"',cnbre ='"+this.nombre+"',capll ='"+this.apellido+"'","ccod ='"+ccod+"'");              
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        
    }
    
    public ArrayList iniciarTablaClientes(){
       ArrayList <Cliente> clientes = new ArrayList<>();
       ConexionBD bd = ConexionBD.getInstance();
       bd.Select("nombre, apellido", "cliente","");
       int i = 0;
       try {
           while(bd.getRs().next()){
               Cliente cl = new Cliente(bd.getRs().getString("nombre"),bd.getRs().getString("apellido"),bd.getRs().getString("dni"));
               clientes.add(cl);              
           }
       } catch (SQLException ex) {
           System.out.println(ex);
       }
       return clientes;
   }


    
    
    
   

    
}
