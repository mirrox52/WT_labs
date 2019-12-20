package writer.impl;

import beans.book.Book;
import writer.exception.XmlOutInException;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

public class BookXmlWriter {
    public void Write(Collection<Book> books, String fileName) throws XmlOutInException {
        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(fileName));
            xmlEncoder.writeObject(books);
            xmlEncoder.close();
        } catch (IOException e) {
            throw new XmlOutInException("can't write to file = [" + fileName + "]", e);
        }
    }
}
