package com.quest.practice_vars;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s==null){
            System.out.println("enter a string");
            return;
        }
        String newString = "";

        for (int i = s.length()-1; i>=0; i--) {
            newString =newString+ s.charAt(i);
        }
        if (newString.equals(s)) {
            System.out.println("string is a palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
    }
}
