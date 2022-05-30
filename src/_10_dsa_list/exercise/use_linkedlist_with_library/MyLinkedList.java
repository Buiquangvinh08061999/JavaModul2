package _10_dsa_list.exercise.use_linkedlist_with_library;

public class MyLinkedList<E> {

    private Node head;
    private int numberNodes=0;
    private boolean flag;

    public class Node {
        private Node next;
        private Object data;
        // phương thức khởi tạo
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList(){
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }



    public void add(int index, Object data) {
        Node temp = head;

        for (int i = 0; i < index -1; i++){
            temp = temp.next;
        }

        Node holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;

        numberNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public void addLast(Object data) {
        if (head == null){
            addFirst(data);
        }else {

            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        numberNodes++;
    }
    public void remove(int index) {
        Node temp = head;
        for (int i=0; i<index -1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numberNodes--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++)
            temp = temp.next;
        System.out.println(temp.data);
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numberNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int result = 0;
        for (int i = 0; i <= numberNodes; i++) {
            if ((temp.data).equals(data)) {
                result = i;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return result;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
