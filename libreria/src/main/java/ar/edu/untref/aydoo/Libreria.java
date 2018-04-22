package ar.edu.untref.aydoo;

/**
 * Created by nicopaez on 11/04/2018.
 */
public class Libreria {
    public int calcularMontoDelMes(final Cliente miCliente) {
        if(miCliente.getCompra() != null) {
            return miCliente.getCompra().valorCompra();
        } else {
            return 0;
        }
    }
}