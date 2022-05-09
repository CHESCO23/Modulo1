package programacao_orientada_a_objetos.exercicio03;

public class Pedido {

    Integer codigo;

    int subtotal;

    int desconto;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer código) {
        this.codigo = código;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getTotal() {
        return subtotal - desconto;
    }


}
