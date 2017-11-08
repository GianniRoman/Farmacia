package Modelos;

import Conexion.ConexionBD;
import java.util.Date;

public class Stock {
    int existencias, nroLote;
    Date venc;
    String mcod;
    int stockMinimo;
    Medicamento[] medicamentos;

    public Stock() {
        
    }
    
    public static void cargarStock(String mcod, Date venc, String nroLote, int cant){
        ConexionBD bd = ConexionBD.getInstance();
        int dia = venc.getDate();
        int mes = venc.getMonth()+1;
        int año = venc.getYear()+1900;
        bd.Insert("stock", "'"+nroLote+"','"+mcod+"',"+cant+",'"+dia+"/"+mes+"/"+año+"'");
    }
}
