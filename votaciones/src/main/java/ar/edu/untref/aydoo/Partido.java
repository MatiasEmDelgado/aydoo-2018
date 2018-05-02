package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    private List<Candidato> candidatos = new ArrayList<Candidato>();
    private int cantidadDeVotos = 0;
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

    public Candidato getCandidatoGanadorDelPartido(Provincia provincia) {
        Candidato candidatoGanador = new Candidato(0, null, provincia);
        ArrayList<Candidato> candidatosDeLaProvincia = getCandidatos(provincia);
        for (Candidato candidato : candidatosDeLaProvincia) {
            if(candidato.getCantidadDeVotos() > candidatoGanador.getCantidadDeVotos()){
                candidatoGanador = candidato;
            }
        }
        return candidatoGanador;
    }

    private ArrayList<Candidato> getCandidatos(Provincia provincia) {
        ArrayList<Candidato> candidatosDeLaProvincia = new ArrayList<Candidato>();
        for (Candidato candidato : candidatos) {
            if(candidato.getProvincia().getNombre() == provincia.getNombre()) {
                candidatosDeLaProvincia.add(candidato);
            }
        }
        return  candidatosDeLaProvincia;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void contarVoto() {
        cantidadDeVotos++;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }
}
