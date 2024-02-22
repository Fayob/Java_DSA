package dev.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);
        myDLL.append(4);

        myDLL.printList();
        myDLL.getLength();
    }
}
