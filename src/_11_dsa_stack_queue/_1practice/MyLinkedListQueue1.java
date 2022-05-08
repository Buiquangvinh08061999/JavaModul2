package _11_dsa_stack_queue._1practice;

public class MyLinkedListQueue1 {

    public class Node{
       public int key;
       public Node next;

        public Node(int key) {
            this.key = key;
        }
    }
    private Node head;
    private Node tail;

    public MyLinkedListQueue1() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;

        if(this.head ==null){
            this.tail = null;
        }
        return temp;
    }
}
