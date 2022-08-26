public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private Departamento departamento;

    public void mostrarDados(){
        System.out.println("\n Nome: " + this.nome
                           + "\n CPF: " +  this.cpf
                            + "\n Salario: "+ this.salario
                            + "\n Departamento: " + this.departamento.getNome());
    }

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, double salario, Departamento departamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
      //  this.departamento.getFuncionarios().remove(this);
        this.departamento = departamento;
      //  this.departamento.getFuncionarios().add(this);

    }
}
