package Modelos;

public class Medico extends Persona {
    
    String matricula;
    Receta[] recetas;

    public Medico(String matricula, Receta[] recetas, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
        this.recetas = recetas;
    }

  
    
}
