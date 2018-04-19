package ar.edu.untref.aydoo;
public final class Fibonacci {

    public static final int OPCION_ORIENTACION = 3;
    public static final int OPCION_DIRECCION = 4;

    private Fibonacci() {

    }
    public static void main(final String[] args) {
        Integer numero;
        char orientacion;
        char direccion;
        String opciones;
        boolean opcionValida = true;

        if ( args.length == 1) {
            numero = Integer.parseInt(args[0]);
            orientacion = 'h';
            direccion = 'd';
            opcionValida = true;
        } else {
            numero = Integer.parseInt(args[1]);
            opciones  = args[0];
            orientacion = opciones.charAt(OPCION_ORIENTACION);
            direccion = opciones.charAt(OPCION_DIRECCION);
            opcionValida = true;
        }
        if ((orientacion != 'h' && orientacion != 'v')
                || (direccion != 'd' && direccion != 'i')) {
           opcionValida = false;
        }

        if (opcionValida) {
            caratula(numero, orientacion);
            if (direccion == 'd') {
                menorMayor(numero, orientacion);
            } else {
                mayorMenor(numero, orientacion);
            }
        } else {
            System.out.print("Opciones no validas.");
        }
    }

    private static void caratula(final Integer nro, final char orientacion) {
        if (orientacion == 'h') {
            System.out.print("fibo<" + nro + ">: ");
        } else {
            System.out.println("fibo<" + nro + ">: ");
        }
    }

    public static void menorMayor(final int entrada, final char orientacion) {
            Integer resultado;
            boolean ultimaImpresion = false;
            for (int i = 0; i < entrada; i++) {
                resultado = getFibonacci(i);
                if(i == entrada-1){
                    ultimaImpresion = true;
                }
                imprimir(resultado, orientacion, ultimaImpresion);
            }
        }

    public static void mayorMenor(final int entrada, final char orientacion) {
            Integer resultado;
            boolean ultimaImpresion = false;
            for (int i = entrada - 1; i >= 0; i--) {
                resultado = getFibonacci(i);
                if(i == 0){
                    ultimaImpresion = true;
                }
                imprimir(resultado, orientacion, ultimaImpresion);
            }
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

    private static void imprimir(final Integer nro, final char orientacion, final boolean ultimaImpresion) {
        if (orientacion == 'h') {
            if (!ultimaImpresion) {
                System.out.print(nro.toString() + " ");
            } else {
                System.out.print(nro.toString() + " ");
            }
        } else {
            if (!ultimaImpresion) {
                System.out.println(nro.toString());
            } else {
                System.out.print(nro.toString());
            }
        }
    }
}
