package ar.edu.untref.aydoo;

public class Candidato {

    private Integer idCandidato;
    private Partido partidoCandidato;
    private Provincia provinciaCandidato;
    private int cantidadDeVotos = 0;

    public Candidato(int id, Partido partido, Provincia provincia) {
        idCandidato = id;
        partidoCandidato = partido;
        provinciaCandidato = provincia;
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

    public Provincia getProvincia() {
        return provinciaCandidato;
    }
}
