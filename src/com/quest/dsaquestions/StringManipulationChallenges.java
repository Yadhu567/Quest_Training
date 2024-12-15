package com.quest.dsaquestions;

public class StringManipulationChallenges {
    public static void main(String[] args) {
        eachWordReverse("hello world");
        substringInsert("hello world");
        compareEfficiency();

    }
    public static void eachWordReverse(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder newStr=new StringBuilder();
        for(String word:words){
            StringBuilder str=new StringBuilder(word);
            newStr.append(str.reverse()).append(" ");
        }
        System.out.println(newStr.toString());
    }
    public static void substringInsert(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.insert(3,"new");
        System.out.println(sb.toString());
    }
    public static void compareEfficiency() {
        String str = "hello world";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sf = new StringBuffer(str);


        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            str = str + "hai";
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i <100; i++) {
            sb.append("hai");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i <100; i++) {
            sf.append("hai");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");
    }
}
