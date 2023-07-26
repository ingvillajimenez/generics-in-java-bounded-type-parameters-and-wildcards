package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.Date;

public class Main {

    public static <T extends Comparable<T> & PrettyPrintable> void prettyPrintLarger(
            Box<T> box1, Box<T> box2) {
        if (box1.compareTo(box2) > 0) {
            box1.prettyPrint();

            return;
        }

        box2.prettyPrint();
    }

    public static <T extends Comparable<T> & PrettyPrintable> void prettyPrintSmaller(
            Box<T> box1, Box<T> box2){
        if (box1.compareTo(box2) < 0) {
            box1.prettyPrint();

            return;
        }

        box2.prettyPrint();
    }


    public static void main(String[] args) {

        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
        System.out.println(carBox1);

        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Camry", 30000));
        System.out.println(carBox2);

        System.out.println("\n------------Larger");
        prettyPrintLarger(carBox1, carBox2);

        System.out.println("\n------------Smaller");
        prettyPrintSmaller(carBox1, carBox2);

    }
}

// The Comparable Interface
// Implement the single method compareTo()

// x.compareTo(y)
// Positive if x > y, negative if x < y, zero if x = y

// Bounded Types
// Can specify inheritance as well as multiple interfaces