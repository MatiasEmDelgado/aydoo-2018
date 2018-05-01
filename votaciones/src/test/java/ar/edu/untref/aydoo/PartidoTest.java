package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {
    @Test
    public void candidatoGanadorDelPartidoEnLaRioja() {
        Votante votanteUno = new Votante();
        Votante votanteDos = new Votante();
        Votante votanteTres = new Votante();
        Votante votanteCuatro = new Votante();
        Provincia laRioja = new Provincia("La Rioja");
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
