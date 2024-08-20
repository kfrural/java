package gui.tableModels;

import classes.Professor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kfrural
 */
public class TMCadProfessor extends AbstractTableModel{
    private List<Professor> prof;
    
    private final int COL_CPF = 0;
    private final int COL_NOME = 1;
    private final int COL_MATERIA  = 2;
    private final int COL_IDADE = 3;
    
    public TMCadProfessor(List<Professor> prof){
        this.prof = prof;
    }
    
    @Override
    public int getRowCount() {
        return this.prof.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    
    public Professor getObjetoAluno(int row){
       return this.prof.get(row);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Professor a = this.prof.get(rowIndex);
        switch (columnIndex) {
            case COL_CPF:
                return a.getCpf();
            case COL_NOME:
                return a.getNome();
            case COL_MATERIA:
                return a.getMateria();
            case COL_IDADE:
                return a.getIdade();
            default:
                break;
        }
        return "-";
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        //qual o nome da coluna
         if(columnIndex == COL_CPF){
            return "CPF";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_MATERIA){
            return "Materia";
        }else if(columnIndex == COL_IDADE){
            return "Idade";
        }

        return "";
    }

    
}
