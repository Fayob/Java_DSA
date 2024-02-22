package dev.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);
        myDLL.append(4);
        System.out.println(myDLL.removeLast());
        myDLL.prepend(1);
        myDLL.prepend(5);


        myDLL.printList();
        myDLL.getLength();
    }
}
