/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class SerializadorCSVMusica {
    public String toCSV(List<Musica> musica) {
        String csv = "Cod;Nome;Custo;Preco;\n";
        for (Musica m : musica) {
            csv += m.getTitulo() + ";" 
                + m.getArtista()+ ";"
                + m.getDuracao()+ ";"
                + m.getPreco() + ";\n";
        }
        return csv;
    }
    
    public List<Musica> fromCSV(String data) {
        List<Musica> musica = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Musica m = new Musica();
                m.setTitulo(partes[0]);
                m.setArtista(partes[1]);
                m.setDuracao(Double.parseDouble(partes[2]));
                m.setPreco(Double.parseDouble(partes[3]));
                
                musica.add(m);
            }
        }
        return musica;
    }


}
