package ar.edu.untref.aydoo;

public class Articulo extends Producto{

    private double precioDelArticulo;

    public Articulo(double precio) {
        precioDelArticulo = precio;
    }

    public double getPrecio() {
        return precioDelArticulo + precioDelArticulo * 0.21;
    }
}
