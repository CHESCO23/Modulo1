package orientacao_a_objetos_2_objeto_this.modificações_static_e_final;

public class testecontador {
    public static void main(String[] args) {
        contador c = new contador();
        c.incrementar();
        System.out.println(contador.COUNT);
        contador.COUNT++;
        contador.imprimirContador();
    }
}
