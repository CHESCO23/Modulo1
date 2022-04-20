package estruturaDeDescisão;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        float valor = scanner.nextFloat();
        Boolean oValorÉPositivo = (valor >= 0 );
        if (oValorÉPositivo)
            System.out.println("o valor é positivo ");
        Boolean oValorÉNegativo = (valor < 0);
        if (oValorÉNegativo)
            System.out.println("O valor é negativo ");

    }
}
