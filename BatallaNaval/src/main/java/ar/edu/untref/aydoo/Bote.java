package ar.edu.untref.aydoo;

public class Bote extends Barco{

    private Posicion posicionDelBote;

    public void setPosicion(Posicion unaPosicion) {
        this.posicionDelBote = unaPosicion;
    }

    public boolean estaEn(Posicion unaPosicion) {
        if(unaPosicion.obtenerFila() == posicionDelBote.obtenerFila() && unaPosicion.obtenerColumna() == posicionDelBote.obtenerColumna()) {
            return true;
        }else{
            return false;
        }
    }

    public ResultadoDeDisparo recibirDisparo() {

        return ResultadoDeDisparo.HUNDIDO;
    }

}