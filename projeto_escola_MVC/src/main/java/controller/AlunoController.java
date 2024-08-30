package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dao.AlunoDAO;
import model.dao.IDAO;
import model.entities.Aluno;
import model.file.FilePersistence;
import model.file.SerializadorCSVAluno;

/**
 *
 * @author kfrural
 */
public class AlunoController {

    private List<Aluno> pessoas;
    private IDAO repositorio;
//    private RepositorioAluno repositorioAluno;

//    public AlunoController(AlunoDAO repositorioAluno) {
//        this.pessoas = new ArrayList<>();
////        this.repositorioAluno = repositorioAluno;
//    }
    public AlunoController(IDAO repositorio) {
        this.repositorio = repositorio;
    }

    public AlunoController() throws SQLException {
        this.pessoas = new ArrayList<>();
        this.repositorio = new AlunoDAO();
    }

    public void adicionarAluno(Aluno aluno) {
        pessoas.add(aluno);
//        repositorioAluno.salvar(aluno); // Salva no banco de dados
        System.out.println("Aluno adicionado com sucesso!");
    }

//     public void adicionarAluno(String nome, String cpf, int idade,String  curso) {  ESSE É O BÃO
//         ValidAluno valid = new ValidAluno();
//         Aluno a = valid.valid(nome, cpf, idade, curso);
//         this.repositorio.salvar(a);
//        System.out.println("Aluno adicionado com sucesso!");
//    }
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

//    public void removerAlunos(String cpf) {  ESSE É O BAO
//        this.repositorio.excluir(cpf);
//        System.out.println("Aluno removida com sucesso!");
//    }
    public Aluno buscarAluno(String cpf) {
        for (Aluno pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

//    public Aluno buscarAluno(String cpf) { ESSE É O BAO
//        return this.repositorio.buscar(cpf);
//    }
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
    
//    public void atualizarAluno(String cpfAntigo, String nome, String idade, String matricula, String anoIngresso) { ESSE É O BAO
//        removerAluno(cpfAntigo);
//        adicionarAluno(cpfAntigo, nome, idade, matricula, anoIngresso);
//    }

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
    public List<Aluno> listarAlunos() {
        return repositorio.listar();
    }
}
