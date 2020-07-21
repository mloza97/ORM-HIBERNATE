package dao;

import java.io.Serializable;
import java.util.List;
import utils.SiscomException;

/**
 *
 * @author MANUEL LOZA
 */
public interface DAO<T, String extends Serializable> {

    T create() throws SiscomException;

    void saveOrUpdate(T entity) throws SiscomException;

    T get(String id) throws SiscomException;

    void delete(String id) throws SiscomException;

    List<T> findAll() throws SiscomException;

}