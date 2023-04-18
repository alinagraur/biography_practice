import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */
        Author author = new Author();
        Book books = new Book();
        ArrayList<Book> allBooks = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite author’s first name?");
        author.firstName = input.nextLine();

        System.out.println("What is your favorite author’s last name?");
        author.lastName = input.nextLine();

        System.out.println("Where is your favorite author from?");
        author.country = input.nextLine();

        System.out.println("Is your favorite actor alive?");
        author.isAlive = input.nextLine().equalsIgnoreCase("y");

        if (author.isAlive) {
            System.out.println("How old is your favorite author?");
            author.age = input.nextInt();
            input.nextLine();

        }
            String enterBook;

        do {
            System.out.println("Would you like enter book information?");
             enterBook = input.nextLine();

            if (enterBook.toLowerCase().startsWith("y")) {

                System.out.println("What is the book name?");
                books.name = input.nextLine();

                System.out.println("What is genre of the book?");
                books.genre = input.nextLine();

                System.out.println("How many pages does book have?");
                books.page = input.nextInt();
                input.nextLine();


                allBooks.add(books);

            }
        }
            while (enterBook.toLowerCase().startsWith("y")) ;

            if (enterBook.toLowerCase().startsWith("n")) {


                System.out.println("Author's information = " + author);

                System.out.println("Author's books are listed as below: ");
                for (Book book : allBooks) {
                    System.out.println(book);

                }
            }


        }
    }

