package com.skillsoft.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> juliesCourses = new LinkedList<>();
        juliesCourses.add("Math");
        juliesCourses.add("Art");
        juliesCourses.add("Java");

        LinkedList<String> andrewsCourses = new LinkedList<>();
        andrewsCourses.add("Chemistry");
        andrewsCourses.add("English");

        Map<String, Object> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);

//        LinkedList<String> juliesCourses = new LinkedList<>();
//        juliesCourses.add("Math");
//        juliesCourses.add("Art");
//        juliesCourses.add("Java");
//
//        LinkedList<String> andrewsCourses = new LinkedList<>();
//        andrewsCourses.add("Chemistry");
//        andrewsCourses.add("English");
//
//        Map<String, Iterable<String>> coursesMap = new HashMap<>();
//        coursesMap.put("Julie", juliesCourses);
//        coursesMap.put("Andrew", andrewsCourses);
//
//        StudentsUtil.printMapEntries(coursesMap);

//        LinkedList<String> juliesCourses = new LinkedList<>();
//        juliesCourses.add("Math");
//        juliesCourses.add("Art");
//        juliesCourses.add("Java");
//
//        LinkedList<String> andrewsCourses = new LinkedList<>();
//        andrewsCourses.add("Chemistry");
//        andrewsCourses.add("English");
//
//        Map<String, Collection<String>> coursesMap = new HashMap<>();
//        coursesMap.put("Julie", juliesCourses);
//        coursesMap.put("Andrew", andrewsCourses);
//
//        StudentsUtil.printMapEntries(coursesMap);

//        LinkedList<String> juliesCourses = new LinkedList<>();
//        juliesCourses.add("Math");
//        juliesCourses.add("Art");
//        juliesCourses.add("Java");
//
//        LinkedList<String> andrewsCourses = new LinkedList<>();
//        andrewsCourses.add("Chemistry");
//        andrewsCourses.add("English");
//
//        Map<String, List<String>> coursesMap = new HashMap<>();
//        coursesMap.put("Julie", juliesCourses);
//        coursesMap.put("Andrew", andrewsCourses);
//
//        StudentsUtil.printMapEntries(coursesMap);

//        LinkedList<String> juliesCourses = new LinkedList<>();
//        juliesCourses.add("Math");
//        juliesCourses.add("Art");
//        juliesCourses.add("Java");
//
//        LinkedList<String> andrewsCourses = new LinkedList<>();
//        andrewsCourses.add("Chemistry");
//        andrewsCourses.add("English");
//
//        Map<String, LinkedList<String>> coursesMap = new HashMap<>();
//        coursesMap.put("Julie", juliesCourses);
//        coursesMap.put("Andrew", andrewsCourses);
//
//        StudentsUtil.printMapEntries(coursesMap); // java: incompatible types: java.util.Map<java.lang.String,java.util.LinkedList<java.lang.String>> cannot be converted to java.util.Map<java.lang.String,? super java.util.ArrayList<java.lang.String>>

//        ArrayList<String> juliesCourses = new ArrayList<>();
//        juliesCourses.add("Math");
//        juliesCourses.add("Art");
//        juliesCourses.add("Java");
//
//        ArrayList<String> andrewsCourses = new ArrayList<>();
//        andrewsCourses.add("Chemistry");
//        andrewsCourses.add("English");
//
//        Map<String, ArrayList<String>> coursesMap = new HashMap<>();
//        coursesMap.put("Julie", juliesCourses);
//        coursesMap.put("Andrew", andrewsCourses);
//
//        StudentsUtil.printMapEntries(coursesMap);

//        ArrayList<String> courses = new ArrayList<>();
//
//        System.out.println("ArrayList instanceof List: " + (courses instanceof List));
//        System.out.println("ArrayList instanceof Collection: " + (courses instanceof Collection));
//        System.out.println("ArrayList instanceof Iterable: " + (courses instanceof Iterable));

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