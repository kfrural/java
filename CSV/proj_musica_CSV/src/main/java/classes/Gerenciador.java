package classes;

import file.FilePersistence;
import file.SerializadorCSVMusica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Gerenciador {
    private List <Musica> musica;
    
    public Gerenciador(){
        this.musica = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica){
        this.musica.add(musica);
    }
      
 public Musica buscarMusica(String titulo){
     for(Musica m : this.musica){
         if(m.getTitulo().equals(titulo))
             return m;
     }
     return null;
 }
    
 public boolean removerMusica(String titulo){
     Musica encontrou = buscarMusica(titulo);
     if(encontrou != null){
         this.musica.remove(encontrou);
         System.out.println("Musica removida...");
         return true;
     }
     System.out.println("Nao foi encontrada...");
     return false;
 }
  public void atualizarMusica(String tituloAntigo, Musica mNova){
      Musica mExistente = buscarMusica(tituloAntigo);
      
      if(mExistente != null){
          int indice = musica.indexOf(mExistente);
          musica.set(indice, mNova);
          System.out.println("Musica atualizada com sucesso");
      } else
          System.out.println("Musica " + tituloAntigo + " nao foi encontrada");
  }
  
  public void salvarArquivo(String caminho){
      SerializadorCSVMusica serializadorCSV = new SerializadorCSVMusica();
      String csvData = serializadorCSV.toCSV(this.musica);
      
      FilePersistence filePersistence = new FilePersistence();
      filePersistence.saveToFile(csvData, caminho);
      System.out.println("Musica salva em " + caminho);
  }
  
  public void carregarArquivo(String caminho){
      FilePersistence filePersistence = new FilePersistence();
      String csvData = filePersistence.loadFromFile(caminho);
      
      SerializadorCSVMusica desserializadorCSV = new SerializadorCSVMusica();
      this.musica = desserializadorCSV.fromCSV(csvData);
      
      System.out.println("Musicas carregadas com sucesso");
  }

    @Override
    public String toString() {
        return "Gerenciador{" + "musica=" + musica + '}';
    }
  
}