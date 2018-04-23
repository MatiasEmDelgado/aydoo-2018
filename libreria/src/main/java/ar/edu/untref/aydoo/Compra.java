package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Compra {

    private ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
    private int montoTotalDeLaCompra = 0;
    private int mesDeLaCompra;

    public Compra(int mes) {
        mesDeLaCompra = mes;
    }

    public int getMontoTotalDeLaCompra() {
        for (Libro libro: librosDeLaCompra) {
            montoTotalDeLaCompra = montoTotalDeLaCompra + libro.getPrecio();
        }
        return montoTotalDeLaCompra;
    }

    public void agregarLibroAlaCompra(Libro unLibro) {
        librosDeLaCompra.add(unLibro);
    }
}
