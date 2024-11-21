package com.quest.oops.libraryassigment2;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed; // to indicate book is borrowed or not

    public Book(String isbn, String title, String author) {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        this.isBorrowed = false;

    }

    //getters and setters method
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    //method to change status when borrowing book
    public void borrowBook() {
        isBorrowed = true;
    }

    //method to change status when returning book
    public void returnBook() {
        isBorrowed = false;
    }

    // overriding the toString method
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + getIsbn()+ '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isBorrowed=" + getIsBorrowed() +
                '}';
    }
}
