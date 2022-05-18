package orientacao_a_objetos_2_objeto_this.modificações_static_e_final;

public class contador {
    public static int COUNT = 0;
    // o final é constante
   public static final double PI = 3.14;
   public void incrementar(){
       COUNT++;
   }
   public static void imprimirContador(){
       System.out.println("O valor do contador é: " + contador.COUNT);
   }
}
