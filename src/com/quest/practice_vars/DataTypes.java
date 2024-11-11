package com.quest.practice_vars;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        double num2=3.14;
        System.out.println(num2);
        float num3=3.14f;
        System.out.println(num3);
        boolean b1=true;
        System.out.println(b1);
        char c1='a';
        System.out.println(c1);
        short num4=2;
        System.out.println(num4);
        byte num5=2;
        System.out.println(num5);
        long num6=2;
        System.out.println(num6);
        String s1="hello";
        System.out.println(s1);
        int[] array= {2,4,7,8};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        /* for(int j:array){
            System.out.println(j);
        } */
    }
}
