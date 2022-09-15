public class Principal {
    public static void main(String[] args) {

        //Cliente Maria possui conta corrente e poupança
        Cliente cliente1 = new Cliente("123456","Maria");
        ContaPoupanca poupanca1 = new ContaPoupanca("Poup001",1000,cliente1);
        ContaCorrente corrente1 = new ContaCorrente("CC001", 800,cliente1);

        System.out.println("\n Situação das contas de " +cliente1.getNome());
        corrente1.mostrarDados();
        poupanca1.mostrarDados();

        //Maria vai transferir 200 da conta corrente para poupança
        corrente1.tranferirDinheiro(poupanca1,200);

        System.out.println("\n Situação após a transferência: ");
        corrente1.mostrarDados();
        poupanca1.mostrarDados();

        //Cliente Antônio possui apenas conta corrente
        Cliente cliente2 = new Cliente("999999","Antônio");
        ContaCorrente corrente2 = new ContaCorrente("CC002",1500,cliente2);

        System.out.println("\n Situação da conta de " +cliente2.getNome());
        corrente2.mostrarDados();

        //Antonio vai transferir 300 para conta corrente de Maria
        corrente2.tranferirDinheiro(corrente1,300);

        System.out.println("\n Situação após a transferência: ");
        corrente1.mostrarDados();
        corrente2.mostrarDados();

        //Antonio vai sacar 100
        corrente2.sacarDinheiro(100); //lembrem-se da taxa de saque
        System.out.println("\n Situação após o saque: ");
        corrente2.mostrarDados();

        //Aplicando as taxas nas contas da Maria
        poupanca1.aplicarRendimentos(0.10);
        corrente1.cobrarTaxa(10);

        System.out.println("\n Situação após aplicação das taxas: ");
        corrente1.mostrarDados();
        poupanca1.mostrarDados();

    }
}
