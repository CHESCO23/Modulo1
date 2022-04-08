package com.company.chesco;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da temperatura em celsius:");
        double temperatura = scanner.nextDouble();
        double formula =  temperatura * 9 / 5 + 32;
        System.out.println("O resultado é:" + formula);
    }
}
