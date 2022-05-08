package _11_dsa_stack_queue._1practice;

public class LinkedListQueueClient1 {
    public static void main(String[] args) {
        MyLinkedListQueue1 queue1 = new MyLinkedListQueue1();
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.dequeue();
        queue1.dequeue();
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        System.out.println("Vật phẩm có giá trị là: " + queue1.dequeue().key);
    }
}
