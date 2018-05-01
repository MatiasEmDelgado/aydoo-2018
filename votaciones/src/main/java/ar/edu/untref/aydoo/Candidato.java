package ar.edu.untref.aydoo;

public class Candidato {

    private Integer idCandidato;
    private Partido partidoCandidato;
    private int cantidadDeVotos = 0;

    public Candidato(int id, Partido partido, Provincia laRioja) {
        idCandidato = id;
        partidoCandidato = partido;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public Partido getPartidoCandidato() {
        return partidoCandidato;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void contarVoto() {
        cantidadDeVotos++;
    }
}
