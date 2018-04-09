package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Crucero extends Barco{
    private Posicion[] posicionesDelCrucero = new Posicion[2];

    private int toquesDelCrucero = 0;

    public void setPosicion(Posicion unaPosicion) {
        this.posicionesDelCrucero[0] = unaPosicion;
        Posicion pocicionIncrementadaEnUno = new Posicion(unaPosicion.obtenerFila() + 1, unaPosicion.obtenerColumna() + 1);
        this.posicionesDelCrucero[1] = pocicionIncrementadaEnUno;
    }

    public boolean estaEn(Posicion unaPosicion) {
      // boolean estaEnPosicion = false;
       for(int i = 0; i<2;i++) {
           if (unaPosicion.obtenerFila() == posicionesDelCrucero[i].obtenerFila() && unaPosicion.obtenerColumna() == posicionesDelCrucero[i].obtenerColumna()) {
               return true;
           }
       }
       return false;
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
