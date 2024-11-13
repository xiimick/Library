package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class library {
    private List<book> books;

    public library() {
        this.books = new ArrayList<>();
    }

    public void addBook(book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    public boolean removeBook(book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        return books.remove(book);
    }

    public List<book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public int getBookCount() {
        return books.size();
    }
}
