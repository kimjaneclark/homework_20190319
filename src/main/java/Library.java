import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (capacity > bookCount())
        {
            this.collection.add(book);
        }
    }

    public Book removeBook() {
        Book bookRemoved = null;
        bookRemoved = this.collection.remove(0);
        return bookRemoved;
    }


}
