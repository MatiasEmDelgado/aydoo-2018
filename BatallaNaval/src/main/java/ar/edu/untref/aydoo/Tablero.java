package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Barco> listaDeBarcos = new ArrayList<>();

    public ResultadoDeDisparo recibirDisparo(final Posicion posicionIndicada) {
        for (Barco barco: listaDeBarcos) {
            if (barco.estaEn(posicionIndicada)) {
                return barco.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBarco(final Barco unBarco, final Posicion posicion) throws BarcoEncimadoExcepcion {
        boolean barcoAgregado = false;
        if(listaDeBarcos.size() == 0) {
            unBarco.setPosicion(posicion);
            listaDeBarcos.add(unBarco);
            barcoAgregado = true;
        }
        for (Barco barco: listaDeBarcos) {
            if(!barco.estaEn(posicion)) {
                unBarco.setPosicion(posicion);
                listaDeBarcos.add(unBarco);
                barcoAgregado = true;
            }
        }
        if (!barcoAgregado){
            throw new BarcoEncimadoExcepcion();
        }
    }
}
