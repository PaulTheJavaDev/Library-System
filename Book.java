public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String name, String author, boolean isAvailable) {
        this.title = name;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //learned how to use the ternary operator
    public String getBookDetails() {
        return "Title: " + title + "\nDirector: " + author + "\nAvailability: " + (isAvailable ? "Available" : "Not Available") + "\n";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
