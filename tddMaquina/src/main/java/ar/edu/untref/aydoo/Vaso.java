package ar.edu.untref.aydoo;

public class Vaso {
    private int cantidadDeAzucar = 0;
    private Contenido contenido = Contenido.VACIO;

    public int getCantidadDeAzucar() {
        return this.cantidadDeAzucar;
    }

    public boolean tieneCafe() {
        if (this.contenido == Contenido.CAFE
                || this.contenido == Contenido.CAFE_CON_LECHE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneAzucar() {
        if(this.cantidadDeAzucar>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneTe() {
        if (this.contenido == Contenido.TE
                || this.contenido == Contenido.TE_CON_LECHE) {
            return true;
        } else {
            return false;
        }
    }

    public void setAzucar(int cantidadAzucar) {
        this.cantidadDeAzucar = cantidadAzucar;
    }

    public void setCafe() {
        this.contenido  = Contenido.CAFE;
    }

    public void setTe() {
        this.contenido = Contenido.TE;
    }

    public void setLeche() {
        if (this.contenido == Contenido.CAFE){
            this.contenido = Contenido.CAFE_CON_LECHE;
        } else if (this.contenido == Contenido.TE){
            this.contenido = Contenido.TE_CON_LECHE;
        } else {
            this.contenido = Contenido.LECHE;
        }
    }
}