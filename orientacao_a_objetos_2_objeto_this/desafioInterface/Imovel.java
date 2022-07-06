package orientacao_a_objetos_2_objeto_this.desafioInterface;

public class Imovel implements Seguravel {


    private int areConstruida;
    private double valorMercado;

    @Override
    public String obterDescricao() {
        return "Imóvel com área construida de " +areConstruida + "m2 e valor de mercado"
                + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.003;
        valorApolice= valorApolice +  (areConstruida* 0.5);
        return valorApolice;
    }
}
