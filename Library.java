import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    Scanner scanner = new Scanner(System.in);

    private List<Book> books;

    static String[] actualBooks = {
            "Hayden's Hell of a ride",
            "Snowy Snow-side",
            "Water bottles: my experience",
            "Why use iMac?"
    };

    public static ArrayList<String> availableBooks = new ArrayList<>();

    public void addBook() {
        System.out.println("What is the name of the book you would like to add?");
        String book = scanner.nextLine();

        availableBooks.add(book);
    }

    //love that I used the for each loop here (super efficient)
    public void listAllBooksWithDetails() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books currently available!");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : books) {
                System.out.println(book.getBookDetails()); // Use book object to get details
            }
        }
    }

    public void returnBook() {

        System.out.println("What book do you want to return?");
        String bookName = scanner.nextLine();

        //checking if the book is an actual Book
        for (String actualBook : actualBooks) {
            if (bookName == actualBook) {
                System.out.println("Book returned!");
                availableBooks.add(bookName);
            } else {
                System.out.println("Not a book, that this library has lend you!");
                break;
            }
        }

    }

    //I now know how to use the "!" better!
    //:D see what I did there?
    public void listAvailableBooks() {

        boolean foundAvailable = false;
        for (int i = 0; i < availableBooks.size(); i++) {
            System.out.println(availableBooks.get(i));
            foundAvailable = true;
        }
        if (!foundAvailable) {
            System.out.println("No available movies at the moment.");
        }
    }

    public void searchByTitle() {
        System.out.println("What book-title do you wanna search if it's available?");
        String title = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book.getBookDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.printf("\nNo books with the title %s found!", title);
        }
    }

    public void searchByAuthor() {
        System.out.println("Who is the author that you wanna search some books of?");
        String author = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getBookDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.printf("\nNo books from %s were found!", author);
        }
    }
}
