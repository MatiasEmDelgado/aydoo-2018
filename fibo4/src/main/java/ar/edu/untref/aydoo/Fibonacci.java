package ar.edu.untref.aydoo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Fibonacci {

    public static void main(final String[] arg) {
        String textoDeSalida = "";
        InicializadorDeOpciones opciones = new InicializadorDeOpciones(arg);

        FibonacciCalculador fibo = new FibonacciCalculador(opciones.getNumerosaMostrar());
        if (opciones.getDirectaInversa() == 'i') {
            fibo.invertir();
        }

        if (opciones.opcionesValidas()) {
            switch (opciones.getListaSumatoria()) {
                case 'l':
                    textoDeSalida = "fibo<" + opciones.getNumerosaMostrar()+ ">:";
                    switch (opciones.getHorizontalVertical()) {
                        case 'h':
                            textoDeSalida += fibo.mostrarFiboHorizontal();
                            break;
                        case 'v':
                            textoDeSalida += fibo.mostrarFiboVertical();
                            break;
                    }
                    break;
                case 's':
                    textoDeSalida = "fibo<" + opciones.getNumerosaMostrar() + ">s:";
                    if (opciones.getHorizontalVertical() == 'h') textoDeSalida += " ";
                    if (opciones.getHorizontalVertical() == 'v') textoDeSalida += "\r\n";
                    textoDeSalida += fibo.sumatoria();
                    break;
            }
        } else textoDeSalida = "Opciones no validas";


        if (opciones.getArchivoSalida() != "") {
            EscribidorFibonacci escribidorFibonacci = new EscribidorFibonacci(opciones);
            escribidorFibonacci.escribirEnSalida(textoDeSalida);
        } else {
            System.out.println(textoDeSalida);
        }
    }
}







