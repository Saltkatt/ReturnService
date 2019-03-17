package elin.iths.se.returnservice.models;

import java.util.Set;

public class Book {

    private long bookId;
    private String title;
    private Set<Author> authors;
    private boolean available;
    private String returnDate;
    private String postedAt;
    private String lastUpdatedAt;

    public Book() {
    }

    public Book(long bookId, String title, Set<Author> authors, boolean available, String returnDate, String postedAt, String lastUpdatedAt) {
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.available = available;
        this.returnDate = returnDate;
        this.postedAt = postedAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
