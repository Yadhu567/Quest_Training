package com.quest.cloneobject;

public class Books {
    private String bookId;
    private String title;
    private String author;
    private boolean available;

    public Books(String bookId, String title, String author, boolean available){
        setBookId(bookId);
        setTitle(title);
        setAuthor(author);
        setAvailable(available);
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }
    public boolean isValid(){
        if(this.getBookId()!=null && this.isAvailable()){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Books clonedObject =(Books)super.clone(); //shallow copy
        clonedObject.setBookId(new String(this.getBookId())); //deep copy
        clonedObject.setTitle(new String(this.getTitle())); //deep copy
        clonedObject.setAuthor(new String(this.getAuthor()));
        clonedObject.setAvailable(this.isAvailable());
        return clonedObject;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId='" + getBookId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", available=" + getAuthor() +
                '}';
    }
}
