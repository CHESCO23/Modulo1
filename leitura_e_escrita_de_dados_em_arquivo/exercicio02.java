package leitura_e_escrita_de_dados_em_arquivo;
/*
Mostre a lista de tarefas para o usuário

Crie um programa que imprima, no console, a lista de tarefas que você criou com o algorítimo anterior.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class exercicio02 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\chesco23.txt");
        List<String> linhas = Files.readAllLines(arquivo);
        for (int i= 0 ;i < linhas.size(); i++){
            String nome = linhas.get(i);
            System.out.println(  nome + " hoje " + i );
        }
    }

}
