package com.company.chesco;

import java.util.Scanner;

public class exercicio03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe seu sexo( F ou M ) :");
        String sexo = scanner.next();

        Boolean eMasculino = sexo.equals("M");
        if (eMasculino)
            System.out.println("Masculino");

        Boolean eFeminino = sexo.equals("F");
        if (eFeminino)
            System.out.println("Feminino");
        Boolean naoExiste = sexo.equals("D");
        if(naoExiste)
            System.out.println("sexo invalido");

    }
}
