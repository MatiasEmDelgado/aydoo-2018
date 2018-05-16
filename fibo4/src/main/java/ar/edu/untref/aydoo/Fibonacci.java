package ar.edu.untref.aydoo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Fibonacci {

    public static void main(final String[] arg) {

        String textoDeSalida = "";
        InicializadorDeOpciones opciones = new InicializadorDeOpciones(arg);
        int numero = opciones.getNumero();
        char direccion = opciones.getDireccion();
        char modo = opciones.getModo();
        char orientacion = opciones.getOrientacion();
        char numerosAImprimir = opciones.getNumerosAImprimir();
        String nombreArchivo = opciones.getNombreArchivo();

        System.out.println("numero: " + numero);
        System.out.println("direccion :" + direccion);
        System.out.println("modo: " + modo);
        System.out.println("orientacion: " + orientacion);
        System.out.println("archivo: " + nombreArchivo);
        System.out.println("pares: " + numerosAImprimir);

        FibonacciCalculador fibo = new FibonacciCalculador(numero);
        if (direccion == 'i') {
            fibo.invertir();
        }

        if (opciones.opcionesValidas()) {
            switch (modo) {
                case 'l':
                    textoDeSalida = "fibo<" + numero+ ">:";
                    switch (orientacion) {
                        case 'h':
                            if(numerosAImprimir == 'p') {
                                textoDeSalida += fibo.mostrarFiboHorizontalPares();
                            } else {
                                textoDeSalida += fibo.mostrarFiboHorizontal();
                            }

                            break;
                        case 'v':
                            if(numerosAImprimir == 'p') {
                                textoDeSalida += fibo.mostrarFiboVerticalPares();
                            } else {
                                textoDeSalida += fibo.mostrarFiboVertical();
                            }

                            break;
                        case 'p':
                            if(numerosAImprimir == 'p') {
                                textoDeSalida += fibo.mostrarFiboProgresivoPar(numero, direccion);
                            } else {
                                textoDeSalida += fibo.mostrarFiboProgresivo(numero, direccion);
                            }
                    }
                    break;
                case 's':
                    textoDeSalida = "fibo<" + numero + ">s:";
                    if (orientacion == 'h') textoDeSalida += " ";
                    if (orientacion == 'v') textoDeSalida += "\r\n";
                    if (numerosAImprimir == 'p') {
                        textoDeSalida += fibo.sumatoriaPar();
                    } else {
                        textoDeSalida += fibo.sumatoria();
                    }
                    break;
            }
        } else textoDeSalida = "Opciones no validas";


        if (nombreArchivo != null) {
            EscribidorFibonacci escribidorFibonacci = new EscribidorFibonacci(opciones);
            escribidorFibonacci.escribirEnSalida(textoDeSalida);
        } else {
            System.out.println(textoDeSalida);
        }
    }
}







