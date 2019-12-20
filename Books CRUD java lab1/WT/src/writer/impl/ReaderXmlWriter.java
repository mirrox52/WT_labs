package writer.impl;

import beans.reader.Reader;
import writer.exception.XmlOutInException;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

public class ReaderXmlWriter {
    public void Write(Collection<Reader> readers, String fileName) throws XmlOutInException{
        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(fileName));
            xmlEncoder.writeObject(readers);
            xmlEncoder.close();
        } catch (IOException e) {
            throw new XmlOutInException("can't write to file = [" + fileName + "]", e);
        }
    }
}
