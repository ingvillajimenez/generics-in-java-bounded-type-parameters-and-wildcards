package com.skillsoft.generics;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Class<?> stringClass = String.class; // Unbounded wildcard in Class object

        System.out.println("\nName (String): " + stringClass.getName());
        System.out.println("Package (String): " + stringClass.getPackageName());
        System.out.println("Superclass (String): " + stringClass.getSuperclass());
        System.out.println("isInterface (String): " + stringClass.isInterface());

        Class<?> dateClass = Date.class; // Unbounded wildcard in Class object

        System.out.println("\nName (Date): " + dateClass.getName());
        System.out.println("Package (Date): " + dateClass.getPackageName());
        System.out.println("Superclass (Date): " + dateClass.getSuperclass());
        System.out.println("isInterface (Date): " + dateClass.isInterface());

        Class<?> serializableClass = Serializable.class; // Unbounded wildcard in Class object

        System.out.println("\nName (Serializable): " + serializableClass.getName());
        System.out.println("Package (Serializable): " + serializableClass.getPackageName());
        System.out.println("Superclass (Serializable): " + serializableClass.getSuperclass());
        System.out.println("isInterface (Serializable): " + serializableClass.isInterface());

//        Class<String> stringClass = String.class; // Parameterized Class object
//
//        System.out.println("\nName (String): " + stringClass.getName());
//        System.out.println("Package (String): " + stringClass.getPackageName());
//        System.out.println("Superclass (String): " + stringClass.getSuperclass());
//        System.out.println("isInterface (String): " + stringClass.isInterface());
//
//        Class<Date> dateClass = Date.class; // Parameterized Class object
//
//        System.out.println("\nName (Date): " + dateClass.getName());
//        System.out.println("Package (Date): " + dateClass.getPackageName());
//        System.out.println("Superclass (Date): " + dateClass.getSuperclass());
//        System.out.println("isInterface (Date): " + dateClass.isInterface());
//
//        Class<Serializable> serializableClass = Serializable.class; // Parameterized Class object
//
//        System.out.println("\nName (Serializable): " + serializableClass.getName());
//        System.out.println("Package (Serializable): " + serializableClass.getPackageName());
//        System.out.println("Superclass (Serializable): " + serializableClass.getSuperclass());
//        System.out.println("isInterface (Serializable): " + serializableClass.isInterface());

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