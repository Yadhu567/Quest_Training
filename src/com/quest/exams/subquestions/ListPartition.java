package com.quest.exams.subquestions;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Enter the number of elements in the list:");
        int numberOfElements = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(sc.nextInt());
        }

        System.out.println("Enter the sublist size");
        int subListSize = sc.nextInt(); // indicate sublist size

        System.out.println("The input array list");
        System.out.println(arrayList);

        List<List<Integer>> resultList = partitionList(arrayList, subListSize); //stores the list of lists

        System.out.println("The resultant list is:");
        System.out.println(resultList);
    }
    public static List<List<Integer>> partitionList(List<Integer> inputList, int subListSize) {
        List<List<Integer>> resultList =new ArrayList<>(); // list to store the result
        List<Integer> currentPartition =new ArrayList<>(); // initially creates inner list

        for (int i = 0; i < inputList.size(); i++) {
            currentPartition.add(inputList.get(i));

            if (currentPartition.size()==subListSize || i==inputList.size()-1) {
                resultList.add(currentPartition);
                currentPartition = new ArrayList<>();  // created new inner list for next entry
            }
        }
        return resultList;
    }
}
