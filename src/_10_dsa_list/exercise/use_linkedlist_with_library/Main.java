package _10_dsa_list.exercise.use_linkedlist_with_library;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Tốp");
        myLinkedList.add(1,"XÓm");
        myLinkedList.addLast("Vinh");
        myLinkedList.add(0,"Quang");
        myLinkedList.printList();
    }


}
