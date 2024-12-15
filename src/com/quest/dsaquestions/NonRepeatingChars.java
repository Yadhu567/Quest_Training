package com.quest.dsaquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChars {
    public static void main(String[] args) {
        String str="swiss";

        char[] charArray=str.toCharArray();

        int[] count=new int[256];

        for(char c:charArray){
            count[c]++;
        }

        for(char c:charArray){
            if(count[c]==1){
                System.out.println(c);
                break;
            }
        }

//        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();
//
//        for (char c:str.toCharArray()) {
//            linkedHashMap.put(c,linkedHashMap.getOrDefault(c,0)+1);
//        }
//        for (Map.Entry<Character, Integer> e:linkedHashMap.entrySet()) {
//            if (e.getValue()==1) {
//                System.out.println(e.getKey());
//                break;
//            }
//        }
    }
}
