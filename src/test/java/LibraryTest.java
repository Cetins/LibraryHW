import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library testLibrary;
    Book testBook;

    @Before
    public void beforeEach() {
        testLibrary = new Library(3);
        testBook = new Book("Quiet", "Susan Cain", "Self Improvement");
    }

    @Test
    public void initialCountZeroBook() {
        assertEquals(0, testLibrary.getStockCount());
    }
    @Test
    public void canAddBook() {
        testLibrary.addBook(testBook);
        assertEquals(1, testLibrary.getStockCount());
        assertEquals(1, testLibrary.getStockByGenre(testBook.getGenre()));
    }

    @Test
    public void canRemoveBook() {
        testLibrary.addBook(testBook);
        testLibrary.removeBook(testBook);
        assertEquals(0, testLibrary.getStockCount());
    }

    @Test
    public void canGetStockByGenre() {
        testLibrary.addBook(testBook);
        assertEquals(1, testLibrary.getStockByGenre(testBook.getGenre()));
    }

}
