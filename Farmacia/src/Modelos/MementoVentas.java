package Modelos;

import java.util.ArrayList;

public class MementoVentas {
    //Objeto que vamos a guardar el estado.
    Venta estado = new Venta();
    
    public MementoVentas(float descuento, int oscod, String formaDePago, String tarjetaCredito, String nbreTitularCred, String direccionCred, String cgoSeguridadCred, String nroTjtaCred, String tarjetaDebito, String dniTitularDeb, String nroTarjetaDeb, String cgoSeguridadDeb, float monto, int fcod, Cliente cliente, int dia, int mes, int año,ArrayList medicamentos) //Constructor de momento para el objeto Ventas.
    {
        estado.setDescuento(descuento);
        estado.setOscod(oscod);
        estado.setFormaDePago(formaDePago);
        estado.setTarjetaCredito(tarjetaCredito);
        estado.setNbreTitularCred(nbreTitularCred);
        estado.setDireccionCred(direccionCred);
        estado.setCgoSeguridadCred(cgoSeguridadCred);
        estado.setNroTjtaCred(nroTjtaCred);
        estado.setTarjetaDebito(tarjetaDebito);
        estado.setDniTitularDeb(dniTitularDeb);
        estado.setNroTarjetaDeb(nroTarjetaDeb);
        estado.setCgoSeguridadDeb(cgoSeguridadDeb);
        estado.setMonto(monto);
        estado.setFcod(fcod);
        estado.setCliente(cliente);
        estado.setDia(dia);
        estado.setMes(mes);
        estado.setAño(año);
        estado.setMedicamentos(medicamentos);
    }

    public Venta getEstado() // Retorno de momento del objeto Ventas.
    {
        return estado; 
    }
    
}
