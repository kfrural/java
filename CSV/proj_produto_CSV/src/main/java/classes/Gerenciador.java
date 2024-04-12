package classes;

import file.FilePersistence;
import file.SerializadorCSVProduto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Gerenciador {
    private List <Produto> produtos;
    
    public Gerenciador(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produtos){
        this.produtos.add(produtos);
    }
      
 public Produto buscarProduto(String nome){
     for(Produto m : this.produtos){
         if(m.getNome().equals(nome))
             return m;
     }
     return null;
 }
    
 public boolean removerProduto(String nome){
     Produto encontrou = buscarProduto(nome);
     if(encontrou != null){
         this.produtos.remove(encontrou);
         System.out.println("Produto removida...");
         return true;
     }
     System.out.println("Nao foi encontrada...");
     return false;
 }
  public void atualizarProduto(String nomeAntigo, Produto pNova){
      Produto pExistente = buscarProduto(nomeAntigo);
      
      if(pExistente != null){
          int indice = produtos.indexOf(pExistente);
          produtos.set(indice, pNova);
          System.out.println("Produto atualizada com sucesso");
      } else
          System.out.println("Produto " + nomeAntigo + " nao foi encontrada");
  }
  
  public void salvarArquivo(String caminho){
      SerializadorCSVProduto serializadorCSV = new SerializadorCSVProduto();
      String csvData = serializadorCSV.toCSV(this.produtos);
      
      FilePersistence filePersistence = new FilePersistence();
      filePersistence.saveToFile(csvData, caminho);
      System.out.println("Produto salva em " + caminho);
  }
  
  public void carregarArquivo(String caminho){
      FilePersistence filePersistence = new FilePersistence();
      String csvData = filePersistence.loadFromFile(caminho);
      
      SerializadorCSVProduto desserializadorCSV = new SerializadorCSVProduto();
      this.produtos = desserializadorCSV.fromCSV(csvData);
      
      System.out.println("Produtos carregadas com sucesso");
  }

    @Override
    public String toString() {
        return "Gerenciador{" + "produtos=" + produtos + '}';
    }
  
}