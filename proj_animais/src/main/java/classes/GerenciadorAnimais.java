package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorAnimais {
    private List<Animais> listAnimais;

    public GerenciadorAnimais() {
        this.listAnimais = new ArrayList<>();
    }
    
    public void addAnimais(Animais animais){
        this.listAnimais.add(animais);
        System.out.println("Animal adicionado");
    }
    
    public boolean removeAnimais(String nome){
        for(Animais animais : this.listAnimais){
            if(animais.getNome().equals(nome)){
                listAnimais.remove(animais);
                System.out.println("Animais removido");
                return true;
            }
        }
        System.out.println("Num achei esse animais nao");
        return false;
    }
    
    public Animais buscarAnimais(String nome){
        for(Animais animais : this.listAnimais){
            if(animais.getNome().equals(nome))
                return animais;
        }
        return null;
    }
    
    public void atualizaAnimais(String nome, Animais animaisNova){
        Animais animaisExistente = buscarAnimais(nome);
        if(animaisExistente != null){
            int indice = listAnimais.indexOf(animaisExistente);
            listAnimais.set(indice, animaisNova);
            System.out.println("Animais atualizado");
        } else
            System.out.println("O animal  " + nome + "nao foi achado");
    }

@Override
public String toString(){
    StringBuilder saida = new StringBuilder();
    for(Animais animais : this.listAnimais){
        saida.append(animais.toString()).append("\n");
    }
    return saida.toString();
}
    
}
