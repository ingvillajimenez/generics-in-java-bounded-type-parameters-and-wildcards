package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {


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

// Type Erasure
// Process where the compiler replaces a generic parameter with an actual class or bridge method
// Bytecode produced contains only ordinary classes, interfaces, and methods