package ar.edu.untref.aydoo;

public class Bote extends Barco {

    private Posicion posicionDelBote;

    public void setPosicion(final Posicion unaPosicion) {
        this.posicionDelBote = unaPosicion;
    }

    public boolean estaEn(final Posicion unaPosicion) {
        return unaPosicion.obtenerFila() == posicionDelBote.obtenerFila()
         &&
         unaPosicion.obtenerColumna() == posicionDelBote.obtenerColumna();
    }

    public ResultadoDeDisparo recibirDisparo() {

        return ResultadoDeDisparo.HUNDIDO;
    }

}
