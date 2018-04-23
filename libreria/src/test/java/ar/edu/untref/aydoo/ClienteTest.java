package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClienteTest {

    @Test
    public void elClienteCompraUnLibro() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
        librosDeLaCompra.add(principito);
        miCliente.comprar(librosDeLaCompra, 1);
        Assert.assertEquals(10,miCliente.getCuentaDelCliente().getComprasDelCliente(1).get(0).getMontoTotalDeLaCompra());

    }

    @Test
    public void elClienteCompraUnLibroYSeLeDescuentaElValorDelLibroEnLaCuentaAFinDeMes() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        ArrayList<Libro> librosDeLaCompra = new ArrayList<Libro>();
        librosDeLaCompra.add(principito);
        miCliente.comprar(librosDeLaCompra, 1);
        miCliente.getCuentaDelCliente().descontarMontoDeCompraDelMes(1);
        Assert.assertEquals(90, miCliente.getCuentaDelCliente().getSaldo());
    }
}
