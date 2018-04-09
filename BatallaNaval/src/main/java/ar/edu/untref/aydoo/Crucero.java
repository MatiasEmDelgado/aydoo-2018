package ar.edu.untref.aydoo;

public class Crucero extends Barco{

    private Posicion posicionDelCrucero;
    private int toquesDelCrucero = 0;

    public void setPosicion(Posicion unaPosicion) {
        this.posicionDelCrucero = unaPosicion;
    }

    public boolean estaEn(Posicion unaPosicion) {
        return true;
    }

    public ResultadoDeDisparo recibirDisparo() {
        this.toquesDelCrucero++;
        if(this.toquesDelCrucero == 2){
            return ResultadoDeDisparo.HUNDIDO;
        }else{
            return ResultadoDeDisparo.TOCADO;
        }

    }
}
