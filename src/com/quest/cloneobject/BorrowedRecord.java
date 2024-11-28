package com.quest.cloneobject;
import java.time.LocalDateTime;
public class BorrowedRecord {
    private Books book;
    private LocalDateTime borrowedAt;
    private LocalDateTime returnedAt;
    public BorrowedRecord(Books book, LocalDateTime borrowedAt, LocalDateTime returnedAt){
        this.book=book;
        this.borrowedAt=borrowedAt;
        this.returnedAt=returnedAt;

    }
    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public LocalDateTime getBorrowedAt() {
        return borrowedAt;
    }

    public void setBorrowedAt(LocalDateTime borrowedAt) {
        this.borrowedAt = borrowedAt;
    }

    public LocalDateTime getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(LocalDateTime returnedAt) {
        this.returnedAt = returnedAt;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", borrowedAt=" + borrowedAt +
                ", returnedAt=" + returnedAt +
                '}';
    }
}


