package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Compra> comprasEnLaLibreria = new ArrayList<Compra>();


    public void registrarCompra(Libro libro, Cliente cliente, int mes) {
        comprasEnLaLibreria.add(new Compra(libro, cliente, mes));
    }
    public Double obtenerMontoDeCobro(int mes, Cliente cliente) {
        Double montoDeCobro = 0.0;

        for (Compra compra : comprasEnLaLibreria) {
            if (compra.getClienteDeLaCompra().equals(cliente) && compra.getMesDeLaCompra() == mes){
                montoDeCobro = compra.getLibroDeLaCompra().getPrecioDelLibro();
            }
        }

        return montoDeCobro;
    }

}
