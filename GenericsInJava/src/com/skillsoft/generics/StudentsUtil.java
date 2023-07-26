package com.skillsoft.generics;

import java.util.Map;

public class StudentsUtil {

    public static <T extends Number> double computeAverageScore(Map<String, T> studentsMap) { // Bounded type parameter

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }

//    public static double computeAverageScore(Map<String, ? extends Number> studentsMap) { // Upper bounded wildcard (?)
//
//        double totalScore = 0;
//        int count = 0;
//
//        for (Map.Entry<String, ? extends Number> entry : studentsMap.entrySet()) { // Upper bounded wildcard (?)
//            totalScore += entry.getValue().doubleValue();
//            count++;
//        }
//
//        return totalScore / count;
//    }

//    public static double computeAverageScore(Map<String, Number> studentsMap) {
//
//        double totalScore = 0;
//        int count = 0;
//
//        for (Map.Entry<String, Number> entry : studentsMap.entrySet()) {
//            totalScore += entry.getValue().doubleValue();
//            count++;
//        }
//
//        return totalScore / count;
//    }

}
