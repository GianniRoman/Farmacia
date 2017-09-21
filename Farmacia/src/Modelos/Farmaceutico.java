
package Modelos;

public class Farmaceutico extends Persona{
    
    int nroLegajo;
    Venta ventas[];

    public Farmaceutico(String nombre, String apellido, int dni,int nroLegajo,Venta[] ventas) {
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
        this.ventas = ventas;
    }
    
}
