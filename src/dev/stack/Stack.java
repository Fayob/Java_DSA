package dev.stack;

public class Stack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public Stack (int value){
        Node newNode = new Node(value);
        this.top = newNode;
        height = 1;
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }
    public void getHeight() {
        System.out.println("Top: " + height);
    }

}
