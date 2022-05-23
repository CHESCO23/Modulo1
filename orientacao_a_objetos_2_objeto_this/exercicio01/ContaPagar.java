package orientacao_a_objetos_2_objeto_this.exercicio01;

public class  ContaPagar {

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

    void pagar() {
        //  equals é para fazer a comparação.
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            situacaoConta = SituacaoConta.PAGA;
            System.out.println("A conta já foi paga" + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("A conta já foi cancelada e não pode ser paga" + this.getDescricao() + ".");
        } else {
            System.out.println("pagando conta" + this.getDescricao() + " no valor de " + this.getValor() + "e vencimento em " + this.getDataVencimento() + " do fornecedor" + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
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

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }


    public void cancelar() {
        if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("A conta já foi cancelada e não pode ser cancelada" + this.getDescricao() + ".");
        } else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("A conta já foi paga e não pode ser cancelada.");

        } else {
            System.out.println("CONTA PENDENTE.");
            this.situacaoConta = SituacaoConta.CANCELADA;


        }
    }
}


