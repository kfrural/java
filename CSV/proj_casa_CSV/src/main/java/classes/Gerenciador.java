package classes;

import file.FilePersistence;
import file.SerializadorCSVCasa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Gerenciador {
    private List <Casa> casas;
    
    public Gerenciador(){
        this.casas = new ArrayList<>();
    }

    public void adicionarCasa(Casa casas){
        this.casas.add(casas);
    }
      
 public Casa buscarCasa(String cod){
     for(Casa c : this.casas){
         if(c.getCod().equals(cod))
             return c;
     }
     return null;
 }
    
 public boolean removerCasa(String cod){
     Casa encontrou = buscarCasa(cod);
     if(encontrou != null){
         this.casas.remove(encontrou);
         System.out.println("Casa removida...");
         return true;
     }
     System.out.println("Nao foi encontrada...");
     return false;
 }
  public void atualizarCasa(String nomeAntigo, Casa cNova){
      Casa cExistente = buscarCasa(nomeAntigo);
      
      if(cExistente != null){
          int indice = casas.indexOf(cExistente);
          casas.set(indice, cNova);
          System.out.println("Casa atualizada com sucesso");
      } else
          System.out.println("Casa " + nomeAntigo + " nao foi encontrada");
  }
  
  public void salvarArquivo(String caminho){
      SerializadorCSVCasa serializadorCSV = new SerializadorCSVCasa();
      String csvData = serializadorCSV.toCSV(this.casas);
      
      FilePersistence filePersistence = new FilePersistence();
      filePersistence.saveToFile(csvData, caminho);
      System.out.println("Casa salva em " + caminho);
  }
  
  public void carregarArquivo(String caminho){
      FilePersistence filePersistence = new FilePersistence();
      String csvData = filePersistence.loadFromFile(caminho);
      
      SerializadorCSVCasa desserializadorCSV = new SerializadorCSVCasa();
      this.casas = desserializadorCSV.fromCSV(csvData);
      
      System.out.println("Casas carregadas com sucesso");
  }

    @Override
    public String toString() {
        return "Gerenciador{" + "casas=" + casas + '}';
    }
  
}