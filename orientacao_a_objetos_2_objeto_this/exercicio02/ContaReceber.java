package orientacao_a_objetos_2_objeto_this.exercicio02;

public class ContaReceber extends Conta {

    public Double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public ContaReceber(Cliente Empressa, String descricao, Double valor, String dataVencimento) {
        this.Descricao = descricao;
        this.valor = valor;
        this.DataVencimento = dataVencimento;
    }

    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public ContaReceber() {


    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public void receber() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("A conta " + this.getDescricao() + " não pode ser recebida");
        }else  if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("A conta: " + this.getDescricao() + " não pode ser recebido");
        }else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor " + this.getValor()+" E vencimento em "+ this.getDataVencimento() + " do cliente " + this.() +".");
        }

    }

    public void cancelar() {
        if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("A conta já foi cancelada e não pode ser cancelada" + this.getDescricao() + ".");
        } else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
        }else if (this.valor.equals(this.getValor() >= 50000)) {
            System.out.println("Sua conta é um valor muito alto para ser cancelado:" + this.getDescricao() + ".");

        } else {
            System.out.println("cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;


        }
    }
}
