package com.skillsoft.generics;

import java.math.BigInteger;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        System.out.println("********** Invoke the isEven() method");
//
//        System.out.println("Is fifty even: " + MathUtil.isEven("fifty")); // java.lang.ClassCastException. class java.lang.String cannot be cast to class java.lang.Number

        System.out.println("*********** Invoke the isPrime() method");

        System.out.println("Is seventeen prime: " + MathUtil.isPrime("seventeen")); // java.lang.ClassCastException. class java.lang.String cannot be cast to class java.lang.Number

        System.out.println("Is today's date prime: " + MathUtil.isPrime(new Date()));

//        System.out.println("********** Invoke the isEven() method");
//
//        System.out.println("Is 50 even: "  + MathUtil.isEven(50));
//
//        System.out.println("Is 103 even: " + MathUtil.isEven(103));
//
//        System.out.println("Is 50.2 even: " + MathUtil.isEven(50.2));
//
//        System.out.println("Is 5000000 even: " + MathUtil.isEven(BigInteger.valueOf(5000000)));
//
//        System.out.println("*********** Invoke the isPrime() method");
//
//        System.out.println("Is 50 prime: " + MathUtil.isPrime(50));
//
//        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));
//
//        System.out.println("Is 5000000 prime: " + MathUtil.isPrime(BigInteger.valueOf(5000000)));
    }
}