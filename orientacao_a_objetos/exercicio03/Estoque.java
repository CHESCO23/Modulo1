package orientacao_a_objetos.exercicio03;

public class Estoque {
    // vc pode usar vetores com o que vc quiser.
   produto[] produtos;

   // void sempre acompanha um metodo.
   void listarProdutos(){
       System.out.println("\n produtos em estoque");
       System.out.println("--------------------------");

       // no arraw sempre deve colocar for depois.
       for (int i = 0; i < produtos.length; i++ ){
           produtos[i].descrever();

       }
   }

}
