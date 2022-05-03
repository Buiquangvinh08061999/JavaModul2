package _10_dsa_list.practice.linkedlist_simple;



import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;
    private  int numNodes = 0;

    public class Node{
        private Node next;
        public Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return  data;
        }
    }
    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, Object data){
        Node teamp = head;
        Node holder;

        for (int i = 0; i < index -1 && teamp.next!= null;i++){
            teamp = teamp.next;
        }
        holder = teamp.next;
        teamp.next = new Node(data);
        teamp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node teamp = head;
        head = new Node(data);
        head.next = teamp;
        numNodes++;
    }
    public Node get(int index){
        Node teamp = head;
        for(int i = 0; i< index; i++){
            teamp= teamp.next;
        }
        return teamp;
    }

    public void printList(){
        Node teamp = head;
        while (teamp !=null){
            System.out.println(teamp.data);
            teamp=teamp.next;
        }
    }

}


