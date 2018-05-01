package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class VotacionPorProvinciaTest {

    @Ignore
    public void candidatoConMasVotosEnLaRioja() {
        CamaraElectoral camaraElectoral = new CamaraElectoral();
        Votante votanteSocialista = new Votante();
        Votante votanteComunista = new Votante();
        Votante votanteRadicalista = new Votante();
        Votante otroVotanteSocialista = new Votante();
        Provincia laRioja = new Provincia("La Rioja");
        Provincia laPampa = new Provincia("La Pampa");
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
        votanteRadicalista.votar(radicalista.getCandidato(unCandidatoDeLaRioja));
        otroVotanteSocialista.votar(socialista.getCandidato(unCandidatoDeLaRioja));
        Assert.assertTrue(camaraElectoral.getCandidatoGanadorProvincial(laRioja).equals(unCandidatoDeLaRioja));
    }
}
