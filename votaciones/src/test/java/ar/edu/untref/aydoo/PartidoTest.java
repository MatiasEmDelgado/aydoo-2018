package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {
    @Test
    public void candidatoGanadorDelPartidoEnLaRioja() {
        Provincia laRioja = new Provincia("La Rioja");
        Votante votanteUno = new Votante(laRioja);
        Votante votanteDos = new Votante(laRioja);
        Votante votanteTres = new Votante(laRioja);
        Votante votanteCuatro = new Votante(laRioja);
        Partido socialista = new Partido();
        Candidato unCandidatoDeLaRioja = new Candidato(1, socialista, laRioja);
        Candidato otroCandidatoDeLaRioja = new Candidato(2, socialista, laRioja);
        Candidato ultimoCandidatoDeLaRioja = new Candidato(3, socialista, laRioja);
        socialista.setCandidato(unCandidatoDeLaRioja);
        socialista.setCandidato(otroCandidatoDeLaRioja);
        socialista.setCandidato(ultimoCandidatoDeLaRioja);
        votanteUno.votar(socialista.getCandidato(unCandidatoDeLaRioja));
        votanteDos.votar(socialista.getCandidato(otroCandidatoDeLaRioja));
        votanteTres.votar(socialista.getCandidato(unCandidatoDeLaRioja));
        votanteCuatro.votar(socialista.getCandidato(unCandidatoDeLaRioja));
        Assert.assertTrue(socialista.getCandidatoGanadorDelPartido(laRioja).equals(unCandidatoDeLaRioja));
    }
}
