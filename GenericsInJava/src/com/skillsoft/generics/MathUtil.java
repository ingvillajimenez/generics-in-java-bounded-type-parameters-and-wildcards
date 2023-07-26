package com.skillsoft.generics;

public class MathUtil {

    public static <T extends Number> boolean isEven(T element) {
        return element.doubleValue() % 2 == 0;
    }

    public static <T extends Integer> boolean isPrime(T element) {
    // Let's make this type specification more strict
        int num = element.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (element.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }

//    public static <T extends Number> boolean isEven(T element) {
//    // <T extends Number> is an example of bounded type parameter
//        Number number = (Number) element;
//
//        return number.doubleValue() % 2 == 0;
//    }
//
//    public static <T extends Number> boolean isPrime(T element) {
//    // This T is also a bounded type parameter
//        Number number = (Number) element;
//
//        int num = number.intValue() / 2;
//
//        for (int i = 2; i <= num; i++) {
//
//            if (number.intValue() % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

}
