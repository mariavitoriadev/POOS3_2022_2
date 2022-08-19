import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = ent.nextLine();
        System.out.println("Digite o peso: ");
        double peso = ent.nextDouble();
        System.out.println("Digite a altura: ");
        double alt = ent.nextDouble();

        Paciente p1 = new Paciente(nome,peso,alt);
        p1.calcularIMC();

    }
}
