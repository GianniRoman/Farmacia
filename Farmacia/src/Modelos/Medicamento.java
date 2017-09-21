package Modelos;

import java.sql.Date;

public class Medicamento {
    String marca;
    String nombre;
    float precio;
    int presentacion;
    Date vencimiento;
    Lote[] lotes;
    Receta receta;
    Stock stock;
    Droga[] drogas;
    Drogueria drogueria;
    Venta venta;

    public Medicamento() {
    }
    
}
