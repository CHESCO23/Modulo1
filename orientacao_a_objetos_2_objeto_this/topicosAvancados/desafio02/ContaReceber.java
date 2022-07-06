package orientacao_a_objetos_2_objeto_this.topicosAvancados.desafio02;

import orientacao_a_objetos_2_objeto_this.exercicio02.Cliente;
import orientacao_a_objetos_2_objeto_this.exercicio02.Conta;
import orientacao_a_objetos_2_objeto_this.exercicio02.SituacaoConta;

public class ContaReceber extends Conta {

    private orientacao_a_objetos_2_objeto_this.exercicio02.Cliente cliente;

    public ContaReceber() {
    }

    public ContaReceber(orientacao_a_objetos_2_objeto_this.exercicio02.Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar(){
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. " +
                    "É muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            // Pra invocar o metodo que esta na classe mãe.
            super.cancelar();
        }
    }

    public void receber() {
        if(orientacao_a_objetos_2_objeto_this.exercicio02.SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (orientacao_a_objetos_2_objeto_this.exercicio02.SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public orientacao_a_objetos_2_objeto_this.exercicio02.Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}