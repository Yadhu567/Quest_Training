package com.quest.oops.libraryassignment;

public class LibraryMember {
    private String memberId;
    private String name;
    private String contactInfo;
    private String[] borrowedBooks;

    public LibraryMember(String memberId, String name, String contactInfo) {
        setMemberId(memberId);
        setName(name);
        setContactInfo(contactInfo);
        setBorrowedBooks(new String[3]);
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setBorrowedBooks(String[] borrowedBooks) {
        this.borrowedBooks= borrowedBooks;
    }

    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String isbn) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == null) {
                borrowedBooks[i] = isbn;
            }
        }
    }
    public void returnBook(String isbn) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (isbn.equals(borrowedBooks[i])) {
                borrowedBooks[i] = null;
            }
        }
    }


}
