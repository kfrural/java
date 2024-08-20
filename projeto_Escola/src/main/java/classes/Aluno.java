package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Aluno extends Pessoa{
    private String matricula;
    private int anoingresso;
    private String curso;

    public Aluno() {
        super();
        this.matricula = "";
        this.anoingresso = 0;
        this.curso = "";
    }
    
    public Aluno(String cpf, String nome, char sexo, int idade, String curso) {
    super(cpf, nome, sexo, idade);
    this.matricula = "";
    this.anoingresso = 0;
    this.curso = "";
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
        return "Aluno{" + "matricula=" + matricula + ", anoingresso=" + anoingresso + ", curso=" + curso + '}';
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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
