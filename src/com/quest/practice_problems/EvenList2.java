package com.quest.practice_problems;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);

        Iterator<Integer> itObj=arrayList.iterator();
        while (itObj.hasNext()){
            int i= itObj.next();
            if(i%2==0){
                itObj.remove();
            }
        }
        for (Integer i:arrayList) {
            System.out.println(i);
        }
    }
}
