package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorLivro {
    private List<Livro> listLivro;

    public GerenciadorLivro() {
        this.listLivro = new ArrayList<>();
    }
    
    public void addLivro(Livro livro){
        this.listLivro.add(livro);
        System.out.println("Livro adicionada");
    }
    
    public boolean removeLivro(String titulo){
        for(Livro livro : this.listLivro){
            if(livro.getTitulo().equals(titulo)){
                listLivro.remove(livro);
                System.out.println("Livro removido");
                return true;
            }
        }
        System.out.println("Num achei esse livro nao");
        return false;
    }
    
    public Livro buscarLivro(String titulo){
        for(Livro livro : this.listLivro){
            if(livro.getTitulo().equals(titulo))
                return livro;
        }
        return null;
    }
    
    public void atualizaLivro(String titulo, Livro livroNova){
        Livro livroExistente = buscarLivro(titulo);
        if(livroExistente != null){
            int indice = listLivro.indexOf(livroExistente);
            listLivro.set(indice, livroNova);
            System.out.println("Livro atualizado");
        } else
            System.out.println("O livro  " + titulo + "nao foi achado");
    }

@Override
public String toString(){
    StringBuilder saida = new StringBuilder();
    for(Livro livro : this.listLivro){
        saida.append(livro.toString()).append("\n");
    }
    return saida.toString();
}
    
}
