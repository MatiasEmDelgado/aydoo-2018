package ar.edu.untref.aydoo;

public class Compra {

    private Libro libroDeLaCompra;
    private Cliente clienteDeLaCompra;
    private int mesDeLaCompra;

    public Compra(Libro libro, Cliente cliente, int mes) {
        libroDeLaCompra = libro;
        clienteDeLaCompra = cliente;
        mesDeLaCompra = mes;
    }

    public Libro getLibroDeLaCompra() {
        return libroDeLaCompra;
    }
}
