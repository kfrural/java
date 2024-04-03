/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorCasa {
    private List<Casa> listCasa;

    public GerenciadorCasa() {
        this.listCasa = new ArrayList<>();
    }
    
    public void addCasa(Casa casa){
        this.listCasa.add(casa);
        System.out.println("Casa adicionada");
    }
    
    public boolean removeCasa(String endereco){
        for(Casa casa : this.listCasa){
            if(casa.getEndereco().equals(endereco)){
                listCasa.remove(casa);
                System.out.println("Casa removida");
                return true;
            }
        }
        System.out.println("Num achei essa casa nao");
        return false;
    }
    
    public Casa buscarCasa(String endereco){
        for(Casa casa : this.listCasa){
            if(casa.getEndereco().equals(endereco))
                return casa;
        }
        return null;
    }
    
    public void atualizaCasa(String endereco, Casa casaNova){
        Casa casaExistente = buscarCasa(endereco);
        if(casaExistente != null){
            int indice = listCasa.indexOf(casaExistente);
            listCasa.set(indice, casaNova);
            System.out.println("Casinha atualizada");
        } else
            System.out.println("A casa localizada em " + endereco + "nao foi achada");
    }

@Override
public String toString(){
    StringBuilder saida = new StringBuilder();
    for(Casa casa : this.listCasa){
        saida.append(casa.toString()).append("\n");
    }
    return saida.toString();
}
    
}
