public class ItemCompra {
    private Compra compra;
    private Produto produto;
    private int quantidade;
    private double valorParcial;

    public ItemCompra(Compra compra, Produto produto, int quantidade) {
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorParcial = quantidade * produto.getPreco();
        //A linha acima poderia ser substituída por: calcularValorParcial();
    }

    public void calcularValorParcial(){
        this.valorParcial = quantidade * produto.getPreco();
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    //Não é interessante ter para não gerar inconsistência
/*    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }*/
}
