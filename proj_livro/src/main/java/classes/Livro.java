package classes;

/**
 *
 * @author kfrural
 */
public class Livro {
    private String titulo;
    private String autor;
    private int num_pag;
    private double preco;

    public Livro(String titulo, String autor, int num_pag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
        this.preco = preco;
    }

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.num_pag = 0;
        this.preco = 0.0;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", num_pag=" + num_pag + ", preco=" + preco + '}';
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
