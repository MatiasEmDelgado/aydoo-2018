package ar.edu.untref.aydoo;

public abstract class Barco {
    private Posicion posicionDelBote;

    public abstract void setPosicion(Posicion unaPosicion);

    public abstract boolean estaEn(Posicion unaPosicion);

    public abstract ResultadoDeDisparo recibirDisparo();

}
