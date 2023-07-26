package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.Date;

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.compareTo(box2) > 0) {
            return box1;
        }

        return  box2;
    }

//    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
//        if (box1.getValue().compareTo(box2.getValue()) > 0) {
//            return box1;
//        }
//
//        return  box2;
//    }


    public static void main(String[] args) {

        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
        System.out.println(carBox1);

        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Carmry", 30000));
        System.out.println(carBox2);

        System.out.println("Larger box: " + getLarger(carBox1, carBox2));

//        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000)); // Type parameter 'com.skillsoft.generics.Car' is not within its bound; should implement 'java.lang.Comparable<com.skillsoft.generics.Car>'
//        System.out.println(carBox1);
//
//        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Carmry", 30000)); // Type parameter 'com.skillsoft.generics.Car' is not within its bound; should implement 'java.lang.Comparable<com.skillsoft.generics.Car>'
//        System.out.println(carBox2);
//
//        System.out.println("Larger box: " + getLarger(carBox1, carBox2)); // reason: no instance(s) of type variable(s) T exist so that Car conforms to Comparable<T>
    }
}

// The Comparable Interface
// Implement the single method compareTo()

// x.compareTo(y)
// Positive if x > y, negative if x < y, zero if x = y