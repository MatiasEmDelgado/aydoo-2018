package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class LibreriaTest
{
    @Test
    public void elClienteNoCompraNadaEnElMesDeEneroElMontoAcobrarDeberiaSer0() {
        Cliente pepe = new Cliente();
        Libreria libreria = new Libreria();
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(1, pepe);
        Assert.assertEquals(0, montoDeCobroEnEneroParaPepe, 1);
    }
}
