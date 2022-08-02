import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int getBooksCount() {
        return books.size();
    }
    public void borrowBook(Library library, Book book) {
        books.add(book);
        library.removeBook(book);
    }
}

