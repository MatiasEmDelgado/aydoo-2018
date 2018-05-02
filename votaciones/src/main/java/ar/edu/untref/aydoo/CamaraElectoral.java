package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CamaraElectoral {

    private List<Partido> partidos = new ArrayList<Partido>();

    private List<Provincia> provinciasDeLaRePublicaArgentina = new ArrayList<Provincia>();

    public CamaraElectoral() {
        provinciasDeLaRePublicaArgentina.add(new Provincia("Catamarca"));
        provinciasDeLaRePublicaArgentina.add(new Provincia("Ciudad Autonoma de Buenos Aires"));
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
        Candidato candidatoGanador = new Candidato(0, null, provincia);
        for(Partido partido : partidos) {
           Candidato candidato = partido.getCandidatoGanadorDelPartido(provincia);
           if(candidato.getCantidadDeVotos() > candidatoGanador.getCantidadDeVotos()) {
               candidatoGanador = candidato;
           }
        }
        return candidatoGanador;
    }

    public HashMap<String, Candidato> getGanadorEnCadaProvincia() {
        HashMap<String, Candidato> ganadoresPorProvincia = new HashMap<String, Candidato>();
        for (Provincia provincia : provinciasDeLaRePublicaArgentina) {
            Candidato candidato = getCandidatoGanadorProvincial(provincia);
            ganadoresPorProvincia.put(provincia.getNombre(), getCandidatoGanadorProvincial(provincia));
        }
        return ganadoresPorProvincia;
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public Partido getPartidoNacionalGanador() {
        Partido partidoNacionalGanador = new Partido();
        for (Partido partido : partidos) {
            if(partido.getCantidadDeVotos() > partidoNacionalGanador.getCantidadDeVotos()) {
                partidoNacionalGanador = partido;
            }
        }
        return partidoNacionalGanador;
    }
}
