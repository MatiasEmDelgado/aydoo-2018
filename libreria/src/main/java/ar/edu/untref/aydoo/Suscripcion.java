package ar.edu.untref.aydoo;

public class Suscripcion extends Producto {

    private double precioSuscripcion;

    private int publicacionesPorMes;

    public Suscripcion(double precio, int cantidadDePublicacionesPorMes) {
        precioSuscripcion = precio;
        publicacionesPorMes = cantidadDePublicacionesPorMes;
    }

    public double getPrecio() {
        return precioSuscripcion;
    }
}

