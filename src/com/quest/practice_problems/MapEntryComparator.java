package com.quest.practice_problems;

import java.util.Comparator;
import java.util.Map;

public class MapEntryComparator implements Comparator<Map.Entry<Person,Integer>> {
    @Override
    public int compare(Map.Entry<Person,Integer> o1, Map.Entry<Person,Integer> o2) {
        if(o1.getValue()>o2.getValue()){
            return 1;
        }else if(o1.getValue()<o2.getValue()){
            return -1;
        }else{
            return 0;
        }
    }
}
