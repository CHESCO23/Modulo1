package metodo;

import java.util.Scanner;

public class recursitividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirtraco();
        String[]  cursos = new String[]{"Jva EE", "Spring","Java OO Avançado"};
        imprimir("Escolha dentre os cursos abaixos:");
        interarEExibirPosicoesDoVetorString(cursos);
        System.out.println("O curso que você escolheu é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
    }
    private static void interarEExibirPosicoesDoVetorString(String[] vetor){
        for (int i = 0; i < vetor.length;i++){
            imprimir("[" +i+ "]" + vetor[i]);
        }
    }
    private static void imprimirtraco() {
        imprimir("--------------------------------------------------");
    }
    private static void imprimir(String texto) {
        System.out.println(texto);

    }
}
