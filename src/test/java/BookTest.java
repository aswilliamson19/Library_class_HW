import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Spot goes to the seaside", "Eric Hill", "Children's");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Spot goes to the seaside", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Eric Hill", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Children's", book.getGenre());
    }

}
