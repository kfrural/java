package gerenciador;

import classes.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorProfessor {

    private List<Professor> listProfessor;

    public GerenciadorProfessor() {
        this.listProfessor = new ArrayList<>();
    }

    public void addProfessor(Professor pessoa) {
        this.listProfessor.add(pessoa);
        System.out.println("Professor feita \n");
    }

    public boolean removeProfessor(String cpf) {
        for (Professor pessoa : listProfessor) {
            if (pessoa.getCpf().equals(cpf)) {
                listProfessor.remove(pessoa);
                System.out.println("CPF cancelado\n");
                return true;
            }
        }
        System.out.println("Professor n encontrada\n");
        return false;
    }

    public Professor buscarProfessor(String cpf) {
        for (Professor pessoa : listProfessor) {
            if (pessoa.getCpf().equals(cpf)) 
                return pessoa;            
        }
        return null;
    }
    
    public void atualizarProfessor(String cpf, Professor pessoaNova){
        Professor pessoaExistente = buscarProfessor(cpf);
        if(pessoaExistente != null){
            int indice = listProfessor.indexOf(pessoaExistente);
            listProfessor.set(indice, pessoaNova);
            System.out.println("Professor atualizada\n");
        }else
            System.out.println("Professor do cpf : " + cpf + "nao achada\n");
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Professor pessoa : listProfessor) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();

    }
    
    
}
