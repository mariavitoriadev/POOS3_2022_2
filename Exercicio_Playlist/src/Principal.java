import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /* Usando o  construtor vazio:
        Musica m = new Musica();
        m.setTitulo("Musica1");
        m.setArtista("Cantor1");*/

        Musica m1 = new Musica("Musica1",
                "Cantor1",
                "Rock",
                LocalTime.of(0,3,40));

        m1.mostrarDados();

        Musica m2 = new Musica("Musica2",
                "Cantor2",
                "Rock",
                LocalTime.of(0,5,30));

        m2.mostrarDados();

        Playlist playlist1 = new Playlist("Primeira Playlist");
        playlist1.adicionaMusica(m1);
        playlist1.adicionaMusica(m2);

        System.out.println("\n Duração da playlist: " + playlist1.calculaDuracao());
        playlist1.mostrarDados();

    }
}
