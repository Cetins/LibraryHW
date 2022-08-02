import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library testLibrary;
    Book testBook;

    @Before
    public void beforeEach() {
        borrower = new Borrower();
        testLibrary = new Library(3);
        testBook = new Book("Quiet", "Susan Cain", "Self Improvement");
    }

    @Test
    public void canBorrowBook() {
        testLibrary.addBook(testBook);
        borrower.borrowBook(testLibrary, testBook);
        assertEquals(0, testLibrary.getStockCount());
        assertEquals(1, borrower.getBooksCount());
    }
}
