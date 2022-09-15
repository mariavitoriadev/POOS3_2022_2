public class ContaCorrente extends Conta{


    public void cobrarTaxa(double valor){
        if (this.getSaldo()>=(valor)){
            this.setSaldo(this.getSaldo() - valor);
        }
        else
            System.out.println("Saldo insuficiente");
    }

    @Override
    public void sacarDinheiro(double valor) {
        if (this.getSaldo()>=(valor+5)){
            this.setSaldo(this.getSaldo() - valor - 5);
        }
        else
            System.out.println("Saldo insuficiente");
    }

    public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
    }
}
