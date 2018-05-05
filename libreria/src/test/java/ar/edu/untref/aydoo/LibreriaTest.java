package ar.edu.untref.aydoo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;


public class LibreriaTest {
    @Test
    public void elClienteNoCompraNadaEnElMesDeEneroElMontoAcobrarDeberiaSer0() {
        Cliente pepe = new Cliente();
        Libreria libreria = new Libreria();
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(1, pepe);
        Assert.assertEquals(0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Ignore
    public void elClienteCompraUnLibroEnElMesDeEneroElMontoAcobrarDeberiaSerElValorDelMismo() {
        Cliente pepe = new Cliente();
        Libro principito = new Libro(50.0);
        Libreria libreria = new Libreria ();
        libreria.registrarCompra(principito, pepe, 1);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(1, pepe);
        Assert.assertEquals(50.0, montoDeCobroEnEneroParaPepe, 1);
    }
}
