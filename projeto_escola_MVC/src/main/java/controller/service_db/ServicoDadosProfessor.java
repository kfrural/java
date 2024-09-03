package controller.service_db;

import java.util.List;
import model.dao.IDAO;
import model.dao.ProfessorDAO;
import model.entities.Professor;

/**
 *
 * @author kfrural
 */
public class ServicoDadosProfessor {
    private ProfessorDAO repositorio;

    public ServicoDadosProfessor(ProfessorDAO repositorio) {
        this.repositorio = repositorio;
    }

    public ServicoDadosProfessor(IDAO repositorio) {
        this.repositorio = (ProfessorDAO) repositorio;
    }

    public void adicionarProfessor(String cpf, String nome, int idade, String materia) {
        Professor professor = new Professor(cpf, nome, idade, materia);
        repositorio.salvar(professor);
    }
    public void atualizarProfessor(String cpf, String nome, int idade, String materia) { //esse eh o bao
        excluirProfessor(cpf);
        adicionarProfessor(cpf, nome, idade, materia);
    }

    public void excluirProfessor(int idProfessor) {
        repositorio.excluir(idProfessor);
    }

    public List<Professor> obterProfessores() {
        return repositorio.listar();
    }

    public void adicionarProfessor(Professor professor) {
        repositorio.salvar(professor);
    }

    public void excluirProfessor(String cpfEscolhido) {
      repositorio.excluir(cpfEscolhido);
    }
}
