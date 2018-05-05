package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Compra> compras = new ArrayList<Compra>();


    public void registrarCompra(Libro libro, Cliente cliente, int mes) {
        compras.add(new Compra(libro, cliente, mes));
    }
    public Double obtenerMontoDeCobro(int mes, Cliente pepe) {
        return 0.0;
    }

}
