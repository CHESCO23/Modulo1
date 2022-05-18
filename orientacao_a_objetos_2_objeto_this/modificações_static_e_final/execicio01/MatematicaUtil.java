package orientacao_a_objetos_2_objeto_this.modificações_static_e_final.execicio01;

public class MatematicaUtil {
    public static final double PI = 3.14;

    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double raio) {

        return  raio * raio * MatematicaUtil.PI ;

    }


}


