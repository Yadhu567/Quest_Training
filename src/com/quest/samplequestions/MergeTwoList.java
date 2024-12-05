package com.quest.samplequestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(5);
        arrayList1.add(8);
        arrayList1.add(1);
        arrayList1.add(6);

        List<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(22);
        arrayList2.add(33);
        arrayList2.add(8);
        arrayList2.add(9);

       /* Iterator<Integer> itObj=arrayList1.iterator();
        while(itObj.hasNext()){
            Integer element=itObj.next();
            if(!arrayList2.contains(element)){
                arrayList2.add(element);
            }
        }*/
        for(Integer element:arrayList1){
            if(!arrayList2.contains(element)){
                arrayList2.add(element);
            }
        }

        System.out.println(arrayList2);


    }
}
