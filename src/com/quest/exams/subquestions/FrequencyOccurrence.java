package com.quest.exams.subquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Enter the number of elements in the list:");
        int numberOfElements = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(sc.nextInt());
        }

        System.out.println("The input array list");
        System.out.println(arrayList);

        Map<Integer,List<Integer>> resultMap= groupByFrequency(arrayList); // stores the result map

        System.out.println("The resultant map is");
        System.out.println(resultMap);
    }
    public static Map<Integer, List<Integer>>  groupByFrequency(ArrayList<Integer> arrayList){
            Map<Integer,Integer> frequencyMap=new HashMap<>(); // map to store the elements and their frequency

            for(Integer num :arrayList){
                frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1); // to count the frequency of occurrence of element
            }

            Map<Integer,List<Integer>> groupByFrequencyMap=new HashMap<>(); // storing the resultant map

            for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
                int element= entry.getKey();
                int frequency=entry.getValue();

                if (!groupByFrequencyMap.containsKey(frequency)) {
                    groupByFrequencyMap.put(frequency,new ArrayList<>()); // creating new arraylist for new key
                }
                groupByFrequencyMap.get(frequency).add(element); //fetch the list of key and add to that
            }
            return  groupByFrequencyMap;
    }
}
