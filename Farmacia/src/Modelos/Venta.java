package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Venta {
    float descuento;
    int oscod;
    String formaDePago;
    String tarjetaCredito, nbreTitularCred, direccionCred, cgoPostalCred, cgoSeguridadCred, nroTjtaCred;
    String tarjetaDebito, dniTitularDeb, nroTarjetaDeb, cgoSeguridadDeb;
    float monto;
    int fcod;
    ArrayList<Medicamento> medicamentos = new ArrayList<>();
    Farmaceutico farmaceutico = new Farmaceutico(null,null,null,null);
    Cliente cliente;
    int dia, mes, año;

    
public void registrarVenta(){
    int i = this.medicamentos.size()-1;
    Medicamento med;
    ConexionBD bd = ConexionBD.getInstance();
    bd.Select("vcod","venta","");
    String lote = null;
    int cantVentas = 0;
        try {
            
            while(bd.getRs().next())
            {
               cantVentas++; 
            }
            System.out.println("cantidad de ventas "+cantVentas);
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        if(this.cliente == null){
        bd.Insert("venta(vcod,vtotal,vfrmpgo,vdesc,fcod,dia,mes,año)","'"+cantVentas+"','"+monto+"','"+formaDePago+"','"+descuento+"','"+fcod+"',"+dia+","+mes+""+","+año+"" );
        while(i>=0){
             med = medicamentos.get(i);
             int mcod = Integer.parseInt(med.codigo);
             lote = med.ObtenerLoteDeMedicamento(mcod);
             System.out.println(cantVentas + "  " + lote);
             bd.Insert("ticket (vcod, lote, vcant)",""+cantVentas+",'"+lote+"',"+1+"");
             medicamentos.remove(i);
             i--;
        }
    }else{
            System.out.println("codigo cliete"+ cliente.getNumeroCliente());
            bd.Insert("venta(vcod,vtotal,vfrmpgo,vdesc,fcod,ccod,oscod,dia,mes,año)","'"+cantVentas+"','"+monto+"','"+formaDePago+"','"+descuento+"','"+fcod+"','"+cliente.getNumeroCliente()+"',"+oscod+","+dia+","+mes+","+año+"" );
            while(i>=0){
             med = medicamentos.get(i);
             int mcod = Integer.parseInt(med.codigo);
             lote = med.ObtenerLoteDeMedicamento(mcod);
             bd.Insert("ticket (vcod, lote, vcant)",""+cantVentas+",'"+lote+"',"+1+"");
             medicamentos.remove(i);
             i--;
        }
        }
}
    @Override
    public String toString() {
        return ""+medicamentos.get(0).nombre + '}';
    }

    public float getDescuento() {
        return descuento;
    }

    public void setFcod(int fcod) {
        this.fcod = fcod;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNbreTitularCred() {
        return nbreTitularCred;
    }

    public void setNbreTitularCred(String nbreTitularCred) {
        this.nbreTitularCred = nbreTitularCred;
    }

    public String getDireccionCred() {
        return direccionCred;
    }

    public void setDireccionCred(String direccionCred) {
        this.direccionCred = direccionCred;
    }

    public String getCgoPostalCred() {
        return cgoPostalCred;
    }

    public void setCgoPostalCred(String cgoPostalCred) {
        this.cgoPostalCred = cgoPostalCred;
    }

    public String getCgoSeguridadCred() {
        return cgoSeguridadCred;
    }

    public void setCgoSeguridadCred(String cgoSeguridadCred) {
        this.cgoSeguridadCred = cgoSeguridadCred;
    }

    public String getNroTjtaCred() {
        return nroTjtaCred;
    }

    public void setNroTjtaCred(String nroTjtaCred) {
        this.nroTjtaCred = nroTjtaCred;
    }

    public String getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(String tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public String getDniTitularDeb() {
        return dniTitularDeb;
    }

    public void setDniTitularDeb(String dniTitularDeb) {
        this.dniTitularDeb = dniTitularDeb;
    }

    public String getNroTarjetaDeb() {
        return nroTarjetaDeb;
    }

    public void setNroTarjetaDeb(String nroTarjetaDeb) {
        this.nroTarjetaDeb = nroTarjetaDeb;
    }

    public String getCgoSeguridadDeb() {
        return cgoSeguridadDeb;
    }

    public void setCgoSeguridadDeb(String cgoSeguridadDeb) {
        this.cgoSeguridadDeb = cgoSeguridadDeb;
    }

    public void setOscod(int oscod) {
        this.oscod = oscod;
    }

    
    public Venta(){
        
    }
    
    private Venta(float monto, int dia, int mes, int año) {
        this.monto = monto;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    
    
}
