import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;


    @Before
    public void setup() {
        library = new Library(3);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void bookCollectionCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToCollection(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }


    @Test
    public void addBookToCollectionIfCapacityReached(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

}
