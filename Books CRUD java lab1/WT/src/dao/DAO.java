package dao;

import dao.exception.DAOException;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> get(int id) throws DAOException;

    List<T> getAll() throws DAOException;

    void save(T entity) throws DAOException;

    void update(T entity, String[] params) throws DAOException, Exception;

    void delete(T entity) throws DAOException;
}
