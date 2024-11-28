package com.quest.cloneobject;

import java.util.List;

public interface LibraryOperations {
    boolean addBook(Books book);
    boolean borrowBook(String bookId);
    boolean returnBook(String bookId) throws CloneNotSupportedException;
    List<Books> availableBooks();
    List<BorrowedRecord> borrowedBooksHistory();
}
