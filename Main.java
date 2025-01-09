import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Library library = new Library();
        Book myBook = new Book("Hayden's Hell", "Paul", true);
        //System.out.println(myBook.callAttributes());
        library.returnBook();
    }

}
