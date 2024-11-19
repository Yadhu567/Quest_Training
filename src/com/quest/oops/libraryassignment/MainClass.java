package com.quest.oops.libraryassignment;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Library library = new Library(100, 50); //maximum books and maximum members
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose an option 1. Add Book 2.Add Members 3. Search Book 4. Borrow Book 5. Return Book "+
                    "6. Display Available Books 7. Display All Members 8. Exit");
            int choice = integerValidation(sc); // to validate integer
            sc.nextLine(); // to clear scanner
            switch (choice) {
                case 1 :
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Publication Year: ");
                    int year = integerValidation(sc); // to validate integer
                    System.out.print("Enter Book is available or not available: ");
                    boolean available = sc.nextBoolean();
                    sc.nextLine();
                    library.addBook(new Book(isbn, title, author, year, available));
                    break;
                case 2 :
                    System.out.print("Enter MemberID: ");
                    String memberId= sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter ContactInfo: ");
                    String contactInfo = sc.nextLine();
                    sc.nextLine();
                    System.out.println("enter the ISBN of borrowed books");
                    library.addMember(new LibraryMember(memberId, name, contactInfo));
                    break;
                case 3 :
                    System.out.print("Enter ISBN of book to search ");
                    String searchISBN= sc.nextLine();
                    Book book = library.searchBook(searchISBN);
                    if (book != null) {
                        System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4 :
                    System.out.print("Enter ISBN to borrow: ");
                    String isbnBorrow = sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    String borrowMemberId = sc.nextLine();
                    library.borrowBook(isbnBorrow, borrowMemberId);
                    break;
                case 5 :
                    System.out.print("Enter ISBN to return: ");
                    String isbnReturn = sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    String returnMemberId = sc.nextLine();
                    library.returnBook(isbnReturn,returnMemberId);
                    break;
                case 6 :
                    library.displayAvailableBooks();
                    break;
                case 7 :
                    library.displayAllMembers();
                    break;
                case 8 :
                    return; // to exit from loop

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next(); // to clear scanner
        }
        return sc.nextInt();
    }
}



