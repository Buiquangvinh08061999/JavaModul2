package _11_dsa_stack_queue._1practice;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();


        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
