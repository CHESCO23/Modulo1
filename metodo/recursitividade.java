package metodo;

import java.util.Scanner;

public class recursitividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[]  cursos = new String[]{"Jva EE", "Spring","Java OO Avançado"};
        imprimir("Escolha dentre os cursos abaixos:");
        iterarEExibirPosicoesDoVetorString(cursos);
        System.out.println("O curso que você escolheu é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
        if (!posicaoValida){
            encerrarProgramaPorCausaDaPosicaoInvalida();
        }
        imprimirTraco();
        String[] formasPagamento = new String[] {"Cartão","Boleto"};
        System.out.println("Escolha dentre as formas de pagamento abaixo: ");
        iterarEExibirPosicoesDoVetorString(formasPagamento);
        System.out.println("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaDePagamentosEscolhida = scanner.nextInt();
        posicaoValida =verificarPosicaoEscolhidaPeloUsuario(posicaoFormaDePagamentosEscolhida,formasPagamento);
        if (!posicaoValida){
            encerrarProgramaPorCausaDaPosicaoInvalida();

        }
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhido = formasPagamento[posicaoFormaDePagamentosEscolhida];

        imprimirTraco();
        imprimir("O curso escolhido foi" + cursoEscolhido + "e a forma de pagamento" + formaPagamentoEscolhido);

        scanner.close();


    }

    static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
        imprimirEContinuarNaMesmaLinha(texto);
        Integer numero = scanner.nextInt();
        return numero;
    }
    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }
    static void imprimir(String texto) {
        System.out.println(texto);
    }
    static void imprimirEContinuarNaMesmaLinha(String texto) {
        System.out.print(texto);
    }
    static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
        iterarEExibirPosicoesDoVetorString(vetor, 0);
    }
    static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
        imprimir("[" + i + "] " + vetor[i]);
        if (++i < vetor.length) {
            iterarEExibirPosicoesDoVetorString(vetor, i);
        }
    }
    static void imprimirTraco() {
        imprimir("----------------------------------------------");
    }
    static void encerrarProgramaPorCausaDaPosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
}
