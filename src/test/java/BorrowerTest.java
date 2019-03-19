import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    public Library library;
    public Book book;
    public Book book2;
    public Book book3;
    public Borrower borrower;


    @Before
    public void setup() {
        library = new Library(3);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Witches", "Roald Dahl", "Kids");
        book3 = new Book("Hunger Games", "Someone", "Teens");
        borrower = new Borrower("Abigail");
    }

    @Test
    public void borrowerCollectionCount() {
        assertEquals(0, borrower.borrowerBookCount());
    }

    @Test
    public void ableToBorrowBook(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBook(library);
        assertEquals(1, borrower.borrowerBookCount());
        assertEquals(2, library.bookCount());
    }

}
