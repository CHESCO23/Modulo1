package com.company.chesco;

import java.util.Scanner;

    public class Atividade11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu primeiro número");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("Digite seu segundo número");
            double segundoNumero = scanner.nextDouble();
            System.out.print("Digite seu terceiro número");
            double terceiroNumero = scanner.nextDouble();
            byte dois = 2;
            byte tres = 3;
            double dobroDoPrimeiro = primeiroNumero * dois;
            double metadeDoSegundo = segundoNumero / dois;
            double oProdutoDoDobroDoPrimeiroComMetadeDoSegundo = dobroDoPrimeiro * metadeDoSegundo;
            double primeiroVezesTres = primeiroNumero * tres;
            double aSomaDoTriploDoPrimeiroComOTerceiro = primeiroVezesTres + terceiroNumero;
            double oTerceiroElevadoAoCubo = terceiroNumero * terceiroNumero * terceiroNumero;
            System.out.println("O produto do dobro do primeiro com metade do segundo: " + oProdutoDoDobroDoPrimeiroComMetadeDoSegundo);
            System.out.println(("a soma do triplo do primeiro com o terceiro.   ") + aSomaDoTriploDoPrimeiroComOTerceiro);
            System.out.println("o terceiro elevado ao cubo: " + oTerceiroElevadoAoCubo);
            scanner.close();
        }
    }

