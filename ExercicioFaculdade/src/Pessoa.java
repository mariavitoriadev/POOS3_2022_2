public abstract class Pessoa {
    private String cpf;
    private String nome;

    //Método abstrato. As classes filhas concretas (não abstratas)
    //terão que implementar este método
    public abstract void mostrarDados();

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
