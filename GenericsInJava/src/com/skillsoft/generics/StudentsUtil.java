package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<? extends Number> getScoresAsList(Map<String, ? extends Number> studentsMap) {

        List<? extends Number> list = new ArrayList<>();

        for (Map.Entry<String, ? extends Number> entry : studentsMap.entrySet()) {
            // NOTE: The data type of the element is unknown, we can only access
            // it using the Object data type
            Object score = entry.getValue();

            // NOTE: This method requires the actual data type of the element
            // being added, that is not available when we use upper bounded wildcards
            list.add(score); // java: incompatible types: java.lang.Object cannot be converted to capture#1 of ? extends java.lang.Number
        }

        return list;
    }

//    public static <T extends Number> List<T> getScoresAsList(Map<String, T> studentsMap) {
//
//        List<T> list = new ArrayList<>();
//
//        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
//            T score = entry.getValue();
//
//            list.add(score);
//        }
//
//        return list;
//    }

}
