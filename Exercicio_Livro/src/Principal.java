import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Editora editora = new Editora("Pearson","12345");

        Autor autor1 = new Autor("Maria", "98989898");
        Autor autor2 = new Autor("Deitel", "123456");

        List<Autor> listaAutores = new ArrayList<>();
        listaAutores.add(autor1);
        listaAutores.add(autor2);

        Livro livro = new Livro("Java",
                              2016,
                                   300,
                                   editora,
                                   listaAutores);//repare que é passada a listaAutores para o método construtor
                                                 //listaAutores possui 2 objetos do tipo Autor

        Autor autor3 = new Autor("Rafael","987654");
        Livro livro2 = new Livro("POO",
                2022,
                200,
                editora,
                new ArrayList<>(List.of(autor1,autor2)));//outra forma de passar uma lista de Autor para o método construtor

        //Adicionar mais um autor ao livro2:
        livro2.getAutor().add(autor3);

        //obter os autores de um determinado livro:
        //getAutor() retorna uma lista
        List<Autor> autoresLivro = livro.getAutor();

        System.out.println("Autores do livro2: ");
        livro2.mostrarDados();
    }
}
