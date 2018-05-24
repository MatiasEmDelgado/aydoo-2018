package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FibonacciCalculador {

    private int[] fibo;

    public FibonacciCalculador(int cantidadDeNumeros) {
        fibo  = this.calcularFiboConLongitud(cantidadDeNumeros);
    }

    private int[] calcularFiboConLongitud(int longitud) {
        int[] salida = new int[longitud];
        int primerNumero, segundoNumero, tercerNumero;
        primerNumero = 0;
        segundoNumero = 1;

        if (longitud > 0) {
            salida[0] = 0;
        }
        if (longitud > 1) {
            salida[1] = 1;
        }

        for (int i = 2; i < longitud; i++) {
            tercerNumero = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = tercerNumero;
            salida[i] = tercerNumero;
        }
        return salida;
    }

    public void invertir() {
        int[] fiboNuevo = new int[this.fibo.length];
        int contadorFiboNuevo = 0;
        for (int i = this.fibo.length; i > 0; i--) {
            fiboNuevo[contadorFiboNuevo] = fibo[i - 1];
            contadorFiboNuevo++;
        }

        fibo = fiboNuevo;
    }

    public String mostrarFiboVertical() {
        String cadenaAMostrar = "\r\n";
        for (int i = 0; i < this.fibo.length; i++) {
            cadenaAMostrar += (String.valueOf(this.fibo[i]) + "\r\n");
        }
        return cadenaAMostrar;
    }

    public String mostrarFiboVerticalPares() {
        String cadenaAuxiliar = "\r\n";
        String cadenaAMostrar = "\r\n";
        String[] cadenaSpliteada;
        for (int i = 0; i < this.fibo.length; i++) {
            cadenaAuxiliar += (String.valueOf(this.fibo[i]) + "\r\n");
        }
        cadenaSpliteada = cadenaAuxiliar.split("\r\n");
        for (int i = 0; i < cadenaSpliteada.length; i++) {
            if(esParseable(cadenaSpliteada[i]) && Integer.parseInt(cadenaSpliteada[i]) != 0) {
                if (Integer.parseInt(cadenaSpliteada[i]) % 2 == 0) {
                    cadenaAMostrar += cadenaSpliteada[i] + "\r\n";
                }
            }
        }
        return cadenaAMostrar;
    }

    public String mostrarFiboHorizontal() {
        String cadenaAMostrar = "";
        for (int i = 0; i < this.fibo.length; i++) {
            if (i == 0) {
                cadenaAMostrar += (this.fibo[i]);
            } else {
                cadenaAMostrar += (" " + this.fibo[i]);
            }
        }
        return cadenaAMostrar;
    }

    public String mostrarFiboHorizontalPares() {
        String cadenaAMostrar = "";
        String cadenaAuxiliar = "";
        String[] cadenaSpliteada;
        for (int i = 0; i < this.fibo.length; i++) {
            cadenaAuxiliar += (" " + this.fibo[i]);
        }
        cadenaSpliteada = cadenaAuxiliar.split("\\s+");
        for (int i = 0; i < cadenaSpliteada.length; i++) {
            if(esParseable(cadenaSpliteada[i]) && Integer.parseInt(cadenaSpliteada[i]) != 0) {
                if(Integer.parseInt(cadenaSpliteada[i]) % 2 == 0){
                    cadenaAMostrar += " ";
                    cadenaAMostrar += cadenaSpliteada[i];
                }
            }
        }
        return cadenaAMostrar;
    }

    public int sumatoria() {
        int total = 0;
        for (int i = 0; i < this.fibo.length; i++) {
            total += this.fibo[i];
        }
        return total;
    }

    public String mostrarFiboProgresivo(int numero, char direccion) {
        String prograsionFibo = "";
        if(direccion == 'i'){
            prograsionFibo += "\n";
            for(int j = 0; j < numero; j++) {
                int i = numero;
                int[] fiboInvertido = new int[j+1];
                for(int k = 0; k <= j; k++) {
                    fiboInvertido[k] = getFibonacci(i-1);
                    i--;
                }
                fibo = fiboInvertido;
                prograsionFibo += mostrarFiboHorizontal();
                prograsionFibo += "\r\n";
            }
        } else {
            for(int i = 0; i < numero+1; i++){
                fibo = calcularFiboConLongitud(i);
                prograsionFibo += mostrarFiboHorizontal();
                prograsionFibo += "\r\n";
            }
        }
        return prograsionFibo;
    }

    private static int getFibonacci(final int numero) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < numero; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        if (numero == 1) {
            return 1;
        } else {
            return c;
        }
    }

    private boolean esParseable(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(Exception e){
            parsable = false;
        }
        return parsable;
    }

    public int sumatoriaPar() {
        int total = 0;
        for (int i = 0; i < this.fibo.length; i++) {
            if(this.fibo[i] % 2 == 0){
                total += this.fibo[i];
            }
        }
        return total;
    }

    public String mostrarFiboProgresivoPar(int numero, char direccion) {
        ArrayList<String> renglones = new ArrayList<String>();
        String prograsionFibo = "";
        String resultado = "\r\n";
        String cadenaAMostrar = " ";
        int longitudFibo = numero;
        String[] progreciones = new String[8];
        String[] aux;

        if(direccion == 'i'){
            prograsionFibo += "\n";
            for(int j = 0; j < numero; j++) {
                int i = numero;
                int[] fiboInvertido = new int[j+1];
                for(int k = 0; k <= j; k++) {
                    fiboInvertido[k] = getFibonacci(i-1);
                    i--;
                }
                fibo = fiboInvertido;
                prograsionFibo += mostrarFiboHorizontal();
                prograsionFibo += "\r\n";
                progreciones = prograsionFibo.split("\r\n");
            }
        } else {
            longitudFibo++;
            for(int i = 0; i < numero + 1; i++){
                fibo = calcularFiboConLongitud(i);
                prograsionFibo += mostrarFiboHorizontal();
                prograsionFibo += "\r\n";
                progreciones = prograsionFibo.split("\r\n");
            }
        }
        for(int i = 0; i < longitudFibo; i++) {
            String[] cadenaSpliteada = progreciones[i].split("\\s+");
            for (int j = 0; j < cadenaSpliteada.length; j++) {
                if(esParseable(cadenaSpliteada[j]) && Integer.parseInt(cadenaSpliteada[j]) != 0) {
                    if(Integer.parseInt(cadenaSpliteada[j]) % 2 == 0){
                        cadenaAMostrar += cadenaSpliteada[j] + " ";
                    }
                }
            } cadenaAMostrar += "\r\n";
        }

        aux = cadenaAMostrar.split("\r\n");
        for(int i = 0; i < aux.length; i++) {
                renglones.add(aux[i]);
        }
        List<String> renglonesDistintos = renglones.stream().distinct().collect(Collectors.toList());

       for (String renglon : renglonesDistintos) {
           if(renglon.length() > 1){
               resultado += renglon + "\r\n";
           }
        }

        return resultado;
    }
}
