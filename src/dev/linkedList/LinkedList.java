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

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast(){
        if (head == null) return null;
        Node temp = head;
        Node previousNode = temp;
        while (temp.next != null){
            previousNode = temp;
            temp = temp.next;
        }
        tail = previousNode;
        previousNode.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        int count = 0;

        while(count < index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node previousNode = get(index - 1);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        length++;
        return true;
    }

    public boolean insertInto(int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = head;
        Node previousNode = temp;
        for(int i = 0; i < index; i++){
            previousNode = temp;
            temp = temp.next;
        }
        previousNode.next = newNode;
        newNode.next = temp;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null; // this does the same thing as the code that has similar comments in this block
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node previouseNode = get(index - 1);
//        if (previouseNode.next == null) return null; // this does the same thing as the code that has similar comments in this block
        Node targetNode = previouseNode.next;
        previouseNode.next = targetNode.next;
        targetNode.next = null;
        length--;
        return targetNode;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
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
