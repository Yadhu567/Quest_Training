package com.quest.collections.set;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Float> treeSet =new TreeSet<>();
        treeSet.add(5f);
        treeSet.add(1f);
        treeSet.add(3f);
        treeSet.add(3f);
        treeSet.add(null); // This will throw a NullPointerException

        for(Float i:treeSet){
            System.out.println(i);
        }
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.floor(2f));
        System.out.println(treeSet.headSet(3f)); //Returns a view of the portion of this set whose
        // elements are greater than (or equal to, if inclusive is true)

    }
}
