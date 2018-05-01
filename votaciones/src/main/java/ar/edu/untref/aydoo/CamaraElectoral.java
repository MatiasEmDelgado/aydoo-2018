package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CamaraElectoral {
    private List<Partido> partidos = new ArrayList<Partido>();

    private List<Provincia> provinciasDeLaRePublicaArgentina = new ArrayList<Provincia>();

    public CamaraElectoral() {
        provinciasDeLaRePublicaArgentina.add(new Provincia("Catamarca"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Ciudad Autónoma de Buenos Aires"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Cordoba"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Corrientes"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Chaco"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Chubut"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Entre Rios"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Formosa"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Jujuy"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("La Pampa"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("La Rioja"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Mendoza"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Misiones"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Neuquen"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Provincia de Buenos Aires"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Rio Negro"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Salta"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("San Juan"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("San Luis"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Santa Cruz"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Santa Fe"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Santiago del Estero"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Tierra del Fuego, Antartida e Isla del Atlantico Sur"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Tucuman"));
    }

    public Candidato getCandidatoGanadorProvincial(Provincia provincia) {
        Candidato candidatoGanador = partidos.get(0).getCandidatos().get(0);
        for(Partido partido : partidos) {
           Candidato candidato = partido.getCandidatoGanadorDelPartido(provincia);
           if(candidato.getCantidadDeVotos() > candidatoGanador.getCantidadDeVotos()) {
               candidatoGanador = candidato;
           }
        }
        return candidatoGanador;
    }

    public HashMap<Provincia, Candidato> getGanadorEnCadaProvincia() {
        HashMap<Provincia, Candidato> ganadoresPorProvincia = new HashMap<Provincia, Candidato>();
        for (Provincia provincia : provinciasDeLaRePublicaArgentina) {
            ganadoresPorProvincia.put(provincia, getCandidatoGanadorProvincial(provincia));
        }
        return ganadoresPorProvincia;
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }
}
