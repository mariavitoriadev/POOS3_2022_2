public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public void calcularIMC(){
        //acesso direto aos atributos,
        // uma vez que estão visíveis(private) para a classe
        double imc = this.peso / (this.altura*this.altura);
        //poderia usar Math.pow(this.altura,2)
        //Poderia usar o getPeso() e getAltura():
        //double imc = this.getPeso() / (this.getAltura()*this.getAltura());
        System.out.printf("IMC: %.2f" , imc);
        if (imc < 18.5)
            System.out.println("\n Abaixo do peso");
        else
         if (imc < 24.9)
            System.out.println("\n Peso normal");
         else
           if (imc < 29.9)
             System.out.println("\n Acima do peso");
           else
             if (imc < 34.9)
               System.out.println("\n Obesidade I");
             else
               if (imc < 39.9)
                 System.out.println("\n Obesidade II");
               else
                 System.out.println("\n Obesidade III");

    }

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
