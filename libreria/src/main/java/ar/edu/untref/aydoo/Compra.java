package ar.edu.untref.aydoo;

public class Compra {

    private Producto productoDeLaCompra;
    private Cliente clienteDeLaCompra;
    private int mesDeLaCompra;

    public Compra(Producto producto, Cliente cliente, int mes) {
        productoDeLaCompra = producto;
        clienteDeLaCompra = cliente;
        mesDeLaCompra = mes;
    }

    public Producto getProductoDeLaCompra() {
        return productoDeLaCompra;
    }

    public Cliente getClienteDeLaCompra() {
        return clienteDeLaCompra;
    }

    public int getMesDeLaCompra() {
        return mesDeLaCompra;
    }
}
