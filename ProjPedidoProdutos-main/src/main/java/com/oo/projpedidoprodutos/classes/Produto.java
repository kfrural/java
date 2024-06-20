
package com.oo.projpedidoprodutos.classes;

import java.util.Objects;

/**
 *
 * @author jose
 */
public class Produto {
    
    private String cod;
    private String nome;
    private double custo;
    private double preco;
    private double estoque;

    public Produto() {
        this.cod = "";
        this.nome = "";
        this.custo = 0.0;
        this.preco = 0.0;
        this.estoque = 0.0;
    }

    public Produto(String cod, String nome, double custo, double preco, double estoque) {
        this.cod = cod;
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void copiar(Produto outro) {
        this.setCod(outro.getCod());
        this.setNome(outro.getNome());
        this.setCusto(outro.getCusto());
        this.setPreco(outro.getPreco());
        this.setEstoque(outro.getEstoque());
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "--------- Produto -----------\n";
        texto += " Id:" + this.getCod() + "\n";
        texto += " Nome:" + this.getNome() + "\n";
        texto += " Custo:" + this.getCusto() + "\n";
        texto += " Preco:" + this.getPreco() + "\n";
        texto += " Estoque:" + this.getEstoque() + "\n";
        texto += " -------------------------------\n";
        
        return texto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.cod == other.cod;
    }
    
    
    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the estoque
     */
    public double getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    
    
    
    
    
    
}
