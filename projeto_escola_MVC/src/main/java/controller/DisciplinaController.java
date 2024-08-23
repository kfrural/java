package controller;

import java.util.ArrayList;
import java.util.List;
import model.entities.Disciplina;
import model.file.FilePersistence;
import model.file.SerializadorCSVDisciplina;
/**
 *
 * @author kfrural
 */
public class DisciplinaController {

    private List<Disciplina> pessoas;

    public DisciplinaController() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina pessoa) {
        pessoas.add(pessoa);
        System.out.println("Disciplina adicionada com sucesso!");
    }

    public boolean removerDisciplina(String cpf) {
        for (Disciplina pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Disciplina removida com sucesso!");
                return true;
            }
        }
        System.out.println("Disciplina não encontrada!");
        return false;
    }

    public Disciplina buscarDisciplina(String cpf) {
        for (Disciplina pessoa : pessoas) {
            if (pessoa.getCod().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarDisciplina(String cpf, Disciplina pessoaNova) {
        Disciplina pessoaExistente = buscarDisciplina(cpf);
        
        if (pessoaExistente != null) {
            int indice = pessoas.indexOf(pessoaExistente);
            pessoas.set(indice, pessoaNova);
            System.out.println("Disciplina atualizada com sucesso.");
        } else {
            System.out.println("Disciplina com o CPF " + cpf + " não encontrada.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Disciplina pessoa : pessoas) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVDisciplina serializador = new SerializadorCSVDisciplina();
        String csvData = serializador.toCSV(pessoas);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVDisciplina serializador = new SerializadorCSVDisciplina();
        this.pessoas = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }

    public List<Disciplina> getPessoas() {
        return pessoas;
    }
    
}

