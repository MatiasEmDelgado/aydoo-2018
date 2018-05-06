package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Compra {

    private ArrayList<Producto> productosDeLaCompra;
    private Cliente clienteDeLaCompra;
    private Mes mesDeLaCompra;

    public Compra(ArrayList<Producto> productos, Cliente cliente, Mes mes) {
        productosDeLaCompra = productos;
        clienteDeLaCompra = cliente;
        mesDeLaCompra = mes;
    }

    public ArrayList<Producto> getProductosDeLaCompra() {
        return productosDeLaCompra;
    }

    public Cliente getClienteDeLaCompra() {
        return clienteDeLaCompra;
    }

    public Mes getMesDeLaCompra() {
        return mesDeLaCompra;
    }
}
