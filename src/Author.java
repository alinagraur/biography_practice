import java.util.ArrayList;
import java.util.Arrays;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     * Create a custom constructor that will take 6 args and defines the Author object
     * Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author(String firstName, String lastName, String country, boolean isAlive, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;

    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;


    public Author() {

    }

    /*
    Override toString() method here that returns Author object information
     */

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive='" + isAlive + '\'' +
                ", age=" + age +
                '}';
    }
}