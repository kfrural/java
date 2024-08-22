package interfaces;

import classes.Pessoa;
import java.util.List;

/**
 *
 * @author kfrural
 */
public interface IRepositorioDados<T> {
    void salvar(T obj);
    void excluir(int idObj);
    List<T> listar();
}
