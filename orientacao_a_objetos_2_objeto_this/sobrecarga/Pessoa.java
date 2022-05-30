package orientacao_a_objetos_2_objeto_this.sobrecarga;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

}
