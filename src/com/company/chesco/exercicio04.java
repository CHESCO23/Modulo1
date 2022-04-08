package com.company.chesco;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.next();
        Boolean eVogal = letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U");
        if (eVogal)
            System.out.println(letra + " É vogal");
        else
            System.out.println(  letra + "   É consoante" );
    }
}
