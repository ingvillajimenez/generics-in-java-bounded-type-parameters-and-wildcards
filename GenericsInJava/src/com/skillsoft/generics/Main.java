package com.skillsoft.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(100, 110, 120, 130, 140));
        List<Double> doubleList = new ArrayList<>(Arrays.asList(100.1, 110.7, 120.4, 130.3, 140.9));

        ListUtil.copy(integerList, doubleList, 3);

//        List<String> nameList = new ArrayList<>(Arrays.asList("Alice", "Boris", "Coralie", "Denver"));
//        System.out.println("Original list: " + nameList);
//
//        ListUtil.swap(nameList, 1, 3);
//        System.out.println("Swapped list: " + nameList);
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

// Inheritance Hierarchy
// Iterable -> Collection -> List -> ArrayList

// ? super ArrayList<String>
// List<String>, Collection<String>, Iterable<String>, Object

// Wildcard Capture
// Java's ability to infer the type of data you are working with and handle it correctly