import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowerCollection;

    public Borrower(String name) {
        this.name = name;
        this.borrowerCollection = new ArrayList<Book>();

    }

    public int borrowerBookCount() {
        return this.borrowerCollection.size();
    }


    public void borrowBook(Library library) {
        Book removedBook = library.removeBook();
        this.borrowerCollection.add(removedBook);
    }
}
