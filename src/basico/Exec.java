package basico;

import java.util.Date;

public class Exec {

    public static void main(String[] args) {
        // System.out.println("Eu sou um programador Java");
        int x = 10;
        int y = 20;
        int total = x + y;
        // int total = somar(x,y);
        double resultado = dividir(x,y);
        System.out.println("Total: "+total+"\nTotal da divisao: "+resultado);

        imprimir(" Inter no mundial");

        Date data = new Date();

    }

    private static int somar(int x, int y){
        return x + y;
    }

    private static double dividir(double a, double b){
        return a/b;
    }

    public static void imprimir(String frase){
        System.out.println("A frase a imprimir é:" +frase);
    }

}
