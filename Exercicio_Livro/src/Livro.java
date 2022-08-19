import java.util.List;

public class Livro {
    private String titulo;
    private int publicacao;
    private double preco;
    private Editora editora;
    private List<Autor> autor;

    public Livro(String titulo, int publicacao, double preco, Editora editora, List<Autor> autor) {
        this.titulo = titulo;
        this.publicacao = publicacao;
        this.preco = preco;
        this.editora = editora;
        this.autor = autor;
    }

    public Livro() {
    }

    public void mostrarDados(){
        System.out.println("\n Titulo: "+ titulo+
                           "\n Ano: " + publicacao+
                           "\n Preco: "+ preco+
                           "\n Editora: "+ editora.getRazaoSocial());
        System.out.println("\n Autores:");
        for (Autor a : autor)
            System.out.println("\n "+ a.getNome());
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
}
