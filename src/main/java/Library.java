import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > bookCount()) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public void lendBook(Borrower borrower) {
        if (this.bookCount() > 0) {
            this.books.removeBook();
            Book bookBorrowed = borrower.addBook(book);
        }
    }
}
