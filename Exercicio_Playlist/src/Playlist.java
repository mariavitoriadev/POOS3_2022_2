import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void mostrarDados(){
        System.out.println("\n Nome: "+ this.nome);
        System.out.println("\n Musicas da playlist: ");
        for (Musica m: musicas)
            System.out.println(m.getTitulo());
    }

    public LocalTime calculaDuracao(){
        LocalTime total=LocalTime.of(0,0,0);
        for (Musica m: musicas)
             total=total.plusHours(m.getDuracao().getHour())
                     .plusMinutes(m.getDuracao().getMinute())
                     .plusSeconds(m.getDuracao().getSecond());
        return total;

    }

    public void adicionaMusica(Musica musica)
    {
        this.musicas.add(musica);
    }

    public  void removeMusica(Musica musica){
        this.musicas.remove(musica);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
