package dev.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);
        myDLL.append(4);
        System.out.println(myDLL.removeLast());
        myDLL.prepend(1);
        myDLL.prepend(5);
        System.out.println(myDLL.removeFirst());
        System.out.println(myDLL.get(2).value);
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(3));
        System.out.println(myDLL.get(-1));


        myDLL.printList();
        myDLL.getLength();
    }
}
