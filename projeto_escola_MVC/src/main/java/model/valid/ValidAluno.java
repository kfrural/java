package model.valid;

import model.entities.Aluno;
import model.exceptions.Exception;

/**
 *
 * @author kfrural
 */
public class ValidAluno {
    public Aluno valid(String cpf, String nome, int idade, String matricula, int anoIngresso) {
        Aluno a = new Aluno();

        if (cpf == null || cpf.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'CPF'.");
        }
        a.setCpf(cpf);

        if (nome == null || nome.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'Nome'.");
        }
        a.setNome(nome);

        if (idade <= 0) {
            throw new Exception("Error - Valor inválido no campo 'Idade'.");
        }
        a.setIdade(idade);

        if (matricula == null || matricula.isEmpty()) {
            throw new Exception("Error - Campo vazio: 'Matricula'.");
        }
        a.setMatricula(matricula);

        if (anoIngresso <= 0) {
            throw new Exception("Error - Valor inválido no campo 'Ano de Ingresso'.");
        }
        a.setAnoIngresso(anoIngresso);

        return a;
    }
}