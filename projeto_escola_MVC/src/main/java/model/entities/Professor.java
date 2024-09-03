package model.entities;

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

    public Professor(String cpf, String nome, int idade, String materia) {
        super(cpf, nome,idade);
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
