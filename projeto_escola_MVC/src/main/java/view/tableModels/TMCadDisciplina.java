package view.tableModels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.entities.Disciplina;

/**
 *
 * @author kfrural
 */
public class TMCadDisciplina extends AbstractTableModel{
    private List<Disciplina> disciplinas;
    
    private final int COL_COD = 0;
    private final int COL_NOME = 1;
    private final int COL_CH  = 2;
    private final int COL_DPTO = 3;
    
    public TMCadDisciplina(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }
    
    @Override
    public int getRowCount() {
        return this.disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    
    public Disciplina getObjetoDisciplina(int row){
       return this.disciplinas.get(row);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disciplina a = this.disciplinas.get(rowIndex);
        switch (columnIndex) {
            case COL_COD:
                return a.getCod();
            case COL_NOME:
                return a.getNome();
            case COL_CH:
                return a.getCh();
            case COL_DPTO:
                return a.getDpto();
            default:
                break;
        }
        return "-";
        
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        //qual o nome da coluna
         if(columnIndex == COL_COD){
            return "Cod";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_CH){
            return "CH";
        }else if(columnIndex == COL_DPTO){
            return "Dpto";
        }

        return "";
    }

    
}
