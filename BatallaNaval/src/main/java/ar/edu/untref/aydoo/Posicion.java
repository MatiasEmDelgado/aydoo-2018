package ar.edu.untref.aydoo;

public class Posicion {

    private final int fila;
    private final int columna;

    public Posicion(final int fila, final int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int obtenerFila() {
        return this.fila;
    }

    public int obtenerColumna() {
        return this.columna;
    }
}
