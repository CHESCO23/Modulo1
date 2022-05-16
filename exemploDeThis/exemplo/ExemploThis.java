package orientacao_a_objetos_2_objeto_this.exemploDeThis.exemplo;

import orientacao_a_objetos_2_objeto_this.exemploDeThis.exemplo.carro;

public class ExemploThis {
    public static void main(String[] args) {
        carro carro = new carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.aterarModelo("Civic");
    }
}
