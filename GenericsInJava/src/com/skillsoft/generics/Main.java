package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

//        Map<String, Float> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45.4f);
//        studentsMap.put("Ophelia", 67.2f);
//        studentsMap.put("Matthew", 73.8f);
//        studentsMap.put("Carl", 87.0f);
//
//        System.out.println("Average score of students: " +
//                StudentsUtil.computeAverageScore(studentsMap)); // java: incompatible types: java.util.Map<java.lang.String,java.lang.Float> cannot be converted to java.util.Map<java.lang.String,java.lang.Number>

//        Map<String, Integer> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45);
//        studentsMap.put("Ophelia", 67);
//        studentsMap.put("Matthew", 73);
//        studentsMap.put("Carl", 87);
//
//        System.out.println("Average score of students: " +
//                StudentsUtil.computeAverageScore(studentsMap)); // java: incompatible types: java.util.Map<java.lang.String,java.lang.Integer> cannot be converted to java.util.Map<java.lang.String,java.lang.Number>

//        Map<String, Number> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45);
//        studentsMap.put("Ophelia", 67);
//        studentsMap.put("Matthew", 73);
//        studentsMap.put("Carl", 87);
//
//        System.out.println("Average score of students: " +
//                StudentsUtil.computeAverageScore(studentsMap));

    }
}

// The Comparable Interface
// Implement the single method compareTo()

// x.compareTo(y)
// Positive if x > y, negative if x < y, zero if x = y

// Bounded Types
// Can specify inheritance as well as multiple interfaces

// Wildcards
// The "?" in Java is the wildcard which represents an unknown type

// 3 Types of Wildcards
// Upper bounded, unbounded, lower bounded wildcards