package gerenciador;

import classes.Professor;
import file.FilePersistence;
import file.SerializadorCSVProfessor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorProfessor {

    private List<Professor> pessoas;

    public GerenciadorProfessor() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarProfessor(Professor pessoa) {
        pessoas.add(pessoa);
        System.out.println("Professor adicionada com sucesso!");
    }

    public boolean removerProfessor(String cpf) {
        for (Professor pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Professor removida com sucesso!");
                return true;
            }
        }
        System.out.println("Professor não encontrada!");
        return false;
    }

    public Professor buscarProfessor(String cpf) {
        for (Professor pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarProfessor(String cpf, Professor pessoaNova) {
        Professor pessoaExistente = buscarProfessor(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Professor atualizada com sucesso.");
        } else {
            System.out.println("Professor com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Professor pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVProfessor serializador = new SerializadorCSVProfessor();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVProfessor serializador = new SerializadorCSVProfessor();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }

    public List<Professor> getPessoas() {
        return pessoas;
    }
}

