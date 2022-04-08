package com.company.chesco;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o tamanho da aréa(ao quadrado) que deseja pintar:  ");
        double tamanhoEmQuandrados = scanner.nextDouble();
        int quantidadeDeLitrosPorMetros = 3;
        int litrosDeTintasPorMetro = 18;
        int precoDaLata = 80;
        double coberturaDaTinta = tamanhoEmQuandrados /quantidadeDeLitrosPorMetros;
        double quantidadeDeLatas = coberturaDaTinta / litrosDeTintasPorMetro;
        double preçoTotal = quantidadeDeLatas * precoDaLata;
        double quantidadeDeLataArrendodado = Math.ceil(quantidadeDeLatas);
        System.out.println("A quantidade de latas é: " + quantidadeDeLataArrendodado);
        System.out.print("O preço total é: " + preçoTotal);
        scanner.close();


    }
}
