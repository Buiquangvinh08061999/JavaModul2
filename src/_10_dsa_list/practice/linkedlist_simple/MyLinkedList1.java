package _10_dsa_list.practice.linkedlist_simple;

import org.w3c.dom.Node;

public class MyLinkedList1 {

    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList1(Object data){
        head = new Node(data);
    }

    void  add(int index, Object data){
        if(index!=0){
            Node temp = head;
            for (int i = 0 ; i < index-1 && temp.next!=null; i++){
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
        }else {
            Node n = new Node(data);
            n.next = head;
            head = n;
        }
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0 ; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
