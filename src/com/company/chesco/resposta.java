package com.company.chesco;

import java.util.Scanner;

public class resposta {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto:  ");
        byte valorDoProduto = scanner.nextByte();
        System.out.print("Informe a quantidade: ");
        int quantidadeDoProduto = scanner.nextInt();
        double subtotal = valorDoProduto * quantidadeDoProduto;
        Double Desconto = subtotal * 10.0 / 100;
        Double resultado = subtotal - Desconto;
        Boolean quantidadeDeProdutoAcimaDe11 = (quantidadeDoProduto >= 11);
        if(quantidadeDeProdutoAcimaDe11)
            System.out.print("valor total é :  " + resultado );

        if (!quantidadeDeProdutoAcimaDe11)
            System.out.print("O subtotal é: " + subtotal);
        scanner.close();


    }

}
