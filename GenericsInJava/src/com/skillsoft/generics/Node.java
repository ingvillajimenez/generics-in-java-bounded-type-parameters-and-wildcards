package com.skillsoft.generics;

public class Node { // All instances of T will become instances of Comparable

    private Comparable data;
    private Node next;
    private Node previous;

    public Node(Comparable data) {
        this.data = data;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}

//public class Node<T extends Comparable<T>> { // Bounded type parameter
//
//    private T data;
//    private Node<T> next;
//    private Node<T> previous;
//
//    public Node(T data) {
//        this.data = data;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//
//    public Node<T> getNext() {
//        return next;
//    }
//
//    public void setNext(Node<T> next) {
//        this.next = next;
//    }
//
//    public Node<T> getPrevious() {
//        return previous;
//    }
//
//    public void setPrevious(Node<T> previous) {
//        this.previous = previous;
//    }
//}

//public class Node { // Type erasure: the ordinary class once it is converted to bytecode
//
//    private Object data;
//    private Node next;
//    private Node previous;
//
//    public Node(Object data) {
//        this.data = data;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    public Node getPrevious() {
//        return previous;
//    }
//
//    public void setPrevious(Node previous) {
//        this.previous = previous;
//    }
//}

//public class Node<T> {
//
//    private T data;
//    private Node<T> next;
//    private Node<T> previous;
//
//    public Node(T data) {
//        this.data = data;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//
//    public Node<T> getNext() {
//        return next;
//    }
//
//    public void setNext(Node<T> next) {
//        this.next = next;
//    }
//
//    public Node<T> getPrevious() {
//        return previous;
//    }
//
//    public void setPrevious(Node<T> previous) {
//        this.previous = previous;
//    }
//}
