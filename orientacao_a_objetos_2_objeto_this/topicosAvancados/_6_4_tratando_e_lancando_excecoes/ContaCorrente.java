package orientacao_a_objetos_2_objeto_this.topicosAvancados._6_4_tratando_e_lancando_excecoes;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("O valor não pode ser menos que zero.");
        }
        saldo += deposito;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException {
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0){
            throw new SaldoInsuficienteException("Você não possui saldo suficiente");
        }
        saldo -= quantidade;
    }

    public double getSaldo() {
        return saldo;
    }
}
