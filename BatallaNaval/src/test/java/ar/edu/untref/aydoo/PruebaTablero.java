package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class PruebaTablero {

    /*
    cuando unico un barco indico la direccion V u H
    disparo fuera del tablero debria lanzar excepcion
    ubico un barco en una posicion ya ocupada, deberia lanzar excepcion
    ubicar un barco fuera del tablero deberia lanzar excepcion
         */
    @Test
    public void disparoATableroVacioYDevuelveAgua(){
        Tablero tablero = new Tablero();
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoTocoUnBoteYDevuelveHundido(){
        Tablero tablero = new Tablero();
        Barco unBote = new Bote();
        tablero.ubicarBarco(unBote,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoTocoUnCruceroYDevuelveTocado(){
        Tablero tablero = new Tablero();
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        Assert.assertEquals(ResultadoDeDisparo.TOCADO, resultadoDeDisparo);
    }

    @Test
    public void disparoACruceroDosvecesYDevuelveHundido(){
        Tablero tablero = new Tablero();
        Crucero unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 2));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoNoTocoUnBoteYDevuelveAgua(){
        Tablero tablero = new Tablero();
        Barco unBote = new Bote();
        tablero.ubicarBarco(unBote,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2,2));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoNoTocoUnCruceroYDevuelveAgua(){
        Tablero tablero = new Tablero();
        Barco unCrucero = new Crucero();
        tablero.ubicarBarco(unCrucero,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2,2));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoACruceroVerticalDosvecesYDevuelveHundido(){
        Tablero tablero = new Tablero();
        Crucero unCrucero = new Crucero();
        Direccion direccionVertical = new Vertical();
        unCrucero.setDireccionDelCrucero(direccionVertical);
        tablero.ubicarBarco(unCrucero, new Posicion(1, 1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1, 1));
        resultadoDeDisparo = tablero.recibirDisparo(new Posicion(2, 1));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }
}