package com.quest.practice_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap15 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(104,"ravi");
        hashMap.put(101,"harsh");
        hashMap.put(103,"manu");
        hashMap.put(106,"ken");
        hashMap.put(109,"sourav");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee id");
        int id=sc.nextInt();

        Map.Entry<Integer,String> searchE=null;
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            if (e.getKey()==id) {
                System.out.println("the employee with this id is "+e.getValue());
            }
        }
    }
}
