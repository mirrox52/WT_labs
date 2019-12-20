package controller.command.impl;

import beans.reader.Reader;
import controller.command.Command;
import service.exception.ServiceException;
import service.impl.ClientServiceImpl;

public class SignInReader implements Command {
    @Override
    public void execute() {
        ClientServiceImpl clientService = new ClientServiceImpl();

        System.out.println("Enter login of the reader: \n");
        String login = reader.Reader.nextString();

        System.out.println("Enter password of the reader: \n");
        String password = reader.Reader.nextString();


        try{
            clientService.signIn(login, password);
        }
        catch (ServiceException e){
            //
            System.out.println("Error with log in.");
        }
    }
}
