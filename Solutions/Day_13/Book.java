package Solutions.Day_13;

public abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();

}