package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CamaraElectoralTest {

    @Ignore
    public void candidatoGanadorEnCadaProvincia() {

        CamaraElectoral camaraElectoral = new CamaraElectoral();

        Provincia catamarca = new Provincia("Catamarca");
        Provincia caba = new Provincia ("Ciudad Autónoma de Buenos Aires");
        Provincia cordoba = new Provincia("Cordoba");
        Provincia corrientes = new Provincia("Corrientes");
        Provincia chaco = new Provincia("Chaco");
        Provincia chubut = new Provincia("Chubut");
        Provincia entreRios= new Provincia("Entre Rios");
        Provincia formosa = new Provincia("Formosa");
        Provincia jujuy = new Provincia("Jujuy");
        Provincia laPampa= new Provincia("La Pampa");
        Provincia laRioja= new Provincia("La Rioja");
        Provincia mendoza = new Provincia("Mendoza");
        Provincia misiones = new Provincia("Misiones");
        Provincia neuquen = new Provincia("Neuquen");
        Provincia buenosAires= new Provincia("Provincia de Buenos Aires");
        Provincia rioNegro= new Provincia("Rio Negro");
        Provincia salta = new Provincia("Salta");
        Provincia sanJuan = new Provincia("San Juan");
        Provincia sanLuis = new Provincia("San Luis");
        Provincia santaCruz = new Provincia("Santa Cruz");
        Provincia santaFe = new Provincia("Santa Fe");
        Provincia santiagoDelEstero= new Provincia("Santiago del Estero");
        Provincia tierraDelFuego = new Provincia("Tierra del Fuego, Antartida e Isla del Atlantico Sur");
        Provincia tucuman= new Provincia("Tucuman");

        Votante votanteSocialista = new Votante(catamarca);
        Votante votanteComunista = new Votante(catamarca);
        Votante votanteRadicalista = new Votante(catamarca);
        Votante otroVotanteSocialista = new Votante(catamarca);

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
