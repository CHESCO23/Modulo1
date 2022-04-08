package com.company.chesco;

import java.util.Scanner;

public class exercicio12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:   ");
        Double altura = scanner.nextDouble();
       double formula = ( 72.7 * altura) - 58;
       System.out.println("Seu peso ideal é: " + formula);
    }
}
