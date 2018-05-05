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
        if(suscripcionConDescuento()) {
            return (super.getPrecio() - super.getPrecio() * 0.2) * mesesDeLaSuscripcion.size();
        } else {
            return super.getPrecio()* mesesDeLaSuscripcion.size();
        }

    }

    private boolean suscripcionConDescuento(){
        int contadorMesSuscripto = 0;
        int anioDeLaSuscripcion = mesesDeLaSuscripcion.get(0).getAnioDelMes();
        for(int i = 1; i < 13; i++){
            for (Mes mes : mesesDeLaSuscripcion) {
                if(i == mes.getNumeroDelMes() && anioDeLaSuscripcion == mes.getAnioDelMes()) {
                    contadorMesSuscripto++;
                }
            }
        }

        if(contadorMesSuscripto == 12){
            return true;
        } else {
          return false;
        }
    }

}
