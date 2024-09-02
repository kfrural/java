package model.file;

import java.util.ArrayList;
import java.util.List;
import model.entities.Disciplina;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVDisciplina {
    
    public String toCSV(List<Disciplina> disciplinas) {
        String csv = "Cod;Nome;CH;Dpto;\n";
        for (Disciplina disciplina : disciplinas) {
            csv += disciplina.getCod() + ";" 
                + disciplina.getNome() + ";"
                + disciplina.getCh() + ";"
                + disciplina.getDpto() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de disciplinas
    public List<Disciplina> fromCSV(String data) {
        List<Disciplina> disciplinas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Disciplina disciplina = new Disciplina();
                disciplina.setCod(partes[0]);
                disciplina.setNome(partes[1]);
                disciplina.setCh(Integer.parseInt(partes[2]));
                disciplina.setDpto(partes[3]);
                
                //apos montar um disciplina, adiciono na lista
                disciplinas.add(disciplina);
            }
        }
        return disciplinas;
    }
}
