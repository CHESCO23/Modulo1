package programacao_orientada_a_objetos;

public class primeiraClasse {

    public static void main(String[] args) {
       produto produto = new produto();
       produto.nome = "Smartphone";
       produto.precoUnitario = 500.0;
       produto.quantidade = 15;

       exibirQuantidadeEmEstoque(produto);
    }

    private static void exibirQuantidadeEmEstoque(produto produto) {
        System.out.println("Quantidade em estoque do produto " + produto.nome + "é de " + produto.quantidade + " unidade(s)." );
    }
}
