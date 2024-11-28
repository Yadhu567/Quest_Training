package com.quest.cloneobject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations{
    ArrayList<Books> availableBooks=new ArrayList<>();
    ArrayList<BorrowedRecord> borrowedBooks=new ArrayList<>();


    @Override
    public boolean addBook(Books book) {
       if(book.isAvailable()){
            availableBooks.add(book);
            return true;
       }
        return false;
    }

    @Override
    public boolean borrowBook(String bookId) {
        for(Books book:availableBooks){
            if(book.getBookId().equalsIgnoreCase(bookId)){
                if(book.isAvailable()){
                    book.setAvailable(false);
                    availableBooks.remove(book);
                    BorrowedRecord borrowedRecord=new BorrowedRecord(book, LocalDateTime.now(),null);
                    borrowedBooks.add(borrowedRecord);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean returnBook(String bookId) throws CloneNotSupportedException {
        for(Books book:availableBooks){
            if(book.getBookId().equalsIgnoreCase(bookId)){
                if(!book.isAvailable()){
                    book.setAvailable(true);
                    availableBooks.add(book);
                    for (BorrowedRecord borrowBook : borrowedBooks) {
                        if (borrowBook.getBook().getBookId().equalsIgnoreCase(bookId)) {
                            borrowBook.getBook().setAvailable(false);
                            borrowBook.setReturnedAt(LocalDateTime.now());
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<Books> availableBooks() {
        return availableBooks;
    }

    @Override
    public List<BorrowedRecord> borrowedBooksHistory() {
        return borrowedBooks;
    }
}
