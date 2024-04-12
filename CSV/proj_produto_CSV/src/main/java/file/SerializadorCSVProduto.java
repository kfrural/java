package file;

import classes.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVProduto {
    public String toCSV(List<Produto> produtos) {
        String csv = "Nome;Cor;Custo;Preco;\n";
        for (Produto m : produtos) {
            csv += m.getNome() + ";" 
                + m.getCor()+ ";"
                + m.getCusto()+ ";"
                + m.getPreco() + ";\n";
        }
        return csv;
    }
    
    public List<Produto> fromCSV(String data) {
        List<Produto> produtos = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Produto m = new Produto();
                m.setNome(partes[0]);
                m.setCor(partes[1]);
                m.setCusto(Double.parseDouble(partes[2]));
                m.setPreco(Double.parseDouble(partes[3]));
                
                produtos.add(m);
            }
        }
        return produtos;
    }


}
