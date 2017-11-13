package Modelos;

import java.util.ArrayList;
/*  Implmentacion de patron de diseño "Memento".
    Esta clase sirve de conserje para la clase memento. Es la que entrega los distintos estados guardados en el recorrido del sistema.
*/
public class Conserje {
    private ArrayList<MementoVentas> estadosSalvados = new ArrayList<MementoVentas>(); //ArrayList que guarda cada momento.

    public ArrayList<MementoVentas> getEstadosSalvados() {
        return estadosSalvados;
    }

    public void setEstadosSalvados(ArrayList<MementoVentas> estadosSalvados) {
        this.estadosSalvados = estadosSalvados;
    }
    
    public void setMemento(MementoVentas m){ //Guardamos un momento
        estadosSalvados.add(m);
    }
    
    public void ActualizarMomento(int index,MementoVentas vta)
    {
        estadosSalvados.set(index,vta);
    }
    
    public MementoVentas getMemento(int index){ //Retomamos a un momento
        return estadosSalvados.get(index); 
    }
    
}
