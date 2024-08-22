package classes;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Professor extends Pessoa {
    private String materia;

    public Professor() {
        super();
        this.materia = "";
    }

    public Professor(String cpf, String nome, char sexo, int idade, String materia) {
        super(cpf, nome, sexo, idade);
        this.materia = materia;
    }
     public Professor(String nome, String cpf, String materia, int idade) {
        super(cpf, nome, ' ', idade);
        this.materia = materia;
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("\tPreencha\n");
        super.preencher();
        System.out.println("Matéria: ");
        this.setMateria(ler.next());
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + "materia=" + materia + '}';
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
