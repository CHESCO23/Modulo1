package orientacao_a_objetos_2_objeto_this.operaçãoAritmetica;

public enum OperacaoAritmetica {
    ADICAO{

        public int operacao(int x, int y) {
            return x + y;
        }
    }, SUBTRACAO {

        public int operacao(int x, int y) {
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}
















