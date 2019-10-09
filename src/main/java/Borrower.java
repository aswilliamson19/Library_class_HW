import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower() {
        this.bookCollection = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return bookCollection;
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public int collectionCount() {
        return this.bookCollection.size();
    }
}
