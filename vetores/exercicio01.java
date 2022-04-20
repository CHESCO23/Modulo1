package vetores;

import java.util.Scanner;

public class exercicio01 {
    /*
Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva as 5 coisas mais importantes do seu dia");
        System.out.print("PRIMEIRA COISA: ");
        String primeiraCoisaImportante = scanner.next();
        System.out.println("SEGUNDA COISA: ");
        String segundaCoisaImportante = scanner.next();
        System.out.println("TERCEIRA COISA: ");
        String terceiraCoisaImportante = scanner.next();
        System.out.println("QUARTA COISA: ");
        String quartaCoisaImportante = scanner.next();
        System.out.println("QUINTA COISA: ");
        String quintaCoisa = scanner.next();

        String[] coisasImportantes = new String[5];
        coisasImportantes[0] = (primeiraCoisaImportante);
        coisasImportantes[1] = (segundaCoisaImportante);
        coisasImportantes[2] = (terceiraCoisaImportante);
        coisasImportantes[3] = (quartaCoisaImportante);
        coisasImportantes[4] = (quintaCoisa);
        for(int i = 0; i < coisasImportantes.length; i++) {
            System.out.println(coisasImportantes[i]);
        }
    }
}
