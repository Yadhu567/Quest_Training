package com.quest.oops.libraryassignment;

public abstract class LibraryOperation {
        public abstract Book searchBook(String query);
        public abstract LibraryMember searchMember(String memberId);
        public abstract void borrowBook(String isbn, String memberId);
        public abstract void returnBook(String isbn, String memberId);
        public abstract void displayAvailableBooks();
        public abstract void displayAllMembers();
}


