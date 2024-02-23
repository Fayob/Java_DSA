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
        myDLL.set(0, 0);
        myDLL.set(1, 2);
        myDLL.set(2, 2);
        myDLL.insert(1, 1);
        myDLL.insert(4, 4);
        System.out.println(myDLL.set(3, 3));
        System.out.println(myDLL.set(13, 13));
        System.out.println(myDLL.insert(6, 6));


        myDLL.printList();
        myDLL.getLength();
    }
}
