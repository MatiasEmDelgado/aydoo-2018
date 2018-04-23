package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class LibreriaTest {

    @Test
    public void calcularMontoDelMesSinNingunaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Assert.assertEquals(0,libreria.calcularMontoDelMes(miCliente, 1));

    }

    @Test
    public void clienteCompraUnProductoDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
        librosDeLaCompra.add(principito);
        miCliente.comprar(librosDeLaCompra, 1);
        Assert.assertEquals(10,libreria.calcularMontoDelMes(miCliente, 1));

    }

    @Test
    public void clienteRealizaDosComprasDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        ArrayList<Libro> librosDeLaCompra1 = new ArrayList<Libro>();
        librosDeLaCompra1.add(principito);
        miCliente.comprar(librosDeLaCompra1, 1);
        ArrayList<Libro> librosDeLaCompra2 = new ArrayList<Libro>();
        librosDeLaCompra2.add(bambi);
        miCliente.comprar(librosDeLaCompra2, 1);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente, 1));
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
        miCliente.comprar(librosDeLaCompra, 1);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente, 1));
    }

    @Test
    public void clienteRealizaUnaCompraEnEneroYEnFebrero() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        Libro dracula = new Libro(30);
        ArrayList<Libro> librosDeLaCompraDeEnero = new ArrayList<Libro>();
        ArrayList<Libro> librosDeLaCompraDeFebrero = new ArrayList<Libro>();
        librosDeLaCompraDeEnero.add(principito);
        librosDeLaCompraDeEnero.add(bambi);
        librosDeLaCompraDeFebrero.add(dracula);
        miCliente.comprar(librosDeLaCompraDeEnero, 1);
        miCliente.comprar(librosDeLaCompraDeFebrero, 2);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente,1));
        Assert.assertEquals(30,libreria.calcularMontoDelMes(miCliente,2));
    }
}
