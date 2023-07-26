package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<?, ?> map) { // Both the key as well as the value types are unbounded wildcard

        for (Map.Entry<?, ?> entry : map.entrySet()) { // Both the key as well as the value types are unbounded wildcard
            System.out.format("Key: %s, Map: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static double computeAverageScore(Map<?, ? extends Number> scoreMap) { // Key is unbounded wildcard, values is upper-bounded wildcard

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<?, ? extends Number> entry : scoreMap.entrySet()) { // Key is unbounded wildcard, values is upper-bounded wildcard
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }

//    public static List<Object> getScoresAsList(Map<String, ?> studentsMap) { // Unbounded wildcard
//
//        List<Object> list = new ArrayList<>();
//
//        for (Map.Entry<String, ?> entry : studentsMap.entrySet()) { // Unbounded wildcard
//
//            Object score = entry.getValue();
//
//            list.add(score);
//        }
//
//        return list;
//    }

//    public static List<Object> getScoresAsList(Map<String, Object> studentsMap) {
//
//        List<Object> list = new ArrayList<>();
//
//        for (Map.Entry<String, Object> entry : studentsMap.entrySet()) {
//
//            Object score = entry.getValue();
//
//            list.add(score);
//        }
//
//        return list;
//    }

}
