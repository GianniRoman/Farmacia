package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObraSocial {
    String nombre;
    String[] plan;
    Cliente[] clientes;
    Receta[] recetas;
    int obcod;

    public int getObcod() {
        return obcod;
    }

    public void setObcod(int obcod) {
        this.obcod = obcod;
    }

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
        this.plan = null;   
    }
    
    public ObraSocial Cargar(int cant)
    {
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("*","obra_social_uso"," oscod ='"+cant+"'"); 
        String[] plan = new String[4];
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
        bd.Select("*","obra_social_uso","nombre ='"+nombreOb1+"'"); 
        String[] plan = new String[5];
        String nombre = null;
        try{
            if(bd.getRs().next())
            {
                int oscod = (bd.getRs().getInt("oscod"));
                bd.Select("*","plan_obra_social","obcod = "+oscod+"");
                System.out.println(oscod);
                int i= 0;               
                while(bd.getRs().next())
                {
                    System.out.println("tiene plan");
                    plan[i] = bd.getRs().getString("plan");
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
    
    public int ObtenerCcod(String nombre) {
        ConexionBD db = ConexionBD.getInstance();
        int obCod = 0;
        db.Select("oscod","obra_social_uso","nombre = '"+nombre+"'");
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

    public void AltaCobertura(String dni, String[] obs, String[] pObs) {
        
        ConexionBD db = ConexionBD.getInstance();  
        db.Select("ccod","cliente","cdni = '"+dni+"'");
        try{
            if(db.getRs().next())
            {
                int tam = obs.length;
                int i = 0;
                while((tam > 0) && obs[i] != null)
                {
                    ObraSocial ob = new ObraSocial(obs[i]);
                    int cbod = ob.ObtenerCcod(); //codigo obra social
                    db.Select("ccod","cliente","cdni = '"+dni+"'");
                    if(db.getRs().next())
                    {
                        String ccod = db.getRs().getString("ccod"); // codigo cliente
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

    public int ObtenerCantobDeUnCliente(String dni) {
        ConexionBD db = ConexionBD.getInstance();
        int obCod = 0;
        try{
            db.Select("ccod","cliente","cdni = '"+dni+"'");
            db.getRs().next();        
            String ccod = db.getRs().getString("ccod");
            db.Select("ccod","cobertura_cliente","ccod ="+Integer.parseInt(ccod)+"");
            while(db.getRs().next())
            {
                obCod++;
            }
        }catch(SQLException ex)
        {
            System.out.println("Obtener cod :"+ex);
        }
        return obCod;
    }

    public ObraSocial[] traerObrasDeUnCliente(String dni,int cant) {
       ConexionBD db = ConexionBD.getInstance();
       ObraSocial[] obs = new ObraSocial[cant];
       try{
           int i = cant;
           db.Select("ccod","cliente","cdni ='"+dni+"'");
           db.getRs().next();
           db.Select("*","cobertura_cliente,obra_social_uso","cobertura_cliente.oscod = obra_social_uso.oscod and ccod ='"+db.getRs().getString("ccod")+"'"); 
           
           while(db.getRs().next() && i>0) // si el cliente tiene obra social =>
           {   
              String[] plan = new String[1]; 
              plan[0] = db.getRs().getString("plan");
              ObraSocial ob1 = new ObraSocial(db.getRs().getString("nombre"),plan);
              ob1.setObcod(db.getRs().getInt("oscod"));
              obs[i-1] = ob1;
              i--;
           }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
     return obs;
    }
    
    

    public void AltaCobertura(String dni, String obs, String pObs) {
        
        ConexionBD db = ConexionBD.getInstance();  
        db.Select("ccod","cliente","cdni = '"+dni+"'");
        try{
            if(db.getRs().next())
            {
                    ObraSocial ob = new ObraSocial(obs);
                    int cbod = ob.ObtenerCcod(); //codigo obra social
                    db.Select("ccod","cliente","cdni = '"+dni+"'");
                    if(db.getRs().next())
                    {
                        String ccod = db.getRs().getString("ccod"); // codigo cliente
                        String values = ""+ccod+","+cbod+",'"+pObs+"'";
                        db.Insert("cobertura_cliente",values);
                    }
            }else{
                System.out.println("No encontro el cliente con ese dni");
            }
        }catch(SQLException ex)
        {
            System.out.println("alta cobertura"+" "+ex);
        }
    }

    public String getPlan(int i) {
       return this.plan[i];
    }

    public void bajaOb(String dni,String nombreOb) {
        ConexionBD db = ConexionBD.getInstance();
        int oscod = ObtenerCcod(nombreOb);
        db.Select("ccod","cliente","cdni ='"+dni+"'");
        try {
            db.getRs().next();
            int ccod = db.getRs().getInt("ccod");
            System.out.println(ccod + "" + oscod);
            int exito = db.Delete("cobertura_cliente","ccod ="+ccod+" and oscod ="+oscod+"");
            System.out.println("exito "+exito);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
    }

    public ObraSocial CargarPlanes(ObraSocial[] obs,int nObra) {
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("*","obra_social_uso"," nombre ='"+obs[nObra-1]+"'"); 
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
                    System.out.println(plan[i]);
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

    public void ModificarCobertura(String dni, String[] obs, String[] pObs) {
        ConexionBD db = ConexionBD.getInstance();  
        db.Select("ccod","cliente","cdni = '"+dni+"'");
        try{
            if(db.getRs().next())
            {
                int tam = obs.length;
                int i = 0;
                while((tam > 0) && obs[i] != null)
                {
                    ObraSocial ob = new ObraSocial(obs[i]);
                    int cbod = ob.ObtenerCcod(); //codigo obra social
                    db.Select("ccod","cliente","cdni = '"+dni+"'");
                     if(db.getRs().next())
                    {
                        String ccod = db.getRs().getString("ccod"); // codigo cliente
                        db.Update("cobertura_cliente","plan ='"+pObs[i]+"'"," cobertura_cliente.ccod ='"+ccod+"' and cobertura_cliente.oscod='"+cbod+"'");
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

    public ObraSocial[] traerObrasQueTiene(String dni) {
      ObraSocial[] obs = new ObraSocial[1];
      obs = traerObrasDeUnCliente(dni, 1);
      return obs;
    }

    public ObraSocial ObtenerObrasMenosLaOscodDeParametro(int oscod) {
       ConexionBD bd = ConexionBD.getInstance();
       ObraSocial ob = new ObraSocial();
       bd.Select("*","obra_social_uso","oscod <>'"+oscod+"'");
        try {
            bd.getRs().next();
            ob = CargarPlanes(bd.getRs().getInt("oscod"),bd.getRs().getString("nombre"));   
        } catch (SQLException ex) {
            Logger.getLogger(ObraSocial.class.getName()).log(Level.SEVERE, null, ex);
        }
       return ob;
    }
    
    public ObraSocial CargarPlanes(int oscod,String nombreob) {
        ConexionBD bd = ConexionBD.getInstance();
        System.out.println("asd"+oscod);
        bd.Select("*","plan_obra_social"," obcod ='"+oscod+"'"); 
        String[] plan = new String[5];
        String nombre = nombreob;
        try{
                int i= 0;     
                while(bd.getRs().next())
                {          
                    plan[i] = bd.getRs().getString("plan");
                    i++;                  
                }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        ObraSocial nueva = new ObraSocial(nombre,plan);   
       return nueva;
    }

    

}
