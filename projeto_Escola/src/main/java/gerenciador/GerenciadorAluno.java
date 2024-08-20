package gerenciador;

import classes.Aluno;
import file.FilePersistence;
import file.SerializadorCSVAluno;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kfrural
 */
public class GerenciadorAluno {

    private List<Aluno> pessoas;

    public GerenciadorAluno() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno pessoa) {
        pessoas.add(pessoa);
        System.out.println("Aluno adicionada com sucesso!");
    }

    public boolean removerAluno(String cpf) {
        for (Aluno pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Aluno removida com sucesso!");
                return true;
            }
        }
        System.out.println("Aluno não encontrada!");
        return false;
    }

    public Aluno buscarAluno(String cpf) {
        for (Aluno pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarAluno(String cpf, Aluno pessoaNova) {
        Aluno pessoaExistente = buscarAluno(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Aluno atualizada com sucesso.");
        } else {
            System.out.println("Aluno com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Aluno pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVAluno serializador = new SerializadorCSVAluno();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVAluno serializador = new SerializadorCSVAluno();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }

    public List<Aluno> getPessoas() {
        return pessoas;
    }
}

