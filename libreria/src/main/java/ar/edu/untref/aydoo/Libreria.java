package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private static final Double DESCUENTO_AL_CLIENTE = 0.05;

    private List<Compra> comprasEnLaLibreria = new ArrayList<Compra>();


    public void registrarCompra(ArrayList<Producto> productos, Cliente cliente, Mes mes) {
        comprasEnLaLibreria.add(new Compra(productos, cliente, mes));
    }

    public Double obtenerMontoDeCobro(Mes mes, Cliente cliente) {
        Double montoDeCobro = 0.0;
        for (Compra compra : comprasEnLaLibreria) {
            if (compra.getClienteDeLaCompra().equals(cliente) &&
                    compra.getMesDeLaCompra().getNumeroDelMes() == mes.getNumeroDelMes()
                    && compra.getMesDeLaCompra().getAnioDelMes() == mes.getAnioDelMes()){
                for (Producto producto : compra.getProductosDeLaCompra()) {
                    montoDeCobro = montoDeCobro + producto.getPrecio();
                }
            }
        }
        return montoDeCobro - montoDeCobro * DESCUENTO_AL_CLIENTE;
    }

    public Double obtenerMontoDeCobro(int anio, Cliente cliente) {
        Double montoDeCobro = 0.0;
        for (Compra compra : comprasEnLaLibreria) {
            if (compra.getClienteDeLaCompra().equals(cliente)
                    && compra.getMesDeLaCompra().getAnioDelMes() == anio){
                for (Producto producto : compra.getProductosDeLaCompra()) {
                    montoDeCobro = montoDeCobro + producto.getPrecio();
                }
            }
        }
        return montoDeCobro - montoDeCobro * DESCUENTO_AL_CLIENTE;
    }

}
