package orientacao_a_objetos_2_objeto_this.topicosAvancados.desafio02;

/*
No desafio sobre herança e sobreposição, quando uma conta a pagar ou receber não podia ser paga, recebida ou cancelada, apenas exibíamos na tela uma mensagem usando a instrução System.out.println.

Agora, neste desafio, você deve rever as mensagens de erro dos métodos ContaPagar.pagar(), ContaReceber.receber(), ContaReceber.cancelar() e Conta.cancelar() para lançar uma exceção.

A exceção a ser lançada por esses métodos deve-se chamar OperacaoContaException. A classe dessa exceção ainda não existe, então você precisará criá-la com o código abaixo:

package com.algaworks.cursojava.financeiro;

public class OperacaoContaException extends Exception {
	public OperacaoContaException(String msg) {
		super(msg);
	}
}
Na classe DesafioNumeros, que é a responsável por instanciar todos os objetos necessários e invocar os métodos, use as instruções try/catch para capturar a exceção OperacaoContaException durante as chamadas aos métodos que executam operações em contas.
 */

import orientacao_a_objetos_2_objeto_this.exercicio02.Cliente;
import orientacao_a_objetos_2_objeto_this.exercicio02.ContaPagar;
import orientacao_a_objetos_2_objeto_this.exercicio02.Fornecedor;

public class Principal {
    public static void main(String[] args) throws OperacaoContaException {
        // instanciando fornecedores
        orientacao_a_objetos_2_objeto_this.exercicio02.Fornecedor imobiliaria = new orientacao_a_objetos_2_objeto_this.exercicio02.Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        orientacao_a_objetos_2_objeto_this.exercicio02.Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        // instanciando clientes
        orientacao_a_objetos_2_objeto_this.exercicio02.Cliente atacadista = new orientacao_a_objetos_2_objeto_this.exercicio02.Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        orientacao_a_objetos_2_objeto_this.exercicio02.Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");

        // instanciando contas a pagar
        orientacao_a_objetos_2_objeto_this.exercicio02.ContaPagar contaPagar1 = new orientacao_a_objetos_2_objeto_this.exercicio02.ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);

        orientacao_a_objetos_2_objeto_this.exercicio02.ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber(atacadista, "Desenvolvimento de projeto de logística em Java", 89500d, "23/05/2012");
        try {
            contaReceber1.getSituacaoConta();
        }catch (SituacaoConta)

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",53200d, "13/05/2012");

        // pagamento e cancelamento de contas a pagar
        contaPagar1.pagar();
        contaPagar2.cancelar();

        // recebimento e cancelamento de contas a receber
        contaReceber1.receber();
        contaReceber2.cancelar();
    }
}


