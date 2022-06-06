package orientacao_a_objetos_2_objeto_this.DesafioOverride;



public class ContaReceber extends Conta {

    private Cliente cliente;

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() {
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. " +
                    "É muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            super.cancelar();
        }
    }

    @Override
    public void ExibirDetalhes() {




    }

    public void receber() {
        if (SituaçãoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (SituaçãoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituaçãoConta.PAGA;

        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}