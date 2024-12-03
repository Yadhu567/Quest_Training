package com.quest.practice_problems;

import java.util.ArrayList;

public class SecondLargest4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);

        int first=arrayList.get(0);
        int second=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)>first){
                second=first;
                first=arrayList.get(i);
            }else if(arrayList.get(i)>second && first!=second){
                second=arrayList.get(i);
            }
        }
        System.out.println("the second max element is "+second);
    }
}
