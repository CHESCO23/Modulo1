package com.company.chesco;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em fahrenheit:");
        double temperatura = scanner.nextDouble();
        double formula =  5 * ((temperatura - 32 ) / 9);
        System.out.println("o resultado é:" + formula);
    }
}
