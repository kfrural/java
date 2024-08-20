package file;

import classes.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVAluno {

    // Serializa a lista de pessoas para uma String no formato CSV
    public String toCSV(List<Aluno> pessoas) {
        String csv = "CPF;Nome;Sexo;Idade;Curso\n"; // Cabeçalho
        for (Aluno pessoa : pessoas) {
            csv += pessoa.getCpf() + ";"
                    + pessoa.getNome() + ";"
                    + pessoa.getSexo() + ";"
                    + pessoa.getIdade() + ";"
                    + pessoa.getCurso() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de pessoas
    public List<Aluno> fromCSV(String data) {
        List<Aluno> pessoas = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 5) {
                // Cria uma nova pessoa com os dados da linha
                Aluno pessoa = new Aluno(
                        partes[0], // CPF
                        partes[1], // Nome
                        partes[2].charAt(0), // Sexo
                        Integer.parseInt(partes[3]) ,// Idade
                        partes[4]
                );

                // Adiciona a pessoa à lista
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }
}
