package com.company.chesco;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo:   ");
        Double tamanhoDoArquivoEmMB = scanner.nextDouble();
        System.out.print("Digite a velocidade da sua internet: ");
        Double velocidadeDaInternetEmMBPS = scanner.nextDouble();
        Byte ValorParaTransformar = 8;
        Double velocidadeDeDownloadEmMB = velocidadeDaInternetEmMBPS / 8;
        Double tempoBaixadoEmSegundos = tamanhoDoArquivoEmMB / velocidadeDeDownloadEmMB;
        Byte dividirDeSegundoPraMinuto = 60;
        Double tempoBaixadoEmMinutos = tempoBaixadoEmSegundos / dividirDeSegundoPraMinuto;
        System.out.print("O tempo que o arquivo vai ser baixado em segundos é: "+ tempoBaixadoEmSegundos);
        System.out.print("O tempo que o arquivo vai ser baixado em minutos é: " + tempoBaixadoEmMinutos);
        scanner.close();
    }
}

