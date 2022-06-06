package orientacao_a_objetos_2_objeto_this.DesafioOverride;

import java.lang.reflect.Array;

public class RelatorioContas{


    public void exibirListagem(Conta[] contas) {
        for (int i = 0; i < contas.length; i++) {
            System.out.println("conta: " +contas[i].getDescricao() +"\n paga esse valor: " + contas[i].getValor() + "\n com data de vencimento: " + contas[i].getDataVencimento());

        }
        }
}
