package com.stackandqueue;

public class Queue {
    Node front;
    Node rear;

    int length;
    class Node {
        int key;
        Node next;

        public Node(int key) {

            this.key = key;
            this.next = null;
        }
    }
    // add data into the Queue
    public void enQueue(int data) {
        if (front == null) {
            rear = new Node(data);
            front = rear;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }

        length++;

    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.key + "-> ");
            temp = temp.next;
        }
    }
}
