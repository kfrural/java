package classes;

import file.FilePersistence;
import file.SerializadorCSVCarro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Gerenciador {
    private List <Carro> carros;
    
    public Gerenciador(){
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carros){
        this.carros.add(carros);
    }
      
 public Carro buscarCarro(String cod){
     for(Carro c : this.carros){
         if(c.getCod().equals(cod))
             return c;
     }
     return null;
 }
    
 public boolean removerCarro(String cod){
     Carro encontrou = buscarCarro(cod);
     if(encontrou != null){
         this.carros.remove(encontrou);
         System.out.println("Carro removida...");
         return true;
     }
     System.out.println("Nao foi encontrada...");
     return false;
 }
  public void atualizarCarro(String nomeAntigo, Carro cNova){
      Carro cExistente = buscarCarro(nomeAntigo);
      
      if(cExistente != null){
          int indice = carros.indexOf(cExistente);
          carros.set(indice, cNova);
          System.out.println("Carro atualizada com sucesso");
      } else
          System.out.println("Carro " + nomeAntigo + " nao foi encontrada");
  }
  
  public void salvarArquivo(String caminho){
      SerializadorCSVCarro serializadorCSV = new SerializadorCSVCarro();
      String csvData = serializadorCSV.toCSV(this.carros);
      
      FilePersistence filePersistence = new FilePersistence();
      filePersistence.saveToFile(csvData, caminho);
      System.out.println("Carro salva em " + caminho);
  }
  
  public void carregarArquivo(String caminho){
      FilePersistence filePersistence = new FilePersistence();
      String csvData = filePersistence.loadFromFile(caminho);
      
      SerializadorCSVCarro desserializadorCSV = new SerializadorCSVCarro();
      this.carros = desserializadorCSV.fromCSV(csvData);
      
      System.out.println("Carros carregadas com sucesso");
  }

    @Override
    public String toString() {
        return "Gerenciador{" + "carros=" + carros + '}';
    }
  
}