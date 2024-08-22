package service;

import classes.Pessoa;
import interfaces.IRepositorioDados;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class ServicoDados {
    private IRepositorioDados<Pessoa> repositorio;

    public ServicoDados(IRepositorioDados<Pessoa> repositorio) {
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
