package ar.edu.untref.aydoo;

public class Votante {

    private Provincia provinciaVotante;
    private int votos = 0;

    public Votante(Provincia provincia) {
        provinciaVotante = provincia;
    }
    public void votar(Candidato candidato) {
        if(candidato.getProvincia().getNombre() == provinciaVotante.getNombre() && votos == 0){
            candidato.contarVoto();
            votos++;
        }
    }
}
