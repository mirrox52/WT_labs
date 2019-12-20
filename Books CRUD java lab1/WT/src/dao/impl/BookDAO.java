package dao.impl;


import beans.book.Book;
import dao.DAO;
import dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookDAO implements DAO<Book> {
    public List<Book> books = new ArrayList<>();

    public BookDAO(){
        //books.add(new Book("Boris Godunov", "Onegin Eugene", 194));
        //books.add(new Book("It", "Stephen King", 500));
    }

    @Override
    public Optional<Book> get(int id) throws DAOException {
        return Optional.ofNullable(books.get((int) id));
    }

    @Override
    public List<Book> getAll() throws DAOException {
        return books;
    }

    @Override
    public void save(Book entity) throws DAOException {
        books.add(entity);
    }

    @Override
    public void update(Book entity, String[] params) throws DAOException, Exception {
        if (params.length == 3){
            entity.setTitle(Objects.requireNonNull(params[0], "Title cannot be null."));
            entity.setAuthor(Objects.requireNonNull(params[1], "Author cannot be null."));
            entity.setPageNumbers(Integer.parseInt(params[2]));
        }
    }

    @Override
    public void delete(Book entity) throws DAOException {
        books.remove(entity);
    }
}
