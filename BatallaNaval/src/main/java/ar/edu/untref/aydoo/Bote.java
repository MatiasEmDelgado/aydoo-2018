package ar.edu.untref.aydoo;

public class Bote extends Barco{

    private Posicion posicionDelBote;

    public void setPosicion(Posicion unaPosicion) {

    }

    public boolean estaEn(Posicion unaPosicion) {
        return true;
    }

    public ResultadoDeDisparo recibirDisparo() {
        return ResultadoDeDisparo.HUNDIDO;
    }

}