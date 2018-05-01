package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class CamaraElectoral {

    private List<Partido> partidos = new ArrayList<Partido>();

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

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }
}
