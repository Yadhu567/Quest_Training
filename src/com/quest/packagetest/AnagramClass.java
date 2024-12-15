package com.quest.packagetest;

import java.util.HashSet;

public class AnagramClass {
    public static void main(String[] args) {
        String s1="listens";
        String s2="silents";

        HashSet<Character> hashSet1=new HashSet<>();

        HashSet<Character> hashSet2=new HashSet<>();

        for(int i=0;i<s1.length();i++){
            hashSet1.add(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++){
            hashSet2.add(s2.charAt(i));
        }



        int count=0;
        for(Character c:hashSet1){
            if(hashSet2.contains(c)){
                count++;
            }
        }
        if(count==hashSet1.size()){
            System.out.println("Two strings are anagram");
        }else{
            System.out.println("two strings are not anagram");
        }
    }
}
