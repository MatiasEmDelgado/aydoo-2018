package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class VotacionTest
{
    @Test
    public void unVotanteNoVotaUnCandidatoLaCantidadDeVotosDelCandidatoEsCero() {
        Votante unVotante = new Votante();
        Provincia provincia = new Provincia("Sin provincia");
        Partido unPartido = new Partido();
        Candidato unCandidato = new Candidato(1, unPartido, provincia);
        unPartido.setCandidato(unCandidato);
        Assert.assertEquals(0, unPartido.getCandidato(unCandidato).getCantidadDeVotos());
    }

    @Test
    public void unVotanteVotaUnCandidatoLaCantidadDeVotosDelCandidatoEsUno()
    {
        Votante unVotante = new Votante();
        Provincia provincia = new Provincia("Sin provincia");
        Partido unPartido = new Partido();
        Candidato unCandidato = new Candidato(1, unPartido, provincia);
        unPartido.setCandidato(unCandidato);
        unVotante.votar(unPartido.getCandidato(unCandidato));
        Assert.assertEquals(1, unPartido.getCandidato(unCandidato).getCantidadDeVotos());
    }

    @Test
    public void unVotanteVotaUnCandidatoEnLaRiojaLaCantidadDeVotosDelCandidatoEsUno()
    {
        Votante unVotante = new Votante();
        Provincia laRioja = new Provincia("La Rioja");
        Partido unPartido = new Partido();
        Candidato unCandidato = new Candidato(1, unPartido, laRioja);
        unPartido.setCandidato(unCandidato);
        unVotante.votar(unPartido.getCandidato(unCandidato));
        Assert.assertEquals(1, unPartido.getCandidato(unCandidato).getCantidadDeVotos());
    }
}
