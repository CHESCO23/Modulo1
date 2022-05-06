package programacao_orientada_a_objetos.metodo_encapsulamento;

public class ecapsulamento {
    public static void main(String[] args) {
        Novo cliente = new Novo();

        cliente.setNome("Francisco Pimentel");
        cliente.setTelefone("27 999116112");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("ÚLtimo nome: " + cliente.getUltimoNome());

    }
}


