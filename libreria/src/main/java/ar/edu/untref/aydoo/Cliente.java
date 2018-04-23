package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Compra> comprasDelCliente = new ArrayList<Compra>();

    public void comprar(Libro unLibro) {
        Compra compraDelCliente = new Compra();
        compraDelCliente.agregarLibroAlaCompra(unLibro);
        comprasDelCliente.add(compraDelCliente);

    }

    public ArrayList<Compra> getComprasDelCliente() {
        return comprasDelCliente;
    }
}
