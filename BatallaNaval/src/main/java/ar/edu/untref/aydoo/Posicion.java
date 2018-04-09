package ar.edu.untref.aydoo;

public class Posicion {

    private final int fila;
    private final int columna;

    public Posicion(final int coordenadaFila, final int coordenadaColumna) {
        this.fila = coordenadaFila;
        this.columna = coordenadaColumna;
    }

    public int obtenerFila() {
        return this.fila;
    }

    public int obtenerColumna() {
        return this.columna;
    }
}
