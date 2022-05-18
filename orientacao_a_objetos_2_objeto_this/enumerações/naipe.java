package orientacao_a_objetos_2_objeto_this.enumerações;
// enum serve pra listdos. É usado para notificar algum tipo de alteração.
public enum naipe {
    OURO("VERMELHA"), PAUS("PRETA"), ESPADA("PRETA"), COPA("VERMELHA");

    private String cor;

    naipe(String cor) {
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
}
