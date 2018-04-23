package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class CuentaCorriente {

    private int saldo = 0;
    private ArrayList<Compra> comprasDelCliente = new ArrayList<Compra>();

    public void setSaldo(int nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public ArrayList<Compra> getComprasDelCliente() {
        return comprasDelCliente;
    }

}
