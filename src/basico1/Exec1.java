package basico1;

import basico.Exec;

public class Exec1 {

    public static void main(String[] args){

        Exec.imprimir("Figueira no mundial 2023");

        // Sobrecarga: métodos com mesma assinatura, diferindo no tipo e/ou número de parâmetros

        System.out.println();
        System.out.println("kkkkk");
        System.out.println(1);
        System.out.println(true);

        somar(2,4);
    }

    // Meus métodos com sobrecarga:
    private static int somar(int a, int b){
        return a+b;
    }

    private static double somar(double a, double b){
        return a+b;
    }
}
