package ar.edu.untref.aydoo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class LibreriaTest {

    @Test
    public void calcularMontoDelMesSinNingunaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Assert.assertEquals(0,libreria.calcularMontoDelMes(miCliente));

    }

    @Test
    public void clienteCompraUnProductoDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
        librosDeLaCompra.add(principito);
        miCliente.comprar(librosDeLaCompra);
        Assert.assertEquals(10,libreria.calcularMontoDelMes(miCliente));

    }

    @Test
    public void clienteRealizaDosComprasDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        ArrayList<Libro> librosDeLaCompra1 = new ArrayList<Libro>();
        librosDeLaCompra1.add(principito);
        miCliente.comprar(librosDeLaCompra1);
        ArrayList<Libro> librosDeLaCompra2 = new ArrayList<Libro>();
        librosDeLaCompra2.add(bambi);
        miCliente.comprar(librosDeLaCompra2);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente));
    }

    @Test
    public void clienteCompraDosProductosDeValor10EnUnaMismaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
        librosDeLaCompra.add(principito);
        librosDeLaCompra.add(bambi);
        miCliente.comprar(librosDeLaCompra);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente));
    }
}
