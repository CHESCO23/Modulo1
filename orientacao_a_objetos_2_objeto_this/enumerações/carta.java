package orientacao_a_objetos_2_objeto_this.enumerações;

public class carta {
  private int numero;
  private naipe  naipe;

    public carta(int numero, naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;

    }
    public void imprimirCarta(){
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor " + naipe.getCor());
    }
}
