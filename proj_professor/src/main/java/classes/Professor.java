package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Professor {

    private String nome;
    private String cpf;
    private int idade;
    private String sexo;

    public Professor(String nome, String cpf, int idade,String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

   public Professor(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.sexo = "";
   }
    
    public Professor(Professor outra) {
        this.nome = outra.getNome();
        this.cpf = outra.getCpf();
        this.idade = outra.getIdade();
        this.sexo = outra.getSexo();
    }

    public void copy(Professor outra) {
       this.nome = outra.getNome();
       this.cpf = outra.getCpf();
        this.idade = outra.getIdade();
        this.sexo = outra.getSexo();
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

    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
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
        System.out.println("Sexo: ");
        this.sexo = leitor.next();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + this.idade;
        hash = 41 * hash + Objects.hashCode(this.sexo);
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
        final Professor other = (Professor) obj;
        if (this.idade != other.idade) {
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
        return "Professor{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

  

}