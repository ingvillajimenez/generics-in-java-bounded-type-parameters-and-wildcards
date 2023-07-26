package com.skillsoft.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<String, ? super ArrayList<String>> map) {  // value in the map is a lower-bounded wildcard

        for (Map.Entry<String, ? super ArrayList<String>> entry : map.entrySet()) { // value in the map is a lower-bounded wildcard
            System.out.println("-----------------------------");

            // NOTE: We only access the toString() method of the key and value
            // which is a part of the Object base class
            System.out.println(entry);
            System.out.println("-----------------------------");
        }
    }



}
