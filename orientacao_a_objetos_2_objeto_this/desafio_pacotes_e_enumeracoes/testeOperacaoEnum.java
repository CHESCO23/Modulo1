package orientacao_a_objetos_2_objeto_this.desafio_pacotes_e_enumeracoes;

public class testeOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
        int resultado1 = o1.operacao(5,3);
        System.out.println("o resultado é: " + resultado1);
        OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
        int resultado2 = o2.operacao(5, 3);
        System.out.println("O resultado é: " + resultado2);

    }
}

