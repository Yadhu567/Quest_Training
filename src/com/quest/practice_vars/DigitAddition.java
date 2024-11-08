package com.quest.practice_vars;
import java.util.Scanner;
public class DigitAddition {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum= sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
