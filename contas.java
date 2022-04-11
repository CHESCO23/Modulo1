package com.company.chesco;

import java.util.Scanner;

public class contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a conta de energia:  ");
        Double energia = scanner.nextDouble();
        System.out.print("Insira a conta de água:  ");
        Double agua = scanner.nextDouble();
        System.out.print("Insira a conta de telefone: ");
        Double telefone = scanner.nextDouble();
        System.out.print("Escola do filho: ");
        Double escola = scanner.nextDouble();
        System.out.print("Fatura do cartão: ");
        Double fatura = scanner.nextDouble();
        System.out.print("Supermecado: ");
        Double supermecado = scanner.nextDouble();
        Double resultado =  energia;
        resultado = resultado += agua;
        resultado = resultado += telefone;
        resultado = resultado += escola;
        resultado = resultado += fatura;
        resultado = resultado += supermecado;
        System.out.print("O total é: " + resultado );
        scanner.close();
    }
}
