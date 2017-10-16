/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
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
                aux.mcod = bd.getRs().getString("mcod");
                aux.mNbre = bd.getRs().getString("mnbre");
                aux.mGenerico = bd.getRs().getString("mgen");
                aux.mprecio = bd.getRs().getFloat("mprecio");
                aux.mMarca = bd.getRs().getString("mmarca");
                aux.mFormFarmac = bd.getRs().getString("mfmafarmc");
                aux.mPresentacion = bd.getRs().getString("mpres");
                aux.existencias = bd.getRs().getInt("cant");
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
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentoViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }

    public Medicamento getMedic() {
        return medic;
    }

    public String getmNbre() {
        return mNbre;
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
    
    public void actualizarExistencias(int existencias, String mcod) {
        this.existencias = existencias;
        bd.Update("stock","cant = '"+existencias+"'" , "mcod = '"+mcod+"'");
    }
    
    

    @Override
    public String toString() {
        return ""+ mNbre;
    }
    
    
}
