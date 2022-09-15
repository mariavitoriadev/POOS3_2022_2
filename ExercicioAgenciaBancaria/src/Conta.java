public abstract class Conta {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public abstract void sacarDinheiro(double valor);

    public void depositarDinheiro(double valor){
        this.saldo = this.saldo + valor;
    }

    public void tranferirDinheiro(Conta conta, double valor)
    {
        if (this.saldo >= valor){
            this.saldo = this.saldo-valor;
            conta.setSaldo(conta.getSaldo()+valor);
        }
        else
            System.out.println("Saldo insuficiente");

    }


    public void mostrarDados() {
        System.out.println( "\n Num. da conta: " + numeroConta +
                            "\n Saldo: " + saldo +
                            "\n Cliente: " + cliente.getNome());
    }

    public Conta(String numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
