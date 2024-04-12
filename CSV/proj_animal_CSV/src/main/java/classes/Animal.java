package classes;

/**
 *
 * @author kfrural
 */
public class Animal {

    private String cod;
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Animal() {
        this.cod = "";
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }

    @Override
    public String toString() {
        return "Animal{" + "cod=" + cod + ", especie=" + especie + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + '}';
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
   

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
