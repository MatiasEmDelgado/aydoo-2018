package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class CuentaCorriente {

    private int saldo;
    private ArrayList<Compra> comprasDelCliente = new ArrayList<Compra>();

    public CuentaCorriente(int saldoDeLaCuenta) {
        saldo = saldoDeLaCuenta;
    }

    public void setSaldo(int nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public ArrayList<Compra> getComprasDelCliente() {
        return comprasDelCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void descontarMontoDeCompraDelMes() {
        int montoADescontar = 0;
        for (Compra compra : comprasDelCliente) {
            montoADescontar = montoADescontar + compra.getMontoTotalDeLaCompra();
        }
        saldo = saldo - montoADescontar;
    }
}
