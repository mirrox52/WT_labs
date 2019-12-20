package service.impl;

import beans.reader.Reader;
import dao.exception.DAOException;
import dao.factory.DaoFactory;
import dao.impl.ReaderDAO;
import service.ClientService;
import service.exception.ServiceException;

public class ClientServiceImpl implements ClientService {

    @Override
    public void signIn(String login, String password) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ReaderDAO readerDAO = daoObjectFactory.getReaderDAO();
            readerDAO.signIn(login, password);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void registration(Reader reader) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ReaderDAO readerDAO = daoObjectFactory.getReaderDAO();
            readerDAO.registration(reader);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void logout(Reader reader) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ReaderDAO readerDAO = daoObjectFactory.getReaderDAO();
            readerDAO.delete(reader);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void addReader(Reader reader) throws ServiceException {
        try{
            DaoFactory daoObjectFactory = DaoFactory.getInstance();
            ReaderDAO readerDAO = daoObjectFactory.getReaderDAO();
            readerDAO.save(reader);
        }
        catch (DAOException e){
            throw new ServiceException(e);
        }
    }

}
