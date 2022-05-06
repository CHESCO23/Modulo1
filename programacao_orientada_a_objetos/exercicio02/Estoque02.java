package programacao_orientada_a_objetos.exercicio02;

import programacao_orientada_a_objetos.exercicio01.Estoque;

public class Estoque02 {

    static final Integer Quantidade_minima_estoque = 10;


    String nome;

    Integer quantidadeEstoque;


    public Boolean exibirQuantidadeNoEstoque02(Estoque02 estoque) {

        return estoque.quantidadeEstoque < estoque.Quantidade_minima_estoque;

    }

}
