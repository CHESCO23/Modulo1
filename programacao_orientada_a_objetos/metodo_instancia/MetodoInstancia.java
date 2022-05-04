package programacao_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Francisco";
        cliente.ultimoNome = "Pimentel Netto";
        cliente.telefone = "27 999116112";
        cliente.email = "franciscoferreirapimentelnetto@gmail.com";

        Cliente cliente1 = new Cliente();
        cliente1.primeiroNome = "Samuel";
        cliente1.ultimoNome = "de Oliveira";
        cliente1.telefone = "27 99956585";

        System.out.println("NOME CLIENTE: " + cliente.obterNomeCompleto() + ", DDD: "+ cliente.obterDDD());
        System.out.println("NOME CLIENTE: " + cliente1.obterNomeCompleto() + ", DDD: "+ cliente1.obterDDD());
    }
}
