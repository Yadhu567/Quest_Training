package com.quest.cloneobject;

import java.util.List;

public interface LibraryOperations {
    boolean addBook(Books book);
    boolean borrowBook(String bookId);
    boolean returnBook(String bookId) throws CloneNotSupportedException;
    List<Books> availableBooks();
    List<BorrowedRecord> borrowedBooksHistory();

    default void helloBooks() {
        System.out.println("hello");
    }
    default void helloBooks1() {
        System.out.println("hello");
    }

    static void helloAuthor(){
        System.out.println("hoi");
    }
    static void helloAuthor1(){
        System.out.println("hoi");
    }
}
