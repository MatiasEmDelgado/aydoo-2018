package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void ejercicioFibonacciConEntrada5() {
        String expected = "0 1 1 2 3";
        Assert.assertEquals(expected, Fibonacci.getResultado(5));
    }
    @Test
    public void ejercicioFibonacciConEntrada8() {
        String expected = "0 1 1 2 3 5 8 13";
        Assert.assertEquals(expected, Fibonacci.getResultado(8));
    }
}