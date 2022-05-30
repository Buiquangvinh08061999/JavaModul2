package _10_dsa_list.practice.linkedlist_simple;

public class TestMyLinkList1 {
    public static void main(String[] args) {
        System.out.println("Kiểm tra");
        MyLinkedList1 myLk1 = new MyLinkedList1(13);
        myLk1.addFirst(12);
        myLk1.addFirst(11);
        myLk1.addFirst(10);

        myLk1.add(0,9);
//        myLk1.add(4,9);
        myLk1.printList();
    }
}
