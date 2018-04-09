package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Tablero {

    ArrayList<Bote> listaDeBotes = new ArrayList<>();
    ArrayList<Crucero> listaDeCruceros = new ArrayList<>();

    public ResultadoDeDisparo recibirDisparo(Posicion posicionIndicada) {
        for (Crucero crucero: listaDeCruceros) {
            if(crucero.estaEn(posicionIndicada)){
                return crucero.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBote(Bote unBote, Posicion posicion) {
        unBote.setPosicion(posicion);
        listaDeBotes.add(unBote);
    }

    public void ubicarCrucero(Crucero unCrucero, Posicion posicion) {
        unCrucero.setPosicion(posicion);
        listaDeCruceros.add(unCrucero);
    }

}