package com.quest.dsaquestions;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="malayalam";

        StringBuilder reverse=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }
        String newString=reverse.toString();

        if(newString.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
