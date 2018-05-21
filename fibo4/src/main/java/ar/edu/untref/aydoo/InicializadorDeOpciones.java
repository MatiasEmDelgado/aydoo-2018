package ar.edu.untref.aydoo;

public class InicializadorDeOpciones {

    private char orientacion;
    private char direccion;
    private char modo;
    private Integer numero;
    private String archivo;
    private char numerosAImprimir;

    public InicializadorDeOpciones(String[] entrada) {
        if(entrada.length != 0) {
            for(int i = 0; i < entrada.length; i++) {
                if(esParseable(entrada[i])) {
                    numero = Integer.parseInt(entrada[i]);
                } else if(entrada[i].contains("-o=")) {
                    orientacion = entrada[i].charAt(3);
                    direccion = entrada[i].charAt(4);
                } else if (entrada[i].contains("-f=")) {
                    archivo = entrada[i].substring(3);
                } else if (entrada[i].contains("-m=")) {
                    modo = entrada[i].charAt(3);
                } else if (entrada[i].contains("-n=p")) {
                    numerosAImprimir = 'p';
                }
            }
            if(orientacion == '\0') {orientacion = 'h';}
            if(direccion == '\0') {direccion = 'd';}

        } else {
            orientacion = 'x';
            direccion = 'x';
            modo = 'x';
            numerosAImprimir = 'x';
            numero = 0;
        }
    }

    public char getOrientacion() {
        return orientacion;
    }

    public char getDireccion() {
        return direccion;
    }

    public String getArchivo() {
        return archivo;
    }

    public Integer getNumero() {
        return numero;
    }

    public char getNumerosAImprimir() {
        if( numerosAImprimir == '\0') {
            numerosAImprimir = 't';
        }
        return numerosAImprimir;
    }

    public boolean opcionesValidas() {
        boolean opcionValida = true;

        if (((orientacion != 'h' && orientacion != 'v' && orientacion != 'p')
                || (direccion != 'd' && direccion != 'i'))
                || (numero == null)) {
            opcionValida = false;
        }
        return opcionValida;
    }

    public char getModo() {
        if(modo == '\0'){
            modo = 'l';
        }
        return modo;
    }

    public String getNombreArchivo() {
        return archivo;
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
}