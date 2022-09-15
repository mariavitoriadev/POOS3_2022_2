public class ContaPoupanca extends Conta{

    public void aplicarRendimentos(double taxa){
        this.setSaldo(this.getSaldo()*(1+taxa));
    }

    @Override
    public void sacarDinheiro(double valor) {
        if (this.getSaldo()>=(valor)){
            this.setSaldo(this.getSaldo() - valor);
        }
        else
            System.out.println("Saldo insuficiente");
    }

    public ContaPoupanca(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
    }
}
