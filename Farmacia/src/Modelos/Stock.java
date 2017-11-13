package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stock {
    int existencias, nroLote;
    Date venc;
    String mcod;
    int stockMinimo;
    Medicamento[] medicamentos;

    public Stock() {
        
    }
    
    public static void actualizarStock(String lote,int cant){
        int cantInicial = 0;
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("cant", "stock", "lote ='"+lote+"'");
        try {
            if(bd.getRs().next()){
                cantInicial = bd.getRs().getInt("cant");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
        cant = cant + cantInicial;
        bd.Update("stock", "cant ="+cant, "lote='"+lote+"'");
    }
    
    public static void cargarStock (String lote,Date venc,String mcod, int cant){
        ConexionBD bd = ConexionBD.getInstance();
        int dia = venc.getDate();
        int mes = venc.getMonth()+1;
        int año = venc.getYear()+1900;
        bd.Insert("stock","'"+lote+"','"+mcod+"',"+cant+",'"+dia+"/"+mes+"/"+año+"'");
    }
}
