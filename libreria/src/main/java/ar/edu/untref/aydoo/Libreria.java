package ar.edu.untref.aydoo;

public class Libreria {

    public int calcularMontoDelMes(Cliente miCliente) {
        if(miCliente.getComprasDelCliente().size() > 0) {
            int montoTotalDelMes = 0;
            for (Compra compra:miCliente.getComprasDelCliente()) {
                montoTotalDelMes = montoTotalDelMes + compra.getMontoTotalDeLaCompra();
            }
            return montoTotalDelMes;
        } else {
            return 0;
        }

    }
}
