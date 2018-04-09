package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Barco> listaDeBarcos = new ArrayList<>();
    private ArrayList<Crucero> listaDeCruceros = new ArrayList<>();

    public ResultadoDeDisparo recibirDisparo(final Posicion posicionIndicada) {
        for (Barco barco: listaDeBarcos) {
            if (barco.estaEn(posicionIndicada)) {
                return barco.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBarco(final Barco unBarco, final Posicion posicion) {
        unBarco.setPosicion(posicion);
        listaDeBarcos.add(unBarco);
    }
}
