import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void mostrarDados(){
        System.out.println("\n Nome: "+ this.nome +
                           "\n Sigla: " + this.sigla);
        for (Funcionario f: funcionarios)
            System.out.println("\n Nome do func.: "+ f.getNome()+
                               "\n CPF: " + f.getCpf());

    }

    public double calcularFolhaPagamento(){
        double soma=0;
        for (Funcionario f: funcionarios)
            soma = soma + f.getSalario();
        return soma;
    }

    public void adicionarFuncionario(Funcionario func)
    {
        this.funcionarios.add(func);
    }

    public void removerFuncionario(Funcionario func){
        this.funcionarios.remove(func);
    }

    public Departamento() {
    }

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
