package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Libreria {

    public double calcularMontoDelMes(Cliente miCliente, int mes) {
        ArrayList<Compra> compasDelCliente = miCliente.getCuentaDelCliente().getComprasDelCliente(mes);
        if(compasDelCliente != null) {
            double montoTotalDelMes = 0;
            for (Compra compra:compasDelCliente) {
                montoTotalDelMes = montoTotalDelMes + compra.getMontoTotalDeLaCompra();
            }
            return montoTotalDelMes - montoTotalDelMes *  0.05;
        } else {
            return 0;
        }
    }
}
