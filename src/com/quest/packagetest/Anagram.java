package com.quest.packagetest;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "silent";

        String str2 = "listen";

        char[] str1array = str1.toCharArray();

        char[] str2array = str2.toCharArray();

        Arrays.sort(str1array);
        Arrays.sort(str2array);


        boolean flag = true;
        for (int i = 0; i < str1array.length; i++) {
            if (str1array[i] != str2array[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("strings anagram");
        } else {
            System.out.println("strings not anagram");
        }

    }
}


