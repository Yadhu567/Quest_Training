package com.quest.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeStreamApis {
    public static void main(String[] args) {
        Employee emp1=new Employee(22,"john",42,"IT",32200,1);
        Employee emp2=new Employee(34,"ron",62,"HR",24500,4);
        Employee emp3=new Employee(44,"johan",26,"marketing",14500,7);
        Employee emp4=new Employee(53,"peter",39,"IT",94700,8);

        List<Employee> employeeList= Arrays.asList(emp1,emp2,emp3,emp4);

        List<Employee> salaryList=employeeList
                .stream()
                .sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()))
                .toList();

        System.out.println(salaryList);

        List<Employee> experienceList=employeeList
                .stream()
                .sorted(Comparator
                .comparing(Employee::getExperience))
                .toList();

        System.out.println(experienceList);

        List<Employee> salaryRangeList=employeeList
                .stream()
                .filter(e->e.getSalary()>30000)
                .toList();

        System.out.println(salaryRangeList);

        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

        Employee e= employeeList
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(e);

        List<Employee> skippingList=employeeList
                .stream()
                .sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()))
                .skip(2)
                .toList();
        System.out.println(skippingList);

        employeeList.stream().forEach(emp-> System.out.println(emp));

        double totalSalary=employeeList.stream().map(e1->e1.getSalary()).reduce((s1,s2)->s1+s2).get();
        System.out.println(totalSalary/employeeList.stream().count());
    }
}
