package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MesTest {

    private int numeroDelMes;
    private int anioDelMes;

    @Before
    public void inicializoUnMes() {
        Mes abril2018 = new Mes(5, 2018);
        numeroDelMes = abril2018.getNumeroDelMes();
        anioDelMes = abril2018.getAnioDelMes();
    }
    @Test
    public void elMesDeAbril2018DeberiaDevolverLaFecha5AlObtenerNumeroDeMes() {
        Assert.assertEquals(5, numeroDelMes);
    }

    @Test
    public void elMesDeAbril2018DeberiaDevolverElAño2018AlObtenerAnioDeMes() {
        Assert.assertEquals(2018, anioDelMes);
    }
}
