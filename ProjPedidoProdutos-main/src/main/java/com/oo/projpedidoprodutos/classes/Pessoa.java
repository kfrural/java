package com.oo.projpedidoprodutos.classes;

import java.util.Objects;

public class Pessoa {

    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa() {
        this.cpf = "";
        this.nome = "";
        this.sexo = 'f';
        this.idade = 0;
    }

    public Pessoa(String cpf, String nome, char sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    

    public void copiar(Pessoa outra) {
        this.setCpf(outra.getCpf());
        this.setNome(outra.getNome());
        this.setSexo(outra.getSexo());
        this.setIdade(outra.getIdade());
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "--------- Pessoa -----------\n";
        texto += " CPF:" + this.getCpf() + "\n";
        texto += " Nome:" + this.getNome() + "\n";
        texto += " Sexo:" + this.getSexo() + "\n";
        texto += " Idade:" + this.getIdade() + "\n";
        texto += " -------------------------------\n";

        return texto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cpf);
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
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param Cpf the cpf to set
     */
    public void setCpf(String Cpf) {
        this.cpf = Cpf;
    }

}
