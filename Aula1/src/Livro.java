public class Livro {
    private String titulo;
    private String nomeAutor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro() {
    }

    public Livro(String titulo, String nomeAutor, double preco) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.preco = preco;
    }


    public Livro(String titulo, String nomeAutor) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
    }

    public void atualizarPreco(double porcentagem){
        this.preco = this.preco + (this.preco * porcentagem);
    }

    public void mostrarDados(){
        System.out.println("\n Titulo: " + this.titulo +
                           "\n Autor: "+ this.nomeAutor +
                            "\n Preco: "+ this.preco);
    }

}
