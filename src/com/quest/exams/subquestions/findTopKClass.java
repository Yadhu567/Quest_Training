package com.quest.exams.subquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findTopKClass {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("banana");
        words.add("banana");
        int k = 2;
//        List<String> result = findTopKFrequent(words, k);
//        System.out.println(result);
    }

//    private static List<String> findTopKFrequent(List<String> words, int k) {
//        Map<String, Integer> frequencyMap = new HashMap<>();
//        for (String word : words) {
//            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
//        }
//
//    }
}
