package exercicios;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Piscina {

     public static void main(String[] args) {


        double custo = 45;
        double orcamento = calcular(custo,volume(10,10,2));

        System.out.println("Valor do Orçamento: "+orcamento);
    }

    private static double volume (double comprimento, double largura, double profundidade){
        return (comprimento*largura*profundidade);
    }

    private static double calcular(double custo, double volume ){
        return custo*volume;
    }

}
