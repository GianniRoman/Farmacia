package Modelos;

import Conexion.ConexionBD;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Medicamento {
    String codigo;
    String marca;
    String nombre;
    String frmaFarmaceutica;
    float precio;
    String presentacion;
    Date vencimiento;
    Lote[] lotes;
    Receta receta;
    Stock stock;
    Droga[] drogas;
    Drogueria drogueria;
    Venta venta;

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFrmaFarmaceutica() {
        return frmaFarmaceutica;
    }

    public void setFrmaFarmaceutica(String frmaFarmaceutica) {
        this.frmaFarmaceutica = frmaFarmaceutica;
    }

    

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Lote[] getLotes() {
        return lotes;
    }

    public void setLotes(Lote[] lotes) {
        this.lotes = lotes;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Droga[] getDrogas() {
        return drogas;
    }

    public void setDrogas(Droga[] drogas) {
        this.drogas = drogas;
    }

    public Drogueria getDrogueria() {
        return drogueria;
    }

    public void setDrogueria(Drogueria drogueria) {
        this.drogueria = drogueria;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public ArrayList<Medicamento> TraerMedicamentosDeVenta(String vcod) {
        ConexionBD db = ConexionBD.getInstance();
        ArrayList <Medicamento> aMed = new ArrayList<>();
        db.Select("lote","ticket","ticket.vcod ="+vcod+"");
        String[] lotes = new String[50];
        int[] mcods = new int[50];
        int i = 0;
        int iterMed = 0;
        try {
            while(db.getRs().next()){
                lotes[i] = db.getRs().getString("lote");
                i++;
                }
            int cantLotes = lotes.length;
            i = 0;
            while(cantLotes > 0){
               db.Select("mcod","stock","lote ='"+lotes[i]+"'");
               i++;
               cantLotes--;
            while(db.getRs().next()){
                   mcods[iterMed] = db.getRs().getInt("mcod");
                   iterMed++;
               }
             }
            int cantMed = mcods.length;
            i=0;
            while(cantMed>0)
            {
                db.Select("mnbre,mmarca,mpres","medicamento","mcod ='"+mcods[i]+"'");
                if(db.getRs().next())
                {
                    Medicamento aux = new Medicamento();
                    aux.nombre = db.getRs().getString("mnbre");
                    aux.marca = db.getRs().getString("mmarca");
                    aux.presentacion = db.getRs().getString("mpres");
                    aMed.add(aux);
                }
                cantMed--;
                i++;
            }             
            }catch (SQLException ex) {
            Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aMed;
    }
    
     @Override
    public String toString() {
        return nombre+"";
    }

    public String ObtenerLoteDeMedicamento(int mcod) {
       ConexionBD db = ConexionBD.getInstance();
       db.Select("lote","stock","mcod ="+mcod+""); 
       String lote = null;
        try {
            db.getRs().next();
            lote= db.getRs().getString("lote");
        } catch (SQLException ex) {
            Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lote;
    }
   
    
}
