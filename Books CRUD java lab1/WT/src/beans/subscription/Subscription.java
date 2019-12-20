package beans.subscription;

import beans.Entity;
import beans.reader.Reader;

import java.util.Objects;

/**
 * Class, which describe basic characteristics of the
 * subscription. subscription includes such things as:
 * <ul>
 *     <li>Identification number of the subscription</li>
 *     <li>reader name</li>
 *     <li>reader surname</li>
 *     <li>Amount of the books, which are taken by the reader</li>
 * </ul>
 * @author GY
 */
public class Subscription extends Entity implements java.io.Serializable{
    /** Number of the books, which are taken by that reader */
    private int booksAmount;
    private String readerName;
    private String readerSurname;

    /**
     * Constructor, which sets all the fields in the default values.
     *
     * @see Subscription#Subscription(String, String, int)
     */
    public Subscription(){
        this.booksAmount = 0;
        this.readerName = "";
        this.readerSurname = "";
    }

    /**
     * Constructor, which sets all the fields in the values, given by the user.
     *
     * @param readerName    reader name.
     * @param readerSurname reader surname.
     * @param booksAmount   Amount of the books, which are taken by that user.
     *
     * @see Subscription#Subscription()
     */
    public Subscription(String readerName, String readerSurname, int booksAmount){
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.booksAmount = booksAmount;
    }

    /**
     * Constructor, which sets id and amount of the books in the values
     * given by the user and copy from reader his name and surname.
     *
     * @param reader    reader, who is connected with that subscription.
     * @param booksAmount   Amount of the books, taken by that reader.
     *
     * @see Subscription#Subscription()
     * @see Subscription#Subscription(String, String, int)
     */
    public Subscription(Reader reader, int booksAmount){
        this.readerSurname = reader.getSurname();
        this.readerName = reader.getName();
        this.booksAmount = booksAmount;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderSurname() {
        return readerSurname;
    }

    public void setReaderSurname(String readerSurname) {
        this.readerSurname = readerSurname;
    }

    public void setBooksAmount(int booksAmount) throws Exception{
        int MIN_BOOKS_AMOUNT = 0;
        if (booksAmount >= MIN_BOOKS_AMOUNT)
            this.booksAmount = booksAmount;
        else
            throw new Exception("Amount of the beans.book could't be negative number.");
    }

    public int getBooksAmount() {
        return booksAmount;
    }


    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null
                || getClass()
                != o.getClass()) {
            return false;
        }

        Subscription that = (Subscription) o;

        if(!readerName.equals(that.readerName))
            return false;

        if (booksAmount != that.booksAmount) {
            return false;
        }

        return readerSurname.equals(that.readerSurname);
    }

    @Override
    public int hashCode(){
        return Objects.hash(readerName, readerSurname, booksAmount);
    }

    @Override
    public String toString(){
        return "subscription{" +
                "readerName='" + readerName +'\'' +
                "readerSurname='" + readerSurname +'\'' +
                ", booksAmount=" + booksAmount +
                "}";
    }
}
