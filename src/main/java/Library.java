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

    public void lendBook(Book book, Borrower borrower) {
        if (this.books.contains(book)) {
            this.books.remove(book);
            borrower.addBook(book);
        }
    }
}
