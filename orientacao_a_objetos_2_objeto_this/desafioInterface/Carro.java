package orientacao_a_objetos_2_objeto_this.desafioInterface;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Carro implements Seguravel {


    private double valorMercado;
    private double anoFabricacao;

    public Carro(double valorMercado, double anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }


    @Override
    public String obterDescricao() {
        return "Carro ano" + anoFabricacao + "com valor de mercado"
                + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;

        }
        return valorApolice;
    }
}
