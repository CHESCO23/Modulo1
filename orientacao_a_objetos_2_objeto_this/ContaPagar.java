package orientacao_a_objetos_2_objeto_this;

public class ContaPagar {

    String Descricao;
    Double valor;
    String DataVencimento;
    Fornecedor fornecedor;

    public ContaPagar() {
        
    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this.Descricao = descricao;
        this.valor = valor;
        this.DataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    void pagar(){
        System.out.println("pagando conta" + this.getDescricao() + 
                           "no valor de " + this.getValor()+
                           "e vencimento em " + this.getDataVencimento() +
                           " do fornecedor" + this.getFornecedor().getNome() + ".");
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
}

