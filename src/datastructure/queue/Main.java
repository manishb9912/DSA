package datastructure.queue;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(11);
        newQueue.enqueue(22);

        System.out.println(newQueue.dequeue().value);
        System.out.println(newQueue.dequeue().value);
        System.out.println(newQueue.dequeue());
    }
}
