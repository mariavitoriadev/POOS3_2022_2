public class Principal {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Tecnologia da Informação", "TI");

        //Criação de 2 objtos Funcionario.
        //Repare que já são associados com o Departamento d1 via
        //método construtor
        Funcionario f1 = new Funcionario("12345",
                                    "Pablo",
                                    1000,
                                    d1);

        Funcionario f2 = new Funcionario("909090",
                                           "Maria",
                                            2000,
                                            d1 );

        f1.mostrarDados();

        //Agora é preciso dizer que o objetos d1 possui estes 2 funcionários (f1 e f2)
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);


        System.out.println("\n Folha de pagamento do departamento "
                          + d1.getNome() +": " + d1.calcularFolhaPagamento());

        Departamento d2 = new Departamento("Recursos Humanos", "RH");

        //Alterando o departamento do Funcionario f1 de d1 para d2
        //Reparem que é preciso fazer a sincronização.
        //Primeiramente, f1 vai para o Departamento d2
        f1.setDepartamento(d2);
        //Depois, é preciso removê-lo da lista de funcionários de d1
        d1.removerFuncionario(f1);
        //Por fim, é preciso acrescentá-lo na lista de d2
        d2.adicionarFuncionario(f1);

        System.out.println("\n Folha de pagamento do departamento "
                + d1.getNome() +": " + d1.calcularFolhaPagamento());
        System.out.println("\n Folha de pagamento do departamento "
                + d2.getNome() +": " + d2.calcularFolhaPagamento());

        d1.mostrarDados();

    }
}
