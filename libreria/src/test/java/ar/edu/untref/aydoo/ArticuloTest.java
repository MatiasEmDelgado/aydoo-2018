package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ArticuloTest {

    @Test
    public void unArticuloDeveriaDevolverCorrectamenteSuPrecioConIvaAlSolicitarlo() {
        Articulo libro = new Articulo(10.0);
        Assert.assertEquals(12.1, libro.getPrecio(), 1);
    }
}
