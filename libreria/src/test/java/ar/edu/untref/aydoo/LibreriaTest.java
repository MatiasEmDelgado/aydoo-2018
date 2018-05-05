package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class LibreriaTest {

    private Cliente pepe;
    private Libreria libreria;
    private ArrayList<Producto> productosDeLaCompra;
    private Mes enero2018;
    private Mes febrero2018;
    private Mes marzo2018;
    private Mes abril2018;
    private Mes mayo2018;
    private Mes junio2018;
    private Mes julio2018;
    private Mes agosto2018;
    private Mes septiembre2018;
    private Mes octubre2018;
    private Mes noviembre2018;
    private Mes diciembre2018;


    @Before
    public void inicializo() {
        pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        libreria = new Libreria();
        productosDeLaCompra = new ArrayList<Producto>();
        enero2018 = new Mes(1, 2018);
        enero2018 = new Mes(1, 2018);
        febrero2018 = new Mes(2, 2018);
        marzo2018 = new Mes(3, 2018);
        abril2018 = new Mes(4, 2018);
        mayo2018 = new Mes(5, 2018);
        junio2018 = new Mes(6, 2018);
        julio2018 = new Mes(7, 2018);
        agosto2018 = new Mes(8, 2018);
        septiembre2018 = new Mes(9, 2018);
        octubre2018 = new Mes(10, 2018);
        noviembre2018 = new Mes(11, 2018);
        diciembre2018 = new Mes(12, 2018);
    }

    @Test
    public void elClienteNoCompraNadaEnElMesDeEneroElMontoAcobrarDeberiaSer0() {
        Producto principito = new Libro(50.0);
        productosDeLaCompra.add(principito);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteCompraUnLibroEnElMesDeEneroElMontoAcobrarDeberiaSerElValorDelMismo() {
        Producto principito = new Libro(50.0);
        productosDeLaCompra.add(principito);
        libreria.registrarCompra(productosDeLaCompra, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(47.5, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteCompraUnLapizEnElMesDeEneroElMontoAcobrarDeberiaSerElValorDelMismoConIva() {
        Producto lapiz = new Articulo(20.0);
        productosDeLaCompra.add(lapiz);
        libreria.registrarCompra(productosDeLaCompra, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(22.99, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteAdquiereUnaSuscripcionEnEneroParaAbril2018() {
        List<Mes> mesesDeLaSuscripcion = new ArrayList<Mes>();
        mesesDeLaSuscripcion.add(abril2018);
        Producto elGrafico = new Suscripcion(100.0, 2, mesesDeLaSuscripcion);
        productosDeLaCompra.add(elGrafico);
        libreria.registrarCompra(productosDeLaCompra, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(95.0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteAdquiereUnaSuscripcionParaTodoElAnio2018() {

        List<Mes> mesesDeLaSuscripcion = new ArrayList<Mes>();
        mesesDeLaSuscripcion.add(enero2018);
        mesesDeLaSuscripcion.add(febrero2018);
        mesesDeLaSuscripcion.add(marzo2018);
        mesesDeLaSuscripcion.add(abril2018);
        mesesDeLaSuscripcion.add(mayo2018);
        mesesDeLaSuscripcion.add(junio2018);
        mesesDeLaSuscripcion.add(julio2018);
        mesesDeLaSuscripcion.add(agosto2018);
        mesesDeLaSuscripcion.add(septiembre2018);
        mesesDeLaSuscripcion.add(octubre2018);
        mesesDeLaSuscripcion.add(noviembre2018);
        mesesDeLaSuscripcion.add(diciembre2018);
        Producto elGrafico = new Suscripcion(100.0, 2, mesesDeLaSuscripcion);
        productosDeLaCompra.add(elGrafico);
        libreria.registrarCompra(productosDeLaCompra, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(912.0, montoDeCobroEnEneroParaPepe, 1);
    }

    @Test
    public void elClienteAdquiereUnaSuscripcionDeTodosLosMesesPeroEnUnMesElAnioEsDistintoEntoncesNoDeberiaTenerDescuentoDeSuscripcion() {
        enero2018 = new Mes(1, 2018);
        febrero2018 = new Mes(2, 2018);
        marzo2018 = new Mes(3, 2018);
        abril2018 = new Mes(4, 2018);
        mayo2018 = new Mes(5, 2018);
        junio2018 = new Mes(6, 2018);
        julio2018 = new Mes(7, 2018);
        agosto2018 = new Mes(8, 2018);
        septiembre2018 = new Mes(9, 2018);
        octubre2018 = new Mes(10, 2018);
        Mes noviembre2019 = new Mes(11, 2019);
        diciembre2018 = new Mes(12, 2018);
        List<Mes> mesesDeLaSuscripcion = new ArrayList<Mes>();
        mesesDeLaSuscripcion.add(enero2018);
        mesesDeLaSuscripcion.add(febrero2018);
        mesesDeLaSuscripcion.add(marzo2018);
        mesesDeLaSuscripcion.add(abril2018);
        mesesDeLaSuscripcion.add(mayo2018);
        mesesDeLaSuscripcion.add(junio2018);
        mesesDeLaSuscripcion.add(julio2018);
        mesesDeLaSuscripcion.add(agosto2018);
        mesesDeLaSuscripcion.add(septiembre2018);
        mesesDeLaSuscripcion.add(octubre2018);
        mesesDeLaSuscripcion.add(noviembre2019);
        mesesDeLaSuscripcion.add(diciembre2018);
        Producto elGrafico = new Suscripcion(100.0, 2, mesesDeLaSuscripcion);
        productosDeLaCompra.add(elGrafico);
        libreria.registrarCompra(productosDeLaCompra, pepe, enero2018);
        Double montoDeCobroEnEneroParaPepe = libreria.obtenerMontoDeCobro(enero2018, pepe);
        Assert.assertEquals(1140.0, montoDeCobroEnEneroParaPepe, 1);
    }
}
