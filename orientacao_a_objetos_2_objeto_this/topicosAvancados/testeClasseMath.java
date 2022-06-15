package orientacao_a_objetos_2_objeto_this.topicosAvancados;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static java.lang.Math.*;


public class testeClasseMath {


    public static void main(String[] args) {

        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("comprimento: " + comprimento);

        double[] precosProdutoA = {30.20, 25.49};
        //MAX é para ele selecionar o maior número.
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("maior preço: " + maiorPreco);
        // MIN é para ele selecionar o menor número.
        System.out.println("menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));
        // POW serve para fazer calculos elevados.
        System.out.println("2^3: " + pow(2, 3));

        //sqrt é para tirar a raiz do número.
        System.out.println("Raiz de 9: " + sqrt(9));

        double n = 5.4;
        //FLOOR é para tirar o menor inteiro.
        System.out.println("menor inteiro: " + floor(n));
        //CEIL é para tirar maior inteiro.
        System.out.println("maior inteiro: " + ceil(n));
        //ROUND é para arrendondar o número.
        System.out.println("Arredondando: " + round(n));

        //SIN para seno.
        System.out.println("Seno: " + sin(40));

        //RANDOM é para dar um numero aleatório entre 1 a 100.
        double numeroAleatorio = random() * 100;
        System.out.println(numeroAleatorio);








    }
}
