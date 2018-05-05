package ar.edu.untref.aydoo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class LibreriaTest {
    @Test
    public void elClienteNoCompraNadaEnElMesDeEneroElMontoAcobrarDeberiaSer0() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        Libreria libreria = new Libreria();
        Mes enero2018 = new Mes(1, 2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteCompraUnLibroEnElMesDeEneroElMontoAcobrarDeberiaSerElValorDelMismo() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        Producto principito = new Libro(50.0);
        Libreria libreria = new Libreria ();
        Mes enero2018 = new Mes(1, 2018);
        libreria.registrarCompra(principito, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(50.0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteCompraUnLapizEnElMesDeEneroElMontoAcobrarDeberiaSerElValorDelMismoConIva() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        Producto lapiz = new Articulo(20.0);
        Libreria libreria = new Libreria ();
        Mes enero2018 = new Mes(1, 2018);
        libreria.registrarCompra(lapiz, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(24.2, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteAdquiereUnaSuscripcionEnEneroParaAbril2018() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        Mes abril2018 = new Mes(4, 2018);
        List<Mes> mesesDeLaSuscripcion = new ArrayList<Mes>();
        mesesDeLaSuscripcion.add(abril2018);
        Producto elGrafico = new Suscripcion(100.0, 2, mesesDeLaSuscripcion);
        Libreria libreria = new Libreria ();
        Mes enero2018 = new Mes(1, 2018);
        libreria.registrarCompra(elGrafico, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(100.0, montoDeCobroEnEneroParaPepe, 1);
    }

}
