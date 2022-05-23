package orientacao_a_objetos_2_objeto_this.exercicio01;

public class ContaPagar {

    String Descricao;
    Double valor;
    String DataVencimento;
    Fornecedor fornecedor;
    SituacaoConta situacaoConta;

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;

    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this();
        this.Descricao = descricao;
        this.valor = valor;
        this.DataVencimento = dataVencimento;
        this.fornecedor = fornecedor;


    }

    void pagar(){
        if (){
            situacaoConta = SituacaoConta.CANCELADA ; System.out.println("A conta já foi cancelada e não pode ser paga");
    }
        else{}

        System.out.println("pagando conta" + this.getDescricao() + " no valor de " + this.getValor()+ "e vencimento em " + this.getDataVencimento() + " do fornecedor" + this.getFornecedor().getNome() + ".");

    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;

    }
    public SituacaoConta getSituacaoConta(SituacaoConta situacaoConta) {
        return situacaoConta;
    }

    public void cancelar() {
    }
}

