package orientacao_a_objetos_2_objeto_this.exemploDeThis.construtores;

public class Pessoa {
    String nome;
    int idade;
// vá em genarate e vá em constructor para ter o this.
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        //substituindo o this.nome = nome;. Para ão ocorrer repetição de linha.
        //aqui ele chama a linha 7.
          this(nome);
          this.idade = idade;
    }
}
