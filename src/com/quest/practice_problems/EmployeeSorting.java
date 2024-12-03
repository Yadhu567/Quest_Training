package com.quest.practice_problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeSorting {
    public static void main(String[] args) {
        TreeMap<Employee,Integer> treeMap=new TreeMap<>();
        treeMap.put(new Employee(54,"ravi"),72);
        treeMap.put(new Employee(33,"ron"),38);
        treeMap.put(new Employee(56,"hentry"),54);
        treeMap.put(new Employee(67,"ken"),78);
        treeMap.put(new Employee(89,"johan"),22);

        ArrayList<Map.Entry<Employee,Integer>> arrayList=new ArrayList<>(treeMap.entrySet());
        arrayList.sort(new EmployeeComparator());

        LinkedHashMap<Employee,Integer> linkedHashMap=new LinkedHashMap<>();

        for(Map.Entry<Employee,Integer> entry:arrayList){
            System.out.println("name "+entry.getKey().getName()+" salary "+entry.getValue());
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        for(Map.Entry<Employee,Integer> entry:linkedHashMap.entrySet()){
            System.out.println("name "+entry.getKey().getName()+" salary "+entry.getValue());
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }

    }
}
