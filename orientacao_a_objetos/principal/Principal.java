package orientacao_a_objetos.principal;

import orientacao_a_objetos.principal.carro;

public class Principal {
    public static void main(String[] args) {
        carro meuCarro = new carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.modelo = "Palio";
        meuCarro.cor = "Prata";
        meuCarro.fabricantes = "Fiat";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João";
        meuCarro.dono.bairro = "Centro";
    }
    }


