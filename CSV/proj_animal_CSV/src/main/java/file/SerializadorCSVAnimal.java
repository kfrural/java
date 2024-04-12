package file;

import classes.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVAnimal {
    public String toCSV(List<Animal> animais) {
        String csv = "Cod;Especie;Raca;Idade;Peso;\n";
        for (Animal a : animais) {
            csv += a.getCod() + ";" 
                + a.getEspecie() + ";"
                + a.getRaca()+ ";"
                + a.getIdade()+ ";"
                + a.getPeso() + ";\n";
        }
        return csv;
    }
    
    public List<Animal> fromCSV(String data) {
        List<Animal> animais = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 5) {
                Animal a = new Animal();
                a.setCod(partes[0]);
                a.setEspecie(partes[1]);
                a.setRaca(partes[2]);
                a.setIdade(Integer.parseInt(partes[3]));
                a.setPeso(Double.parseDouble(partes[4]));
                
                animais.add(a);
            }
        }
        return animais;
    }


}
