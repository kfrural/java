package model.entities;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno() {
        super();
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String cpf, String nome, int idade, String curso) {
        super(cpf, nome, idade);
        this.curso = curso;
    }


    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha...\n");
        super.preencher();
        System.out.println("Matricula: ");
        this.setMatricula(ler.next());
        System.out.println("Curso: ");
        this.setCurso(ler.next());
    }

    @Override
    public String toString() {
        return "Aluno{"
                + "nome='" + getNome() + '\''
                + ", cpf='" + getCpf() + '\''
                + ", idade=" + getIdade()
                + ", curso='" + curso + '\''
                + ", matricula=" + matricula
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.matricula);
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
