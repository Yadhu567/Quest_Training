package com.quest.exams.subquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOccurrence {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);

        Map<Integer,List<Integer>> resultMap;
        resultMap= groupByFrequency(arrayList); // stores the result map
        System.out.println(resultMap);
    }
    public static Map<Integer, List<Integer>>  groupByFrequency(ArrayList<Integer> arrayList){
            Map<Integer,Integer> frequencyMap=new HashMap<>();

            for(Integer num :arrayList){
                frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1); // go count the frequency of occurrence of element
            }


            Map<Integer,List<Integer>> groupByFrequencyMap=new HashMap<>(); // storing the result

            for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
                int number= entry.getKey();
                int frequency=entry.getValue();

                if (!groupByFrequencyMap.containsKey(frequency)) {
                    groupByFrequencyMap.put(frequency, new ArrayList<>()); // creating new arraylist for new key
                }
                groupByFrequencyMap.get(frequency).add(number); //fetch the list of key and add to that
            }
            return  groupByFrequencyMap;
    }
}
