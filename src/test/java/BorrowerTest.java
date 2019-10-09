import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("Spot goes to the seaside", "Eric Hill", "Children's");
        book2 = new Book("The Kite Runner", "Khaled Hosseini", "Drama");
    }

    @Test
    public void canBorrowABook() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddABookToCollection() {
        borrower.addBook(book1);
        borrower.addBook(book2);
        assertEquals(2, borrower.collectionCount());
    }


}
