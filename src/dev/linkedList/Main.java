package dev.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(7);
        linkedList.append(6);
        linkedList.append(5);
        System.out.println("Removed Node => " + linkedList.removeLast().getValue());
        System.out.println("Removed Node => " + linkedList.removeLast().getValue());
        System.out.println("Removed Node => " + linkedList.removeLast().getValue());
        System.out.println("Removed Node => " + linkedList.removeLast().getValue());
        System.out.println("Removed Node => " + linkedList.removeLast());
        linkedList.prepend(1);
        linkedList.prepend(2);
        linkedList.prepend(3);
        System.out.println("Removed First Node => " + linkedList.removeFirst().getValue());
        System.out.println("Removed First Node => " + linkedList.removeFirst().getValue());
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        System.out.println("The value at index 1 => " + linkedList.get(1).getValue());
        System.out.println("The value at index 4 => " + linkedList.get(4));

        linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
    }
}
