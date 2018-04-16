package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {

    private HacedorDeCafeConLeche hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
    private Azucarero azucarero = new Azucarero();
    private HacedorDeTeConLeche hacedorDeTeConLeche = new HacedorDeTeConLeche();

    public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        azucarero.ponerAzucar(unVaso, cantidadAzucar);
        hacedorDeCafeConLeche.prepararEnVaso(unVaso);
    }

    public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
        azucarero.ponerAzucar(unVaso, cantidadAzucar);
        hacedorDeTeConLeche.prepararEnVaso(unVaso);
    }
}
