import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library.availableBooks.add("Hayden's Hell of a ride");
        Library.availableBooks.add("Snowy Snow-side");
        Library.availableBooks.add("Water bottles: my experience");
        Library.availableBooks.add("Why use iMac?");

        //declaring the objects
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        //now we will program the switch statement and menu
        while (true) {
            System.out.println("+-----------------------------------------------+");
            System.out.println("|                 Library Menu                  |");
            System.out.println("|               Select an Option                |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("|  1. Return a book                             |");
            System.out.println("|  2. Search for a book by title or author      |");
            System.out.println("|  3. View all books currently available        |");
            System.out.println("|  4. Add new books to the library              |"); // Soon: Login forum
            System.out.println("|  5. List all books with details               |");
            System.out.println("|     (title, author, availability)             |");
            System.out.println("+-----------------------------------------------+");

            int selection = scanner.nextInt();

            switch(selection) {
                case 1 -> library.returnBook();
                case 2 -> {
                    System.out.println("What exactly do you wish to see?");
                    System.out.println("|  1  :  title |  2  :  author |");
                    int answer = scanner.nextInt();
                    if (answer == 1) {
                        library.searchByTitle();
                    } else {
                        library.searchByAuthor();
                    }
                }
                case 3 -> library.listAvailableBooks();
                //case 4 -> //soon
                //case 5 -> library.listAllBooksWithDetails(); //fixing soon
                default -> System.out.println("Please write a valid number in!");
            }
        }
    }
}
