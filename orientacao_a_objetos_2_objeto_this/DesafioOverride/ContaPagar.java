package orientacao_a_objetos_2_objeto_this.DesafioOverride;

public class ContaPagar extends Conta {

    private Fornecedor fornecedor;

    public ContaPagar() {
    }

    @Override
    public void ExibirDetalhes() {




    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void pagar() {
        if (SituaçãoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode pagar uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (SituaçãoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() + "no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituaçãoConta.PAGA;
        }




    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
