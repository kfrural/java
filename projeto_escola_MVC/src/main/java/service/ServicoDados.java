package service;

import java.util.List;
import model.dao.IDAO;
import model.entities.Pessoa;

/**
 *
 * @author kfrural
 */
public class ServicoDados {
    private IDAO<Pessoa> repositorio;

    public ServicoDados(IDAO<Pessoa> repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarPessoa(String nome, String cpf, int idade) {
        Pessoa pessoa = new Pessoa(nome, cpf, idade);
        repositorio.salvar(pessoa);
    }

    public void excluirPessoa(int idPessoa) {
        repositorio.excluir(idPessoa);
    }

    public List<Pessoa> obterPessoas() {
        return repositorio.listar();
    }
}
