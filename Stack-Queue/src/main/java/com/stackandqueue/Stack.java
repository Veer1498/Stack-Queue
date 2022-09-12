package com.stackandqueue;

public class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (newNode == null) {
            System.out.println("\nStack Overflow");
            return;
        }

        newNode.data = data;

        newNode.next = top;

        top = newNode;
    }
    public void display() { // print method
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }
}
