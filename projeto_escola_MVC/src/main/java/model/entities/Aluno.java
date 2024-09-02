package model.entities;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno extends Pessoa{
    private String matricula;
    private int anoIngresso;
    private String curso;

    public Aluno() {
        super();
        this.matricula = "";
        this.anoIngresso = 0;
        this.curso = "";
    }
    
    public Aluno(String cpf, String nome, int idade, String curso) {
    super(cpf, nome, idade);
    this.matricula = "";
    this.anoIngresso = 0;
    this.curso = "";
}
   public Aluno(String nome, String cpf, String curso, int idade, String matricula, int anoIngresso) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
        
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("Matricula: ");
        this.setMatricula(ler.next());
        System.out.println("Ano ingresso: ");
        this.setAnoingresso(ler.nextInt());
        System.out.println("Curso: ");
        this.setCurso(ler.next());
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "nome='" + getNome() + '\'' +
               ", cpf='" + getCpf() + '\'' +
               ", idade=" + getIdade() +
               ", curso='" + curso + '\'' +
               ", matricula=" + matricula +
               ", anoIngresso=" + anoIngresso +
               '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + this.anoIngresso;
        hash = 97 * hash + Objects.hashCode(this.curso);
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
        final Aluno other = (Aluno) obj;
        if (this.anoIngresso != other.anoIngresso) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoingresso() {
        return anoIngresso;
    }

    public void setAnoingresso(int anoingresso) {
        this.anoIngresso = anoingresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
        
}
