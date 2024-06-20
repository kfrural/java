package com.oo.projpedidoprodutos.classes;

import com.oo.projpedidoprodutos.gerenciador.GerenciadorProduto;
import java.util.List;

/**
 *
 * @author jose
 */
public class Pedido {
    private int id;
    private Pessoa cliente;
    private GerenciadorProduto gerenciadorProdutos;

    public Pedido() {
        this.id = -1;
        this.cliente = new Pessoa();
        this.gerenciadorProdutos = new GerenciadorProduto();            
    }

    @Override
    public String toString() {
        String texto = "------------- Pedido ---------------\n";
        //Produtos
        String textoListaProdutos = this.gerenciadorProdutos.toString();
        
        texto += this.getCliente().toString() + "\n";
        texto += textoListaProdutos + "\n";
        return texto;
    }
    
    public void addCliente(Pessoa pessoa){
        this.cliente = new Pessoa();
        this.cliente.copiar(pessoa);
    }
    
    /**
     * Uma camada a mais para simplificar a chamada ao Pedido
     * @param produto 
     */
    public void addProduto(Produto produto){
        this.gerenciadorProdutos.adicionarProduto(produto);
    }
    
    
     /**
     * Uma camada a mais para simplificar a chamada ao Pedido
     * @param produto 
     */
    public void removeProduto(String codProduto){
        this.gerenciadorProdutos.removerProduto(codProduto);    
    }
    
    public Produto pesquisarProduto(String codProduto){
        return this.gerenciadorProdutos.buscarProduto(codProduto);    
    }
    
    public boolean possuiProdutos(){
        
        if(this.gerenciadorProdutos.getTotalProdutos() > 0)
            return true;
        else
            return false;
    }
       

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public Pessoa getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    
}
