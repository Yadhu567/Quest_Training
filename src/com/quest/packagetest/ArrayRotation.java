package com.quest.packagetest;

import java.util.ArrayList;

public class ArrayRotation {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(1);

        int index=2;

        ArrayList<Integer> arrayList2=new ArrayList<>();

        for(int i=index;i<arrayList.size();i++){
            arrayList2.add(arrayList.get(i));
        }
        for(int i=0;i<index;i++){
            arrayList2.add(arrayList.get(i));
        }
        arrayList.clear();
        arrayList=arrayList2;
        System.out.println(arrayList);




        
    }
}
