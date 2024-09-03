package controller.service_db;

import java.util.List;
import model.dao.DisciplinaDAO;
import model.dao.IDAO;
import model.entities.Disciplina;
import model.valid.ValidDisciplina;

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

    public void adicionarDisciplina(String cod, String nome, int ch, String dpto) {  //Esse eh o bao
        ValidDisciplina valid = new ValidDisciplina();
        Disciplina d = valid.valid(cod, nome, ch, dpto);
        this.repositorio.salvar(d);
        System.out.println("Disciplina adicionada com sucesso!");
    }

    public void atualizarDisciplina(String codAntigo, String nome, int ch, String dpto) { //esse eh o bao
        excluirDisciplina(codAntigo);
        adicionarDisciplina(codAntigo, nome, ch, dpto);
    }

    public List<Disciplina> obterDisciplinas() {
        return repositorio.listar();
    }

    public void excluirDisciplina(String codEscolhido) {
        repositorio.excluir(codEscolhido);
    }
}
