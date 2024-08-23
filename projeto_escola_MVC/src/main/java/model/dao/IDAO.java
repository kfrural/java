package model.dao;

import java.util.List;

/**
 *
 * @author kfrural
 */
public interface IDAO<T> {
    void salvar(T obj);
    void excluir(int idObj);
    List<T> listar();
}
