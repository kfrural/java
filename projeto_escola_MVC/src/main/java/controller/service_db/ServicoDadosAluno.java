package controller.service_db;

import java.util.List;
import model.dao.AlunoDAO;
import model.dao.IDAO;
import model.entities.Aluno;
import model.valid.ValidAluno;

/**
 *
 * @author kfrural
 */
public class ServicoDadosAluno {

    private AlunoDAO repositorio;

    public ServicoDadosAluno(AlunoDAO repositorio) {
        this.repositorio = repositorio;
    }

    public ServicoDadosAluno(IDAO repositorio) {
        this.repositorio = (AlunoDAO) repositorio;
    }

    public void adicionarAluno(String cpf, String nome, int idade, String curso) {
        ValidAluno valid = new ValidAluno();
        Aluno a = valid.valid(cpf, nome, idade, curso);
        this.repositorio.salvar(a);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void atualizarAluno(String cpf, String nome, int idade, String curso) { //esse eh o bao
        excluirAluno(cpf);
        adicionarAluno(cpf, nome, idade, curso);
    }

    public void excluirAluno(int idAluno) {
        try {
            repositorio.excluir(idAluno);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir aluno: " + e.getMessage(), e);
        }
    }

    public List<Aluno> obterAlunos() {
        try {
            return repositorio.listar();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter alunos: " + e.getMessage(), e);
        }
    }

    public void excluirAluno(String codEscolhido) {
        repositorio.excluir(codEscolhido);
    }

    public void adicionarAluno(Aluno novaAluno) {
        repositorio.salvar(novaAluno);
    }
}
