package classes;

/**
 *
 * @author kfrural
 */
public class Animais {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Animais(String nome, String especie, String raca, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public Animais() {
        this.nome = "";
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }

    @Override
    public String toString() {
        return "Animais{" + "nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
