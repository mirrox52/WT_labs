package dao.impl;


import beans.reader.Reader;
import dao.DAO;
import dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ReaderDAO implements DAO<Reader> {

    public List<Reader> readers = new ArrayList<>();

    public ReaderDAO(){
    }

    public void signIn(String login, String password) throws DAOException{
        // stub
    }

    public void registration(Reader reader) throws DAOException {
        // stub
    }


    @Override
    public Optional<Reader> get(int id) throws DAOException {
        return Optional.ofNullable(readers.get((int) id));
    }

    @Override
    public List<Reader> getAll() throws DAOException {
        return readers;
    }

    @Override
    public void save(Reader entity) throws DAOException {
        readers.add(entity);
    }

    @Override
    public void update(Reader entity, String[] params) throws DAOException, Exception {
        if (params.length == 4){
            entity.setName(Objects.requireNonNull(params[0], "Name cannot be null."));
            entity.setSurname(Objects.requireNonNull(params[1], "Surname cannot be null."));
            entity.setLogin(Objects.requireNonNull(params[2], "Login cannot be null."));
            entity.setPassword(Objects.requireNonNull(params[3], "Password cannot be null."));
        }
    }

    @Override
    public void delete(Reader entity) throws DAOException {
        readers.remove(entity);
    }
}
