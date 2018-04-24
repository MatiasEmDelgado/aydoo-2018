package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CuentaCorriente {

    private double saldo;
    private Map<Integer, ArrayList<Compra>> comprasDelClienteEnCadaMes = new HashMap<Integer, ArrayList<Compra>>();

    public CuentaCorriente(double saldoDeLaCuenta) {
        saldo = saldoDeLaCuenta;
    }

    public void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public ArrayList<Compra> getComprasDelCliente(int mes) {
        return comprasDelClienteEnCadaMes.get(mes);
    }

    public double getSaldo() {
        return saldo;
    }

    public void descontarMontoDeCompraDelMes(int mes) {
        double montoADescontar = 0;
        for (Compra compra : comprasDelClienteEnCadaMes.get(mes)) {
            montoADescontar = montoADescontar + compra.getMontoTotalDeLaCompra();
        }
        saldo = saldo - montoADescontar;
    }

    public void agregarCompra(int mes, Compra compra){
        if(comprasDelClienteEnCadaMes.get(mes) != null){
            comprasDelClienteEnCadaMes.get(mes).add(compra);
        } else {
            comprasDelClienteEnCadaMes.put(mes,new ArrayList<Compra>());
            comprasDelClienteEnCadaMes.get(mes).add(compra);
        }
    }
}
