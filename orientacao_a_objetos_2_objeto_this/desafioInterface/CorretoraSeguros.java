package orientacao_a_objetos_2_objeto_this.desafioInterface;

public class CorretoraSeguros {

    public void fazerPropostaSeguro(Seguravel objetoSeguravel){
        System.out.println("-----------------------------------------------------");
        System.out.println("Corretora de seguros - Proposta");
        System.out.println("-----------------------------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("valor da apólice:" + objetoSeguravel.calcularValorApolice());
        System.out.println("-----------------------------------------------------\n");
    }
    }

