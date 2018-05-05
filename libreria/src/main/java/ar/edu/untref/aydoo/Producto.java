package ar.edu.untref.aydoo;

public abstract class Producto {

    private Double precioProducto;

    public Producto(double precio) {
        precioProducto = precio;
    }

    public Double getPrecio() {
        return precioProducto;
    }
}
