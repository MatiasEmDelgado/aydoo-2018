package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void elClienteCompraUnLibro() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        miCliente.comprar(principito);
        Assert.assertEquals(10,miCliente.getCuentaDelCliente().getComprasDelCliente().get(0).getMontoTotalDeLaCompra());

    }

    @Test
    public void elClienteCompraUnLibroYSeLeDescuentaElValorDelLibroEnLaCuentaAFinDeMes() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente(100);
        Libro principito = new Libro(10);
        miCliente.comprar(principito);
        miCliente.getCuentaDelCliente().descontarMontoDeCompraDelMes();
        Assert.assertEquals(90, miCliente.getCuentaDelCliente().getSaldo());
    }
}
