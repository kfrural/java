package model.entities;

import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Disciplina {
    
    private String cod;
    private String nome;
    private int ch;
    private String dpto;

    public Disciplina() {
        this.cod = "";
        this.nome = "";
        this.ch = 0;
        this.dpto = "";
    }

    public Disciplina(String cod, String nome, int ch, String dpto) {
        this.cod = cod;
        this.nome = nome;
        this.ch = ch;
        this.dpto = dpto;
    }
    
    public void copiar(Disciplina outro) {
        this.setCod(outro.getCod());
        this.setNome(outro.getNome());
        this.setCh(outro.getCh());
        this.setDpto(outro.getDpto());
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "--------- Disciplina -----------\n";
        texto += " Id:" + this.getCod() + "\n";
        texto += " Nome:" + this.getNome() + "\n";
        texto += " CH:" + this.getCh() + "\n";
        texto += " Dpto:" + this.getDpto() + "\n";
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
        final Disciplina other = (Disciplina) obj;
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

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    
}
