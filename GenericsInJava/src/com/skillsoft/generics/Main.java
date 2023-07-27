package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product<Integer> product = new Product<>("iPhone", 1001, 699, 10);
        System.out.println("\nInteger id, price, and discount: " + product);

        Product<BigInteger> tv = new Product<>(
                "Samsung", BigInteger.valueOf(11011),
                BigInteger.valueOf(2000), BigInteger.valueOf(500));
        System.out.println("\nBigInteger id, price, and discount: " + tv);

        Product<Float> shoes = new Product<>("Nike", 1111.0f, 200.75f, 5.5f);
        System.out.println("\nFloat id, price, and discount: " + shoes);

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

// Type Parameter Names
// By convention these are usually single, uppercase letters