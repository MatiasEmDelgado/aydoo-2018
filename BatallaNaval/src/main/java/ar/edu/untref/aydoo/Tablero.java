package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Tablero {

    ArrayList<Barco> listaDeBarcos = new ArrayList<>();
    ArrayList<Crucero> listaDeCruceros = new ArrayList<>();

    public ResultadoDeDisparo recibirDisparo(Posicion posicionIndicada) {
        for (Barco barco: listaDeBarcos) {
            if(barco.estaEn(posicionIndicada)){
                return barco.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBarco(Barco unBarco, Posicion posicion) {
        unBarco.setPosicion(posicion);
        listaDeBarcos.add(unBarco);
    }
}