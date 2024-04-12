package classes;

import file.FilePersistence;
import file.SerializadorCSVAnimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Gerenciador {
    private List <Animal> animais;
    
    public Gerenciador(){
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animais){
        this.animais.add(animais);
    }
      
 public Animal buscarAnimal(String cod){
     for(Animal a : this.animais){
         if(a.getCod().equals(cod))
             return a;
     }
     return null;
 }
    
 public boolean removerAnimal(String cod){
     Animal encontrou = buscarAnimal(cod);
     if(encontrou != null){
         this.animais.remove(encontrou);
         System.out.println("Animal removida...");
         return true;
     }
     System.out.println("Nao foi encontrada...");
     return false;
 }
  public void atualizarAnimal(String nomeAntigo, Animal pNova){
      Animal pExistente = buscarAnimal(nomeAntigo);
      
      if(pExistente != null){
          int indice = animais.indexOf(pExistente);
          animais.set(indice, pNova);
          System.out.println("Animal atualizada com sucesso");
      } else
          System.out.println("Animal " + nomeAntigo + " nao foi encontrada");
  }
  
  public void salvarArquivo(String caminho){
      SerializadorCSVAnimal serializadorCSV = new SerializadorCSVAnimal();
      String csvData = serializadorCSV.toCSV(this.animais);
      
      FilePersistence filePersistence = new FilePersistence();
      filePersistence.saveToFile(csvData, caminho);
      System.out.println("Animal salva em " + caminho);
  }
  
  public void carregarArquivo(String caminho){
      FilePersistence filePersistence = new FilePersistence();
      String csvData = filePersistence.loadFromFile(caminho);
      
      SerializadorCSVAnimal desserializadorCSV = new SerializadorCSVAnimal();
      this.animais = desserializadorCSV.fromCSV(csvData);
      
      System.out.println("Animals carregadas com sucesso");
  }

    @Override
    public String toString() {
        return "Gerenciador{" + "animais=" + animais + '}';
    }
  
}