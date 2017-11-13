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
    String tarjetaCredito, nbreTitularCred, direccionCred, cgoSeguridadCred, nroTjtaCred;
    String tarjetaDebito, dniTitularDeb, nroTarjetaDeb, cgoSeguridadDeb;
    float monto;
    int fcod;
    ArrayList<Medicamento> medicamentos = new ArrayList<>();
    Farmaceutico farmaceutico = new Farmaceutico(null,null,null,null);
    Cliente cliente;
    int dia, mes, año;

    public void setState(Venta estado){
      //Atributos del paso 1
      this.medicamentos = estado.medicamentos;
      this.dia = estado.dia;
      this.mes = estado.mes;
      this.año = estado.año;
      //Atributos del paso 2
      this.descuento = estado.descuento;
      this.monto = estado.monto;
      this.formaDePago = estado.formaDePago;
      this.tarjetaCredito = estado.tarjetaCredito;
      this.tarjetaDebito = estado.tarjetaDebito;
      this.nbreTitularCred = estado.nbreTitularCred;
      this.direccionCred = estado.direccionCred;
      this.cgoSeguridadCred = estado.cgoSeguridadCred;
      this.cgoSeguridadDeb = estado.cgoSeguridadDeb;
      this.nroTarjetaDeb = estado.nroTarjetaDeb;
      this.nroTjtaCred = estado.nroTjtaCred;
      this.dniTitularDeb = estado.dniTitularDeb;
      //atributos del paso 3
      this.oscod = estado.oscod; 
      this.farmaceutico = estado.farmaceutico;
      this.fcod = estado.fcod;
      this.cliente = estado.cliente;
  
   }
 
   public MementoVentas guardarEstadoToMemento(){
      return new MementoVentas(descuento,oscod,formaDePago,tarjetaCredito,nbreTitularCred,direccionCred,cgoSeguridadCred,nroTjtaCred,tarjetaDebito,dniTitularDeb,nroTarjetaDeb,cgoSeguridadDeb,monto,fcod,cliente,dia,mes,año,medicamentos);
   }

    public Venta(float descuento, int oscod, String formaDePago, String tarjetaCredito, String nbreTitularCred, String direccionCred, String cgoSeguridadCred, String nroTjtaCred, String tarjetaDebito, String dniTitularDeb, String nroTarjetaDeb, String cgoSeguridadDeb, float monto, int fcod, Cliente cliente, int dia, int mes, int año,ArrayList medicamentos) {
        this.descuento = descuento;
        this.oscod = oscod;
        this.formaDePago = formaDePago;
        this.tarjetaCredito = tarjetaCredito;
        this.nbreTitularCred = nbreTitularCred;
        this.direccionCred = direccionCred;
        this.cgoSeguridadCred = cgoSeguridadCred;
        this.nroTjtaCred = nroTjtaCred;
        this.tarjetaDebito = tarjetaDebito;
        this.dniTitularDeb = dniTitularDeb;
        this.nroTarjetaDeb = nroTarjetaDeb;
        this.cgoSeguridadDeb = cgoSeguridadDeb;
        this.monto = monto;
        this.fcod = fcod;
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.medicamentos = medicamentos;
    }
   
   public void getStateFromMemento(MementoVentas Memento){
      Memento.getEstado();
       //Atributos del paso 1
      this.medicamentos = Memento.getEstado().medicamentos;
      //Atributos del paso 2
      this.descuento = Memento.getEstado().descuento;
      this.monto = Memento.getEstado().monto;
      this.formaDePago = Memento.getEstado().formaDePago;
      this.tarjetaCredito = Memento.getEstado().tarjetaCredito;
      this.tarjetaDebito = Memento.getEstado().tarjetaDebito;
      this.nbreTitularCred = Memento.getEstado().nbreTitularCred;
      this.direccionCred = Memento.getEstado().direccionCred;
      this.cgoSeguridadCred = Memento.getEstado().cgoSeguridadCred;
      this.cgoSeguridadDeb = Memento.getEstado().cgoSeguridadDeb;
      this.nroTarjetaDeb = Memento.getEstado().nroTarjetaDeb;
      this.nroTjtaCred = Memento.getEstado().nroTjtaCred;
      this.dniTitularDeb = Memento.getEstado().dniTitularDeb;
      //atributos del paso 3
      this.oscod = Memento.getEstado().oscod; 
      this.farmaceutico = Memento.getEstado().farmaceutico;
      this.fcod = Memento.getEstado().fcod;
      this.cliente = Memento.getEstado().cliente;
      this.dia = Memento.getEstado().dia;
      this.mes = Memento.getEstado().mes;
      this.año = Memento.getEstado().año;
   }
      
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
