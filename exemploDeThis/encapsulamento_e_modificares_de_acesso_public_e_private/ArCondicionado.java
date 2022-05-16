package orientacao_a_objetos_2_objeto_this.exemploDeThis.encapsulamento_e_modificares_de_acesso_public_e_private;

public class ArCondicionado {
    private int temperatura;
    public void trocarTemperatura(int temperatura){
        if ( temperatura >= 17 && temperatura <= 25){
            this.temperatura= temperatura;
        }
    }
    public int obterTemperatura(){
        return temperatura;
    }
}
