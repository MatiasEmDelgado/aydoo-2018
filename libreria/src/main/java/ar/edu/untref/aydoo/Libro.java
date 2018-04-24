package ar.edu.untref.aydoo;

public class Libro extends Producto{

    private double precioLibro;

    public Libro(double precio) {
        precioLibro = precio;
    }

    public double getPrecio() {
        return precioLibro;
    }
}
