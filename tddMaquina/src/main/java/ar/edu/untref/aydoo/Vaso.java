package ar.edu.untref.aydoo;

public class Vaso {
    private int cantidadDeAzucar = 0;
    private boolean contieneCafe = false;
    private boolean contieneTe = false;

    public Object getCantidadDeAzucar() {
        // TODO Auto-generated method stub
        return this.cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        // TODO Auto-generated method stub
        return this.contieneCafe;
    }

    public boolean tieneAzucar() {
        // TODO Auto-generated method stub
        if(this.cantidadDeAzucar>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneTe() {
        // TODO Auto-generated method stub
        return this.contieneTe;
    }

    public void setAzucar(int cantidadAzucar) {
        this.cantidadDeAzucar = cantidadAzucar;
    }

    public void setCafe() {
        this.contieneCafe  = true;

    }

    public void setTe() {
        // TODO Auto-generated method stub
        this.contieneTe   = true;
    }
}
