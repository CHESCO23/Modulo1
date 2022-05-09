package programacao_orientada_a_objetos.class_instancia;

public class classe_Instancia {
    public static void main(String[] args) {
        System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);

        Produto produto = new Produto();
        produto.nome = "CANECA";

        Produto produto1 = new Produto();
        produto1.nome = "carteira";

        Impressao.informacao("produto1:" + produto.nome);


    }
}
