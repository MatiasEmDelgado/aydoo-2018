package ar.edu.untref.aydoo;

public class Posicion {

    private int fila;
    private int columna;


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

    public void setFila(int coordenadaFila) {
        this.fila = coordenadaFila;
    }

    public void setColumna(int coordenadaColumna) {
        this.columna = coordenadaColumna;
    }
}
