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

        linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
    }
}
