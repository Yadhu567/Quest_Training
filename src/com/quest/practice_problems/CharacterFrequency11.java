package com.quest.practice_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency11 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap=new HashMap<>();

        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();


        for(int i=0;i<word.length();i++){
            hashMap.put(word.charAt(i),hashMap.getOrDefault(word.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> e:hashMap.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
    }
}
