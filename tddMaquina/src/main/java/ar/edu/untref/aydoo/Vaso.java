package ar.edu.untref.aydoo;

public class Vaso {
    private int cantidadDeAzucar = 0;
    private Contenido contenido = new Vacio();

    public Object getCantidadDeAzucar() {
        return this.cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        if (this.contenido instanceof Cafe) return true;
        else return false;
    }

    public boolean tieneAzucar() {
        if(this.cantidadDeAzucar>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneTe() {
        if (this.contenido instanceof Te) return true;
        else return false;
    }

    public void setAzucar(int cantidadAzucar) {
        this.cantidadDeAzucar = cantidadAzucar;
    }

    public void setCafe() {
        this.contenido  = new Cafe();

    }

    public void setTe() {
        this.contenido = new Te();
    }
}
