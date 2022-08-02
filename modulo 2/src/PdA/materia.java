package PdA;

public class materia {
    public static void main(String[] args){
        //usa muita memoria RAM, por conta que sempre vai criar uma String nova, enchendo assim a memoria.
        String s = "olá";
        s = s + " pessoal";
        System.out.println(s);

        //para melhor uso da memoria RAM. Pois ele vai meio que apagar o antigo e criar novamente o que pede.
        StringBuilder sb = new StringBuilder("olá");
        sb.append(" pessoal!");

        String resultado = sb.toString();
        System.out.println("com StringBuilder: " + resultado);
    }
}
