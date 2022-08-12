import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Livro livro1; //declarei objeto
        livro1 = new Livro(); //instanciei
       //Os comando comentados abaixo não irão funcionar,
        //pois os atributos agora são privados (private)
        // livro1.titulo = "POO";
        //livro1.nomeAutor="Deitel";
       // livro1.preco=200;
        //System.out.println(livro1.titulo);
        //System.out.println(livro1.nomeAutor);

        //Para acessá-los, agora basta usar os getters e setters
        livro1.setTitulo("POO");
        livro1.setNomeAutor("Deitel");
        livro1.setPreco(200);
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getNomeAutor());

        livro1.mostrarDados();

       Livro livro2 = new Livro("Java","Maria",400);
       livro2.mostrarDados();

        Livro livro3 = new Livro("PHP", "João");
        livro3.setPreco(100);
        livro3.atualizarPreco(0.10);
        livro3.mostrarDados();


    }
}
