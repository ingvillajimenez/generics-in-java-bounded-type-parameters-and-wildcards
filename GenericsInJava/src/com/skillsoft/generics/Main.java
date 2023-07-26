package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.Date;

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) > 0) {
            return box1;
        }

        return  box2;
    }

//    private static <T> Box<T> getLarger(Box<T> box1, Box<T> box2) {
//        if (box1.getValue() > box2.getValue()) { // Operator '>' cannot be applied to 'T', 'T
//            return box1;
//        }
//
//        return  box2;
//    }

    public static void main(String[] args) {

        Box<Integer> integerBox1 = new Box<>(22);
        System.out.println(integerBox1);

        Box<Integer> integerBox2 = new Box<>(99);
        System.out.println(integerBox2);

        System.out.println("Larger box: " + getLarger(integerBox1, integerBox2));

//        Box<Integer> integerBox = new Box<>(22);
//        System.out.println(integerBox);
//
//        Box<Float> floatBox = new Box<>(22.2f);
//        System.out.println(floatBox);
//
//        Box<BigInteger> bigIntegerBox = new Box<>(BigInteger.valueOf(100000000));
//        System.out.println(bigIntegerBox);
//
//        Box<String> stringBox = new Box<>("Zoe");
//        System.out.println(stringBox);

    }
}

// The Comparable Interface
// Implement the single method compareTo()

// x.compareTo(y)
// Positive if x > y, negative if x < y, zero if x = y