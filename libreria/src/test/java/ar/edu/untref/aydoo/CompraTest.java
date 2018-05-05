package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CompraTest {


    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElLibroQueSeVendioEnLaCompra (){
        Cliente pepe = new Cliente();
        Libro principito = new Libro(10.0);
        Compra compra = new Compra(principito, pepe, 1);
        Libro libroDeLaCompra = compra.getLibroDeLaCompra();
        Assert.assertEquals(principito, libroDeLaCompra);
    }

    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElQueRealizoLaCompra (){
        Cliente pepe = new Cliente();
        Libro principito = new Libro(10.0);
        Compra compra = new Compra(principito, pepe, 1);
        Cliente clienteDeLaCompra = compra.getClienteDeLaCompra();
        Assert.assertEquals(pepe, clienteDeLaCompra);
    }

    @Test
    public void unaCompraDeberiaDevolverCorrectamenteElMesEnElQueSeRealizoLaCompra (){
        Cliente pepe = new Cliente();
        Libro principito = new Libro(10.0);
        Compra compra = new Compra(principito, pepe, 1);
        int mesDeLaCompra = compra.getMesDeLaCompra();
        Assert.assertEquals(1, mesDeLaCompra);
    }

}
