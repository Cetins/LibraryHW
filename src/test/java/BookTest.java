import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book testBook;

    @Before
    public void beforeEach() {
        testBook = new Book("Quiet", "Susan Cain", "Self Improvement");
    }

    @Test
    public void hasTitle() {
        assertEquals("Quiet", testBook.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Susan Cain", testBook.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Self Improvement", testBook.getGenre());
    }
}
