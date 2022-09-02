import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String numeroCompra;
    private String dataCompra;
    private double valorCompra;
    private Cliente cliente;
    private List<ItemCompra> itemCompras = new ArrayList<>();

    public Compra(String numeroCompra, String dataCompra, Cliente cliente) {
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
        this.cliente = cliente;
        //this.itemCompras = new ArrayList<>();
    }

    public void listarItemCompras(){
        for (ItemCompra i: itemCompras)
            System.out.println("Produto: "+ i.getProduto().getNome());
    }
    public void calcularValorTotal(){
        double total=0;
        for (ItemCompra i: itemCompras)
            total = total + i.getValorParcial();
        this.valorCompra = total;

    }

    public void adicionarItemCompra(ItemCompra itemCompra){
        this.itemCompras.add(itemCompra);
    }

    public void removerItemCompra(ItemCompra itemCompra){
        this.itemCompras.remove(itemCompra);
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    //Não é interessanter ter para não gerar inconsistência
/*    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }*/

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }

    public void setItemCompras(List<ItemCompra> itemCompras) {
        this.itemCompras = itemCompras;
    }
}
