package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Venta {
    float descuento;
    String formaDePago;
    String tarjetaCredito, nbreTitularCred, direccionCred, cgoPostalCred, cgoSeguridadCred, nroTjtaCred;
    String tarjetaDebito, dniTitularDeb, nroTarjetaDeb, cgoSeguridadDeb;
    float monto;
    ArrayList<Medicamento> medicamentos = new ArrayList<>();
    Farmaceutico farmaceutico;
    Cliente cliente;
    int dia, mes, año;

    @Override
    public String toString() {
        return ""+medicamentos.get(0).nombre + '}';
    }

    public float getDescuento() {
        return descuento;
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

    
    public Venta(){
        
    }
    
    private Venta(float monto, int dia, int mes, int año) {
        this.monto = monto;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    
    
}
