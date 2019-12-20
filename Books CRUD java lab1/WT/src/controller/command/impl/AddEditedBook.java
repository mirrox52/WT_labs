package controller.command.impl;


import beans.book.Book;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.LibraryServiceImpl;

import java.util.Objects;

public class AddEditedBook implements Command {
    @Override
    public void execute() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book = new Book();
        String[] params = new String[3];

        System.out.println("Enter title of the book: \n");
        params[0] = Reader.nextString();

        System.out.println("Enter author of the book: \n");
        params[1] = Reader.nextString();

        System.out.println("Enter page numbers: \n");
        params[2] = Reader.nextString();

        try{
            libraryService.addEditedBook(book, params);
        }
        catch (Exception e){
            //
            System.out.println("Error with editing a book.");
        }
    }
}
