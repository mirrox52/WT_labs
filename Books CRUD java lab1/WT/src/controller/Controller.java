package controller;

import beans.book.Book;
import controller.command.Command;
import controller.command.impl.DisplayHelp;
import dao.factory.DaoFactory;
import dao.impl.BookDAO;
import dao.impl.ReaderDAO;
import beans.reader.Reader;
import writer.exception.XmlOutInException;
import writer.impl.BookXmlWriter;
import writer.impl.ReaderXmlWriter;

public class Controller {
    public void writeBookToFile(){
        BookXmlWriter xmlWriter = new BookXmlWriter();
        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        BookDAO bookDAO = daoObjectFactory.getBookDAO();
        try {
        	xmlWriter.Write(bookDAO.books, "books.xml");
        }catch (XmlOutInException e){
            System.out.println("Cannot write to the file.");
        }
    }

    public void writeReaderToFile(){
        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        ReaderDAO readerDAO = daoObjectFactory.getReaderDAO();
        ReaderXmlWriter xmlWriter = new ReaderXmlWriter();
        try {
        	xmlWriter.Write(readerDAO.readers, "readers.xml");
        }catch (XmlOutInException e){
            System.out.println("Cannot write to the file.");
        }
    }

    public void execute(){
        Command displayHelp = new DisplayHelp();
        displayHelp.execute();

        int result = reader.Reader.nextInt();

        try {
            while (result != 0) {
                CommandName ct = ConsoleCommand.getCommandTypeByNumber(result);
                ct.getCommand().execute();
                result = reader.Reader.nextInt();
            }
            ConsoleCommand
                    .getCommandTypeByNumber(result)
                    .getCommand()
                    .execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

