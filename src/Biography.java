import java.util.ArrayList;
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

        //YOUR CODE HERE
        Scanner inputReader = new Scanner(System.in);

        ArrayList<Book> listOfBooks = new ArrayList<>();
        Author author = new Author("", "", "", false, 0, listOfBooks);

        String bookInfo;

            System.out.println(Author.askFirstName);
            String firstName = inputReader.nextLine();
            author.firstName = firstName;

            System.out.println(Author.askLastName);
            String lastName = inputReader.nextLine();
            author.lastName = lastName;

            System.out.println(Author.askWhereIsFrom);
            String authorsCountry = inputReader.nextLine();
            author.country = authorsCountry;

            System.out.println(Author.askIsAlive);
            String isAlive = inputReader.nextLine();

            if (isAlive.toUpperCase().startsWith("Y")) {
                author.isAlive = true;
                System.out.println(Author.askHowOld);
                int age = inputReader.nextInt();
                author.age = age;
            }
            // int attempt = 0;
            do{
                System.out.println(Book.addBookInfo);
                inputReader.nextLine();
                bookInfo = inputReader.nextLine();

                // attempt++;
                if(bookInfo.toUpperCase().startsWith("N")) {
                    break;
                }else {
                    System.out.println(Book.bookName);
                    String name = inputReader.nextLine();

                    System.out.println(Book.bookGenre);
                    String genre = inputReader.nextLine();

                    System.out.println(Book.numberOfPages);
                    int totalPages = inputReader.nextInt();

                    Book book = new Book(name, genre, totalPages);
                    listOfBooks.add(book);
                }
            } while (bookInfo.toUpperCase().startsWith("Y"));

        System.out.println(author);












    }
}
