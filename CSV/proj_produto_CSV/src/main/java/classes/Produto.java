package classes;

/**
 *
 * @author kfrural
 */
public class Produto {

    private String nome;
    private String cor;
    private double custo;
    private double preco;

    public Produto() {
        this.nome = "";
        this.cor = "";
        this.custo = 0.0;
        this.preco = 0.0;
    }

    public Produto(String nome, double custo) {
        this.nome = nome;
        this.custo = custo;
    }

    public Produto(Produto outra) {
        this.nome = outra.getNome();
        this.custo = outra.getCusto();
    }

    public void copy(Produto outra) {
        this.nome = outra.getNome();
        this.custo = outra.getCusto();
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", cor=" + cor + ", custo=" + custo + ", preco=" + preco + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
