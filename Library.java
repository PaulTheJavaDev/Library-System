import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static String[] actualBooks = {
            "Hayden's Hell of a ride",
            "Snowy Snow-side",
            "Water bottles: my experience",
            "Why use iMac?"
    };

    static Scanner scanner = Main.scanner;

    ArrayList<String> availableBooks = new ArrayList<String>();

    public void returnBook() {
        System.out.println("What book do you want to return?");
        String bookName = scanner.nextLine();

        //checking if the book is an actual Book
        for (int i = 0; i < actualBooks.length; i++) {
            if (bookName == actualBooks[i]) {
                System.out.println("Book returned!");
                availableBooks.add(bookName);
            } else {
                System.out.println("Not a book, that this library lend you!");
            }
        }

    }

    public void listAllBooks() {

        //availableBooks.add(actualBooks[1]); // [test]: adding test object to the ArrayList
        if (availableBooks.size() == 0) {
            System.out.println("There are no books available at the moment!");
        } else {
            System.out.println(availableBooks);
        }

    }

    public void addBook() {

        System.out.println("What is the name of the book you would like to add?");
        String name = scanner.nextLine();

        availableBooks.add(name);

    }

    //I don't know how I will write this method yet. Maybe create a new Book Object?
    public void readBookAttributes() {



    }

}
