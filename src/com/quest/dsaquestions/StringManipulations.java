package com.quest.dsaquestions;

import java.util.Arrays;

public class StringManipulations {
    public static void main(String[] args) {
        String sentence = "hello world";
        String word = "hello";
        wordCount(sentence,word);
        stringReplacement("hello world");
        stringReverse("he@$%llo world");
    }
    public static void wordCount(String sentence,String word){
        String[] words=sentence.split(" ");

        int count=0;
        for(String s:words){
            if(s.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void stringReplacement(String word){
        word.replace(" ","%20");
        System.out.println(word);
    }
    public static void stringReverse(String str){
        char[] charArray=str.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while (left<right){
            if(Character.isAlphabetic(charArray[left])&&Character.isAlphabetic(charArray[right])){
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }else if(Character.isAlphabetic(charArray[left])) {
                left++;
            }
            else {
                right--;
            }
        }
        String newStr="";
        for(int i=0;i<charArray.length;i++){
            newStr=newStr+charArray[i];
        }
        System.out.println(newStr);
    }
}
