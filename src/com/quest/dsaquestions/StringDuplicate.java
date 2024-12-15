package com.quest.dsaquestions;

import java.util.LinkedHashSet;

public class StringDuplicate {
    public static void main(String[] args) {
        String str="programming";
        String newString="";

        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            if(newString.indexOf(currentchar)==-1){
                newString=newString+currentchar;
            }
        }
        System.out.println(newString);


//        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();
//
//        for(int i=0;i<str.length();i++){
//            linkedHashSet.add(str.charAt(i));
//        }
//
//        for(Character c:linkedHashSet){
//            newString=newString+c;
//        }
//        System.out.println(newString);

    }
}
