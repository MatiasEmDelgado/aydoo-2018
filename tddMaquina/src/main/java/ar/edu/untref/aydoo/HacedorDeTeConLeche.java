package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {

    private Lechero lechero = new Lechero();
    private Azucarero azucarero = new Azucarero();
    private Tetero tetero = new Tetero();

    public void prepararEnVaso(Vaso unVaso) {
        tetero.setTe(unVaso);
    }
}
