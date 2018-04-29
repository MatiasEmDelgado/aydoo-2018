package ar.edu.untref.aydoo;

public class Crucero extends Barco {

    private Posicion[] posicionesDelCrucero = new Posicion[2];
    private Direccion direccionDelCrucero = Direccion.HORIZONTAL;

    private int toquesDelCrucero = 0;

    public void setPosicion(final Posicion unaPosicion) {
        this.posicionesDelCrucero[0] = unaPosicion;
        Posicion otraPosicion = new Posicion(unaPosicion.obtenerFila(), unaPosicion.obtenerColumna());
        if (this.direccionDelCrucero == Direccion.HORIZONTAL) {
            otraPosicion.setColumna(unaPosicion.obtenerColumna() + 1);
        } else {
            otraPosicion.setFila(unaPosicion.obtenerFila() + 1);
        }
        this.posicionesDelCrucero[1] = otraPosicion;
    }

    public boolean estaEn(final Posicion unaPosicion) {
        // boolean estaEnPosicion = false;
        for (int i = 0; i < 2; i++) {
            if (unaPosicion.obtenerFila()
                    ==
                    posicionesDelCrucero[i].obtenerFila()
                    && unaPosicion.obtenerColumna()
                    == posicionesDelCrucero[i].obtenerColumna()) {
                return true;
            }
        }
        return false;
    }

    public ResultadoDeDisparo recibirDisparo() {
        this.toquesDelCrucero++;
        if (this.toquesDelCrucero == 2) {
            return ResultadoDeDisparo.HUNDIDO;
        } else {
            return ResultadoDeDisparo.TOCADO;
        }

    }

    public void setDireccionDelCrucero(Direccion direccionDelCrucero) {
        this.direccionDelCrucero = direccionDelCrucero;
    }
}

