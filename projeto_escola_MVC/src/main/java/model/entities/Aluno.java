package model.entities;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno extends Pessoa{
    private int matricula;
    private int anoingresso;
    private String curso;

    public Aluno() {
        super();
        this.matricula = 0;
        this.anoingresso = 0;
        this.curso = "";
    }
    
    public Aluno(String cpf, String nome, char sexo, int idade, String curso) {
    super(cpf, nome, sexo, idade);
    this.matricula = 0;
    this.anoingresso = 0;
    this.curso = "";
}
    public Aluno(String nome, String cpf, String curso, int idade) {
        super(cpf, nome, '\0', idade);
        this.curso = curso;
        this.matricula = 0;
        this.anoingresso = 0; 
    }
        
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("Matricula: ");
        this.setMatricula(ler.nextInt());
        System.out.println("Ano ingresso: ");
        this.setAnoingresso(ler.nextInt());
        System.out.println("Curso: ");
        this.setCurso(ler.next());
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", anoingresso=" + anoingresso + ", curso=" + curso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.matricula;
        hash = 47 * hash + this.anoingresso;
        hash = 47 * hash + Objects.hashCode(this.curso);
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
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.anoingresso != other.anoingresso) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }

      
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnoingresso() {
        return anoingresso;
    }

    public void setAnoingresso(int anoingresso) {
        this.anoingresso = anoingresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
}
