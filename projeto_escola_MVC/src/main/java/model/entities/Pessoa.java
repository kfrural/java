package model.entities;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {
    protected String cpf;
    protected String nome;
    protected char sexo;
    protected int idade;

    public Pessoa() {
        this.cpf = "";
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
    }

    public Pessoa(String cpf, String nome, char sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public Pessoa(String nome, String cpf, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = ' '; 
        this.idade = idade;
    }
    
    public Pessoa(Pessoa outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
    }
    
    public void copy(Pessoa outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("CPF: ");
        this.setCpf(ler.next());
        System.out.println("Nome: ");
        this.setNome(ler.next());
        System.out.println("Sexo: ");
        this.setSexo(ler.next().charAt(0));
        System.out.println("Idade: ");
        this.setIdade(ler.nextInt());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    
    
    
}