package service;

import java.util.List;
import model.dao.DisciplinaDAO;
import model.dao.IDAO;
import model.entities.Disciplina;

/**
 *
 * @author kfrural
 */
public class ServicoDadosDisciplina {
    private DisciplinaDAO repositorio;

    public ServicoDadosDisciplina(DisciplinaDAO repositorio) {
        this.repositorio = repositorio;
    }

    public ServicoDadosDisciplina(IDAO repositorio) {
        this.repositorio = (DisciplinaDAO) repositorio;
    }

    public void adicionarDisciplinas(String nome, String codigo, String ch, String dpto) {
        Disciplina disciplina = new Disciplina(nome, codigo, ch, dpto);
        repositorio.salvar(disciplina);
    }
public void adicionarDisciplina(Disciplina d) {
        repositorio.salvar(d);
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
