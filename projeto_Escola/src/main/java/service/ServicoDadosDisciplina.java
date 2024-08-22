package service;

import classes.Disciplina;
import interfaces.IRepositorioDados;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class ServicoDadosDisciplina {
    private RepositorioDisciplina repositorio;

    public ServicoDadosDisciplina(RepositorioDisciplina repositorio) {
        this.repositorio = repositorio;
    }

    public ServicoDadosDisciplina(IRepositorioDados repositorio) {
        this.repositorio = (RepositorioDisciplina) repositorio;
    }

    public void adicionarDisciplinas(String nome, String codigo, String ch, String dpto) {
        Disciplina disciplina = new Disciplina(nome, codigo, ch, dpto);
        repositorio.salvar(disciplina);
    }
public void adicionarDisciplina(Disciplina d) {
        Disciplina disciplina = new Disciplina();
        repositorio.salvar(disciplina);
    }
    public void excluirDisciplina(int idDisciplina) {
        repositorio.excluir(idDisciplina);
    }

    public List<Disciplina> obterDisciplinas() {
        return repositorio.listar();
    }

    public void excluirDisciplina(String codEscolhido) {
        repositorio.excluir(codEscolhido);
    }
}
