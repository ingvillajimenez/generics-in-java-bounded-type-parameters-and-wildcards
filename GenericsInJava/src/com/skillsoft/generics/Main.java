package com.skillsoft.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.5);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<Integer, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put(1001, 87);
        anotherStudentsMap.put(1002, 78);
        anotherStudentsMap.put(1003, 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

//        Map<String, Double> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45.5);
//        studentsMap.put("Ophelia", 67.2);
//        studentsMap.put("Matthew", 73.8);
//        studentsMap.put("Carl", 87.0);
//
//        StudentsUtil.printMapEntries(studentsMap);
//
//        System.out.println("\n***************");
//
//        Map<Integer, String> anotherStudentsMap = new HashMap<>();
//
//        anotherStudentsMap.put(1001, "Della");
//        anotherStudentsMap.put(1002, "Perry");
//        anotherStudentsMap.put(1003, "Paul");
//
//        StudentsUtil.printMapEntries(anotherStudentsMap);


//        Map<String, Double> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45.5);
//        studentsMap.put("Ophelia", 67.2);
//        studentsMap.put("Matthew", 73.8);
//        studentsMap.put("Carl", 87.0);
//
//        List<Object> scoresList = StudentsUtil.getScoresAsList(studentsMap); // java: incompatible types: java.util.Map<java.lang.String,java.lang.Double> cannot be converted to java.util.Map<java.lang.String,java.lang.Object>
//        System.out.println("Scores list (objects): " + scoresList);
//
//        Map<String, Integer> anotherStudentsMap = new HashMap<>();
//
//        anotherStudentsMap.put("Della", 87);
//        anotherStudentsMap.put("Perry", 78);
//        anotherStudentsMap.put("Paul", 67);
//
//        List<Object> anotherScoresList = StudentsUtil.getScoresAsList(anotherStudentsMap); // java: incompatible types: java.util.Map<java.lang.String,java.lang.Integer> cannot be converted to java.util.Map<java.lang.String,java.lang.Object>
//        System.out.println("Another scores list (objects): " + anotherScoresList);

//        Map<String, Object> studentsMap = new HashMap<>();
//
//        studentsMap.put("Dorian", 45.5);
//        studentsMap.put("Ophelia", 67.2);
//        studentsMap.put("Matthew", 73.8);
//        studentsMap.put("Carl", 87.0);
//
//        List<Object> scoresList = StudentsUtil.getScoresAsList(studentsMap);
//        System.out.println("Scores list (objects): " + scoresList);
//
//        Map<String, Object> anotherStudentsMap = new HashMap<>();
//
//        anotherStudentsMap.put("Della", 87);
//        anotherStudentsMap.put("Perry", 78);
//        anotherStudentsMap.put("Paul", 67);
//
//        List<Object> anotherScoresList = StudentsUtil.getScoresAsList(anotherStudentsMap);
//        System.out.println("Another scores list (objects): " + anotherScoresList);
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

// Bounded Type Parameters vs. Upper Bounded Wildcards
// With bounded types the type T is known, with wildcards the type ? is unknown

// Unbounded Wildcards
// Method can be implemented using functionality in the Object base class
// When the code of the method is such that it does not depend on the exact type