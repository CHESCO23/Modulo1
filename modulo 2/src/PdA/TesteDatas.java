package PdA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
    public static void main(String[] args) {
        //para mostrar a data e hora do dia.
        Date hoje = new Date();
        System.out.println(hoje);

        // Modificando para o padrão basileiro.
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(hoje));

        String dataAniversario = "20/01/1985";
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date aniversario = formatador2.parse(dataAniversario);
            System.out.println(formatador2.format(aniversario));
        }catch (ParseException e){
            System.out.println("formato de data invalida");
        }
    }

        }






