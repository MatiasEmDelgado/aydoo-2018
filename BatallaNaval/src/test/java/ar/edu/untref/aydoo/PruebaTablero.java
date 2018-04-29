package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;


public class PruebaTablero {

    /*
    cuando unico un barco indico la direccion V u H
    disparo fuera del tablero debria lanzar excepcion
    ubico un barco en una posicion ya ocupada, deberia lanzar excepcion
    ubicar un barco fuera del tablero deberia lanzar excepcion
         */
    @Test
    public void disparoATableroVacioYDevuelveAgua(){
        Tablero tablero = new Tablero(20, 20);
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoTocoUnBoteYDevuelveHundido() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Barco unBote = new Bote();
        tablero.ubicarBarco(unBote,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoTocoUnCruceroYDevuelveTocado() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        Assert.assertEquals(ResultadoDeDisparo.TOCADO, resultadoDeDisparo);
    }

    @Test
    public void disparoACruceroDosvecesYDevuelveHundido() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 2));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoNoTocoUnBoteYDevuelveAgua() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Barco unBote = new Bote();
        tablero.ubicarBarco(unBote,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2,2));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoNoTocoUnCruceroYDevuelveAgua() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Barco unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2,2));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoACruceroVerticalDosvecesYDevuelveHundido() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Crucero unCrucero = new Crucero();
        unCrucero.setDireccionDelCrucero(Direccion.VERTICAL);
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2, 1));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

    @Test (expected = BarcoEncimadoExcepcion.class)
    public void ubicoBoteEncimaDeUnCruceroYDeberiaDevolverError() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Crucero unCrucero = new Crucero();
        unCrucero.setDireccionDelCrucero(Direccion.VERTICAL);
        Bote unBote = new Bote();
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        tablero.ubicarBarco(unBote, new Posicion(1, 1));
    }

    @Test (expected = BarcoEncimadoExcepcion.class)
    public void ubicoBoteEncimaDeOtroYDeberiaDevolverError() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Bote unBote = new Bote();
        Bote otroBote = new Bote();
        tablero.ubicarBarco(unBote, new Posicion(1, 1));
        tablero.ubicarBarco(otroBote, new Posicion(1, 1));
    }

    @Test
    public void ubicoDosBotesUnoAbajoDelOtro() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20, 20);
        Bote unBote = new Bote();
        Bote otroBote = new Bote();
        tablero.ubicarBarco(unBote, new Posicion(1, 1));
        tablero.ubicarBarco(otroBote, new Posicion(1, 2));
        Assert.assertEquals(2, tablero.obtenerListaDeBarcos().size());
    }

    @Test
    public void ubicoUnBoteAlLadoDeUnCrucero() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20 ,20);
        Bote unBote = new Bote();
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unBote, new Posicion(1, 1));
        tablero.ubicarBarco(unCrucero, new Posicion(1, 2));
        Assert.assertEquals(2, tablero.obtenerListaDeBarcos().size());
    }

    @Test (expected = BarcoFueraDelTableroExcepcion.class)
    public void ubicoBoteFueraDelTablero() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20,20);
        Bote unBote = new Bote();
        tablero.ubicarBarco(unBote, new Posicion(100, 100));
    }

    @Test (expected = BarcoFueraDelTableroExcepcion.class)
    public void ubicoCruceroFueraDelTablero() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20,20);
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(20, 19));
    }
    
    @Test (expected = BarcoFueraDelTableroExcepcion.class)
    public void ubicoBarcoConPosicionNegativaDeberiaLanzarExcepcion() throws BatallaNavalExcepcion {
        Tablero tablero = new Tablero(20,20);
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(-1, 19));
    }
}