package oo;

public class Exec {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.codigo = 1;
        produto.nome = "Pão";
        produto.preco = 1.15;
        produto.quantidade = 1;
        Produto.marca = "Pullman";

        System.out.println(produto.calcularValorTotal());

        imprimirProduto(produto);
    }

    private static void imprimirProduto(Produto produto){
        System.out.println(produto.codigo);
        System.out.println(produto.nome);
        System.out.println(Produto.marca);
    }

}
