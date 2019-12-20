package beans.book;

import beans.Entity;

import java.util.Objects;

/**
 * Class that describes basic characteristics of the books.
 * There are:
 * <ul>
 *     <li>Title</li>
 *     <li>Author</li>
 *     <li>Amount of the pages</li>
 * </ul>
 * @author GY
 */
public class Book extends Entity implements java.io.Serializable, Comparable<Book>{
    private String title;
    private String author;
    private int pageNumbers;

    /**
     * Constructor, which sets all the fields in
     * the default values. Title will be equal empty string,
     * Author - empty string, page numbers - 1.
     *
     * @see Book#Book(String, String, int)
     */
    public Book(){
        this.title = "";
        this.author = "";
        this.pageNumbers = 0;
    }

    /**
     * Constructor,which sets all the fields in the values
     * given by the user.
     *
     * @param title Title of the beans.book
     * @param author    Author of the beans.book
     * @param pageNumbers   Amount of the pages
     *
     * @see Book#Book()
     */
    public Book(String title, String author, int pageNumbers){
        this.title = title;
        this.author = author;
        this.pageNumbers = pageNumbers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    /**
     * Sets amount of the pages in the beans.book. It can throw
     * an exception, when you try to set a number of pages lower than 0.
     * {@link Book#pageNumbers}
     *
     * @param pageNumbers   Amount of the pages
     * @throws Exception    Is thrown when number of the pages is lower than 0.
     */
    public void setPageNumbers(int pageNumbers) throws Exception{
        int MIN_PAGE_NUMBER = 0;
        if (pageNumbers >= MIN_PAGE_NUMBER)
            this.pageNumbers = pageNumbers;
        else
            throw new Exception("Number of pages should be greater than 0.");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int compareTo(Book another){
        return getTitle().compareTo(another.getTitle());
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

        Book that = (Book) o;

        if (pageNumbers != that.pageNumbers) {
            return false;
        }

        if(!author.equals(that.author))
            return false;

        return title.equals(that.title);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author, pageNumbers);
    }

    @Override
    public String toString(){
        return "beans.book{" +
                "title='" + title +'\'' +
                "author='" + author +'\'' +
                ", pageNumbers=" + pageNumbers +
                "}";
    }
}