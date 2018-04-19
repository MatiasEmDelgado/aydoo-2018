package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

    public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        unVaso.setAzucar(cantidadAzucar);
        unVaso.setCafe();
    }

    public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        unVaso.setAzucar(cantidadAzucar);
        unVaso.setTe();
    }
}