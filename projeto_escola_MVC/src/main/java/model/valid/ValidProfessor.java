package model.valid;

import model.entities.Professor;
import model.exceptions.Exception;

/**
 *
 * @author kfrural
 */
public class ValidProfessor {
    public Professor valid(String cpf, String nome, int idade, String materia) {
        Professor p = new Professor();

        if (cpf == null || cpf.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'CPF'.");
        }
        p.setCpf(cpf);

        if (nome == null || nome.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'Nome'.");
        }
        p.setNome(nome);

        if (idade <= 0) {
            throw new Exception("Error - Valor inválido no campo 'Idade'.");
        }
        p.setIdade(idade);

        if (materia == null || materia.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'Matéria'.");
        }
        p.setMateria(materia);

        return p;
    }
}
