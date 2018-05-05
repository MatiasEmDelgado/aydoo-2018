package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

    @Test
    public void unLibroDeveriaDevolverCorrectamenteSuPrecioAlSolicitarlo() {
        Libro libro = new Libro(10.0);
        Assert.assertEquals(10.0, libro.getPrecio(), 1);
    }

}
