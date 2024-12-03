package com.quest.practice_problems;

import java.util.HashSet;
import java.util.Iterator;

public class DivisibleByThree8 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(6);

        Iterator<Integer> itObj=hashSet.iterator();
        while (itObj.hasNext()){
            int i= itObj.next();
            if(i%3==0){
                itObj.remove();
            }
        }
        for (Integer i:hashSet) {
            System.out.println(i);
        }
    }
}
