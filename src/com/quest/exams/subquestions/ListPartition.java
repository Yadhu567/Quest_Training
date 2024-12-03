package com.quest.exams.subquestions;
import java.util.List;
import java.util.ArrayList;

public class ListPartition {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        int partitionSize = 2;
        List<List<Integer>> resultList = partitionList(arrayList, partitionSize); //stores the list of lists
        System.out.println(resultList);
    }
    public static List<List<Integer>> partitionList(List<Integer> inputList, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPartition = new ArrayList<>(); // initially creates inner list

        for (int i = 0; i < inputList.size(); i++) {
            currentPartition.add(inputList.get(i));

            if (currentPartition.size() == n || i == inputList.size() - 1) {
                result.add(currentPartition);
                currentPartition = new ArrayList<>();  // created new inner list for next entry
            }
        }
        return result;
    }
}
