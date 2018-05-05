package ar.edu.untref.aydoo;

public class Compra {

    private Producto productoDeLaCompra;
    private Cliente clienteDeLaCompra;
    private Mes mesDeLaCompra;

    public Compra(Producto producto, Cliente cliente, Mes mes) {
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

    public Mes getMesDeLaCompra() {
        return mesDeLaCompra;
    }
}
