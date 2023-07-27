package com.skillsoft.generics;

import java.util.List;

public class ListUtil {

    public static void copy(List<?> sourceList, List<?> destList, int index) {

        copyHelper(sourceList, destList, index);
//        java: method copyHelper in class com.skillsoft.generics.ListUtil cannot be applied to given types;
//        required: java.util.List<T>,java.util.List<T>,int
//        found:    java.util.List<capture#1 of ?>,java.util.List<capture#2 of ?>,int
//        reason: inference variable T has incompatible equality constraints capture#2 of ?,capture#1 of ?
    }

    public static <T> void copyHelper(List<T> sourceList, List<T> destList, int index) {

        destList.set(index, sourceList.get(index));
    }

//    public static void swap(List<?> list, int index1, int index2) {
//        swapHelper(list, index1, index2);
//    }
//
//    // NOTE: Within this helper function, the type of the generic type parameter
//    // is known
//    public static <T> void swapHelper(List<T> list, int index1, int index2) {
//
//        T firstElement = list.get(index1);
//        T secondElement = list.get(index2);
//
//        list.set(index1, secondElement);
//        list.set(index2, firstElement);
//    }

//    public static <T> void swap(List<?> list, int index1, int index2) {
//
//        T firstElement = list.get(index1); //java: incompatible types: capture#1 of ? cannot be converted to T
//        T secondElement = list.get(index2); //java: incompatible types: capture#2 of ? cannot be converted to T
//
//        list.set(index1, secondElement); //java: incompatible types: T cannot be converted to capture#3 of ?
//        list.set(index2, firstElement); //java: incompatible types: T cannot be converted to capture#4 of ?
//    }

//    public static <T> void swap(List<T> list, int index1, int index2) {
//
//        T firstElement = list.get(index1);
//        T secondElement = list.get(index2);
//
//        list.set(index1, secondElement);
//        list.set(index2, firstElement);
//    }
}
