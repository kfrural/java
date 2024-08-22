package service;

import classes.Professor;
import interfaces.IRepositorioDados;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class ServicoDadosProfessor {
    private RepositorioProfessor repositorio;

    public ServicoDadosProfessor(RepositorioProfessor repositorio) {
        this.repositorio = repositorio;
    }

    public ServicoDadosProfessor(IRepositorioDados repositorio) {
        this.repositorio = (RepositorioProfessor) repositorio;
    }

    public void adicionarProfessor(String nome, String cpf, String materia, int idade) {
        Professor professor = new Professor(nome, cpf, materia, idade);
        repositorio.salvar(professor);
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
