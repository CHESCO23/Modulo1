package programacao_orientada_a_objetos.exercicio03;

public class pedido {
    Integer código;

    Double subtotal;

    Double desconto;

    public Integer getCódigo() {
        return código;
    }

    public void setCódigo(Integer código) {
        this.código = código;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    Double total;
}
