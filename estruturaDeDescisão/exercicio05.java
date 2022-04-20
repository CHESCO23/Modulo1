package estruturaDeDescisão;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o priemeiro numero: ");
        Double numeroUm = scanner.nextDouble();
        System.out.print("Insira o segundo numero: ");
        Double  numeroDois = scanner.nextDouble();
        System.out.print("Qual operação que deseja: " + "1- adição"+ "2- subtração" + "3- adição" + "4- multiplicação");
        String operacao = scanner.next();


        Boolean operacoesMatematicos = operacao.equals("1") || operacao.equals("2") || operacao.equals("3") || operacao.equals("4");
        if (operacoesMatematicos);




    }
}
