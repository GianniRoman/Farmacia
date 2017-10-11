package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.Arrays;

public class ObraSocial {
    String nombre;
    String[] plan;
    Cliente[] clientes;
    Receta[] recetas;

    ObraSocial(String ob) {
       this.nombre = ob;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Receta[] getRecetas() {
        return recetas;
    }

    public void setRecetas(Receta[] recetas) {
        this.recetas = recetas;
    }

    public ObraSocial(String nombre, String[] plan, Cliente[] clientes, Receta[] recetas) {
        this.nombre = nombre;
        this.plan = plan;
        this.clientes = clientes;
        this.recetas = recetas;
    }
    public ObraSocial(String nombre,String[] planes) {
        this.nombre = nombre;
        this.plan = planes;
    }
    
    public ObraSocial() {
        
    }
    
    public ObraSocial Cargar(int cant) // deberia retornar muchas obras sociales, para asi cargar todo de una.
    {
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("*","obra_social_uso"," oscod ='"+cant+"'"); 
        String[] plan = new String[10];
        String nombre = null;
        try{
            if(bd.getRs().next())
            {
                int oscod = (bd.getRs().getInt("oscod"));
                nombre = bd.getRs().getString("nombre");
                ConexionBD bd1 = ConexionBD.getInstance();
                bd1.Select("*","plan_obra_social","obcod = "+oscod+"");
                int i= 0;               
                while(bd1.getRs().next())
                {
                    plan[i] = bd1.getRs().getString("plan");
                    i++;
                    
                }
                             
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        ObraSocial nueva = new ObraSocial(nombre,plan);        
        return nueva;
    }

    public String[] getPlan() {
        return plan;
    }

    public void setPlan(String[] plan) {
        this.plan = plan;
    }

    public int contarObrasSociales() {
       ConexionBD bd = ConexionBD.getInstance();
       bd.Select("*","obra_social_uso","");
       int cont = 0;
       try{
            while(bd.getRs().next())
            {
                cont++;    
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
       return cont;      
    }

    public ObraSocial CargarPlanes(String nombreOb1) {      
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("*","obra_social_uso"," nombre ='"+nombreOb1+"'"); 
        String[] plan = new String[5];
        String nombre = null;
        try{
            if(bd.getRs().next())
            {
                int oscod = (bd.getRs().getInt("oscod"));
                ConexionBD bd1 = ConexionBD.getInstance();
                bd1.Select("*","plan_obra_social","obcod = "+oscod+"");
                int i= 0;               
                while(bd1.getRs().next())
                {
                    plan[i] = bd1.getRs().getString("plan");
                    i++;
                   
                }
                             
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        ObraSocial nueva = new ObraSocial(nombre,plan);   
       return nueva;
    }

    public int ObtenerCcod() {
        ConexionBD db = ConexionBD.getInstance();
        int obCod = 0;
        db.Select("oscod","obra_social_uso","nombre = '"+this.nombre+"'");
        try{
            if(db.getRs().next())
            {
                obCod = db.getRs().getInt("oscod");
            }
        }catch(SQLException ex)
        {
            System.out.println("Obtener cod :"+" "+ex);
        }
        System.out.println(obCod);
        return obCod;
    }

    public void AltaCobertura(int dni, String[] obs, String[] pObs) {
        
        ConexionBD db = ConexionBD.getInstance();  
        db.Select("ccod","cliente","cdni = '"+dni+"'");
        try{
            if(db.getRs().next())
            {
                int tam = obs.length;
                int i = 0;
                while((tam > 0) && !"null".equals(obs[i]))
                {
                    System.out.println("Iteraciones : "+i);
                    ObraSocial ob = new ObraSocial(obs[i]);
                    int cbod = ob.ObtenerCcod(); //codigo obra social
                    System.out.println(cbod);
                    db.Select("ccod","cliente","cdni = '"+dni+"'");
                    if(db.getRs().next())
                    {
                        String ccod = db.getRs().getString("ccod"); // codigo cliente
                        System.out.println(ccod);
                        String values = ""+ccod+","+cbod+",'"+pObs[i]+"'";
                        db.Insert("cobertura_cliente",values);
                    }
                    i++;
                    tam--;
                }
            }else{
                System.out.println("No encontro el cliente con ese dni");
            }
        }catch(SQLException ex)
        {
            System.out.println("alta cobertura"+" "+ex);
        }
       
    }
   
    
    
}
