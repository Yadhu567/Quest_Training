package com.quest.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        String[] arr={"python","java","c++","python"}; //Java collections only store Objects,
        // It can store similar as well as different data types with some considerations
        HashMap<String ,Integer> map=new HashMap<>();
        for(String lang:arr){
            map.put(lang,map.getOrDefault(lang,0)+1);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            map.clear();
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

    }
}
