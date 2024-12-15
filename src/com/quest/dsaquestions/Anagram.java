package com.quest.dsaquestions;


public class Anagram {
    public static void main(String[] args) {
        String str1="silent";

        String str2="listen";

        char[] str1array=str1.toCharArray();

        char[] str2array=str2.toCharArray();

        for(int i=0;i<str1array.length;i++){
            for(int j=0;j<str1array.length-i-1;j++){
                if(str1array[j]>str1array[j+1]){
                    char temp=str1array[j];
                    str1array[j]=str1array[j+1];
                    str1array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<str2array.length;i++){
            for(int j=0;j<str2array.length-i-1;j++){
                if(str2array[j]>str2array[j+1]){
                    char temp=str2array[j];
                    str2array[j]=str2array[j+1];
                    str2array[j+1]=temp;
                }
            }
        }

        boolean flag=true;
        for(int i=0;i<str1array.length;i++){
            if(str1array[i]!=str2array[i]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(" two strings anagram");
        }else{
            System.out.println(" two strings not anagram");
        }

    }
}
