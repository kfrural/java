package gerenciador;

import classes.Aluno;
import file.FilePersistence;
import file.SerializadorCSVAluno;
import java.util.ArrayList;
import java.util.List;
import service.RepositorioAluno;

/**
 *
 * @author kfrural
 */
public class GerenciadorAluno {

    private List<Aluno> pessoas;
//    private RepositorioAluno repositorioAluno;

    public GerenciadorAluno(RepositorioAluno repositorioAluno) {
        this.pessoas = new ArrayList<>();
//        this.repositorioAluno = repositorioAluno;
    }

    public GerenciadorAluno() {
     this.pessoas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        pessoas.add(aluno);
//        repositorioAluno.salvar(aluno); // Salva no banco de dados
        System.out.println("Aluno adicionado com sucesso!");
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

    public void atualizarAluno(String cpf, Aluno alunoNovo) {
        Aluno alunoExistente = buscarAluno(cpf);
    
    if (alunoExistente != null) {
        int indice = pessoas.indexOf(alunoExistente);
        pessoas.set(indice, alunoNovo);
//        repositorioAluno.excluir(alunoExistente.getMatricula()); // Remove o registro antigo
//        repositorioAluno.salvar(alunoNovo); // Salva o novo registro
        System.out.println("Aluno atualizado com sucesso.");
    } else {
        System.out.println("Aluno com o CPF " + cpf + " não encontrado.");
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

//    public void importarParaBancoDeDados(String caminhoDoArquivo) {
//        FilePersistence filePersistence = new FilePersistence();
//        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
//
//        SerializadorCSVAluno serializador = new SerializadorCSVAluno();
//        List<Aluno> alunos = serializador.fromCSV(csvData);
//
//        for (Aluno aluno : alunos) {
//            repositorioAluno.salvar(aluno);
//        }
//
//        System.out.println("Alunos importados e salvos no banco de dados com sucesso.");
//    }

    public List<Aluno> getPessoas() {
        return pessoas;
    }
}
