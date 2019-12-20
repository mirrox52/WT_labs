package service.impl;

import beans.book.Book;
import dao.exception.DAOException;
import dao.factory.DaoFactory;
import dao.impl.BookDAO;
import service.LibraryService;
import service.exception.ServiceException;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public void addNewBook(Book book) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            BookDAO bookDAO = daoObjectFactory.getBookDAO();
            bookDAO.save(book);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void addEditedBook(Book book, String[] params) throws Exception, ServiceException {
        if (params.length != 3)
            throw new ServiceException("For editing books, you should pass 3 arguments.");
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            BookDAO bookDAO = daoObjectFactory.getBookDAO();
            bookDAO.update(book, params);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void removeBook(Book book) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            BookDAO bookDAO = daoObjectFactory.getBookDAO();
            bookDAO.delete(book);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }
}
