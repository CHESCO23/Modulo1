package orientacao_a_objetos_2_objeto_this.modificação_em_acesso_defaut;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        Adestrador adestrador = new Adestrador();
        adestrador.ensinarCachorrosSentar(cachorro);
    }
}
