package com.company.chesco;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o peso do peixe: ");
        byte limiteDeKilos = 50;
        byte taxaDaMulta = 4;
        double pesoDoPeixe = scanner.nextDouble();
        double valorExedente = (pesoDoPeixe - limiteDeKilos);
        double valorDaMulta = (valorExedente * taxaDaMulta);
        System.out.println("O peso do peixe é:" + pesoDoPeixe);
        System.out.println("O valor da multa é: " + valorDaMulta);

    }

}
