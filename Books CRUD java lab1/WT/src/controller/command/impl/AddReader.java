package controller.command.impl;


import beans.reader.Reader;
import controller.command.Command;
import service.exception.ServiceException;
import service.impl.ClientServiceImpl;


public class AddReader implements Command {
    @Override
    public void execute() {
        ClientServiceImpl clientService = new ClientServiceImpl();
        Reader _reader = new Reader();

        // name
        // surname
        // login
        // password
        System.out.println("Enter name of the reader: \n");
        String name = reader.Reader.nextString();

        System.out.println("Enter surname of the reader: \n");
        String surname = reader.Reader.nextString();

        System.out.println("Enter login of the reader: \n");
        String login = reader.Reader.nextString();

        System.out.println("Enter password of the reader: \n");
        String password = reader.Reader.nextString();

        _reader.setName(name);
        _reader.setSurname(surname);
        _reader.setLogin(login);
        _reader.setPassword(password);

        try{
            clientService.addReader(_reader);
        }
        catch (ServiceException e){
            //
            System.out.println("Error with adding new reader.");
        }
    }
}

