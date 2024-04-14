package file;

import classes.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVCarro {
    public String toCSV(List<Carro> carros) {
        String csv = "Cod;Marca;Modelo;Ano;Preco;\n";
        for (Carro c : carros) {
            csv += c.getCod() + ";" 
                + c.getMarca() + ";"
                + c.getModelo()+ ";"
                + c.getAno()+ ";"
                + c.getPreco() + ";\n";
        }
        return csv;
    }
    
    public List<Carro> fromCSV(String data) {
        List<Carro> carros = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 5) {
                Carro c = new Carro();
                c.setCod(partes[0]);
                c.setMarca(partes[1]);
                c.setModelo(partes[2]);
                c.setAno(Integer.parseInt(partes[3]));
                c.setPreco(Double.parseDouble(partes[4]));
                
                carros.add(c);
            }
        }
        return carros;
    }


}
