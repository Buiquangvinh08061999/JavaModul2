package _10_dsa_list.practice.list_simple;

public class MyListTest1 {
    public static void main(String[] args) {
        MyList1<Integer> myList1 = new MyList1<Integer>();
       myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(3);
        myList1.add(3);
        myList1.add(3);
        myList1.add(6);

        System.out.println("Element 3 là " + myList1.get(3));
        System.out.println("Element 4 là " + myList1.get(4));

       int a = myList1.get(6);
        System.out.println("Element 6 là " + a);
    }
}
