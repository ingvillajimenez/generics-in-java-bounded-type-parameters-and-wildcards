package com.skillsoft.generics;

public class Box<T extends Comparable<T>> {
    // Here is an example of a bounded type parameter specified for our class definition
    // Type parameter T implements Comparable<T> interface
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }

}