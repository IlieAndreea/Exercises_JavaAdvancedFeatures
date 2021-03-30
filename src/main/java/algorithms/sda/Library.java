package algorithms.sda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    private Map<Genre, Set<Book>> bookShelf;

    public Map<Genre, Set<Book>> getBookshelf() {
        return bookShelf;
    }

    public void setBookshelf(Map<Genre, Set<Book>> bookshelf) {
        this.bookShelf = bookshelf;
    }

    public Library() {
        initWithDefaultBooks();
    }

    public void initWithDefaultBooks() {
        Book drama1 = new Book("GG", "Great Gatsby", Genre.DRAMA, 2001);
        Book horror1 = new Book("MS", "Frankenstein", Genre.HORROR, 1897);
        Book sf = new Book("FH", "Dune", Genre.HORROR, 1996);
        Set<Book> dramaSection = new HashSet<Book>();
        dramaSection.add(drama1);

        bookShelf = new HashMap<Genre, Set<Book>>();
        bookShelf.put(Genre.DRAMA, dramaSection);
    }
}
