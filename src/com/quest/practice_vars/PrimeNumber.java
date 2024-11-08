package com.quest.practice_vars;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("not prime or composite");
            return;
        }
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("Not Prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}
