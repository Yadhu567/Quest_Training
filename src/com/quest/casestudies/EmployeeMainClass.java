package com.quest.casestudies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMainClass {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();

        empList.add(new Employee(23,"ron","hr",4566));
        empList.add(new Employee(10,"rahul","it",3966));
        empList.add(new Employee(19,"tony","it",2466));

        List<Employee> newlist= empList.stream().filter((e)->e.getDepartment().equalsIgnoreCase("hr")).toList();
        System.out.println(newlist);
        for(Employee e:empList){
            if(e.getDepartment().equalsIgnoreCase("IT")){
                System.out.println(e);
            }
        }
        for(Employee e:empList){
            if(e.getDepartment().equalsIgnoreCase("HR")){
                System.out.println(e);
            }

        }
        for(Employee e:empList){
            if(e.getSalary()>50000){
                System.out.println(e);
            }

        }

        Employee em=empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(em);


    }
}
