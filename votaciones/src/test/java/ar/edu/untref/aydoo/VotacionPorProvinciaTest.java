package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class VotacionPorProvinciaTest {

    @Test
    public void candidatoConMasVotosEnLaRioja() {
        CamaraElectoral camaraElectoral = new CamaraElectoral();

        Provincia laRioja = new Provincia("La Rioja");
        Provincia laPampa = new Provincia("La Pampa");

        Votante votanteSocialista = new Votante(laRioja);
        Votante votanteComunista = new Votante(laPampa);
        Votante votanteRadicalista = new Votante(laRioja);
        Votante otroVotanteSocialista = new Votante(laRioja);


        Partido socialista = new Partido();
        Partido comunista = new Partido();
        Partido radicalista = new Partido();

        camaraElectoral.agregarPartido(socialista);
        camaraElectoral.agregarPartido(comunista);
        camaraElectoral.agregarPartido(radicalista);

        Candidato unCandidatoDeLaRioja = new Candidato(1, socialista, laRioja);
        Candidato unCandidatoDeLaPampa = new Candidato(2, comunista, laPampa);
        Candidato otroCandidatoDeLaRioja = new Candidato(3, radicalista, laRioja);

        socialista.setCandidato(unCandidatoDeLaRioja);
        comunista.setCandidato(unCandidatoDeLaPampa);
        radicalista.setCandidato(otroCandidatoDeLaRioja);

        votanteSocialista.votar(socialista.getCandidato(unCandidatoDeLaRioja));
        votanteComunista.votar(comunista.getCandidato(unCandidatoDeLaPampa));
        votanteRadicalista.votar(radicalista.getCandidato(otroCandidatoDeLaRioja));
        otroVotanteSocialista.votar(socialista.getCandidato(unCandidatoDeLaRioja));

        Assert.assertTrue(camaraElectoral.getCandidatoGanadorProvincial(laRioja).equals(unCandidatoDeLaRioja));
    }
}
