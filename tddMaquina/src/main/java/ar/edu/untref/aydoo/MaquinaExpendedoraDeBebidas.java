package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

    public void hacerCafeConLecheConNDeAzucar(final Vaso unVaso, final int cantidadAzucar) {
        unVaso.setAzucar(cantidadAzucar);
        unVaso.setCafe();
    }

    public void hacerTeConLecheConNDeAzucar(final Vaso unVaso, final int cantidadAzucar) {
        unVaso.setAzucar(cantidadAzucar);
        unVaso.setTe();
    }
}
