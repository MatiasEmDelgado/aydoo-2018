package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Libreria {

    public int calcularMontoDelMes(Cliente miCliente) {
        ArrayList<Compra> compasDelCliente = miCliente.getCuentaDelCliente().getComprasDelCliente();
        if(compasDelCliente.size() > 0) {
            int montoTotalDelMes = 0;
            for (Compra compra:compasDelCliente) {
                montoTotalDelMes = montoTotalDelMes + compra.getMontoTotalDeLaCompra();
            }
            return montoTotalDelMes;
        } else {
            return 0;
        }

    }
}
