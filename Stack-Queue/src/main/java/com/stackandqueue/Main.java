package com.stackandqueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue");

        Stack stack = new Stack();

        System.out.println();
        System.out.println("Element present in the Stack");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
    }
}
