package model.entities;

import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pessoa {
    protected String cpf;
    protected String nome;
    protected int idade;

    public Pessoa() {
        this.cpf = "";
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(Pessoa outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
        this.idade = outro.getIdade();
    }
    
    public void copy(Pessoa outro){
        this.cpf = outro.getCpf();
        this.nome = outro.getNome();
        this.idade = outro.getIdade();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("CPF: ");
        this.setCpf(ler.next());
        System.out.println("Nome: ");
        this.setNome(ler.next());
        System.out.println("Idade: ");
        this.setIdade(ler.nextInt());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + '}';
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
}