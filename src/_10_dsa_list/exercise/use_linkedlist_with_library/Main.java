package _10_dsa_list.exercise.use_linkedlist_with_library;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mylist = new MyLinkedList<>();

        mylist.addFirst(5);
        mylist.addFirst(4);
        mylist.addFirst(3);
        mylist.addFirst(2);

//        mylist.add(2,30);

        mylist.remove(2);

        mylist.printList();
    }
}
