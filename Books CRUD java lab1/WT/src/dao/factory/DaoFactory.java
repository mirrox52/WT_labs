package dao.factory;

import dao.impl.BookDAO;
import dao.impl.ReaderDAO;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();
    private final BookDAO bookDAO = new BookDAO();
    private final ReaderDAO readerDAO = new ReaderDAO();

    public static DaoFactory getInstance(){
        return instance;
    }

    public BookDAO getBookDAO(){
        return bookDAO;
    }

    public ReaderDAO getReaderDAO(){
        return readerDAO;
    }
}
