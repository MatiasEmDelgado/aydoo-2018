package ar.edu.untref.aydoo;

public class Articulo extends Producto {

    private static final Double IVA = 1.21;

    public Articulo(double precio) {
        super(precio);
    }

    public Double getPrecio() {
        return super.getPrecio()*IVA;
    }
}
