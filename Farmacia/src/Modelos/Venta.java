package Modelos;

import Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Venta {
    float descuento;
    String formaDePago;
    float monto;
    Medicamento[] medicamentos;
    Farmaceutico farmaceutico;
    Cliente cliente;
    int dia, mes, año;

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

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento[] medicamentos) {
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

    
    public Venta(){
        
    }
    
    private Venta(float monto, int dia, int mes, int año) {
        this.monto = monto;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    
    
}
