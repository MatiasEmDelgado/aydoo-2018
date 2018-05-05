package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class MesTest {

    @Test
    public void elMesDeAbril2018DeberiaDevolverLaFecha5AlObtenerNumeroDeMes() {
        Mes abril2018 = new Mes(5, 2018);
        int numeroDelMes = abril2018.getNumeroDelMes();
        Assert.assertEquals(5, numeroDelMes);
    }

    @Test
    public void elMesDeAbril2018DeberiaDevolverElAño2018AlObtenerAnioDeMes() {
        Mes abril2018 = new Mes(5, 2018);
        int anioDelMes = abril2018.getAnioDelMes();
        Assert.assertEquals(2018, anioDelMes);
    }
}
