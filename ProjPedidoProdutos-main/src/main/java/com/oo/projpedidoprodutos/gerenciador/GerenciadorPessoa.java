package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Pessoa;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVPessoa;
import com.oo.projpedidoprodutos.file.SerializadorCSVProduto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jose
 */
public class GerenciadorPessoa {

    private List<Pessoa> pessoas;

    public GerenciadorPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public boolean removerPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Pessoa removida com sucesso!");
                return true;
            }
        }
        System.out.println("Pessoa não encontrada!");
        return false;
    }

    public Pessoa buscarPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarPessoa(String cpf, Pessoa pessoaNova) {
        Pessoa pessoaExistente = buscarPessoa(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Pessoa atualizada com sucesso.");
        } else {
            System.out.println("Pessoa com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVPessoa serializador = new SerializadorCSVPessoa();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVPessoa serializador = new SerializadorCSVPessoa();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
}

