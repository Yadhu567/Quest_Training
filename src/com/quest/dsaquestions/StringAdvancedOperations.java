package com.quest.dsaquestions;

public class StringAdvancedOperations {
    public static void main(String[] args) {
        removeVowel("hello");
        compressString("aaabb");
    }
    public static void removeVowel(String str){
        StringBuilder sb=new StringBuilder();
        String vowel="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(!vowel.contains(String.valueOf(str.charAt(i)))){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void compressString(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
