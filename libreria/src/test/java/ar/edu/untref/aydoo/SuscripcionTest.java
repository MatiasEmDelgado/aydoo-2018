package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SuscripcionTest {

    private List<Mes> mesesDeLaSuscripcion;
    private Suscripcion elGrafico;

    @Before
    public void inicializoListaDeMesesYUnaSuscripcion() {
        mesesDeLaSuscripcion = new ArrayList<Mes>();
        elGrafico = new Suscripcion(100.0, 1, mesesDeLaSuscripcion);
    }

    @Test
    public void unaSuscripcionDeCosto100ParaElMesDeAbril2018DeberiaCostar100() {
        Mes abril2018 = new Mes(4, 2018);
        mesesDeLaSuscripcion.add(abril2018);
        Assert.assertEquals(100, elGrafico.getPrecio(), 1);
    }

    @Test
    public void unaSuscripcionDeCosto100ParaElMesDeAbrilYMayo2018DeberianCostar200() {
        Mes abril2018 = new Mes(4, 2018);
        Mes mayo2018 = new Mes(5, 2018);
        mesesDeLaSuscripcion.add(abril2018);
        mesesDeLaSuscripcion.add(mayo2018);

        Assert.assertEquals(200, elGrafico.getPrecio(), 1);
    }
}
