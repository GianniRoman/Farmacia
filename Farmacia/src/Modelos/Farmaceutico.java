
package Modelos;

public class Farmaceutico extends Persona{
    
    String nroLegajo;
    Venta ventas[];

    public Farmaceutico(String nombre, String apellido, String dni,String nroLegajo) {
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
    }
    
}
