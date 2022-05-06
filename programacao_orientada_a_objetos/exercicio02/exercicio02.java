package programacao_orientada_a_objetos.exercicio02;

import programacao_orientada_a_objetos.exercicio01.Estoque;

public class exercicio02 {

    public static void main(String[] args) {
        Estoque02 estoque = new Estoque02();

        estoque.nome = "Sela de cavalo";

        estoque.quantidadeEstoque = 0;


        System.out.println("Nescessário repor " + estoque.nome + " ? " + estoque.exibirQuantidadeNoEstoque02(estoque));
    }


}


