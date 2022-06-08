package orientacao_a_objetos_2_objeto_this.TesteInterface;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnvieavelPorEmail e = (EnvieavelPorEmail) i;
        e.enviar("franciscoferreirapimentelnetto@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");
    }
}
