package dev.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
