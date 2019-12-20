package service.factory;

import service.LibraryService;
import service.impl.ClientServiceImpl;
import service.impl.LibraryServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ClientServiceImpl clientService = new ClientServiceImpl();
    private final LibraryServiceImpl libraryService = new LibraryServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ClientServiceImpl getClientService(){
        return clientService;
    }

    public LibraryServiceImpl getLibraryService(){
        return libraryService;
    }
}
