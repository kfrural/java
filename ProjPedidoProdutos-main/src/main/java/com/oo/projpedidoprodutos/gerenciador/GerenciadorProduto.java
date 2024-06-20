package com.oo.projpedidoprodutos.gerenciador;


import com.oo.projpedidoprodutos.classes.Produto;
import com.oo.projpedidoprodutos.file.FilePersistence;
import com.oo.projpedidoprodutos.file.SerializadorCSVProduto;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {

    private List<Produto> produtos;

    public GerenciadorProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public boolean removerProduto(String cod) {
        for (Produto produto : produtos) {
            if (produto.getCod().equals(cod)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return true;
            }
        }
        System.out.println("Produto não encontrado!");
        return false;
    }

    public Produto buscarProduto(String cod) {
        for (Produto produto : produtos) {
            if (produto.getCod().equals(cod)) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(String codAntigo, Produto produtoNovo) {
        Produto produtoExistente = buscarProduto(codAntigo);
        
        if (produtoExistente != null) {
            int indice = produtos.indexOf(produtoExistente);
            produtos.set(indice, produtoNovo);
            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Produto com o nome " + codAntigo + " não encontrado.");
        }
    }
    
    public int getTotalProdutos(){
        return this.produtos.size();
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Produto produto : produtos) {
            saida.append(produto.toString()).append("\n");
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        SerializadorCSVProduto serializador = new SerializadorCSVProduto();
        String csvData = serializador.toCSV(produtos);

        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);

        SerializadorCSVProduto serializador = new SerializadorCSVProduto();
        this.produtos = serializador.fromCSV(csvData);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }

    
   
}
