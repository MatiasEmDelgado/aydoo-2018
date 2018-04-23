package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Cliente {

    private CuentaCorriente cuentaDelCliente;

    public Cliente(int saldoDeLaCuenta) {
        cuentaDelCliente = new CuentaCorriente(saldoDeLaCuenta);
    }

    public void comprar(ArrayList<Libro> libros) {
        Compra compraDelCliente = new Compra();
        for (Libro libro : libros) {
            compraDelCliente.agregarLibroAlaCompra(libro);
        }
        cuentaDelCliente.getComprasDelCliente().add(compraDelCliente);
    }

    public CuentaCorriente getCuentaDelCliente() {
        return cuentaDelCliente;
    }

}
