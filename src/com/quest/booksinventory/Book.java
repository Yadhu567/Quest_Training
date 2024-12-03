package com.quest.booksinventory;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;
    final static double DISCOUNT_PERCENTAGE=25.0; //constant to store discount percentage
    public Book(String title,String author,double price,int stock){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setStock(stock);
    }// setters and getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price - (price * DISCOUNT_PERCENTAGE / 100);
    }
    public int getStock() throws OutOfStockException{ //throws is a class
       if(stock<=0){ // checks book is out of stock
           throw new OutOfStockException("This book is out of stock!");
       }else{
           return stock;
       }
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    //overrides toString method
    @Override
    public String toString() {
        try {
            return "Book{" +
                    "title='" + getTitle() + '\'' +
                    ", author='" + getAuthor() + '\'' +
                    ", price=" + getPrice() +
                    ", stock=" + getStock() +
                    '}';
        } catch (OutOfStockException e) {
            throw new RuntimeException(e);
        }
    }
}
