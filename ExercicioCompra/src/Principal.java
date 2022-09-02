public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria","1234567");

        Produto p1 = new Produto("Smartphone", 2000);
        Produto p2 = new Produto("Laptop", 5000);

        Compra compra1 = new Compra("001",
                               "01/09/2022",cliente);

        //Informando o primeiro produto comprado na compra1
        //Repare que informamos também a quantidade comprada deste produto
        //O cálculo do valor parcial (quantidade X preco) é feito no método construtor
        ItemCompra itemCompra1 = new ItemCompra(compra1,p1,2);
        //Alteramos a quantidade comprada.
        // Por isso, é preciso chamar o método calcularValorParcial() em seguida
        itemCompra1.setQuantidade(3);
        itemCompra1.calcularValorParcial();

        //Informando o segundo produto comprado na compra1.
        //Repare que informamos também a quantidade comprada deste produto
        //O cálculo do valor parcial (quantidade X preco) é feito no método construtor
        ItemCompra itemCompra2 = new ItemCompra(compra1,p2,1);

        //Adicionamos os objetos itemCompra na List
        compra1.adicionarItemCompra(itemCompra1);
        compra1.adicionarItemCompra(itemCompra2);

        compra1.calcularValorTotal();

        System.out.println("Valor total da compra: "+
                           compra1.getValorCompra());

        System.out.println("Nome do cliente: "+
                      compra1.getCliente().getNome());

       compra1.listarItemCompras();


    }
}
