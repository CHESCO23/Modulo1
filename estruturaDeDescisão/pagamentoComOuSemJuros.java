package estruturaDeDescisão;

import java.util.Scanner;

public class pagamentoComOuSemJuros {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do produto : ");
        double valorDoPruduto = scanner.nextDouble();

        System.out.print("Qual o tipo de pagamento [1 = a vista / 2 = a prazo]: ");
       Integer tipoDePagamneto = scanner.nextInt();

        boolean pagamentoAVista = tipoDePagamneto.equals (1);
         Double juros = 0.0;

         if(!pagamentoAVista){
             juros = 10.0;

         }
         double acrescimo = tipoDePagamneto + juros / 100;

         double valorTotal = acrescimo + valorDoPruduto;
         System.out.print("Valor total: " + valorTotal);
         scanner.close();
    }
}
