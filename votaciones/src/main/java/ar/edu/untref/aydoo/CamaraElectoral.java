package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class CamaraElectoral {

    private List<Partido> partidos = new ArrayList<Partido>();

    public Candidato getCandidatoGanadorProvincial(Provincia provincia) {
        for (Partido partido : partidos) {
           Candidato candidato = partido.getCandidatoGanadorDelPartido(provincia);
        }
        return null;
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }
}
