package ar.edu.untref.aydoo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EscribidorFibonacci {

    String archivo;
    int numerosAMostrar;

    public EscribidorFibonacci (InicializadorDeOpciones opciones){
        archivo = opciones.getArchivoSalida();
        numerosAMostrar = opciones.getNumerosaMostrar();
    }
    public void escribirEnSalida(String textoDeSalida) {
        System.out.println("fibo<" + numerosAMostrar + "> guardado en " + archivo);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(archivo, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.print(textoDeSalida);
        writer.close();
    }
}
