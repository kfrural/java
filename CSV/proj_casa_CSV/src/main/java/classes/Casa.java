package classes;

/**
 *
 * @author kfrural
 */
public class Casa {
    
    private String cod;
    private String tipo;
    private int quartos;
    private int banheiros;
    private double area;
    private double preco;

    public Casa() {
        this.cod = "";
        this.tipo = "";
        this.quartos = 0;
        this.banheiros = 0;
        this.area = 0.0;
        this.preco = 0.0;
    }

    @Override
    public String toString() {
        return "Casa{" + "cod=" + cod + ", tipo=" + tipo + ", quartos=" + quartos + ", banheiros=" + banheiros + ", area=" + area + ", preco=" + preco + '}';
    }

    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
