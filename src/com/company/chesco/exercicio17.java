package com.company.chesco;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o tamanho, em metros quadrados, da área desejada:  ");
        double tamanhoEmMetrosQuadrados = scanner.nextDouble();
        byte quantidadeDeLitrosPorMetros = 3;
        byte quantidadeDeLataporTinta = 18;
        byte preçoDaLata = 80;

        double coberturaDaTintaEmLata = tamanhoEmMetrosQuadrados / quantidadeDeLitrosPorMetros;
        double quantidadeDeLata = coberturaDaTintaEmLata / quantidadeDeLataporTinta;
        double quantidadePagaPorLata = quantidadeDeLata * preçoDaLata;

        double quantidadeDeTintaporGalao = 3.6;
        int preçoDoGalao = 25;

        double coberturaDaTintaEmGalao = tamanhoEmMetrosQuadrados / quantidadeDeTintaporGalao;
        double quantidadeDeGalao = coberturaDaTintaEmGalao / quantidadeDeTintaporGalao;
        double quantidadePagaPorGalao = quantidadeDeGalao * preçoDoGalao;

        double quantidadePagaPorLataArredondado = Math.ceil(quantidadePagaPorLata);
        double quantidadePagaPorGalaoArrendado = Math.ceil(quantidadePagaPorGalao);

        System.out.println("O preço pago em latas é: " + quantidadePagaPorLataArredondado);
        System.out.println("A quantidade de lata é: " + quantidadeDeLata);
        System.out.println("O preço pago em galão é: " + quantidadePagaPorGalaoArrendado);
        System.out.println("A quantidade de galão é: " + quantidadeDeGalao);

        double misturado = quantidadePagaPorLataArredondado + quantidadePagaPorGalaoArrendado;
        double quantidadePagaPorMistura = misturado * tamanhoEmMetrosQuadrados;

        double misturadoLata = misturado / quantidadePagaPorLataArredondado;
        double restoDivisao = misturado % quantidadePagaPorLataArredondado;
        double misturadoGalao = restoDivisao / quantidadePagaPorGalaoArrendado;

        double misturadoLataArredondado = Math.ceil(misturadoLata);
        double misturadoGalaoArredondado = Math.ceil(misturadoGalao);

        System.out.println("O preço pago misturando latas e galão é: " + misturado);
        System.out.println("A quantidade de lata usada quando se mistura os dois é: " + misturadoLataArredondado);
        System.out.println("A quantidade de galão usada quando se mistura os dois é: " + misturadoGalaoArredondado);
        scanner.close();
    }
}


