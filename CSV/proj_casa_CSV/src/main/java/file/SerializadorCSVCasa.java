package file;

import classes.Casa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVCasa {
    public String toCSV(List<Casa> casas) {
        String csv = "Cod;Tipo;Quartos;Banheiros;Area;Preco;\n";
        for (Casa c : casas) {
            csv += c.getCod() + ";" 
                + c.getTipo() + ";"
                + c.getQuartos()+ ";"
                + c.getBanheiros()+ ";"
                + c.getArea()+ ";"
                + c.getPreco() + ";\n";
        }
        return csv;
    }
    
    public List<Casa> fromCSV(String data) {
        List<Casa> casas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 6) {
                Casa c = new Casa();
                c.setCod(partes[0]);
                c.setTipo(partes[1]);
                c.setQuartos(Integer.parseInt(partes[2]));
                c.setBanheiros(Integer.parseInt(partes[3]));
                c.setArea(Double.parseDouble(partes[4]));
                c.setPreco(Double.parseDouble(partes[5]));
                
                casas.add(c);
            }
        }
        return casas;
    }


}
