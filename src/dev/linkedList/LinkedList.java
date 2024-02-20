package dev.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Length => " + length);
    }

    public void getHead(){
        System.out.println("Head => " + head.value);
    }

    public void getTail(){
        System.out.println("Tail => " + tail.value);
    }

    public void getLength(){
        System.out.println("Length => " + length);
    }
}
