package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("************* Invoke the isPrime() method");

        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));

        System.out.println("Is 37 prime: " + MathUtil.isPrime(37));

        System.out.println("Is 52 prime: " + MathUtil.isPrime(51));

//        System.out.println("************* Invoke the isPrime() method");
//
//        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));
//
//        System.out.println("Is 17.2 prime: " + MathUtil.isPrime(17.2));
//        java: method isPrime in class com.skillsoft.generics.MathUtil cannot be applied to given types;
//        required: T
//        found:    double
//        reason: inference variable T has incompatible bounds
//        lower bounds: java.lang.Integer
//        lower bounds: java.lang.Double

//        System.out.println("************* Invoke the isEven() method");
//
//        System.out.println("Is 50 even: " + MathUtil.isEven(50));
//
//        System.out.println("Is 103 even: " + MathUtil.isEven(103));
//
//        System.out.println("Is 50.2 even: " + MathUtil.isEven(50.2));
//
//        System.out.println("Is 5000000 even: " + MathUtil.isEven(BigInteger.valueOf(5000000)));
//
//        System.out.println("************* Invoke the isPrime() method");
//
//        System.out.println("Is 50 prime: " + MathUtil.isPrime(50));
//
//        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));
//
//        System.out.println("Is 5000000 prime: " + MathUtil.isPrime(BigInteger.valueOf(5000000)));


//        System.out.println("********** Invoke the isEven() method");
//
//        System.out.println("Is fifty even: " + MathUtil.isEven("fifty")); // compile-time error
////        java: method isEven in class com.skillsoft.generics.MathUtil cannot be applied to given types;
////        required: T
////        found:    java.lang.String
////        reason: inference variable T has incompatible bounds
////        lower bounds: java.lang.Number
////        lower bounds: java.lang.String
//
//        System.out.println("*********** Invoke the isPrime() method");
//
//        System.out.println("Is seventeen prime: " + MathUtil.isPrime("seventeen")); // compile-time error
//
//        System.out.println("Is today's date prime: " + MathUtil.isPrime(new Date())); // compile-time error


    }
}