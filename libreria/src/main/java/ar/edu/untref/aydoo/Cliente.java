package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Cliente {

    private CuentaCorriente cuentaDelCliente;

    public Cliente(int saldoDeLaCuenta) {
        cuentaDelCliente = new CuentaCorriente(saldoDeLaCuenta);
    }

    public void comprar(ArrayList<Producto> productos, int mes) {
        Compra compraDelCliente = new Compra(mes);
        for (Producto producto : productos) {
            compraDelCliente.agregarProductoAlaCompra(producto);
        }
        cuentaDelCliente.agregarCompra(mes,compraDelCliente);
    }

    public CuentaCorriente getCuentaDelCliente() {
        return cuentaDelCliente;
    }

}
