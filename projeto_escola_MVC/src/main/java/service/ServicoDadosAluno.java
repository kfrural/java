package service;

import java.util.List;
import model.dao.AlunoDAO;
import model.dao.IDAO;
import model.entities.Aluno;

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

    public void adicionarAluno(String nome, String cpf, String curso, int idade) {
//        validarDadosAluno(nome, cpf, curso, idade);
        Aluno aluno = new Aluno(nome, cpf, curso, idade);
        try {
            repositorio.salvar(aluno);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao adicionar aluno: " + e.getMessage(), e);
        }
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

    private void validarDadosAluno(String nome, String cpf, String curso, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio.");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do aluno não pode ser vazio.");
        }
        if (curso == null || curso.trim().isEmpty()) {
            throw new IllegalArgumentException("Curso do aluno não pode ser vazio.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("Idade do aluno deve ser maior que zero.");
        }
    }
    
    public void excluirAluno(String codEscolhido) {
        repositorio.excluir(codEscolhido);
    }

    public void adicionarAluno(Aluno novaAluno) {
        Aluno aluno = new Aluno();
        repositorio.salvar(aluno);
    }
}
