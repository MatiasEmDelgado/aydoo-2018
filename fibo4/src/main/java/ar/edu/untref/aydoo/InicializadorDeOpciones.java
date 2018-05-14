package ar.edu.untref.aydoo;

public class InicializadorDeOpciones {
    private char horizontalVertical = 'h';
    private char directaInversa = 'd';
    private char listaSumatoria = 'l';
    private int numerosaMostrar;
    private String archivoSalida = "";

    public InicializadorDeOpciones(final String[] arg) {
        String principioDelComando = "";
        numerosaMostrar = Integer.parseInt(arg[arg.length - 1]);
        for (String comandoActual : arg) {
            if (comandoActual.length() > 3) {
                principioDelComando = comandoActual.substring(0, 3);
                switch (principioDelComando) {
                    case "-o=":
                        horizontalVertical = comandoActual.charAt(3);
                        directaInversa = comandoActual.charAt(4);
                        break;
                    case "-m=":
                        listaSumatoria = comandoActual.charAt(3);
                        break;
                    case "-f=":
                        archivoSalida = comandoActual.substring(3);
                        break;
                }
            }
        }
    }

    public boolean opcionesValidas() {
        return (horizontalVertical == 'h' || horizontalVertical == 'v')
                && (directaInversa == 'i' || directaInversa == 'd');
    }

    public char getDirectaInversa() {
        return directaInversa;
    }

    public char getHorizontalVertical() {
        return horizontalVertical;
    }

    public char getListaSumatoria() {
        return listaSumatoria;
    }

    public int getNumerosaMostrar() {
        return numerosaMostrar;
    }

    public String getArchivoSalida() {
        return archivoSalida;
    }
}
