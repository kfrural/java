package model.valid;

import model.entities.Disciplina;

/**
 *
 * @author kfrural
 */
public class ValidDisciplina {
    public Disciplina valid(String codigo, String nome, int cargaHoraria, String departamento) {
        Disciplina d = new Disciplina();

        if (codigo == null || codigo.isEmpty()) {
            throw new model.exceptions.Exception("Error - Campo vazio: 'Código'.");
        }
        d.setCod(codigo);

        if (nome == null || nome.isEmpty()) {
            throw new model.exceptions.Exception("Error - Campo vazio: 'Nome'.");
        }
        d.setNome(nome);

        if (cargaHoraria <= 0) {
            throw new model.exceptions.Exception("Error - Valor inválido no campo 'Carga Horária'.");
        }
        d.setCh(cargaHoraria);

        if (departamento == null || departamento.isEmpty()) {
            throw new model.exceptions.Exception("Error - Campo vazio: 'Departamento'.");
        }
        d.setDpto(departamento);

        return d;
    }
}
