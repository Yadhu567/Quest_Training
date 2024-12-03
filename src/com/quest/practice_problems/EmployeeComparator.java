package com.quest.practice_problems;

import java.util.Comparator;
import java.util.Map;

public class EmployeeComparator implements Comparator<Map.Entry<Employee, Integer>> {
    @Override
    public int compare(Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2) {
        if (o1.getValue() > o2.getValue()) {
            return 1;
        } else if (o1.getValue() < o2.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }


}
