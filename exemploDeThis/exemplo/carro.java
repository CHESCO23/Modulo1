package orientacao_a_objetos_2_objeto_this.exemploDeThis.exemplo;


public class carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void aterarModelo(String modelo){

        // ! significa diferente.
        if ( modelo != null){
            // O THIS É O OBJETO QUE SE ESTA UTILIZNADO NA CLASSE PRINCIPAL(O OBJETO SEMPRE É O MINUSCULO).
            this.modelo = modelo;
        }
    }
}
