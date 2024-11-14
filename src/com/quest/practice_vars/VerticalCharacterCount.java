package com.quest.practice_vars;
import java.util.Scanner;
public class VerticalCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (str.indexOf(str.charAt(i))==i){
                System.out.println(str.charAt(i) + "-" + count);
            }
        }
    }
}
