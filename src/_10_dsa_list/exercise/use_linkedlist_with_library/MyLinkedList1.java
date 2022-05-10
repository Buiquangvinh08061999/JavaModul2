package _10_dsa_list.exercise.use_linkedlist_with_library;

import org.w3c.dom.Node;

public class MyLinkedList1<E> {
    private Node head;
    private int numNodes = 0;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E e) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }


    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (numNodes == 0) {
            head = new Node(e);
            numNodes++;
            return;
        }
        Node temp = head;
        for (int i = 0; i < numNodes - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            System.out.println("Chỉ mục không hợp lệ");
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next.next;
            temp.next = holder;
            numNodes--;
        }
    }

    public int size() {
        return numNodes;
    }


    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Node getFirst() {
        if (numNodes != 0) {
            return head;
        } else {
            return null;
        }
    }

    public Node getLast() {
        return null;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a = 2;
        System.out.println(b);
    }


}
