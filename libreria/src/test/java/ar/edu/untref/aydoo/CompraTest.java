package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CompraTest {

    private Cliente pepe;
    private Producto principito;
    private ArrayList<Producto> productosDeLaCompraDePepe;
    private Mes enero;
    private Compra compra;

    @Before
    public void inicioUnaCompra() {
        pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        productosDeLaCompraDePepe = new ArrayList<Producto>();
        principito = new Libro(10.0);
        productosDeLaCompraDePepe.add(principito);
        enero = new Mes(1,2018);
        compra = new Compra(productosDeLaCompraDePepe, pepe, enero);
    }

    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElLibroQueSeVendioEnLaCompra (){
        ArrayList<Producto> libroDeLaCompra = compra.getProductosDeLaCompra();
        Assert.assertEquals(productosDeLaCompraDePepe, libroDeLaCompra);
    }

    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElClienteQueRealizoLaCompra (){
        Cliente clienteDeLaCompra = compra.getClienteDeLaCompra();
        Assert.assertEquals(pepe, clienteDeLaCompra);
    }

    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElMesEnElQueSeRealizoLaCompra (){
        int mesDeLaCompra = compra.getMesDeLaCompra().getNumeroDelMes();
        Assert.assertEquals(1, mesDeLaCompra);
    }

}
