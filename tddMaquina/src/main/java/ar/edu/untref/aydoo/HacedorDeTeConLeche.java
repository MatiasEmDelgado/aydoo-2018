package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {

    private Lechero lechero = new Lechero();
    private Tetero tetero = new Tetero();

    public void prepararEnVaso( final Vaso unVaso) {
        tetero.setTe(unVaso);
        lechero.ponerLecheUnVaso(unVaso);
    }
}
