package Modelos;


public class Cliente extends Persona{
    int NumeroCliente;
    ObraSocial[] obrasSociales;
    Receta[] recetas;
    Venta[] ventas;

    public Cliente(int NumeroCliente, ObraSocial[] obrasSociales, Receta[] recetas, Venta[] ventas, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.NumeroCliente = NumeroCliente;
        this.obrasSociales = obrasSociales;
        this.recetas = recetas;
        this.ventas = ventas;
    }
    

   

    
}
