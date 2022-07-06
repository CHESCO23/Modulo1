package orientacao_a_objetos_2_objeto_this.desafio_pacotes_e_enumeracoes;

public enum SituacaoConta {
    PENDENTE ("PENDENTE"), PAGA ("PAGA"), CANCELADA("CANCELADA");

    private String situacaoConta;

    SituacaoConta(String situacaoConta) {
        this.situacaoConta = situacaoConta;
    }
    public String getsituacaoConta(){
        return situacaoConta;
    }


}
