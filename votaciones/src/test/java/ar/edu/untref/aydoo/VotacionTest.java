package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class VotacionTest
{
    @Test
    public void unVotanteNoVotaUnCandidatoLaCantidadDeVotosDelCandidatoEsCero() {
        Votante unVotante = new Votante();
        Partido unPartido = new Partido();
        Candidato unCandidato = new Candidato(1, unPartido);
        unPartido.setCandidato(unCandidato);
        Assert.assertEquals(0, unPartido.getCandidato(unCandidato).getCantidadDeVotos());
    }

    @Test
    public void unVotanteVotaUnCandidatoLaCantidadDeVotosDelCandidatoEsUno()
    {
        Votante unVotante = new Votante();
        Partido unPartido = new Partido();
        Candidato unCandidato = new Candidato(1, unPartido);
        unPartido.setCandidato(unCandidato);
        unVotante.votar(unPartido.getCandidato(unCandidato));
        Assert.assertEquals(1, unPartido.getCandidato(unCandidato).getCantidadDeVotos());
    }
}
