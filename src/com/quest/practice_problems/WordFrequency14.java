package com.quest.practice_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordFrequency14 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String[] words = s1.split(" ");

        for(int i=0;i<words.length;i++){
            hashMap.put(words[i],hashMap.getOrDefault(words[i],0)+1);
        }
        for(Map.Entry<String,Integer> e:hashMap.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
    }
}
