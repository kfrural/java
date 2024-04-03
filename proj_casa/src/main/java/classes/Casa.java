package classes;

/**
 *
 * @author kfrural
 */
public class Casa {
    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;

    public Casa(String endereco, double area, int num_quartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.num_quartos = num_quartos;
        this.preco = preco;
    }

    public Casa() {
        this.endereco = "";
        this.area = 0.0;
        this.num_quartos = 0;
        this.preco = 0.0;
    }

    @Override
    public String toString() {
        return "Casa{" + "endereco=" + endereco + ", area=" + area + ", num_quartos=" + num_quartos + ", preco=" + preco + '}';
    }
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
