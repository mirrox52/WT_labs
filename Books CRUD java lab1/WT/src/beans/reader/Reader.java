package beans.reader;

import beans.Entity;

import java.util.Objects;

/**
 * Class, which describe basic characteristics of the reader.
 * There are:
 * <ul>
 *     <li>Name</li>
 *     <li>Surname</li>
 * </ul>
 * @author GY
 */
public class Reader extends Entity implements java.io.Serializable, Comparable<Reader>{
    private String name;
    private String surname;
    private String login;
    private String password;

    /**
     * Constructor, which sets all the fields in the
     * default values.
     *
     * @see Reader#Reader(String, String, String, String)
     */
    public Reader(){
        this.name = "";
        this.surname = "";
        this.login = "";
        this.password = "";
    }

    /**
     * Constructor, which sets all the fields in the
     * values given by the user.
     *
     * @param name  Name of the reader
     * @param surname   Surname of the reader
     *
     * @see Reader#Reader()
     */
    public Reader(String name, String surname, String login, String password){
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int compareTo(Reader another){
        return getSurname().compareTo(another.getSurname());
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

        Reader that = (Reader) o;

        if(!name.equals(that.name))
            return false;

        return surname.equals(that.surname);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname, getId(), login, password);
    }

    @Override
    public String toString(){
        return "reader{" +
                "name='" + name +'\'' +
                "surname='" + surname +'\'' +
                " login=" + login + '\'' +
                "}";
    }
}
