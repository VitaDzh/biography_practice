import java.util.ArrayList;

public class Book{

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE

    public Book(String name, String genre, int totalPage){
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }


    //Define instance variables here
    //YOUR CODE HERE
    public  String name;
    public  String genre;
    public  int totalPage;


    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "\nBook{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }




    public static final String addBookInfo = "Would you like to enter book information? (Y/N)";
    public static final String bookName = "What is a book name?";
    public static final String bookGenre = "What is genre of the book?";
    public static final String numberOfPages = "How many pages does book have?";

}
