package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class LibreriaTest {

    @Test
    public void calcularMontoDelMesSinNingunaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Assert.assertEquals(0,libreria.calcularMontoDelMes(miCliente, 1),0);

    }

    @Test
    public void clienteCompraUnProductoDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        ArrayList<Producto> librosDeLaCompra = new ArrayList<Producto>();
        librosDeLaCompra.add(principito);
        miCliente.comprar(librosDeLaCompra, 1);
        Assert.assertEquals(10,libreria.calcularMontoDelMes(miCliente, 1),0);

    }

    @Test
    public void clienteRealizaDosComprasDeValor10() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        ArrayList<Producto> librosDeLaCompra1 = new ArrayList<Producto>();
        librosDeLaCompra1.add(principito);
        miCliente.comprar(librosDeLaCompra1, 1);
        ArrayList<Producto> librosDeLaCompra2 = new ArrayList<Producto>();
        librosDeLaCompra2.add(bambi);
        miCliente.comprar(librosDeLaCompra2, 1);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente, 1),0);
    }

    @Test
    public void clienteCompraDosProductosDeValor10EnUnaMismaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        ArrayList<Producto> librosDeLaCompra = new ArrayList<Producto>();
        librosDeLaCompra.add(principito);
        librosDeLaCompra.add(bambi);
        miCliente.comprar(librosDeLaCompra, 1);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente, 1),0);
    }

    @Test
    public void clienteRealizaUnaCompraEnEneroYEnFebrero() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        Libro bambi = new Libro(10);
        Libro dracula = new Libro(30);
        ArrayList<Producto> librosDeLaCompraDeEnero = new ArrayList<Producto>();
        ArrayList<Producto> librosDeLaCompraDeFebrero = new ArrayList<Producto>();
        librosDeLaCompraDeEnero.add(principito);
        librosDeLaCompraDeEnero.add(bambi);
        librosDeLaCompraDeFebrero.add(dracula);
        miCliente.comprar(librosDeLaCompraDeEnero, 1);
        miCliente.comprar(librosDeLaCompraDeFebrero, 2);
        Assert.assertEquals(20,libreria.calcularMontoDelMes(miCliente,1),0);
        Assert.assertEquals(30,libreria.calcularMontoDelMes(miCliente,2),0);
    }

    @Test
    public void clienteCompraUnArticulo() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Articulo calculadoraPro = new Articulo(413.25);
        ArrayList<Producto> articulosDeLaCompra = new ArrayList<Producto>();
        articulosDeLaCompra.add(calculadoraPro);
        miCliente.comprar(articulosDeLaCompra, 1);
        Assert.assertEquals(500,libreria.calcularMontoDelMes(miCliente,1),1);
    }

    @Test
    public void clienteCompraUnArticuloYUnLibro() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Articulo calculadoraPro = new Articulo(413.25);
        Libro dracula = new Libro(30);
        ArrayList<Producto> productosDeLaCompra = new ArrayList<Producto>();
        productosDeLaCompra.add(calculadoraPro);
        productosDeLaCompra.add(dracula);
        miCliente.comprar(productosDeLaCompra, 1);
        Assert.assertEquals(530,libreria.calcularMontoDelMes(miCliente,1),1);
    }
}
