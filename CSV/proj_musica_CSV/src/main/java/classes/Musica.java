package classes;

/**
 *
 * @author kfrural
 */
public class Musica {

    private String titulo;
    private String artista;
    private double duracao;
    private double preco;

    public Musica() {
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Musica(Musica outra) {
        this.titulo = outra.getTitulo();
        this.duracao = outra.getDuracao();
    }

    public void copy(Musica outra) {
        this.titulo = outra.getTitulo();
        this.duracao = outra.getDuracao();
    }

    @Override
    public String toString() {
        return "Musica{" + "titulo=" + titulo + ", artista=" + artista + ", duracao=" + duracao + ", preco=" + preco + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
