package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteViewModel {
    String  nombre,apellido,dni;
    String fechaIngreso;
    Venta[] vts = new Venta[100];
    Medicamento[] mdc = new Medicamento[100];
    Receta[] rct = new Receta[100];
    ArrayList<Cliente> cl = new ArrayList<>();
    ConexionBD bd = ConexionBD.getInstance();
    
    public ArrayList iniciarTablaClientes(){
       ArrayList <Cliente> clientes = new ArrayList<>();
       ConexionBD bd = ConexionBD.getInstance();
       bd.Select("*", "cliente","");
       int i = 0;
       try {
           while(bd.getRs().next()){
               Cliente cl = new Cliente(bd.getRs().getString("cnbre"),bd.getRs().getString("capll"),bd.getRs().getString("cdni"));
               cl.setNumeroCliente(bd.getRs().getString("ccod"));
               cl.setFechaIngreso(bd.getRs().getString("ingreso"));
               clientes.add(cl);              
           }
       } catch (SQLException ex) {
           System.out.println(ex);
       }
       return clientes;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Venta[] getVts() {
        return vts;
    }

    public void setVts(Venta[] vts) {
        this.vts = vts;
    }

    public Medicamento[] getMdc() {
        return mdc;
    }

    public void setMdc(Medicamento[] mdc) {
        this.mdc = mdc;
    }

    public Receta[] getRct() {
        return rct;
    }

    public void setRct(Receta[] rct) {
        this.rct = rct;
    }

    public ArrayList<Cliente> getVtas() {
        return cl;
    }

    public void setVtas(ArrayList<Cliente> vtas) {
        this.cl = cl;
    }
}
