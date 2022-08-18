public class Principal {
    public static void main(String[] args) {
        Livro livro1; //declaração do objeto
        livro1 = new Livro(); //instanciação

        //Os comando comentados abaixo não irão funcionar mais,
        //pois os atributos agora são privados (private). Veja a classe Livro
        //livro1.titulo = "POO";
        //livro1.nomeAutor="Deitel";
        //livro1.preco=200;
        //System.out.println(livro1.titulo);
        //System.out.println(livro1.nomeAutor);

        //Agora, para acessar os atributos,
        //basta usar os getters e setters
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

        //Declaração e inicialização de array de 2 posições,
        //contendo os objetos livro1 e livro2
        Livro[] arrayLivros1 = new Livro[]{livro1,livro2};
        //for aprimorado para percorrer o array e mostrar o conteúdo
        System.out.println("\n Conteúdo do arrayLivros1:");
        for (Livro livro : arrayLivros1)
            livro.mostrarDados();

        //Declaração de um array de Livro de 5 posições
        // e diferentes maneiras de atribuição
        Livro[] arrayLivros2 = new Livro[5];
        arrayLivros2[0] = livro1;
        arrayLivros2[1] = livro2;
        arrayLivros2[2] = livro3;
        arrayLivros2[3] = new Livro("C#","Deitel", 500);
        arrayLivros2[4] = new Livro("Java Avançado","José");

        //for aprimorado para percorrer o array arrayLivros2
        System.out.println("\n Conteúdo do arrayLivros2:");
        for (Livro livro : arrayLivros2)
            livro.mostrarDados();
    }
}
