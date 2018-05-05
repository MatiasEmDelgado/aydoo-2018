package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Suscripcion extends Producto {

    private List<Mes> mesesDeLaSuscripcion;
    private int periodicidadDeLaSuscripcion;

    public Suscripcion(double precio, int periodicidad, List<Mes> meses) {
        super(precio);
        mesesDeLaSuscripcion = meses;
        periodicidadDeLaSuscripcion = periodicidad;
    }

    public List<Mes> getMesesDeLaSuscripcion() {
        return mesesDeLaSuscripcion;
    }

    public int getPeriodicidadDeLaSuscripcion() {
        return periodicidadDeLaSuscripcion;
    }

    public Double getPrecio() {
        return super.getPrecio()* mesesDeLaSuscripcion.size();
    }
}
