package _10_dsa_list.exercise.use_linkedlist_with_library;

import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    public int numNodes = 0;

    public  class Node{
       private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }
    public MyLinkedList(){
    }
    public void  add(int index, E element){
        Node teamp = head;
        Node holder;
        for (int i=0 ; i< index -1 && teamp.next != null; i++ ){
            teamp=teamp.next;
        }
        holder = teamp.next;
        teamp.next = new Node(element);
        teamp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E e){
        Node teamp = head;
        head = new Node(e);
        head.next = teamp;
        numNodes++;
    }
    public void addLast(E e){
        Node teamp = head;
        while (teamp!= null){
            if(teamp.next == null){
                teamp.next = new Node(e);
                numNodes++;
                break;
            }
            teamp = teamp.next;
        }
    }

    public void remove(int index){
       Node teamp = head;
        for (int i = 0; i < index - 1 && teamp.next != null; i++) {
            teamp.next = teamp.next.next;
        }
        numNodes --;
    }
    public void get(int index){
        Node teamp = head;
        for (int i = 0; i< index - 1; i++){
            teamp =teamp.next;
            System.out.println(teamp.data);
        }
    }
    public int size(){
        return numNodes;
    }

    public  boolean contains(E o){
        Node teamp = head;
      for (int i =0; i< numNodes;i++){
          if(teamp.data == o){
              return true;
          }
          teamp = teamp.next;
      }
      return false;
    }

    public int indexOf(E o){
        Node teamp = head;
        for (int i = 0; i< numNodes; i++){
            if (teamp.data ==o){
                return i;
            }
            teamp = teamp.next;
        }
        return  -1;
    }

    public  E getFirst(){
        Node teamp = head;
        return (E) teamp.getData();
    }

    public Node getLast() {
        if(numNodes == 0){
            return null;
        }else {
            Node teamp =head;
            for (int i =0;i< numNodes-1;i++){
                teamp = teamp.next;
            }
            return teamp;
        }
    }
    public void clear(){
        head = null;
        numNodes = 0;
    }

    public void printList(){
        Node teamp = head;
        while (teamp !=null){
            System.out.println(teamp.data);
            teamp = teamp.next;
        }
    }
}
