package orientacao_a_objetos_2_objeto_this.modificação_em_acesso_defaut;

public class Cachorro {
    // usa o privado aqui para que so pode ser acessado usando o get and set
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //
    public void sentar(){
        System.out.println("Eu, " + nome + " , vou sentar!");
    }
}
