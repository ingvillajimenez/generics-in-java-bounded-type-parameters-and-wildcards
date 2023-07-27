package com.skillsoft.generics;

import java.util.List;

public class Utilities {

    public static void copy(List<Number> source, List<Number> destList, int index) {
        // All reference of <T> will be replaced by the base class Number
        destList.set(index, source.get(index));
    }

//    public static <T extends Number> void copy(List<T> source, List<T> destList, int index) {
//        // Generic method with a bounded type parameter T
//        destList.set(index, source.get(index));
//    }

//    public static void copy(List<Object> source, List<Object> destList, int index) {
//        // Every reference to type T will be replaced by an Object reference
//        destList.set(index, source.get(index));
//    }

//    public static <T> void copy(List<T> source, List<T> destList, int index) {
//        // Generic method with an unbounded type parameter T
//        destList.set(index, source.get(index));
//    }
}
