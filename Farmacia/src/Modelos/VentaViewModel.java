/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.Principal;

/**
 *
 * @author glupi
 */
public class VentaViewModel {
   int dia, mes, año, mcod, vcant;
   Medicamento med;
   String fnbre, fapll, lote, mnbre, vcod, fcod;
   float monto, mprecio;
   
   ArrayList<VentaViewModel> vtas = new ArrayList<>();
   ConexionBD bd = ConexionBD.getInstance();
   
   public void iniciarFiltrado(){
        bd.Select("*", "venta , ticket, stock, medicamento, farmaceutico", "venta.vcod=ticket.vcod and venta.fcod=farmaceutico.fcod and ticket.lote=stock.lote and stock.mcod=medicamento.mcod");
       try {
           while(bd.getRs().next()){
               VentaViewModel aux = new VentaViewModel();
               aux.dia = bd.getRs().getInt("dia");
               aux.mes = bd.getRs().getInt("mes");
               aux.año = bd.getRs().getInt("año");
               aux.fnbre = bd.getRs().getString("fnbre");
               aux.fapll = bd.getRs().getString("fapll");
               aux.fcod = bd.getRs().getString("fcod");
               aux.vcant = bd.getRs().getInt("vcant");
               aux.vcod = bd.getRs().getString("vcod");
               aux.lote = bd.getRs().getString("lote");
               aux.mnbre = bd.getRs().getString("mnbre");
               aux.mcod = bd.getRs().getInt("mcod");
               aux.mprecio = bd.getRs().getFloat("mprecio");
               aux.monto = bd.getRs().getInt("vcant") * bd.getRs().getFloat("mprecio");
               this.vtas.add(aux);
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(VentaViewModel.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void filtrarDia (Date diaMesAño){
       int fdia = diaMesAño.getDate();
       int fmes = diaMesAño.getMonth()+1;
       int faño = diaMesAño.getYear()+1900;
       int cant = this.vtas.size();
       int i;
       VentaViewModel aux;
       for(i=cant-1;i>=0;i--){
           aux = (VentaViewModel) vtas.get(i);
           if(aux.dia != fdia || aux.mes != fmes || aux.año != faño){
               vtas.remove(i);
           }
       }
   }
   
   public void filtrarMes (int month){
       int fmes = month+1;
       int cant=this.vtas.size();
       int i;
       VentaViewModel aux;
       for(i=cant-1; i>=0; i--){
           aux = (VentaViewModel) vtas.get(i);
           if(aux.mes != fmes){
               vtas.remove(i);
           }
       }
   }
   
   public void filtrarAño (int year){
       int faño = year;
       int cant= this.vtas.size();
       int i;
       VentaViewModel aux;
       for(i = cant-1; i>=0; i--){
           aux= (VentaViewModel) vtas.get(i);
           if(aux.año != faño){
               vtas.remove(i);
           }
       }
   }
   
   public void filtrarFarmaceutico(String farcod){
       String ftrcod = farcod;
       System.out.println(ftrcod);
       int cant = this.vtas.size();
       int i;
       VentaViewModel aux;
       for(i=cant-1; i>=0; i--){
           aux = (VentaViewModel) vtas.get(i);
           if(!(aux.fcod.equals(ftrcod))){
               vtas.remove(i);
           }
       }
   }
   
   public ArrayList iniciarTablaVentas(){
       ArrayList <VentaViewModel> aux = new ArrayList<>();
       bd.Select("ticket.lote, mnbre, vcant, mprecio, fnbre, fapll, venta.vcod", "venta , ticket, stock, medicamento, farmaceutico", "venta.vcod=ticket.vcod and venta.fcod=farmaceutico.fcod and ticket.lote=stock.lote and stock.mcod=medicamento.mcod");
       try {
           while(bd.getRs().next()){
               VentaViewModel auxvm = new VentaViewModel();
               auxvm.vcod = bd.getRs().getString("vcod");
               auxvm.lote = bd.getRs().getString("lote");
               auxvm.mnbre = bd.getRs().getString("mnbre");
               auxvm.vcant = bd.getRs().getInt("vcant");
               auxvm.mprecio = bd.getRs().getFloat("mprecio");
               auxvm.fnbre = bd.getRs().getString("fnbre");
               auxvm.fapll = bd.getRs().getString("fapll");
               aux.add(auxvm);
           }
       } catch (SQLException ex) {
           Logger.getLogger(VentaViewModel.class.getName()).log(Level.SEVERE, null, ex);
       }
       return aux;
   }
   
   public ArrayList cargarFarmaceuticos(){
       ArrayList <Farmaceutico> frm = new ArrayList<>();
       
       try{
            
            bd.Select("*","farmaceutico","");
            while(bd.getRs().next())
            {
                    String nbre = bd.getRs().getString("fnbre");
                    String apellido = bd.getRs().getString("fapll");
                    String cod = bd.getRs().getString("fcod");
                    String dni = bd.getRs().getString("fdni");
                    Farmaceutico aux = new Farmaceutico(nbre,apellido,dni,cod);
                    frm.add(aux);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return frm;
   }

    public int getVcant() {
        return vcant;
    }

    public String getFnbre() {
        return fnbre;
    }

    public String getFapll() {
        return fapll;
    }

    public String getLote() {
        return lote;
    }

    public String getMnbre() {
        return mnbre;
    }

    public float getMonto() {
        return monto;
    }

    public float getMprecio() {
        return mprecio;
    }

    public ArrayList<VentaViewModel> getVtas() {
        return vtas;
    }

    public String getVcod() {
        return vcod;
    }

    
    @Override
    public String toString() {
        return "VentaViewModel{" + "vcod=" + vcod + ", lote=" + lote + '}';
    }
   
   
}

