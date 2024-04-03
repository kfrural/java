package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private String sexo;
    public static int contador = 0;

    public Pessoa(String nome, String cpf, int idade, double altura, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        contador++;
    }

   public Pessoa(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.altura = 0.0;
        this.sexo = "";
        contador ++;
   }
    
    public Pessoa(Pessoa outra) {
        this.nome = outra.getNome();
        this.cpf = outra.getCpf();
        this.idade = outra.getIdade();
        this.altura = outra.getAltura();
        this.sexo = outra.getSexo();
        contador++;
    }

    public void copy(Pessoa outra) {
       this.nome = outra.getNome();
       this.cpf = outra.getCpf();
        this.idade = outra.getIdade();
        this.altura = outra.getAltura();
        this.sexo = outra.getSexo();
        contador++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }
    
    public String getSexo(){
        return this.sexo;
    }

    public void fill() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Idade: ");
        this.idade = leitor.nextInt();
        System.out.println("Altura: ");
        this.altura = leitor.nextDouble();
        System.out.println("Sexo: ");
        this.sexo = leitor.next();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.cpf);
        hash = 71 * hash + this.idade;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.sexo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + '}';
    }


}