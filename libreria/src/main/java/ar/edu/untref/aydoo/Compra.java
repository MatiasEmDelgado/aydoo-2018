package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Compra {

    private ArrayList<Producto> productosDeLaCompra = new ArrayList<Producto>();
    private double montoTotalDeLaCompra = 0;
    private double mesDeLaCompra;

    public Compra(int mes) {
        mesDeLaCompra = mes;
    }

    public double getMontoTotalDeLaCompra() {
        for (Producto producto: productosDeLaCompra) {
            montoTotalDeLaCompra = montoTotalDeLaCompra + producto.getPrecio();
        }
        return montoTotalDeLaCompra;
    }

    public void agregarProductoAlaCompra(Producto producto) {
        productosDeLaCompra.add(producto);
    }
}
