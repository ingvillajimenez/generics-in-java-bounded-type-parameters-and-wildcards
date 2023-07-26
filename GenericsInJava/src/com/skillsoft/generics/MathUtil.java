package com.skillsoft.generics;

public class MathUtil {

    public static <T extends Object> boolean isEven(T element) {
    // <T extends Object> is an implicit assumption for any type parameter
        Number number = (Number) element;

        return number.doubleValue() % 2 == 0;
    }

    public static <T extends Object> boolean isPrime(T element) {
    // The type T specified standalone is referred to as an unbounded type
        Number number = (Number) element;

        int num = number.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }

}
