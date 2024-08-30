package model.file;

import java.util.ArrayList;
import java.util.List;
import model.entities.Professor;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVProfessor {

    // Serializa a lista de pessoas para uma String no formato CSV
    public String toCSV(List<Professor> pessoas) {
        String csv = "CPF;Nome;Idade;Materia;\n"; // Cabeçalho
        for (Professor pessoa : pessoas) {
            csv += pessoa.getCpf() + ";"
                    + pessoa.getNome() + ";"
                    + pessoa.getIdade() + ";"
                    + pessoa.getMateria() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de pessoas
    public List<Professor> fromCSV(String data) {
        List<Professor> pessoas = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                // Cria uma nova pessoa com os dados da linha
               Professor pessoa = new Professor(
                        partes[0], // CPF
                        partes[1], // Nome
                        Integer.parseInt(partes[2]), // Idade
                        partes[3] // Matéria
                );

                // Adiciona a pessoa à lista
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }
}
