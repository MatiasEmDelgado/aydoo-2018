package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void elClienteDevuelveCorrectamenteSuNombre() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        String nombreCliente = pepe.getNombreCliente();
        Assert.assertEquals("Pepe", nombreCliente);
    }

    @Test
    public void elClienteDevuelveCorrectamenteSuApellido() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        String apellidoCliente = pepe.getApellidoCliente();
        Assert.assertEquals("Grillo", apellidoCliente);
    }

    @Test
    public void elClienteDevuelveCorrectamenteSuDireccion() {
        Cliente pepe = new Cliente("Pepe", "Grillo", "Lavalle 430");
        String direccionCliente = pepe.getDireccionCliente();
        Assert.assertEquals("Lavalle 430", direccionCliente);
    }
}
