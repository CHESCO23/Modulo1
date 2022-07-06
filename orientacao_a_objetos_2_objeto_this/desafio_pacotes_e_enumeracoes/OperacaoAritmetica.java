package orientacao_a_objetos_2_objeto_this.desafio_pacotes_e_enumeracoes;

public enum OperacaoAritmetica {
    ADICAO {
        public int operacao(int x, int y) {
            return x + y;
        }
    }, SUBTRACAO {
        public int operacao(int x, int y) {
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);

private SituacaoConta situacaoConta;

}


















