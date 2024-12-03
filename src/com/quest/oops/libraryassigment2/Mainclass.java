package com.quest.oops.libraryassigment2;

public class Mainclass {
    public static void main(String[] args) {
        // Adding books
        Book book1 =new Book("b101","harry poter","johnson");
        Book book2 =new Book("b105","the walking shadow","peter");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println();

        // Adding members
        Member member1=new Member("m23","smith","regular",3);
        Member member2 =new PremiumMember("p23","johan","premium",5);

        System.out.println(member1);
        System.out.println(member2);
        System.out.println();

        // Borrowing books
        member1.borrowBook(book1);
        member2.borrowBook(book2);
        // Returning books
        member1.returnBook(book1);
        member2.returnBook(book2);

        System.out.println();
        // late fine calculation
        System.out.println(member1.getName()+"-> Late Fine:"+member1.lateFine(5));
        System.out.println(member2.getName()+"-> Late Fine:"+member2.lateFine(3));

    }
}
