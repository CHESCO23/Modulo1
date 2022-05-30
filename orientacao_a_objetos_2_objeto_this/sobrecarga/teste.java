package orientacao_a_objetos_2_objeto_this.sobrecarga;

public class teste {
    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastroPessoa.cadastrar(pessoa);
        cadastroPessoa.cadastrar("Maria", 25);

    }
}
