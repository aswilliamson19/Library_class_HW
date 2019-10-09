import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Spot goes to the seaside", "Eric Hill", "Children's");
        book2 = new Book("The Kite Runner", "Khaled Hosseini", "Drama");
        borrower = new Borrower();
    }

    @Test
    public void libraryCollectionIsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canNotAddBookOverCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canLendABookToBorrower() {
        library.addBook(book1);
        library.lendBook(book1, borrower);
        assertEquals(1, borrower.collectionCount());
        assertEquals(0, library.bookCount());
    }

}
