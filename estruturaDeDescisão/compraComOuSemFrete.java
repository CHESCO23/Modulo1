package estruturaDeDescisão;

import java.util.Scanner;

public class compraComOuSemFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto:  ");
        double valorDoProduto = scanner.nextDouble();
       Double frete = 15.0;
       Double resultado = valorDoProduto + frete;
       Boolean seOPrecoDoProdutoAcimaDe100 = (valorDoProduto >= 100);
        if(seOPrecoDoProdutoAcimaDe100)
            System.out.print("valor total é :  " + valorDoProduto );

        if (!seOPrecoDoProdutoAcimaDe100)
            System.out.print("O valor total é: " + resultado);
        scanner.close();
    }
}
