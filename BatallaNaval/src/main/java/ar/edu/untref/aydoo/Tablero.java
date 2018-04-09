package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Tablero {

    ArrayList<Bote> listaDeBotes = new ArrayList<>();

    public ResultadoDeDisparo recibirDisparo(Posicion posicionIndicada) {
        for (Bote bote: listaDeBotes) {
            if(bote.estaEn(posicionIndicada)){
                return bote.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBote(Bote unBote, Posicion posicion) {
        unBote.setPosicion(posicion);
        listaDeBotes.add(unBote);
    }


}