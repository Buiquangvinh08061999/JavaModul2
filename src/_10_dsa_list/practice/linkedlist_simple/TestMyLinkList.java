package _10_dsa_list.practice.linkedlist_simple;

public class TestMyLinkList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= KIỂM TRA /=/=/=/=");

        MyLinkedList myLinkedList = new MyLinkedList(5);
        myLinkedList.addFirt(11);
        myLinkedList.addFirt(12);
        myLinkedList.addFirt(13);

        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}
