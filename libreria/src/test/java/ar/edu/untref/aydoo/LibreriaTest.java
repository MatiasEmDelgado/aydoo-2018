package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;

public class LibreriaTest {

    @Test

    public void calcularMontoDelMesSinNingunaCompra() {
        Libreria libreria = new Libreria();
        Cliente miCliente = new Cliente();
        Assert.assertEquals(0,libreria.calcularMontoDelMes(miCliente));

    }


}
