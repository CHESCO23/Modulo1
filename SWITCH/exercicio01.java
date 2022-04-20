package SWITCH;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia de hoje ( 1 a 7): ");
        int diaDaSemana = scanner.nextInt();
        String diaDeSemana = null;
        switch (diaDaSemana){
            case 1: diaDeSemana = "Domingo";
            break;
            case 2: diaDeSemana = "Segunda";
            break;
            case 3: diaDeSemana = "Terça";
            break;
            case 4: diaDeSemana = "Quarta";
            break;
            case 5: diaDeSemana = "Quinta";
            break;
            case 6: diaDeSemana = "Sexta";
            break;
            case 7: diaDeSemana = "Sábado";
            break;
            default:
                System.err.println("Digite um número válido!");
                System.exit(1);

        }

        System.out.println(diaDeSemana);
        scanner.close();
    }
}
