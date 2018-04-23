package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void elClienteCompraUnLibro() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente();
        Libro principito = new Libro(10);
        miCliente.comprar(principito);
        Assert.assertEquals(10,miCliente.getCuentaDelCliente().getComprasDelCliente().get(0).getMontoTotalDeLaCompra());

    }
}
