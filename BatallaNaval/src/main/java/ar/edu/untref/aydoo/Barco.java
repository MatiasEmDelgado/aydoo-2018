package ar.edu.untref.aydoo;

public abstract class Barco {

    public abstract void setPosicion(Posicion unaPosicion);

    public abstract boolean estaEn(Posicion unaPosicion);

    public abstract ResultadoDeDisparo recibirDisparo();

}
