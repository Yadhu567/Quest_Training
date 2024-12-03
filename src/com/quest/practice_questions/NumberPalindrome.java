package com.quest.practice_questions;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==originalNum){
            System.out.println("the number is a palindrome");
        }else{
            System.out.println("the number is not a palindrome");
        }
    }
}
