package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.5);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Scores list (doubles): " + StudentsUtil.getScoresAsList(studentsMap));

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        System.out.println("Scores list (integers): " + StudentsUtil.getScoresAsList(anotherStudentsMap));

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