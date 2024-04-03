package gerenciador;

import classes.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class GerenciadorPessoa {

    private List<Pessoa> listPessoa;

    public GerenciadorPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa) {
        this.listPessoa.add(pessoa);
        System.out.println("Pessoa feita \n");
    }

    public boolean removePessoa(String cpf) {
        for (Pessoa pessoa : listPessoa) {
            if (pessoa.getCpf().equals(cpf)) {
                listPessoa.remove(pessoa);
                System.out.println("CPF cancelado\n");
                return true;
            }
        }
        System.out.println("Pessoa n encontrada\n");
        return false;
    }

    public Pessoa buscarPessoa(String cpf) {
        for (Pessoa pessoa : listPessoa) {
            if (pessoa.getCpf().equals(cpf)) 
                return pessoa;            
        }
        return null;
    }
    
    public void atualizarPessoa(String cpf, Pessoa pessoaNova){
        Pessoa pessoaExistente = buscarPessoa(cpf);
        if(pessoaExistente != null){
            int indice = listPessoa.indexOf(pessoaExistente);
            listPessoa.set(indice, pessoaNova);
            System.out.println("Pessoa atualizada\n");
        }else
            System.out.println("Pessoa do cpf : " + cpf + "nao achada\n");
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Pessoa pessoa : listPessoa) {
            saida.append(pessoa.toString()).append("\n");
        }
        return saida.toString();

    }
    
    
}
