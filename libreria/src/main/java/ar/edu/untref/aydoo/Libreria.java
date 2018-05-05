package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private static final Double DESCUENTO_AL_CLIENTE = 0.05;

    private List<Compra> comprasEnLaLibreria = new ArrayList<Compra>();


    public void registrarCompra(Producto producto, Cliente cliente, Mes mes) {
        comprasEnLaLibreria.add(new Compra(producto, cliente, mes));
    }
    public Double obtenerMontoDeCobro(Mes mes, Cliente cliente) {
        Double montoDeCobro = 0.0;
        for (Compra compra : comprasEnLaLibreria) {
            if (compra.getClienteDeLaCompra().equals(cliente) &&
                    compra.getMesDeLaCompra().getNumeroDelMes() == mes.getNumeroDelMes()
                    && compra.getMesDeLaCompra().getAnioDelMes() == mes.getAnioDelMes()){
                montoDeCobro = compra.getProductoDeLaCompra().getPrecio();
            }
        }
        return montoDeCobro - montoDeCobro * DESCUENTO_AL_CLIENTE;
    }

}
