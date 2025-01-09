public class Book extends Library{ //thinking about this extends part

    static String name;
    static String author;
    static boolean availability;

    Book(String name, String author, boolean availability) {
        this.name = name;
        this.author = author;
        this.availability = availability;
    }

    //test method for now
    public String callAttributes() {
        String attributes = name + " was written by "
                + author + "\navailability status: " + availability;
        return attributes;
    }
}
