package orientacao_a_objetos_2_objeto_this.TesteInterface;

//IMPLEMENTS É PARA PODER CONSEGUIR UTILIZAR OUTRAS CLASSES. A HERANÇA SÓ CONSEGUE COLOCAR UMA, O QUE NÃO É MUITO EFICAZ NA MAIORIA DAS VEZES, MESMO FAZENDO O MESMO QUE O IMPLEMENTS.

public class NotaFiscal implements  Imprimivel, EnvieavelPorEmail {
    private int numero;

    public NotaFiscal(int numero){
        this.numero = numero;

    }
    public void adicionarPedido(String produto){

    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o email "+ email);


    }

    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);

    }
}
