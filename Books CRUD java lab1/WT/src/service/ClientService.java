package service;

import beans.reader.Reader;
import service.exception.ServiceException;

public interface ClientService {
    void signIn(String login, String password) throws ServiceException;
    void registration(Reader reader) throws ServiceException;
    void logout(Reader reader) throws ServiceException;
    void addReader(Reader reader) throws ServiceException;
}
