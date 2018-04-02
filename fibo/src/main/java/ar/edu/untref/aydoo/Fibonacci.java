package ar.edu.untref.aydoo;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int entrada = Integer.parseInt(args[0]);

        //Scanner scanner = new Scanner(System.in);
        //entrada = scanner.nextInt();
        //scanner.close();

        System.out.print("fibo<"+ entrada + ">: " + getResultado(entrada));
    }

    public static String getResultado(int entrada){
        String resultado = "";
        for (int i = 0; i < entrada; i++) {
            resultado = resultado+getFibonacci(i);
            if (i != entrada - 1) {
                resultado=resultado+" ";
            }
        }
        return resultado;
    }
    private static int getFibonacci(int number) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < number; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        if(number == 1){
            return 1;
        }else{
            return c;
        }
    }
}
