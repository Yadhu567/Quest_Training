package com.quest.oops.libraryassigment2;

public class Member implements LibraryOperations {
    private String memberId;
    private String name;
    private String memberType;
    private int borrowLimit; // to store maximum borrowed book limit
    private int borrowed;

    public Member(String memberId, String name, String memberType,int borrowLimit) {
        setMemberId(memberId);
        setName(name);
        setMemberType(memberType);
        setBorrowLimit(borrowLimit);
        this.borrowed = 0; // to store currently borrowed book count
    }

    //getters and setters method
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public int getBorrowLimit() {
        return borrowLimit;
    }
    public void setBorrowLimit(int borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public int getBorrowed() {
        return borrowed;
    }

    // overriding the abstract borrow book method
    @Override
    public void borrowBook(Book book) {
        if (borrowed < borrowLimit) {
            if (!book.getIsBorrowed()) {
                book.borrowBook();
                borrowed++; // increments currently borrowed book count
                System.out.println(book.getTitle() + " borrowed!");
            } else {
                System.out.println(book.getTitle() + " is already borrowed!");
            }
        } else {
            System.out.println("borrow limit exceeded!");
        }
    }

    // overriding the abstract return book method
    @Override
    public void returnBook(Book book) {
        if (book.getIsBorrowed()) {
            book.returnBook();
            borrowed--; // decrements currently borrowed book count
            System.out.println(book.getTitle() + " returned!");
        } else {
            System.out.println(book.getTitle() + " is not borrowed!");
        }

    }

    //method to calculate late fine
    public double lateFine(final int days) {
        return days * 1.2;
    }

    // overriding the toString method
    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + getMemberId() + '\'' +
                ", name='" + getName() + '\'' +
                ", memberType='" + getMemberType() + '\'' +
                ", borrowed=" + getBorrowed() +
                '}';
    }

}
