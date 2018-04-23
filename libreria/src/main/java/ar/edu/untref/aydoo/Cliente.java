package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Cliente {

    private CuentaCorriente cuentaDelCliente = new CuentaCorriente();

    public void comprar(Libro unLibro) {
        Compra compraDelCliente = new Compra();
        compraDelCliente.agregarLibroAlaCompra(unLibro);
        cuentaDelCliente.getComprasDelCliente().add(compraDelCliente);

    }

    public CuentaCorriente getCuentaDelCliente() {
        return cuentaDelCliente;
    }

}
