package com.quest.collections.set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Float> lhs=new LinkedHashSet<>();
        lhs.add(5f);
        lhs.add(2f);
        lhs.add(3f);
        lhs.add(3f);
        lhs.add(null);
        lhs.add(null);
        for(Float i:lhs){
            System.out.println(i);
        }
        System.out.println(lhs.remove(2.0f));
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains(3.0f));
//        lhs.clear();
        Iterator<Float> itObj=lhs.iterator();
        while (itObj.hasNext()){
            System.out.println(itObj.next());
        }
    }

}
