package _10_dsa_list.exercise.use_linkedlist_with_library;

public class Main {
    public static void main(String[] args) {
        MyLinkedList1<Integer> list1 = new MyLinkedList1<>();
        list1.addLast(4);
        list1.addFirst(2);
        list1.addLast(5);
//        list1.remove(0);
        list1.printList();
        System.out.println("Số 4 có trong danh sách không?:" + list1.contains(4));
        System.out.println("Số 4 nằm ở vị trị nào: "+ list1.indexOf(4));
        System.out.println("Chiều dài của size là : " + list1.size());


    }
}
