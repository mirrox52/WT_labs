package service;

import beans.book.Book;
import service.exception.ServiceException;

public interface LibraryService {
    void addNewBook(Book book) throws ServiceException;
    void addEditedBook(Book book, String[] params) throws Exception;
    void removeBook(Book book) throws ServiceException;
}
