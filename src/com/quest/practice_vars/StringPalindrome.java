package com.quest.practice_vars;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input string
        if(s==null){
            System.out.println("enter a string");
            return;
        }
        StringBuilder newString = new StringBuilder();

        for (int i = s.length()-1; i>=0; i--) {
            newString.append(s.charAt(i));
        }
        if (newString.toString().equals(s)) { // checks two strings are equal
            System.out.println("string is a palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
    }
}
