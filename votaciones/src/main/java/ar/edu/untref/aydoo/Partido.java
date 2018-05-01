package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    private List<Candidato> candidatos = new ArrayList<Candidato>();

    public void setCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public Candidato getCandidato(Candidato unCandidato) {
        Candidato candidatoARetornar = null;
        for (Candidato candidato : candidatos) {
            if(unCandidato.getIdCandidato() == candidato.getIdCandidato()){
                candidatoARetornar = candidato;
            }
        }
        return candidatoARetornar;
    }
}
