package gui.tableModels;

import classes.Aluno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kfrural
 */
public class TMCadAluno extends AbstractTableModel{
    private List<Aluno> alunos;
    
    private final int COL_CPF = 0;
    private final int COL_NOME = 1;
    private final int COL_CURSO  = 2;
    private final int COL_IDADE = 3;
    
    public TMCadAluno(List<Aluno> alunos){
        this.alunos = alunos;
    }
    
    @Override
    public int getRowCount() {
        return this.alunos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    
    public Aluno getObjetoAluno(int row){
       return this.alunos.get(row);
    }


@Override
public Object getValueAt(int rowIndex, int columnIndex) {
    if (rowIndex < 0 || rowIndex >= alunos.size() || columnIndex < 0 || columnIndex >= getColumnCount()) {
        return "-";
    }
    Aluno a = this.alunos.get(rowIndex);
    switch (columnIndex) {
        case COL_CPF:
            return a.getCpf();
        case COL_NOME:
            return a.getNome();
        case COL_CURSO:
            return a.getCurso();
        case COL_IDADE:
            return a.getIdade();
        default:
            return "-";
    }
}
    
    @Override
    public String getColumnName(int columnIndex) {
        //qual o nome da coluna
         if(columnIndex == COL_CPF){
            return "CPF";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_CURSO){
            return "Curso";
        }else if(columnIndex == COL_IDADE){
            return "Idade";
        }

        return "";
    }

    
}
