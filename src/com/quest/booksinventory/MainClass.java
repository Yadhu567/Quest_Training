package com.quest.booksinventory;

import java.util.Scanner;
public class MainClass implements DisplayPriceAboveBooks{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        Book[] books=new Book[5];
        System.out.println("enter details of normal books");
        // normal books
        for(int i=0;i<3;i++){
            System.out.println("enter book title");
            String title=sc.nextLine();

            System.out.println("enter book author");
            String author=sc.nextLine();

            System.out.println("enter book price");
            double price=doubleValidation(sc);

            System.out.println("enter book stock");
            int stock=integerValidation(sc);

            books[i]=new Book(title,author,price,stock);
            sc.nextLine(); //clears input
        }
        //special edition books
        SpecialEditionBook[] specilbook=new SpecialEditionBook[5];
        System.out.println("enter details of special edition books");
        for(int i=3;i<5;i++){
            System.out.println("enter book title");
            String title=sc.nextLine();

            System.out.println("enter book author");
            String author=sc.nextLine();

            System.out.println("enter book price");
            double price=doubleValidation(sc);

            System.out.println("enter book stock");
            int stock=integerValidation(sc);

            System.out.println("enter special features");
            String specialFeatures=sc.nextLine();

            books[i]=new SpecialEditionBook(title,author,price,stock,specialFeatures);
            sc.nextLine();  //clears input
        }
        //book details
        System.out.println("Books details are:");
        for(Book book:books){
            System.out.println(book);
        }

        System.out.println("Enter a price value:");
        int priceValue= integerValidation(sc);

        //lambda function to display books above given price
        System.out.println("Books above given price value");
        DisplayPriceAboveBooks priceAboveBooks=()->{
            for(Book book:books){
                if(book.getPrice()>=priceValue){
                    System.out.println(book);
                }
            }
        };
        DisplayPriceAboveBooks priceAboveBooks1=new DisplayPriceAboveBooks() {
            @Override
            public void displayBooks() {
                System.out.println("hello");
            }
        };
        priceAboveBooks1.displayBooks();
        priceAboveBooks.displayBooks();
    }
    @Override
    public void displayBooks() {

    }
    // integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }
    // double validation
    private static Double doubleValidation(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextDouble();
    }
}
