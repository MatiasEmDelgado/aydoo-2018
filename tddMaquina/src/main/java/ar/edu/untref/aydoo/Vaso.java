package ar.edu.untref.aydoo;

public class Vaso {
    private int cantidadDeAzucar = 0;
    private boolean contieneCafe = false;
    private boolean contieneTe = false;

    public Object getCantidadDeAzucar() {
        return this.cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        return this.contieneCafe;
    }

    public boolean tieneAzucar() {
        if(this.cantidadDeAzucar>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneTe() {
        return this.contieneTe;
    }

    public void setAzucar(int cantidadAzucar) {
        this.cantidadDeAzucar = cantidadAzucar;
    }

    public void setCafe() {
        this.contieneCafe  = true;

    }

    public void setTe() {
        this.contieneTe   = true;
    }
}
