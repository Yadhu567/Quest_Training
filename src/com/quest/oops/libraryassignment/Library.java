package com.quest.oops.libraryassignment;

public class Library extends LibraryMethods {
    private final Book[] books;
    private final LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library(int maxBooks, int maxMembers) {
        books = new Book[maxBooks];
        members = new LibraryMember[maxMembers];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added successfully: " + book.getTitle());
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void addMember(LibraryMember member) {
        if (memberCount < members.length) {
            members[memberCount++] = member;
            System.out.println("Member added successfully: " + member.getName());
        } else {
            System.out.println("Library is full, cannot add more members.");
        }
    }

    @Override
    public Book searchBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equalsIgnoreCase(isbn)){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public LibraryMember searchMember(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equalsIgnoreCase(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    @Override
    public void borrowBook(String isbn, String memberId) {
        Book book = searchBook(isbn);
        if (book != null && book.getIsAvailable()) {
            LibraryMember member = searchMember(memberId);
            if (member != null) {
                book.setIsAvailable(false);
                member.borrowBook(isbn);
                System.out.println("Book borrowed successfully by " + member.getName());
                return;
            }
        }
        System.out.println("Book borrow operation failed.");
    }

    @Override
    public void returnBook(String isbn, String memberId) {
        LibraryMember member = searchMember(memberId);
        if (member != null) {
            Book book = searchBook(isbn);
            if (book != null && !book.getIsAvailable()) {
                book.setIsAvailable(true);
                member.returnBook(isbn);
                System.out.println("Book returned successfully by " + member.getName());
                return;
            }
        }
        System.out.println("Book return operation failed.");
    }

    @Override
    public void displayAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsAvailable()) {
                System.out.println(books[i].getTitle() +  books[i].getAuthor() + books[i].getPublicationYear());
            }
        }
    }

    @Override
    public void displayAllMembers() {
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i].getName() + members[i].getMemberId() + members[i].getContactInfo()+ members[i].getBorrowedBooks());
        }
    }
}