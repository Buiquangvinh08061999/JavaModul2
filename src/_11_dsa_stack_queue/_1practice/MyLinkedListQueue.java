package _11_dsa_stack_queue._1practice;



public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node teamp = new Node(key);
       if(this.tail == null){
           this.head = this.tail = teamp;
           return;
       }
       this.tail.next = teamp;
       this.tail =teamp;
    }

    public Node dequeue(){
        if(this.head==null){
            return null;
        }
        Node teamp = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return teamp;
    }


}
