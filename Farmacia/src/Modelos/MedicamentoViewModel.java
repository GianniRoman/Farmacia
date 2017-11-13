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

/**
 *
 * @author glupi
 */
public class MedicamentoViewModel {
    String lote, mNbre, mMarca, mLab, mGenerico, mFormFarmac, mPresentacion, mcod;
    int existencias;
    float mprecio;
    boolean mBajoReceta;
    Date vto;
    Medicamento medic = new Medicamento();
    ArrayList <MedicamentoViewModel> med = new ArrayList<>();
    ConexionBD bd = ConexionBD.getInstance();
    
    public ArrayList buscarMedicamento (String buscado){
        String cercano = "%"+buscado+"%";
        bd.Select("*", "stock, medicamento", "stock.mcod = medicamento.mcod and (mnbre like '"+cercano+"' or mgen like '"+cercano+"')");
        int cont = 0;
        try{
            while(bd.getRs().next() && cont<5){
                MedicamentoViewModel aux = new MedicamentoViewModel();
                Medicamento auxm = new Medicamento();
                    if(bd.getRs().getInt("cant")>0){
                        aux.mcod = bd.getRs().getString("mcod");
                        aux.mNbre = bd.getRs().getString("mnbre");
                        aux.mGenerico = bd.getRs().getString("mgen");
                        aux.mLab = bd.getRs().getString("mlab");
                        aux.mprecio = bd.getRs().getFloat("mprecio");
                        aux.mMarca = bd.getRs().getString("mmarca");
                        aux.mFormFarmac = bd.getRs().getString("mfmafarmc");
                        aux.mPresentacion = bd.getRs().getString("mpres");
                        aux.existencias = bd.getRs().getInt("cant");
                        aux.lote = bd.getRs().getString("lote");
                        aux.vto = bd.getRs().getDate("mvenc");
                        auxm.setNombre(aux.mNbre);
                        auxm.setMarca(aux.mMarca);
                        auxm.setPrecio(aux.mprecio);
                        auxm.setPresentacion(aux.mPresentacion);
                        auxm.setFrmaFarmaceutica(aux.mFormFarmac);
                        auxm.setCodigo(aux.mcod);
                        System.out.println("medicamento auxm : "+ auxm.getNombre());
                        aux.medic = auxm;
                        /*
                        aux.medic.setNombre(mNbre);
                        aux.medic.setGenerico(mGenerico);
                        aux.medic.setPrecio(mprecio);
                        aux.medic.setMarca(mMarca);
                        aux.medic.setPresentacion(mPresentacion);
                        aux.medic.setFrmaFarmaceutica(mFormFarmac);
                        aux.medic.setCodigo(mcod);
                        */
                        this.med.add(aux);
                        System.out.println("medicamento en aux:"+aux.getMedic().getNombre());
                        System.out.println("medicamento en array"+med.get(0).getMedic().getNombre());
                        cont ++;
                        for(int i = 0; i<this.med.size(); i++){
                            if(aux.mcod.equals(med.get(i).mcod)){
                                if(aux.vto.before(med.get(i).getVto())){//si el vencimiento del que ingrese es anterior al existente
                                    this.med.remove(i);//quito el existente
                                    cont--;//resto el contador en uno
                                }else{
                                    if(med.get(i).vto.before(aux.vto)){//si la fecha de vencimiento del que ingrese es posterior al existente
                                        this.med.remove(cont-1);//borro el que agregue
                                        cont--;//resto el contador en uno
                                    }
                                }
                            }
                        }
                    }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentoViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }
    
    public ArrayList buscarMedicamentoSinStock(String buscado){
        int cont = 0;
        String cercano = "%"+buscado+"%";
        bd.Select("*", "medicamento", "(mnbre like '"+cercano+"' or mgen like '"+cercano+"')");
        try{
            while(bd.getRs().next() && cont<5){
                    MedicamentoViewModel aux = new MedicamentoViewModel();
                    aux.mcod = bd.getRs().getString("mcod");
                    aux.mNbre = bd.getRs().getString("mnbre");
                    aux.mGenerico = bd.getRs().getString("mgen");
                    aux.mLab = bd.getRs().getString("mlab");
                    aux.mprecio = bd.getRs().getFloat("mprecio");
                    aux.mMarca = bd.getRs().getString("mmarca");
                    aux.mFormFarmac = bd.getRs().getString("mfmafarmc");
                    aux.mPresentacion = bd.getRs().getString("mpres");
                    aux.medic.setNombre(mNbre);
                    aux.medic.setPrecio(mprecio);
                    aux.medic.setMarca(mMarca);
                    aux.medic.setPrecio(mprecio);
                    aux.medic.setPresentacion(mPresentacion);
                    aux.medic.setFrmaFarmaceutica(mFormFarmac);
                    aux.medic.setCodigo(mcod);
                    this.med.add(aux);
                    cont ++;
                }
            }
         catch (SQLException ex) {
            Logger.getLogger(MedicamentoViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }
    
    public static boolean loteValido(String lote){
        ConexionBD bd = ConexionBD.getInstance();
        bd.Select("lote", "Stock", "");
        try {
            while(bd.getRs().next()){
                if(bd.getRs().getString("lote").equals(lote)){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentoViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public Medicamento getMedic() {
        return medic;
    }

    public String getLote() {
        return lote;
    }

    public Date getVto() {
        return vto;
    }

    public String getmNbre() {
        return mNbre;
    }

    public String getmLab() {
        return mLab;
    }

    public String getmMarca() {
        return mMarca;
    }

    public String getmGenerico() {
        return mGenerico;
    }

    public String getmFormFarmac() {
        return mFormFarmac;
    }

    public String getmPresentacion() {
        return mPresentacion;
    }

    public float getMprecio() {
        return mprecio;
    }

    public int getExistencias() {
        return existencias;
    }

    public String getMcod() {
        return mcod;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void actualizarExistencias(int existencias, String lote) {
        this.existencias = existencias;
        bd.Update("stock","cant = '"+existencias+"'" , "lote = '"+lote+"'");
    }
    
    

    @Override
    public String toString() {
        return ""+ mNbre;
    }

    private void setMedic(Medicamento medic) {
        this.medic = medic;
    }
    
    
}
