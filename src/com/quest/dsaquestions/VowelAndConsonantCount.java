package com.quest.dsaquestions;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        String str="helloworld";
        String vowel="aeiouAEIOU";
        int vc=0;
        int cc=0;
        for(int i=0;i<str.length();i++){
            if(vowel.contains(String.valueOf(str.charAt(i)))){
                vc++;
            }
            else{
                cc++;
            }
        }
        System.out.println("vowel count "+vc);
        System.out.println("consonant count "+cc);
    }
}
