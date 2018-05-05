package ar.edu.untref.aydoo;

public class Cliente {

    private String nombreCliente;

    private String apellidoCliente;

    private String direccionCliente;

    public Cliente(String nombre, String apellido, String direccion) {
        nombreCliente = nombre;
        apellidoCliente = apellido;
        direccionCliente = direccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
}
