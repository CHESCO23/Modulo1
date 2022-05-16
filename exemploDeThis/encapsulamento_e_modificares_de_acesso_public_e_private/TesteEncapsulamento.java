package orientacao_a_objetos_2_objeto_this.exemploDeThis.encapsulamento_e_modificares_de_acesso_public_e_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("TEMPERATURA DO AR: "+ ar.obterTemperatura() + "°");
        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar: "+ ar.obterTemperatura()+"°");
    }
}
