package com.quest.practice_problems;

import java.util.ArrayList;

public class OccurenceCount5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(5);

        int count;
        boolean[] flag=new boolean[arrayList.size()];

        for(int i=0;i<arrayList.size();i++){
            count=0;
            if(flag[i]){
                continue;
            }
            for(int j=0;j<arrayList.size();j++){
                if(arrayList.get(i).equals(arrayList.get(j))){
                    count++;
                    flag[j]=true;
                }
            }
            System.out.println("element "+arrayList.get(i)+" count "+ count);
        }
}}
