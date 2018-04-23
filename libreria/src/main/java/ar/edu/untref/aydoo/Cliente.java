package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Cliente {

    private CuentaCorriente cuentaDelCliente;

    public Cliente(int saldoDeLaCuenta) {
        cuentaDelCliente = new CuentaCorriente(saldoDeLaCuenta);
    }

    public void comprar(ArrayList<Libro> libros, int mes) {
        Compra compraDelCliente = new Compra(mes);
        for (Libro libro : libros) {
            compraDelCliente.agregarLibroAlaCompra(libro);
        }
        cuentaDelCliente.agregarCompra(mes,compraDelCliente);
    }

    public CuentaCorriente getCuentaDelCliente() {
        return cuentaDelCliente;
    }

}
