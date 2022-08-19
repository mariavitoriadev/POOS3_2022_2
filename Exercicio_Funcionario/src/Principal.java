import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 5;
        Scanner ent = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[TAM];
        double soma = 0;
        for (int i=0;i<TAM;i++){
            System.out.println("Digite o nome: ");
            String nome = ent.nextLine();

            System.out.println("Digite o salário: ");
            double sal = ent.nextDouble();
            ent.nextLine();//para limpar o buffer de entrada do teclado
            soma = soma + sal;

            Funcionario f = new Funcionario(nome,sal);
            funcionarios[i] = f;
            // Outra forma:
           // funcionarios[i] = new Funcionario(nome,sal);

        }
        double media = soma / TAM;
        System.out.printf("Media de salarios: %.2f",  media);

        for (Funcionario f : funcionarios){
            System.out.println("\n Salario antes do reajuste: " + f.getSalario());
            if (f.getSalario() >= media){
                System.out.println(f.getNome());
                f.setSalario(f.getSalario() * 1.05);
            }
            else
                f.setSalario(f.getSalario() * 1.10);

            System.out.println("Salario apos reajuste: "+ f.getSalario());
        }

    }
}
