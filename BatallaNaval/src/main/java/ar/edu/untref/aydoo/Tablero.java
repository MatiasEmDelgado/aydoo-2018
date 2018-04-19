package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Tablero {

    private int cantidadFilasDelTablero;

    private int cantidadColumnasDelTablero;

    private ArrayList<Barco> listaDeBarcos = new ArrayList<>();

    public Tablero(int cantidadFilas, int cantidadColumnas) {
        this.cantidadFilasDelTablero = cantidadFilas;
        this.cantidadColumnasDelTablero = cantidadColumnas;
    }

    public ResultadoDeDisparo recibirDisparo(final Posicion posicionIndicada) {
        for (Barco barco: listaDeBarcos) {
            if (barco.estaEn(posicionIndicada)) {
                return barco.recibirDisparo();
            }
        }
        return ResultadoDeDisparo.AGUA;
    }

    public void ubicarBarco(final Barco unBarco, final Posicion posicion) throws BatallaNavalExcepcion {
        if(posicionValidaParaElTablero(posicion)) {
            boolean barcoAgregado = false;

            if (listaDeBarcos.size() == 0) {
                barcoAgregado = true;
            } else {
                for (Barco barco : listaDeBarcos) {
                    if (!barco.estaEn(posicion)) {
                        barcoAgregado = true;
                    }
                }
            }

            if (barcoAgregado) {
                unBarco.setPosicion(posicion);
                listaDeBarcos.add(unBarco);
            } else {
                throw new BarcoEncimadoExcepcion();
            }
        } else {
            throw new BarcoFueraDelTableroExcepcion();
        }
    }

    public ArrayList<Barco> obtenerListaDeBarcos() {
        return listaDeBarcos;
    }

    public int obtenerCantidadDeFilasDelTablero() {
        return cantidadFilasDelTablero;
    }

    public int obtenerCantidadDeColumnasDelTablero() {
        return cantidadColumnasDelTablero;
    }

    private boolean posicionValidaParaElTablero(Posicion posicion) {
        if(posicion.obtenerFila() > 0
                && posicion.obtenerFila() < obtenerCantidadDeFilasDelTablero()
                && posicion.obtenerColumna() > 0
                && posicion.obtenerColumna() < obtenerCantidadDeColumnasDelTablero()) {
            return true;
        } else {
            return false;
        }
    }
}
