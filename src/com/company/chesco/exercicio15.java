package com.company.chesco;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // SALARIO BRUTO

        System.out.print("Digite o número de horas trabalhadas por mês:");
        Double numeroDeHorasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite quanto você ganhar por hora:");
        Double numeroQueGanhaPorHora = scanner.nextDouble();

        Double salarioBruto = (numeroDeHorasTrabalhadas * numeroQueGanhaPorHora);
        System.out.print(salarioBruto);

        // IMPOSTOS

        Double impostoDeRenda = 0.11;
        Double inss = 0.08;
        Double sindicato = 0.05;

        // PREÇO IMPOSTOS

        Double salarioBrutoImpostoDeRenda = salarioBruto * impostoDeRenda;
        Double salarioBrutoInss = salarioBruto * inss;
        Double salarioBrutoSindicato = salarioBruto * sindicato;

        Double somaDosImpostos = salarioBrutoImpostoDeRenda + salarioBrutoInss + salarioBrutoSindicato;

        // SALARIO LIQUIDO

        Double salarioLiquido = salarioBruto - somaDosImpostos;

        // IMPRINTS

        System.out.println("Seu salario bruto é: " + salarioBruto);
        System.out.println("O quanto você pagou para o inss é:" + salarioBrutoInss);
        System.out.println("O quanto você pagou ao sindicato é: " + salarioBrutoSindicato);
        System.out.println("O seu salario liquído é: " + salarioLiquido);
    }

}


