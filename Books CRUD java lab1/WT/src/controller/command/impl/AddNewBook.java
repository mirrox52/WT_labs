package controller.command.impl;


import beans.book.Book;
import controller.command.Command;
import reader.Reader;
import service.exception.ServiceException;
import service.impl.LibraryServiceImpl;

import java.util.Objects;

public class AddNewBook implements Command {

    @Override
    public void execute() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        System.out.println("Enter title of the book: \n");
        String title = Reader.nextString();

        System.out.println("Enter author of the book: \n");
        String author = Reader.nextString();

        System.out.println("Enter page numbers: \n");
        int pageNumbers = Integer.parseInt(Objects.requireNonNull(Reader.nextString(), "Page Number cannot be null."));

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        try {
            book.setPageNumbers(pageNumbers);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            libraryService.addNewBook(book);
        }
        catch (ServiceException e){
            //
            System.out.println("Error with adding new book.");
        }
    }
}
