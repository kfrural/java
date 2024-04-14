package classes;

/**
 *
 * @author kfrural
 */
public class Carro {
    
    private String cod;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Carro() {
        this.cod = "";
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.preco = 0.0;
    }

    @Override
    public String toString() {
        return "Carro{" + "cod=" + cod + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + '}';
    }    

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
