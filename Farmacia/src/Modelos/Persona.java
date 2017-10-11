package Modelos;
public class Persona {
    String nombre;
    String apellido;
    String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    
    
}
