package com.company.chesco;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.println("Digite sua altura:    ");
        Double altura = scanner.nextDouble();
        Double seuPesoIdealMasculino = ((72.2 * altura) - 58);
        System.out.println(("Seu peso ideal masculino é:   ") + seuPesoIdealMasculino);
        Double seuPesoIdealFeminino = ((62.1 * altura) - 44.7);
        System.out.println(("Seu peso ideal feminino é:   ") + seuPesoIdealFeminino);

    }
}
