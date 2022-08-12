import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        final int TAM =7; //constante
        int[] vetor = new int[TAM];
        Scanner ent = new Scanner(System.in);

        int soma=0;
        for (int i=0; i<TAM;i++){
            System.out.println("Digite a qtd de caso: ");
            vetor[i] = ent.nextInt();
            soma = soma + vetor[i];
        }

        double media = (double) soma / 7;
        System.out.println("Media: " + media);

        int cont =0;

        for (int i=0;i<TAM;i++) {
            if (vetor[i] > media) {
                cont++;
            }
        }

/*        for (int elem : vetor) {
            if (elem > media) {
                cont++;
            }
        }*/

        System.out.println("\n Qtd dias acima da média: " + cont);
    }
}
